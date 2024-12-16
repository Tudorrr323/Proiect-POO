/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proiectpoo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author va195
 */
public class ValentinaGUI2 extends javax.swing.JFrame {

    /**
     * Creates new form ValentinaGUI2
     */
    static FileReader fr = null;
    static BufferedReader br = null;
    static String line = "", cuvant = "";
    static int contor = 0;
    
    public ValentinaGUI2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textLaptopuri = new java.awt.TextArea();
        textAccesoriiLaptop = new java.awt.TextArea();
        textCalculatoare = new java.awt.TextArea();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(960, 620));

        textLaptopuri.setEditable(false);

        textAccesoriiLaptop.setEditable(false);

        textCalculatoare.setEditable(false);

        label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label1.setText("Vector Calculatoare");

        label2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label2.setText("Vector Accesorii Laptop");

        label3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label3.setText("Vector Laptopuri");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textCalculatoare, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textLaptopuri, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textAccesoriiLaptop, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textLaptopuri, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCalculatoare, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAccesoriiLaptop, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ValentinaGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ValentinaGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ValentinaGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ValentinaGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ValentinaGUI2().setVisible(true);
                afisareVectori();
            }
        });
    }
    
    public static void afisareVectori(){
        try{
            fr = new FileReader("src\\main\\java\\com\\mycompany\\proiectpoo\\textValentina.txt");
            br = new BufferedReader(fr);
            line = br.readLine();
            
            while(line != null){
                if(line.isEmpty()){
                    line = br.readLine();
                    contor++;
                }
                
                String[] parti = line.split(",");
                
                switch(contor) {
                    case 0 -> textCalculatoare.append("Placa Video: " + parti[0] + 
                                "\nProcesor: " + parti[1] +
                                "\nPlaca de baza: " + parti[2] +
                                "\nMemorie RAM: " + parti[3] + " GB" +
                                "\nStocare" + parti[4] + " GB" +
                                "\nAlimentare: " + parti[5] + " W\n\n");
                    case 1 -> textLaptopuri.append("Nume Mouse: " + parti[0] +
                            "\nDiagonala Monitor: " + parti[1] +
                            "\nGreutate: " + parti[2] +
                            "\nDaca Tastatura este iluminata: " + parti[3] +
                            "\nAutonomie Baterie: " + parti[4] +
                            "\nPlaca Video: " + parti[5] + 
                            "\nProcesor: " + parti[6] +
                            "\nPlaca de baza: " + parti[7] +
                            "\nMemorie RAM: " + parti[8] + " GB" +
                            "\nStocare" + parti[9] + " GB" +
                            "\nAlimentare: " + parti[10] + " W\n\n");
                    case 2 -> textAccesoriiLaptop.append("Are Geanta: " + parti[0] +
                            "\nAre Cooling Pad: " + parti[1] +
                            "\nAre Casti: " + parti[2] +
                            "\nAre Protectie Ecran: " + parti[3] +
                            "\nNume Mouse: " + parti[4] +
                            "\nDiagonala Monitor: " + parti[5] +
                            "\nGreutate: " + parti[6] +
                            "\nDaca Tastatura este iluminata: " + parti[7] +
                            "\nAutonomie Baterie: " + parti[8] +
                            "\nPlaca Video: " + parti[9] + 
                            "\nProcesor: " + parti[10] +
                            "\nPlaca de baza: " + parti[11] +
                            "\nMemorie RAM: " + parti[12] + " GB" +
                            "\nStocare" + parti[13] + " GB" +
                            "\nAlimentare: " + parti[14] + " W\n\n");
                    default -> {
                    }
                }
                line = br.readLine();
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul nu a fost gasit: " + fr);//Daca fisierul nu a fost gasit intra pe exceptia asta si afiseaza mesajul
        } catch (IOException ex) {
            Logger.getLogger(ValentinaGUI2.class.getName()).log(Level.SEVERE, null, ex);
        }//Daca fisierul textValentina.txt nu exista, exceptia va fi prinsa, iar detaliile vor fi logate fara a opri programul.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private static java.awt.TextArea textAccesoriiLaptop;
    private static java.awt.TextArea textCalculatoare;
    private static java.awt.TextArea textLaptopuri;
    // End of variables declaration//GEN-END:variables
}
