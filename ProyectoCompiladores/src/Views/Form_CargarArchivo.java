/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import System.Compilacion;
import System.CreateHTML;
import System.Settings;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import necesario.RSFileChooser;

/**
 *
 * @author Kevin
 */
public class Form_CargarArchivo extends javax.swing.JFrame {

    private boolean ArchivoCargado;
    private File Archivo;
    private String TempData;
    private String ErroresLexicos;
    private String ErroresSintacticos;
    private String HTML;

    public Form_CargarArchivo() {
        initComponents();
        this.BtnLoad.setFocusPainted(false);
        new Settings().ConfigureForm(this);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Previsualizacion = new javax.swing.JTextArea();
        BtnLoad = new rojeru_san.complementos.ButtonHover();
        jLabel1 = new javax.swing.JLabel();
        rSButtonMaterialTwo2 = new RSMaterialComponent.RSButtonMaterialTwo();
        rSButtonMaterialTwo3 = new RSMaterialComponent.RSButtonMaterialTwo();
        BtnErrorLexico = new RSMaterialComponent.RSButtonMaterialTwo();
        BtnErrorSintactico = new RSMaterialComponent.RSButtonMaterialTwo();
        rSButtonMaterialTwo6 = new RSMaterialComponent.RSButtonMaterialTwo();
        jSeparator1 = new javax.swing.JSeparator();
        rSButtonMaterialTwo7 = new RSMaterialComponent.RSButtonMaterialTwo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Previsualizacion.setEditable(false);
        Previsualizacion.setBackground(new java.awt.Color(0, 0, 0));
        Previsualizacion.setColumns(20);
        Previsualizacion.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Previsualizacion.setForeground(new java.awt.Color(0, 204, 51));
        Previsualizacion.setRows(5);
        Previsualizacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane1.setViewportView(Previsualizacion);

        BtnLoad.setBackground(new java.awt.Color(0, 112, 192));
        BtnLoad.setText("CARGAR ARCHIVO");
        BtnLoad.setColorHover(new java.awt.Color(0, 79, 192));
        BtnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoadActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COMPILER");

        rSButtonMaterialTwo2.setBackground(new java.awt.Color(183, 28, 28));
        rSButtonMaterialTwo2.setText("HOME");
        rSButtonMaterialTwo2.setBackgroundHover(new java.awt.Color(198, 40, 40));
        rSButtonMaterialTwo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialTwo2ActionPerformed(evt);
            }
        });

        rSButtonMaterialTwo3.setBackground(new java.awt.Color(0, 105, 92));
        rSButtonMaterialTwo3.setText("CREAR HTML");
        rSButtonMaterialTwo3.setBackgroundHover(new java.awt.Color(0, 105, 92));
        rSButtonMaterialTwo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialTwo3ActionPerformed(evt);
            }
        });

        BtnErrorLexico.setBackground(new java.awt.Color(0, 105, 92));
        BtnErrorLexico.setText("ERRORES LEXICOS");
        BtnErrorLexico.setBackgroundHover(new java.awt.Color(0, 105, 92));
        BtnErrorLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnErrorLexicoActionPerformed(evt);
            }
        });

        BtnErrorSintactico.setBackground(new java.awt.Color(0, 105, 92));
        BtnErrorSintactico.setText("ERRORES SINTACTICOS");
        BtnErrorSintactico.setBackgroundHover(new java.awt.Color(0, 105, 92));
        BtnErrorSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnErrorSintacticoActionPerformed(evt);
            }
        });

        rSButtonMaterialTwo6.setBackground(new java.awt.Color(0, 105, 92));
        rSButtonMaterialTwo6.setText("INTEGRANTES");
        rSButtonMaterialTwo6.setBackgroundHover(new java.awt.Color(0, 105, 92));
        rSButtonMaterialTwo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialTwo6ActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N

        rSButtonMaterialTwo7.setBackground(new java.awt.Color(0, 105, 92));
        rSButtonMaterialTwo7.setText("REINICIAR");
        rSButtonMaterialTwo7.setBackgroundHover(new java.awt.Color(0, 105, 92));
        rSButtonMaterialTwo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialTwo7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(BtnLoad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rSButtonMaterialTwo2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(rSButtonMaterialTwo3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(BtnErrorLexico, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(BtnErrorSintactico, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(rSButtonMaterialTwo6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(rSButtonMaterialTwo7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonMaterialTwo2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMaterialTwo3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnErrorLexico, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnErrorSintactico, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMaterialTwo6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMaterialTwo7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(805, 633));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoadActionPerformed

        if (this.ArchivoCargado) { //ARCHIVO CARGADO LISTO PARA EMPEZAR A COMPILAR
            try {
                Compilacion Compilacion = new Compilacion();
           
                this.ErroresLexicos = Compilacion.AnalisisLexico(Archivo,true);
                this.ErroresSintacticos = Compilacion.analisisSintactico(TempData);
                Settings.msg.smsDialog("COMPILACION CORRECTA: \nPuedes Ver los errores lexicos y sintacticos\nen los botones de la parte superior.");
                this.BtnLoad.setText("COMPILACION FINALIZADA.");
                new CreateHTML().generarHtml(TempData);
            } catch (Exception e) {
                Settings.AppLog.Write("Form_CargarArchivo.CompilarArchivo", e, true);
            }
        }
        if (this.ArchivoCargado != true) { //ARCHIVO NO SE ENCUENTRA CARGADO BUSCAR
            RSFileChooser chooser = new RSFileChooser();
            chooser.setDialogTitle("SELECCIONA TXT");
            chooser.setFileFilter(new FileNameExtensionFilter("TXT", "txt"));
            int Open = chooser.showOpenDialog(null);
            if (Open == JFileChooser.APPROVE_OPTION) {

                Archivo = chooser.getSelectedFile();

                String linea;
                try {
                    BufferedReader leer = new BufferedReader(new FileReader(Archivo));
                    linea = leer.readLine();
                    while (linea != null) {
                        Previsualizacion.append(linea + "\n");
                        linea = leer.readLine();
                    }
                    this.ArchivoCargado = true;
                    this.TempData = Previsualizacion.getText();
                    this.BtnLoad.setText("COMPILAR");
                    Settings.msg.smsDialog("Cargado Exitoso.");
                } catch (IOException e) {
                    Settings.AppLog.Write("Form_CargarArchivo.CargarArchivo", e, true);
                }
            }
        }


    }//GEN-LAST:event_BtnLoadActionPerformed

    private void rSButtonMaterialTwo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialTwo2ActionPerformed
       new Form_Home().setVisible(true);
       dispose();
    }//GEN-LAST:event_rSButtonMaterialTwo2ActionPerformed

    private void rSButtonMaterialTwo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialTwo3ActionPerformed
        new CreateHTML().generarHtml(TempData);
    }//GEN-LAST:event_rSButtonMaterialTwo3ActionPerformed

    private void BtnErrorLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnErrorLexicoActionPerformed
        new CreateHTML().generarHTMLErroresLexicos(ErroresLexicos,Archivo);
    }//GEN-LAST:event_BtnErrorLexicoActionPerformed

    private void BtnErrorSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnErrorSintacticoActionPerformed
        new CreateHTML().generarHTMLErroresSintacticos(ErroresSintacticos);
    }//GEN-LAST:event_BtnErrorSintacticoActionPerformed

    private void rSButtonMaterialTwo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialTwo6ActionPerformed

        Settings.msg.smsDialog("INTEGRANTES:\n\n"
                + "Hubert Orellana (1890-17-13038)\n"
                + "Kevin Rosales (1890-19-5148)\n"
                + "Susan Roldan (1890-19-19031)\n"
                + "Miyatovich Gamarro (1890-19-12035)\n"
                + "Jayron Rodriguez (1890-18-12571)\n"
                + "Oswaldo Morales (1890-19-14492)");
    }//GEN-LAST:event_rSButtonMaterialTwo6ActionPerformed

    private void rSButtonMaterialTwo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialTwo7ActionPerformed
      this.ArchivoCargado = false;
      this.BtnLoad.setText("CARGAR ARCHIVO");
      this.ErroresLexicos = "";
      this.TempData = "";
      this.ErroresSintacticos = "";
      this.Previsualizacion.setText("");
      
    }//GEN-LAST:event_rSButtonMaterialTwo7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form_CargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_CargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_CargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_CargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_CargarArchivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialTwo BtnErrorLexico;
    private RSMaterialComponent.RSButtonMaterialTwo BtnErrorSintactico;
    private rojeru_san.complementos.ButtonHover BtnLoad;
    private javax.swing.JTextArea Previsualizacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private RSMaterialComponent.RSButtonMaterialTwo rSButtonMaterialTwo2;
    private RSMaterialComponent.RSButtonMaterialTwo rSButtonMaterialTwo3;
    private RSMaterialComponent.RSButtonMaterialTwo rSButtonMaterialTwo6;
    private RSMaterialComponent.RSButtonMaterialTwo rSButtonMaterialTwo7;
    // End of variables declaration//GEN-END:variables
}
