/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.nscompany.pawstop;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class Review_a extends javax.swing.JInternalFrame {
ArrayList<Prescription> list = new ArrayList<Prescription>();
    /**
     * Creates new form Review_a
     */
    public Review_a() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI uii=(BasicInternalFrameUI)this.getUI();
        uii.setNorthPane(null);
        getUsers();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(1150, 734));
        setMinimumSize(new java.awt.Dimension(1150, 734));
        setPreferredSize(new java.awt.Dimension(1150, 734));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1150, 734));
        jPanel1.setMinimumSize(new java.awt.Dimension(1150, 734));
        jPanel1.setPreferredSize(new java.awt.Dimension(1150, 734));
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(410, 40, 700, 270);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bb.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(340, 18, 942, 320);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bb.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(559, 356, 723, 320);

        jLabel3.setText("previous prescription and diagnosis medicatino bla bla bla");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 169, 328, 16);

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
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        
        Prescription taskModel = new Prescription();
        int id = Integer.parseInt(dtm.getValueAt(selectedRow, 0).toString());
        
        for (Prescription listElement: list) {
            if (listElement.getId() == id) {
                taskModel = listElement;
                break;
            }
        }
    }
         private void getUsers() {
        final String statement = "SELECT * from prescription";
        try {
            PreparedStatement preparedStatement = ConnectionClass.getInstance().connection.prepareStatement(statement);

            ResultSet resultSet = preparedStatement.executeQuery();
            
            final String[] headerName = {"id","name","disease","prescription"};
            DefaultTableModel tableModel = new DefaultTableModel(null, headerName);
            jTable1.setModel(tableModel);
           


            list.clear();

            while (resultSet.next()) {
                    
                Prescription taskModel = new Prescription();
                taskModel.setId(resultSet.getInt("id"));
                taskModel.setName(resultSet.getString("name"));
                taskModel.setDisease(resultSet.getString("disease"));
                taskModel.setPrescription(resultSet.getString("prescription"));               
                
                
                list.add(taskModel);
                Object[] row = new Object[6];
                row[0] = taskModel.getId();
                row[1] = taskModel.getName();
                row[2] = taskModel.getDisease();
                row[3] = taskModel.getPrescription();              
                
                
                tableModel.addRow(row);
            }
                
            for (Prescription taskModel: list) {
                System.out.println(taskModel.getId());
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Prescription_p.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
