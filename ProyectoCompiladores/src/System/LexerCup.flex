package compiladores;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    private Symbol symbol(int type,Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%
boton {return new Symbol(sym.Boton,yychar,yyline,yytext());}
salto {return new Symbol(sym.Salto,yychar,yyline,yytext());}
etiquetaTexto {return new Symbol(sym.EtiquetaTexto,yychar,yyline,yytext());}
cajaTexto {return new Symbol(sym.CajaTexto,yychar,yyline,yytext());}
tabla {return new Symbol(sym.Tabla,yychar,yyline,yytext());}
etiquetaTabla {return new Symbol(sym.EtiquetaTabla,yychar,yyline,yytext());}
fila {return new Symbol(sym.Fila,yychar,yyline,yytext());}
celdaEncabezado {return new Symbol(sym.CeldaEncabezado,yychar,yyline,yytext());}
celda {return new Symbol(sym.Celda,yychar,yyline,yytext());}
borde {return new Symbol(sym.Borde,yychar,yyline,yytext());}
Borde {return new Symbol(sym.Borde,yychar,yyline,yytext());}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"$" {return new Symbol(sym.InicioPrograma,yychar,yyline,yytext());}
"<" {return new Symbol(sym.AbreEtiqueta,yychar,yyline,yytext());}
">" {return new Symbol(sym.CierraEtiqueta,yychar,yyline,yytext());}
"=" {return new Symbol(sym.Igual,yychar,yyline,yytext());}
"'" {return new Symbol(sym.Comilla,yychar,yyline,yytext());}
{L}({L}|{D})* {return new Symbol(sym.Identificador,yychar,yyline,yytext());}
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero,yychar,yyline,yytext());}
 . {return new Symbol(sym.ERROR,yychar,yyline,yytext());}
