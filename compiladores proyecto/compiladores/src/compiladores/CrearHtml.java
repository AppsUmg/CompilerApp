/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladores;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;


public class CrearHtml {
    public void generarHtml(String str) throws IOException {
        str=str.replace("$","");
        str=str.replace("<boton", "<button type=\"button\">");
        str=str.replace(">boton", "</button>");
        str=str.replace("<salto>", "<br>");
        str=str.replace("<etiquetaTexto", "<label>");
        str=str.replace(">etiquetaTexto", "</label>");
        str=str.replace("<cajaTexto", "<input type=\"text\" value=\"");
        str=str.replace(">cajaTexto","\">");
        
        if(str.contains("<tabla Borde='si'")){
            str=str.replace("<tabla Borde='si'","<table border=\"1\">");
        }
        else if(str.contains("<tabla Borde='no'")) {
             str=str.replace("<tabla Borde='no'","<table border=\"0\">");
        }
        else if(str.contains("<tabla borde='si'")){
            str=str.replace("<tabla borde='si'","<table border=\"1\">");
        }
        else if(str.contains("<tabla borde='no'")) {
             str=str.replace("<tabla borde='no'","<table border=\"0\">");
        }
        else {
            str=str.replace("<tabla","<table> "); 
        }
        
        str=str.replace(">tabla","</table>");
        str=str.replace("<etiquetaTabla","<caption>");
        str=str.replace(">etiquetaTabla","</caption>");
        str=str.replace("<fila","<tr>");
        str=str.replace(">fila","</tr>");
        str=str.replace("<celdaEncabezado","<th>");
        str=str.replace(">celdaEncabezado","</th>");
        str=str.replace("<celda","<td>");
        str=str.replace(">celda","</td>");
        str=str.replace("Borde='si'","border=\"1\"");
        str=str.replace("Borde='no'","border=\"0\"");
        
        String encabezado="<html> <head><title>ARCHIVO DE SALIDA</title></head> \n <body>";
        String cierre="\n </body> \n </html>";
        str=encabezado+str+cierre;
        
        Path rutaXampp = Paths.get("C:\\xampp\\htdocs\\pagina.html");
         if(Files.exists(rutaXampp)) {
            Files.delete(rutaXampp);
        } 
         crearArchivo(str,"pagina","C:\\xampp\\htdocs",".html");
         
        
             String direccion = "http://localhost:8082/pagina.html";
    try
                    {
                        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + direccion);
                    }
                    catch(Exception err)
                    {
                        JOptionPane.showMessageDialog(null,"Error: "+err);
                    }
         
    }
    
    public void crearArchivo(String str, String nombreArchivo, String path, String extension){
             try {
     FileWriter myWriter = new FileWriter(path+"\\"+nombreArchivo+extension);
      myWriter.write(str);
      myWriter.close();
      System.out.println("creacion de rchivo exitoso");
    } catch (IOException e) {
      System.out.println("ocurrio un error");
      e.printStackTrace();
    }
    }
   
}
