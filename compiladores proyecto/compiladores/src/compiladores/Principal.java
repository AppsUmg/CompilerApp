/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladores;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Principal {
    
    String raiz="C:\\Users\\jrizz_000\\Documents\\NetBeansProjects\\compiladores\\";
    public void iniciar() throws Exception {
        
        String str =raiz+"src\\compiladores\\lexer.flex";
        String strCup =raiz+"src\\compiladores\\lexerCup.flex";
        String[] rutaS = { "-parser","sintax",raiz+"src\\compiladores\\Sintax.cup"};
        generar(str,strCup,rutaS);
    }
    
    public void generar(String rutaLexico, String rutaCup, String[] rutaS) throws IOException, Exception {
        File archivo;
        archivo = new File(rutaLexico);
        JFlex.Main.generate(archivo);
        
        archivo = new File(rutaCup);
        JFlex.Main.generate(archivo);
        
        java_cup.Main.main(rutaS);
        
        Path rutaSym = Paths.get(raiz+"src\\compiladores\\sym.java");
        if(Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        } 
       
        Files.move(
                Paths.get(raiz+"sym.java"), 
                Paths.get(raiz+"src\\compiladores\\sym.java"));
       
        Path rutaSintax = Paths.get(raiz+"src\\compiladores\\sintax.java");
        if(Files.exists(rutaSintax)) {
            Files.delete(rutaSintax);
        } 
        
        Files.move(
                Paths.get(raiz+"sintax.java"), 
                Paths.get(raiz+"src\\compiladores\\sintax.java"));
        
    }
}
