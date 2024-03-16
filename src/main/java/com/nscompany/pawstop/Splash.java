/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.nscompany.pawstop;
public class Splash extends javax.swing.JFrame {

   
    public Splash() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1380, 775));
        setPreferredSize(new java.awt.Dimension(1380, 775));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ss.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-250, -150, 1730, 990);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
       Splash splash=new Splash();
       splash.setVisible(true);
       try{
           Thread.sleep(3000);
       } 
       catch(Exception e){
               }
       splash.setVisible(false);
       Log log=new Log();
       log.setVisible(true);
       
       splash.dispose();
       
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Splash().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
