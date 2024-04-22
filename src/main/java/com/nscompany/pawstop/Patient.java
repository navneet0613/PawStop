/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.nscompany.pawstop;


public class Patient extends javax.swing.JFrame {

    public Patient() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        deet = new javax.swing.JLabel();
        prescrip = new javax.swing.JLabel();
        app = new javax.swing.JLabel();
        doc = new javax.swing.JLabel();
        cont = new javax.swing.JLabel();
        prof = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1380, 775));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(52, 139, 227));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/details.png"))); // NOI18N
        jLabel8.setText("Details");
        jLabel8.setToolTipText("Enter your pet's details");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel8.setFocusCycleRoot(true);
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(150, 100, 190, 160);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(52, 139, 227));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prescriptionn.png"))); // NOI18N
        jLabel9.setText("Presriptions\n");
        jLabel9.setToolTipText("View prescription and diagnosis provided by the doctor ");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(510, 100, 150, 160);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(52, 139, 227));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appointment.png"))); // NOI18N
        jLabel10.setText("Appointment");
        jLabel10.setToolTipText("Schedule an appointment");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(840, 100, 170, 160);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(52, 139, 227));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doc.png"))); // NOI18N
        jLabel11.setText("Doc Profile");
        jLabel11.setToolTipText("View doctor's profile");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(170, 390, 160, 150);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(52, 139, 227));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contact.png"))); // NOI18N
        jLabel12.setText("Contact Us");
        jLabel12.setToolTipText("Contact the clinic");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(530, 380, 130, 160);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(52, 139, 227));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proff.png"))); // NOI18N
        jLabel13.setText("Profile");
        jLabel13.setToolTipText("View your pet's profile ");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel13);
        jLabel13.setBounds(860, 376, 140, 170);

        deet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rr.png"))); // NOI18N
        deet.setToolTipText("Enter your pet's details");
        deet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deetMouseClicked(evt);
            }
        });
        jPanel1.add(deet);
        deet.setBounds(130, 70, 230, 220);

        prescrip.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prescrip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rr.png"))); // NOI18N
        prescrip.setToolTipText("View prescription and diagnosis provided by the doctor ");
        prescrip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prescripMouseClicked(evt);
            }
        });
        jPanel1.add(prescrip);
        prescrip.setBounds(470, 70, 230, 220);

        app.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        app.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rr.png"))); // NOI18N
        app.setToolTipText("Schedule an appointment");
        app.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appMouseClicked(evt);
            }
        });
        jPanel1.add(app);
        app.setBounds(800, 70, 240, 220);

        doc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rr.png"))); // NOI18N
        doc.setToolTipText("View doctor's profile");
        doc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docMouseClicked(evt);
            }
        });
        jPanel1.add(doc);
        doc.setBounds(140, 350, 220, 220);

        cont.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rr.png"))); // NOI18N
        cont.setToolTipText("Contact the clinic");
        cont.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contMouseClicked(evt);
            }
        });
        jPanel1.add(cont);
        cont.setBounds(480, 340, 220, 240);

        prof.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prof.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rr.png"))); // NOI18N
        prof.setToolTipText("View your pet's profile ");
        prof.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profMouseClicked(evt);
            }
        });
        jPanel1.add(prof);
        prof.setBounds(810, 350, 230, 220);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(100, 60, 1170, 620);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sss.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1380, 775));
        jLabel2.setMinimumSize(new java.awt.Dimension(1380, 775));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1920, 1080);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deetMouseClicked
        Details_p d=new Details_p();
        this.dispose();
        d.setVisible(true);
    }//GEN-LAST:event_deetMouseClicked

    private void prescripMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prescripMouseClicked
        Prescription_p p=new Prescription_p();
        this.dispose();
        p.setVisible(true);
    }//GEN-LAST:event_prescripMouseClicked

    private void appMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appMouseClicked
        Appointment_p a = new Appointment_p();
        this.dispose();
        a.setVisible(true);
    }//GEN-LAST:event_appMouseClicked

    private void docMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docMouseClicked
       Doc_p doc =new Doc_p();
       this.dispose();
       doc.setVisible(true);
    }//GEN-LAST:event_docMouseClicked

    private void contMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contMouseClicked
       Contact_p co =new Contact_p();
       this.dispose();
       co.setVisible(true);       
    }//GEN-LAST:event_contMouseClicked

    private void profMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profMouseClicked
       Profile_p pp =new Profile_p();
       this.dispose();
       pp.setVisible(true);
    }//GEN-LAST:event_profMouseClicked

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
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel app;
    private javax.swing.JLabel cont;
    private javax.swing.JLabel deet;
    private javax.swing.JLabel doc;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel prescrip;
    private javax.swing.JLabel prof;
    // End of variables declaration//GEN-END:variables
}
