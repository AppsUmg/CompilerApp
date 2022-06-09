/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.sms;

import System.Settings;
import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author krosales
 */
public class Sms {

    private UIManager UI = new UIManager();
    private Icon Icono;
    private String CarpetIcons;
    private Color Fondo;
    private Color ColorLetra;
    private String Version = "SMS v.0.0.1 última modificación 14/09/2021";

    public Sms(String UrlCarpetIcons) {
        Fondo = Color.WHITE;
        ColorLetra = Color.BLACK;
        setConfig(Fondo,ColorLetra,14,new Color(0, 137, 123),Fondo);
        this.CarpetIcons=UrlCarpetIcons;
    }
    
    public Sms() {
        Fondo = Color.WHITE;
        ColorLetra = Color.BLACK;
        setConfig(Fondo,ColorLetra,16,new Color(255, 255, 255),ColorLetra);
    }

    public void setConfig(Color Fondo,Color ColorLetra,int Size,Color FondoBoton,Color ColorBoton){
     UI.put("OptionPane.background", Fondo);
     UI.put("Panel.background",Fondo);
     UI.put("OptionPane.messageForeground", ColorLetra);
     UI.put("OptionPane.messageFont", new Font("Times New Roman", Font.PLAIN, Size));
     UI.put("OptionPane.buttonFont", new Font("Times New Roman", Font.BOLD, Size));
     UI.put("Button.background", FondoBoton);
     UI.put("Button.foreground", ColorBoton);
     UI.put("Button.focus", FondoBoton);
     UI.put("Button.FocusPainted", false);
    }
    public String getCarpetIcons() {
        return CarpetIcons;
    }

    public void setCarpetIcons(String CarpetIcons) {
        this.CarpetIcons = CarpetIcons;
    }
    
    public void smsDialog(String Text) {
        try {
            Icono =new ImageIcon(getClass().getResource("sms2_64x64.png"));
            JOptionPane.showMessageDialog(null, Text, "SISTEMA", JOptionPane.INFORMATION_MESSAGE, Icono);
        } catch (Exception e) {
            Settings.AppLog.Write("Sms.smsDialog", e,false);
        }
    }
    
    public void smsDialog(String Text,String Icon) {
        try {
            Icono =new ImageIcon(getClass().getResource(CarpetIcons+"/"+Icon+".png"));
            JOptionPane.showMessageDialog(null, Text, "SISTEMA", JOptionPane.INFORMATION_MESSAGE, Icono);
        } catch (Exception e) {
            System.out.println("smsDialog:\n"+e);
        }
    }
    
    public void smsError(String Text){
        try {
            Icono =new ImageIcon(getClass().getResource("/System/Sms/error_48x48.png"));
            JOptionPane.showMessageDialog(null, "ERROR:\n"+Text, "SISTEMA", JOptionPane.INFORMATION_MESSAGE, Icono);
        } catch (Exception e) {
            System.out.println("smsError:\n"+e);
        }
    }
    
    public void smsError(String Text,String Icon){
        try {
            Icono =new ImageIcon(getClass().getResource(CarpetIcons+"/"+Icon+".png"));
            JOptionPane.showMessageDialog(null, "ERROR:\n"+Text, "SISTEMA", JOptionPane.ERROR_MESSAGE, Icono);
        } catch (Exception e) {
            System.out.println("smsError:\n"+e);
        }
    }
     
    public String smsInput(String Text){
        try {
            return JOptionPane.showInputDialog(null, Text);
        } catch (Exception e) {
            System.out.println("smsError:\n"+e);
            return null;
        }
    }
    
    public int smsConfirmarSalir(){
        try {
            return JOptionPane.showConfirmDialog(null, "SE PERDERAN TODOS LOS DATOS.\n ¿CONTINUAR?"
                       , "SYSTEM", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/Resources/delete data 32x32.png")));
        } catch (Exception e) {
            return -1;
        }
    }
    
    public int smsConfirmarGuardar(){
        try {
            return JOptionPane.showConfirmDialog(null, "¿DESEA GUARDAR LOS CAMBIOS?", "SYSTEM", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/Resources/SAVE32X32.png")));
        } catch (Exception e) {
            return -1;
        }
    }
     public int smsConfirmar(String Dato){
        try {
            return JOptionPane.showConfirmDialog(null, Dato, "SYSTEM", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/Resources/Task32x32.png")));
        } catch (Exception e) {
            return -1;
        }
    }
}
