/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import System.Tokens;
import System.sintax;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;

/**
 *
 * @author Kevin
 */
public class Compilacion {

    String HTML;
    String analisisLexico;

    public Compilacion() {
    }

    public String AnalisisLexico(File Archivo) {
        Reader lector;
        try {
            lector = new BufferedReader(new FileReader(Archivo));
            Lexer lexer = new Lexer(lector);

            String resultado = "";
            while (true) {
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    resultado += "FIN";
                    analisisLexico = resultado;
                    
                }

                switch (tokens) {
                    case ERROR: {
                        resultado += tokens.ERROR + ": \t \t <simbolo no definido> \n";
                        HTML += "<tr><td> " + tokens.ERROR + "</td> <td> -Simbolo no definido- </td> </tr> \n";
                    }
                    break;
                    case Identificador:
                    case Numero:
                    case Boton:
                    case Salto:
                    case EtiquetaTexto:
                    case CajaTexto:
                    case Tabla:
                    case EtiquetaTabla:
                    case Fila:
                    case CeldaEncabezado:
                    case Celda:
                    case AbreEtiqueta:
                    case CierraEtiqueta:
                    case InicioPrograma:
                    case Borde:
                    case Comilla:
                    case Igual: {
                        resultado += lexer.lexeme + ": \t \t <" + tokens + "> \n";
                        HTML += "<tr><td> " + lexer.lexeme + "</td> <td> -" + tokens + "- </td> </tr> \n";
                    }
                    break;
                    default:
                        resultado += "Token: \t \t <" + tokens + "> \n";
                        break;
                }
                return HTML;
            }

        } catch (FileNotFoundException ex) {
            Settings.AppLog.Write("Compiler.AnalisisLexico", ex, true);
        } catch (IOException ex) {
            Settings.AppLog.Write("Compiler.AnalisisLexico", ex, true);
        }
        return null;
    }

    public String analisisSintactico(String Value) {
        sintax s = new sintax(new LexerCup(new StringReader(Value)));
        try {
            s.parse();
            return "Analisis realizado correctamente";
        } catch (Exception ex) {
            Symbol sym = s.getS();
            return "Error de sintaxis en la linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + " Texto: \"" + sym.value + "\" ";

        }
    }

    public String getHTML() {
        return HTML;
    }

    public void setHTML(String HTML) {
        this.HTML = HTML;
    }

    public String getAnalisisLexico() {
        return analisisLexico;
    }

    public void setAnalisisLexico(String analisisLexico) {
        this.analisisLexico = analisisLexico;
    }

}
