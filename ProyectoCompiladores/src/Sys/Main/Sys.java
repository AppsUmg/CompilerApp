package Sys.Main;

import System.Settings;
import System.sms.Sms;
import Views.Form_Home;

public class Sys {

    public static void main(String[] args) {
        Settings.msg = new Sms();
        new Form_Home().setVisible(true);
    }

}
