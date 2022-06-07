package System;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultCaret;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author krosales
 */
public class AppLog {

    /*========================
              VARIABLES
      ========================*/
    private int Contador;
    private String Carpeta;
    private String RutaCarpeta;
    private String FormatoFecha;
    private boolean LogConsole = false;
    private String Version = "LOG v.2.0 última modificación 04/02/2022";
    private String Ext = "txt";


    /*========================
            CONSTRUCTORES
     ========================*/
    public AppLog(String CarpetaPrograma, boolean Consola) {
        this.LogConsole = Consola;
        this.FormatoFecha = "yyyy.MM.dd";
        RutaCarpeta = "C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\LocalLow\\Temp\\" + CarpetaPrograma + "\\Logs";
        Create_Carpet(RutaCarpeta);
    }

    /*========================
              METODOS
     ========================*/
    /**
     * Crea La Carpeta en la Ruta Especificada del Constructor
     */
    public static void Create_Carpet(String ruta) {
        try {
            File c = new File(ruta);
            if (c.mkdirs()) {
            } else {
            }
        } catch (Exception e) {
        }
    }

    /**
     * Escribe un Archivo .Txt con la Informacion y el Tipo de Evento
     *
     * @param Type
     * @param Txt
     */
    public void Write(String Type, String Txt) {
        
        

        File archivo; //variable para manipular al archivo
        FileWriter escribir; //Para escribir en el Archivo
        PrintWriter linea; // Para escribir en el Archivo
        archivo = new File(RutaCarpeta + "\\Log - " + new SimpleDateFormat(FormatoFecha).format(new Date()) + " ." + Ext);
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                //Escribimos en el archivo
                linea.println("\n============================================================= "
                        + "\n                          LOG ACEITERA"
                        + "\n=============================================================");

                if (Type.isEmpty()) {
                    linea.println("");
                } else {
                    linea.println(new SimpleDateFormat("HH:mm:ss").format(new Date()) + "|" + Type + "| " + Txt);
                    if (LogConsole) {
                        System.out.println("\n============================================================= "
                                + "\n                          LOG ACEITERA"
                                + "\n=============================================================");
                        System.out.println(Contador + ")" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "|" + Type + "| " + Txt);
                        Contador++;
                    }
                }

                linea.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error Lib_Log Write: " + e);
            }
        } else {
            try {

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                //Escribimos en el archivo

                if (Type.isEmpty()) {
                    linea.println("");
                } else {
                    linea.println(new SimpleDateFormat("HH:mm:ss").format(new Date()) + "|" + Type + "| " + Txt);
                    if (LogConsole) {
                        System.out.println(Contador + ")" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "|" + Type + "| " + Txt);
                        Contador++;
                    }
                }

                linea.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error Lib_Log Write: " + e);
            }
        }

    }
    
    public void Write(String Type, Exception Exception,boolean Mostrar) {
      
        StringWriter sw = new StringWriter();
        Exception.printStackTrace(new PrintWriter(sw));

        if (Mostrar) {
            Settings.msg.smsError(Type+"| Ha ocurrido un error inesperado en la operacion.");
        }

         
         
        File archivo; //variable para manipular al archivo
        FileWriter escribir; //Para escribir en el Archivo
        PrintWriter linea; // Para escribir en el Archivo
        archivo = new File(RutaCarpeta + "\\Log - " + new SimpleDateFormat(FormatoFecha).format(new Date()) + " ." + Ext);
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                //Escribimos en el archivo
                linea.println("\n============================================================= "
                        + "\n                          LOG ACEITERA"
                        + "\n=============================================================");

                if (Type.isEmpty()) {
                    linea.println("");
                } else {
                    linea.println(new SimpleDateFormat("HH:mm:ss").format(new Date()) + "|" + Type + "| ERROR: " + sw.toString());
                    if (LogConsole) {
                        System.out.println("\n============================================================= "
                                + "\n                          LOG ACEITERA"
                                + "\n=============================================================");
                        System.out.println(Contador + ")" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "|" + Type + "| ERROR:" + sw.toString());
                        Contador++;
                    }
                }

                linea.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error Lib_Log Write: " + e);
            }
        } else {
            try {

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                //Escribimos en el archivo

                if (Type.isEmpty()) {
                    linea.println("");
                } else {
                    linea.println(new SimpleDateFormat("HH:mm:ss").format(new Date()) + "|" + Type + "| ERROR:" + sw.toString());
                    if (LogConsole) {
                        System.out.println(Contador + ")" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "|" + Type + "| ERROR:" + sw.toString());
                        Contador++;
                    }
                }

                linea.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error Lib_Log Write: " + e);
            }
        }

    }

    /**
     * Ve lo que Tiene un .Txt con la Fecha Actual y la Retorna en un String
     */
    public String Read() {
        String linea;
        File ruta = new File(RutaCarpeta + "\\Log - " + new SimpleDateFormat(FormatoFecha).format(new Date()) + " ." + Ext);
        try {
            BufferedReader leer = new BufferedReader(new FileReader(ruta));
            linea = leer.readLine();
            while (linea != null) {
                linea = leer.readLine();
            }
            return linea;
        } catch (Exception e) {
            return "Error Lib_Log Read: " + e;
        }
    }

    /**
     * Ve lo que Tiene un .Txt con la Fecha Actual y la Retorna en un String
     *
     * @param Fecha
     * @return
     */
    public String Read(String Fecha) {
        String linea;
        File ruta = new File(RutaCarpeta + "\\Log - " + Fecha + " ." + Ext);
        try {
            BufferedReader leer = new BufferedReader(new FileReader(ruta));
            linea = leer.readLine();
            while (linea != null) {
                linea = leer.readLine();
            }
            return linea;
        } catch (Exception e) {
            return "Error Lib_Log Read: No Existe ningun Log de la Fecha " + Fecha;
        }
    }

    public String getCarpeta() {
        return Carpeta;
    }

    public String getRutaCarpeta() {
        return RutaCarpeta;
    }

    public String getFormatoFecha() {
        return FormatoFecha;
    }

    public String getVersion() {
        return Version;
    }

}
