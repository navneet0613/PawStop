/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.nscompany.pawstop;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
/**
 *
 * @author Lenovo
 */
public class Newpatient_a extends javax.swing.JInternalFrame {
ConnectionClass cn1=new ConnectionClass.getInstance();
    /**
     * Creates new form Newpatient_a
     */
    public Newpatient_a() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI uii=(BasicInternalFrameUI)this.getUI();
        uii.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        spe = new javax.swing.JTextField();
        sym = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        breed = new javax.swing.JTextField();
        premed = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        oname = new javax.swing.JTextField();
        phoneno = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        add = new javax.swing.JTextField();
        dob = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1150, 734));
        setMinimumSize(new java.awt.Dimension(1150, 734));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1150, 734));
        jPanel1.setMinimumSize(new java.awt.Dimension(1150, 734));
        jPanel1.setPreferredSize(new java.awt.Dimension(1150, 734));
        jPanel1.setLayout(null);

        jLabel3.setText("Patient Details");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(61, 139, 90, 30);
        jPanel1.add(name);
        name.setBounds(430, 70, 64, 22);
        jPanel1.add(spe);
        spe.setBounds(430, 130, 64, 22);
        jPanel1.add(sym);
        sym.setBounds(440, 270, 64, 22);
        jPanel1.add(gender);
        gender.setBounds(730, 70, 64, 22);
        jPanel1.add(breed);
        breed.setBounds(760, 140, 64, 22);
        jPanel1.add(premed);
        premed.setBounds(760, 210, 64, 22);

        jLabel4.setText("Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 70, 32, 16);

        jLabel5.setText("Species");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(310, 130, 39, 16);

        jLabel6.setText("Date of Birth");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(300, 200, 66, 16);

        jLabel7.setText("Symptoms");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(287, 270, 70, 16);

        jLabel8.setText("Gender");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(660, 70, 50, 16);

        jLabel9.setText("Breed");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(680, 150, 30, 16);

        jLabel10.setText("Previous Medication");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(640, 210, 108, 16);

        jLabel12.setText("Owner Details");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(130, 470, 90, 16);

        jLabel13.setText("Name");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(530, 410, 32, 16);

        jLabel14.setText("Phone number");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(530, 460, 79, 16);

        jLabel15.setText("E-mail");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(530, 510, 34, 16);

        jLabel16.setText("Address");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(530, 570, 42, 16);
        jPanel1.add(oname);
        oname.setBounds(800, 410, 64, 22);
        jPanel1.add(phoneno);
        phoneno.setBounds(800, 470, 64, 22);
        jPanel1.add(mail);
        mail.setBounds(800, 530, 64, 22);
        jPanel1.add(add);
        add.setBounds(800, 590, 64, 22);
        jPanel1.add(dob);
        dob.setBounds(430, 200, 96, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bb.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(198, 22, 952, 320);

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(970, 640, 140, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bb.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(345, 360, 805, 320);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1150, 734);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(name.getText().isEmpty()){
             JOptionPane.showMessageDialog(rootPane,"Name cannot be empty");
        }else if(dob.getDate()==null){
            JOptionPane.showMessageDialog(rootPane,"Choose date of birth");
        }else if(breed.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Breed cannot ne empty"); 
        }else if(gender.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Gender cannot be empty "); 
        }else if(spe.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Species cannot be empty");
        }else if(sym.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Cannot be empty, enter NO if required");
        }else if(premed.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Cannot be empty");
        }else if(oname.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Enter your name"); 
        }else if(phoneno.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Enter contacy information"); 
        }else if(mail.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Email cannot be empty"); 
        }else if(add.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Address cannot be empty"); 
        }else{
        String INSERTDB3 = "INSERT INTO petdetails( name, gender, species, breed, dob, premed, symp, oname, phoneno, email, address) " +
                   "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            try{
               PreparedStatement ps=cn1.connection.prepareCall(INSERTDB3);
               ps.setString(1, name.getText().toString());
               ps.setString(2, gender.getText().toString());
               ps.setString(3, spe.getText().toString());
               ps.setString(4, breed.getText().toString());
               ps.setString(5, dob.getDate().toString());
               ps.setString(6, premed.getText().toString());
               ps.setString(7, sym.getText().toString());
               ps.setString(8, oname.getText().toString());
               ps.setString(9, phoneno.getText().toString());
               ps.setString(10,mail.getText().toString());
               ps.setString(11,add.getText().toString());
               
               Boolean isAdded=ps.execute();
               JOptionPane.showMessageDialog(rootPane,"Successful!");
               if(isAdded==true){
                   
                   System.out.println("Successfully");
               }
            }
             catch(SQLException sqlException){
                System.out.println("Error Message"+sqlException.getMessage());
            }}}
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
            java.util.logging.Logger.getLogger(Details_p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Details_p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Details_p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Details_p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Details_p().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    private javax.swing.JTextField breed;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField name;
    private javax.swing.JTextField oname;
    private javax.swing.JTextField phoneno;
    private javax.swing.JTextField premed;
    private javax.swing.JTextField spe;
    private javax.swing.JTextField sym;
    // End of variables declaration//GEN-END:variables
}
