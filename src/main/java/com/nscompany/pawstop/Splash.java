/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.nscompany.pawstop;

/**
 *
 * @author Lenovo
 */
public class Splash extends javax.swing.JFrame {

    public Splash() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1380, 775));
        getContentPane().setLayout(null);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        Splash splash=new Splash();
        splash.setVisible(true);
       
       try {
           
                Thread.sleep(3000);
       }
       catch(Exception e){
       }
       
       
      splash.setVisible(false);
      
        Login log=new Login();
        log.setVisible(true);
       
       splash.dispose();     
        
        
    }
        
        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Splash().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
