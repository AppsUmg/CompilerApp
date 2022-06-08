/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import System.sms.Sms;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Kevin
 */
public class Settings {
    
    
    public static String AppName = "COMPILERS APP";
    public static String Version = "1.0";
    public static String IconApp = "icon";
    public static Sms msg = new Sms();
    public static AppLog AppLog = new AppLog(AppName, true);
    public static String PathUri = "C:\\Users\\"+System.getProperty("user.name")+"\\AppData\\LocalLow\\Temp\\COMPILERS APP\\";
    
    
     public void ConfigureForm(JFrame Frame) {
        Frame.setTitle(AppName+" "+Version);
        Frame.setIconImage(new ImageIcon(getClass().getResource("/Resources/" + IconApp + ".png")).getImage());
    }
}
