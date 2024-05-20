/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.nscompany.pawstop;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Lenovo
 */
public class Newpriscription_a extends javax.swing.JInternalFrame {
ConnectionClass cn1=new ConnectionClass.getInstance();

    
    public Newpriscription_a() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI uii=(BasicInternalFrameUI)this.getUI();
        uii.setNorthPane(null);
        
     name.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
       
        char c = e.getKeyChar();       
        if (c == ' ' && name.getText().isEmpty()) {
            
            e.consume();
        }
    }
});
      dis.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
       
        char c = e.getKeyChar();       
        if (c == ' ' && dis.getText().isEmpty()) {
            
            e.consume();
        }
    }
});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pres = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dis = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setMaximumSize(new java.awt.Dimension(1150, 734));
        setMinimumSize(new java.awt.Dimension(1150, 734));
        setPreferredSize(new java.awt.Dimension(1150, 734));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(1150, 734));
        jPanel2.setMinimumSize(new java.awt.Dimension(1150, 734));
        jPanel2.setPreferredSize(new java.awt.Dimension(1150, 734));
        jPanel2.setLayout(null);

        pres.setColumns(20);
        pres.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pres.setRows(5);
        jScrollPane1.setViewportView(pres);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(320, 70, 720, 490);

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(52, 139, 227));
        jLabel3.setText("Prescription");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(170, 10, 150, 40);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Prescribed to");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 120, 100, 30);
        jPanel2.add(name);
        name.setBounds(130, 120, 170, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Disease");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 190, 70, 20);

        dis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disActionPerformed(evt);
            }
        });
        jPanel2.add(dis);
        dis.setBounds(130, 180, 170, 30);

        submit.setBackground(new java.awt.Color(102, 204, 255));
        submit.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel2.add(submit);
        submit.setBounds(580, 570, 230, 40);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jj.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 30, 1110, 610);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if(name.getText().isEmpty()){
             JOptionPane.showMessageDialog(rootPane,"Name cannot be empty");
        }else if(dis.getText().isEmpty()){
             JOptionPane.showMessageDialog(rootPane,"Mention disease");
        }else if(pres.getText().isEmpty()){
             JOptionPane.showMessageDialog(rootPane,"Add prescription");
        }else{
         String INSERTDB3="INSERT INTO prescription( name,disease,prescription)"+" VALUES(?,?,?)";
           try{
              PreparedStatement ps=cn1.connection.prepareCall(INSERTDB3);
               ps.setString(1, name.getText().toString());
              ps.setString(2, dis.getText().toString());
               ps.setString(3, pres.getText().toString());
        
           
               Boolean isAdded=ps.execute();
               JOptionPane.showMessageDialog(rootPane,"Successful!");
              if(isAdded==true){
                   
                   System.out.println("Successfully");
              }
            }
            catch(SQLException sqlException){
                System.out.println("Error Message"+sqlException.getMessage());
            }
        }

    }//GEN-LAST:event_submitActionPerformed

    private void disActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextArea pres;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
