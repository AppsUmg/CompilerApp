/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;

public class CreateHTML {

    public void generarHtml(String str) {
        try {
            str = str.replace("$", "");
            str = str.replace("<boton", "<button type=\"button\">");
            str = str.replace(">boton", "</button>");
            str = str.replace("<salto>", "<br>");
            str = str.replace("<etiquetaTexto", "<label>");
            str = str.replace(">etiquetaTexto", "</label>");
            str = str.replace("<cajaTexto", "<input type=\"text\" value=\"");
            str = str.replace(">cajaTexto", "\">");

            if (str.contains("<tabla Borde='si'")) {
                str = str.replace("<tabla Borde='si'", "<table border=\"1\">");
            } else if (str.contains("<tabla Borde='no'")) {
                str = str.replace("<tabla Borde='no'", "<table border=\"0\">");
            } else if (str.contains("<tabla borde='si'")) {
                str = str.replace("<tabla borde='si'", "<table border=\"1\">");
            } else if (str.contains("<tabla borde='no'")) {
                str = str.replace("<tabla borde='no'", "<table border=\"0\">");
            } else {
                str = str.replace("<tabla", "<table> ");
            }

            str = str.replace(">tabla", "</table>");
            str = str.replace("<etiquetaTabla", "<caption>");
            str = str.replace(">etiquetaTabla", "</caption>");
            str = str.replace("<fila", "<tr>");
            str = str.replace(">fila", "</tr>");
            str = str.replace("<celdaEncabezado", "<th>");
            str = str.replace(">celdaEncabezado", "</th>");
            str = str.replace("<celda", "<td>");
            str = str.replace(">celda", "</td>");
            str = str.replace("Borde='si'", "border=\"1\"");
            str = str.replace("Borde='no'", "border=\"0\"");

            String encabezado = "<html> <head><title>HTML RESULTADO</title></head><center>\n"
                    + "        <h1 style=\"font-size: 50;\">HTML RESULTADO</h1>\n"
                    + "    </center> \n <body>";
            String cierre = "\n </body> \n </html>";
            str = encabezado + str + cierre;

            crearArchivo(str, "pagina", Settings.PathUri, ".html");
            ENLACE_WEB("file:///C:/Users/" + System.getProperty("user.name") + "/AppData/LocalLow/Temp/COMPILERS%20APP/pagina.html");
        } catch (Exception e) {
            Settings.AppLog.Write("CreateHTML.generarHtml", e, true);
        }

    }

    public void crearArchivo(String str, String nombreArchivo, String path, String extension) {
        try {
            FileWriter myWriter = new FileWriter(path + nombreArchivo + extension);
            myWriter.write(str);
            myWriter.close();
            Settings.AppLog.Write("CreateHTML.generarHtml", "Archivo Creado Correctamente.");
        } catch (IOException e) {
            Settings.AppLog.Write("CreateHTML.generarHtml", e, true);
        }
    }

    public void ENLACE_WEB(String URL) {
        try {
            Desktop.getDesktop().browse(URI.create(URL));
        } catch (Exception e) {
            Settings.AppLog.Write("CreateHTML.ENLACE_WEB", e, true);
        }
    }

    public void generarHTMLErroresLexicos(String value, File Archivo) {
        try {
            String encabezado = "<html> <head><title>ERROR LEXICO</title></head> <center>\n"
                    + "        <h1 style=\"font-size: 50;\">ERRORES LEXICOS</h1>\n"
                    + "    </center> \n <body>";
            String cierre = "\n </body> \n </html> ";
            String str = "";

            str += "<table> \n";
            str += new Compilacion().AnalisisLexico(Archivo, false);
            str += "</table>";

            str = encabezado + str + cierre;
            crearArchivo(str, "ErrorLexico", Settings.PathUri, ".html");
            ENLACE_WEB("file:///C:/Users/" + System.getProperty("user.name") + "/AppData/LocalLow/Temp/COMPILERS%20APP/ErrorLexico.html");
        } catch (Exception e) {
            Settings.AppLog.Write("CreateHTML.generarHTMLErroresLexicos", e, true);
        }
    }

    public void generarHTMLErroresSintacticos(String value) {
        try {
            String encabezado = "<html> <head><title>ERROR SINTACTICO</title></head> <center>\n"
                    + "        <h1 style=\"font-size: 50;\">ERRORES SINTACTICO</h1>\n"
                    + "    </center>\n <body>";
            String cierre = "\n </body> \n </html> ";
            String str = "";

            value.replace("\n", "<br>");

            str = encabezado + value + cierre;

            crearArchivo(str, "ErrorSintactico", Settings.PathUri, ".html");
            ENLACE_WEB("file:///C:/Users/" + System.getProperty("user.name") + "/AppData/LocalLow/Temp/COMPILERS%20APP/ErrorSintactico.html");
        } catch (Exception e) {
            Settings.AppLog.Write("CreateHTML.generarHTMLErroresSintacticos", e, true);
        }
    }
}
