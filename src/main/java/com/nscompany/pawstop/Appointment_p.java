/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.nscompany.pawstop;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author Lenovo
 */
public class Appointment_p extends javax.swing.JFrame {
ConnectionClass cn1=new ConnectionClass.getInstance();

    /**
     * Creates new form Appointment_p
     */
    public Appointment_p() {
        initComponents();
        pname.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
       
        char c = e.getKeyChar();       
        if (c == ' ' && pname.getText().isEmpty()) {
            
            e.consume();
        }
    }
});
        pspe.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
       
        char c = e.getKeyChar();       
        if (c == ' ' && pspe.getText().isEmpty()) {
            
            e.consume();
        }
    }
});
        sym.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
       
        char c = e.getKeyChar();       
        if (c == ' ' && sym.getText().isEmpty()) {
            
            e.consume();
        }
    }
});
        pgen.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
       
        char c = e.getKeyChar();       
        if (c == ' ' && pgen.getText().isEmpty()) {
            
            e.consume();
        }
    }
});
        pbreed.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
       
        char c = e.getKeyChar();       
        if (c == ' ' && pbreed.getText().isEmpty()) {
            
            e.consume();
        }
    }
});
        purr.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
       
        char c = e.getKeyChar();       
        if (c == ' ' && purr.getText().isEmpty()) {
            
            e.consume();
        }
    }
});
        oname.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
       
        char c = e.getKeyChar();       
        if (c == ' ' && oname.getText().isEmpty()) {
            
            e.consume();
        }
    }
});
        phoneno.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
       
        char c = e.getKeyChar();       
        if (c == ' ' && phoneno.getText().isEmpty()) {
            
            e.consume();
        }
    }
});
         email.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
       
        char c = e.getKeyChar();       
        if (c == ' ' && email.getText().isEmpty()) {
            
            e.consume();
        }
    }
});
          add.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
       
        char c = e.getKeyChar();       
        if (c == ' ' && add.getText().isEmpty()) {
            
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        pspe = new javax.swing.JTextField();
        pgen = new javax.swing.JTextField();
        pbreed = new javax.swing.JTextField();
        purr = new javax.swing.JTextField();
        sym = new javax.swing.JTextField();
        apdt = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        oname = new javax.swing.JTextField();
        phoneno = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        add = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1380, 775));
        setMinimumSize(new java.awt.Dimension(1380, 775));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1380, 775));
        jPanel1.setMinimumSize(new java.awt.Dimension(1380, 775));
        jPanel1.setPreferredSize(new java.awt.Dimension(1380, 775));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(52, 139, 227));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animal-shelter.png"))); // NOI18N
        jLabel3.setText("Pet Details");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1120, 100, 150, 180);

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(52, 139, 227));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boy.png"))); // NOI18N
        jLabel4.setText("Owner Details ");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 480, 190, 160);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(240, 90, 60, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Species");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(230, 140, 60, 30);
        jPanel1.add(dob);
        dob.setBounds(350, 200, 210, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Date of Birth");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(220, 207, 90, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Symptoms/Disease");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(200, 270, 140, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Gender");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(680, 80, 50, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Breed");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(680, 140, 50, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Purpose of visit");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(660, 200, 100, 30);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Date of Appointment ");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(640, 270, 140, 30);
        jPanel1.add(pname);
        pname.setBounds(350, 80, 210, 30);
        jPanel1.add(pspe);
        pspe.setBounds(350, 140, 210, 30);
        jPanel1.add(pgen);
        pgen.setBounds(780, 80, 200, 30);
        jPanel1.add(pbreed);
        pbreed.setBounds(780, 140, 200, 30);
        jPanel1.add(purr);
        purr.setBounds(780, 200, 200, 30);
        jPanel1.add(sym);
        sym.setBounds(350, 270, 210, 30);
        jPanel1.add(apdt);
        apdt.setBounds(780, 270, 200, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bb.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 30, 1051, 320);
        jPanel1.add(oname);
        oname.setBounds(690, 430, 230, 30);
        jPanel1.add(phoneno);
        phoneno.setBounds(690, 490, 230, 30);
        jPanel1.add(email);
        email.setBounds(690, 550, 230, 30);
        jPanel1.add(add);
        add.setBounds(690, 610, 230, 30);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Name");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(580, 440, 60, 17);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Phone No.");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(570, 500, 80, 17);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Email");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(580, 560, 70, 20);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("Address");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(570, 620, 80, 17);

        jButton1.setBackground(new java.awt.Color(102, 204, 255));
        jButton1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(600, 660, 290, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bb.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(299, 391, 1051, 320);

        jButton2.setBackground(new java.awt.Color(102, 204, 255));
        jButton2.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1180, 10, 130, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit
         String regex = "^(?=.{1,64}@)[\\p{L}0-9_-]+(\\.[\\p{L}0-9_-]+)*@" 
        + "[^-][\\p{L}0-9-]+(\\.[\\p{L}0-9-]+)*(\\.[\\p{L}]{2,})$";
         Pattern pattern = Pattern.compile(regex); 
        Matcher matcher = pattern.matcher(email.getText());
        
         String phoneRE = "[0-9]+";
         Pattern phonePattern = Pattern.compile(phoneRE);
          Matcher phoneMatcher = phonePattern.matcher(phoneno.getText());       
        
        
      
        if(pname.getText().isEmpty()){
             JOptionPane.showMessageDialog(rootPane,"Name cannot be empty");
        }else if(dob.getDate()==null){
            JOptionPane.showMessageDialog(rootPane,"Choose date of birth");
        }else if(pbreed.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Breed cannot ne empty"); 
        }else if(apdt.getDate()==null){
             JOptionPane.showMessageDialog(rootPane,"Choose appointment date");
        }else if(pgen.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Gender cannot be empty "); 
        }else if(pspe.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Species cannot be empty");
        }else if(purr.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Enter purpose of your visit");
        }else if(sym.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Cannot be empty, enter NONE if required");
        }else if(oname.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Enter your name"); 
        }else if(phoneno.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Enter contact information"); 
        }else if(phoneMatcher.matches()==false){
            JOptionPane.showMessageDialog(rootPane,"Enter digits for Phone No."); 
        } else if(phoneno.getText().length()!=10){
            JOptionPane.showMessageDialog(rootPane,"Enter valid phone number");
        }else if(email.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Email cannot be empty");
        }else if(matcher.matches()== false){
            JOptionPane.showMessageDialog(rootPane,"Enter VALID Email");
        }else if(add.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Address cannot be empty"); 
        }else{
            String INSERTDB3="INSERT INTO appointment( name,gender,species,breed,dob,purposeofvisit,symptom,dateofapp,oname,phoneno,email,address)"+" VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
           try{
              PreparedStatement ps=cn1.connection.prepareCall(INSERTDB3);
               ps.setString(1, pname.getText().toString());
              ps.setString(2, pgen.getText().toString());
               ps.setString(3, pspe.getText().toString());
              ps.setString(4, pbreed.getText().toString());              
               ps.setString(5, dob.getDate().toString());
               ps.setString(6, purr.getText().toString());
               ps.setString(7, sym.getText().toString());
               ps.setString(8, apdt.getDate().toString());
               ps.setString(9, oname.getText().toString());                  
               ps.setString(10, phoneno.getText().toString());
               ps.setString(11, email.getText().toString());
               ps.setString(12, add.getText().toString());

               Boolean isAdded=ps.execute();
               JOptionPane.showMessageDialog(rootPane,"Appointment accepted!");
              if(isAdded==true){
                   
                   System.out.println("Successfully");
              }
            }
            catch(SQLException sqlException){
                System.out.println("Error Message"+sqlException.getMessage());
            }
        }
    }//GEN-LAST:event_submit

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Patient p=new Patient();
        this.dispose();
        p.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
   
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
            java.util.logging.Logger.getLogger(Appointment_p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointment_p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointment_p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointment_p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointment_p().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    private com.toedter.calendar.JDateChooser apdt;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField oname;
    private javax.swing.JTextField pbreed;
    private javax.swing.JTextField pgen;
    private javax.swing.JTextField phoneno;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField pspe;
    private javax.swing.JTextField purr;
    private javax.swing.JTextField sym;
    // End of variables declaration//GEN-END:variables
}
