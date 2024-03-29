/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.nscompany.pawstop;

import javax.swing.SwingConstants;

/**
 *
 * @author Lenovo
 */
public class Agree_p extends javax.swing.JFrame {

    /**
     * Creates new form Agree_p
     */
    public Agree_p() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1380, 775));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(52, 139, 227));
        jLabel2.setText("Terms and Conditions");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("<html><p align=\"justify\"> This agreement (\"Terms and Conditions\") is entered into between the Doctor(Vet), herein referred to as the \"Clinic,\" and the pet owner, herein referred to as the \"Owner,\".<br><br> \n<B>Services Provided:</B><br> The Clinic agrees to provide veterinary services to the Owner's pet (\"Patient\") as requested by the Owner.<br><br>\n <B>Responsibilities of the Clinic:</B><br> 1.The Clinic will provide veterinary care and treatment to the Patient to the best of its abilities and in accordance with accepted veterinary practices.<br> 2.The Clinic will ensure that all veterinary procedures and treatments are performed by qualified and licensed veterinarians and staff.<br><br>\n <B>Responsibilities of the Owner:</B><br> 1.The Owner will provide accurate and complete information about the Patient's medical history, behavior, and any pre-existing conditions.<br> 2.The Owner will follow the Clinic's instructions for care, medication administration, and post-treatment protocols.<br> 3.The Owner will promptly notify the Clinic of any changes in the Patient's condition or any concerns regarding the treatment provided.<br><br\n> <B>Limitation of Liability:</B> <br>1.The Owner acknowledges that veterinary medicine is not an exact science, and despite the Clinic's best efforts, there are inherent risks associated with medical procedures and treatments. <br>2.The Owner agrees that the Clinic shall not be liable for any harm, injury, or adverse reactions suffered by the Patient as a result of veterinary care or treatment, except in cases of gross negligence or willful misconduct on the part of the Clinic or its staff.<br> 3.The Owner understands that the Clinic cannot guarantee the success of any treatment or procedure, nor can it guarantee a specific outcome for the Patient's condition.<br> 4.The Owner agrees to indemnify and hold harmless the Clinic, its veterinarians, staff, and agents from any claims, liabilities, damages, or expenses arising out of or related to the Owner's breach of this Agreement or the care and treatment of the Patient.<br><br>\n <B>Consent for Treatment:</B><br> 1.The Owner hereby consents to the Clinic's provision of veterinary care and treatment to the Patient, including but not limited to diagnostic tests, medical procedures, surgery, and medication administration.<br>2. The Owner acknowledges that they have been informed of the risks, benefits, and alternatives to the proposed treatment options and have had the opportunity to ask questions and seek clarification. <p>  </html>  ");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel4.setText("<html>\n<B><U  style=\"color:rgb(52,139,227);\">Back to Sign Up</U></B>\n</html>");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(511, 511, 511)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(620, 620, 620)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(523, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 50, 1380, 640);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sss.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1380, 780);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        Sign sign=new Sign();
        this.dispose();
        sign.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Agree_p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agree_p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agree_p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agree_p.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agree_p().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
