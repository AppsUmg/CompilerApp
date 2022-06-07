package compiladores;
import static compiladores.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r]+
%{
    public String lexeme;
%}
%%
boton {lexeme=yytext(); return Boton;}
salto {lexeme=yytext(); return Salto;}
etiquetaTexto {lexeme=yytext(); return EtiquetaTexto;}
cajaTexto {lexeme=yytext(); return CajaTexto;}
tabla  {lexeme=yytext(); return Tabla;}
etiquetaTabla  {lexeme=yytext(); return EtiquetaTabla;}
fila  {lexeme=yytext(); return Fila;}
celdaEncabezado {lexeme=yytext(); return CeldaEncabezado;}
celda {lexeme=yytext(); return Celda;}
borde {lexeme=yytext(); return Borde;}
Borde {lexeme=yytext(); return Borde;}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"\n" {return Linea;}
"$" {lexeme=yytext(); return InicioPrograma;}
"<" {lexeme=yytext(); return AbreEtiqueta;}
">" {lexeme=yytext(); return CierraEtiqueta;}
"'" {lexeme=yytext(); return Comilla;}
"=" {lexeme=yytext(); return Igual;}
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
 . {return ERROR;}