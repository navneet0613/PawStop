
package com.nscompany.pawstop;
import java.awt.Color;

public class admin_a extends javax.swing.JFrame {
    Color DefaultColor,ClickedColor;
    
    public admin_a() {
        initComponents();
         //the color code 
        DefaultColor= new Color(255,255,255);
        ClickedColor=new Color(220,220,220);
        
            home.setBackground(DefaultColor);
            app.setBackground(DefaultColor);           
            npat.setBackground(DefaultColor);
            pres.setBackground(DefaultColor);
            list.setBackground(DefaultColor); 
            rev.setBackground(DefaultColor);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desk = new javax.swing.JDesktopPane();
        pane = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        app = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        list = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        npat = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pres = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        rev = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1380, 775));
        getContentPane().setLayout(null);

        pane.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout paneLayout = new javax.swing.GroupLayout(pane);
        pane.setLayout(paneLayout);
        paneLayout.setHorizontalGroup(
            paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        paneLayout.setVerticalGroup(
            paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );

        desk.setLayer(pane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout deskLayout = new javax.swing.GroupLayout(desk);
        desk.setLayout(deskLayout);
        deskLayout.setHorizontalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        deskLayout.setVerticalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deskLayout.createSequentialGroup()
                .addComponent(pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(desk);
        desk.setBounds(200, 40, 1150, 740);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        app.setBackground(new java.awt.Color(255, 255, 255));
        app.setToolTipText("Schedule a new appointment");
        app.setMinimumSize(new java.awt.Dimension(200, 50));
        app.setPreferredSize(new java.awt.Dimension(200, 50));
        app.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                appMouseMoved(evt);
            }
        });
        app.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calendar-clock.png"))); // NOI18N
        jLabel2.setText("Appointment");
        jLabel2.setToolTipText("Schedule a new appointment");

        javax.swing.GroupLayout appLayout = new javax.swing.GroupLayout(app);
        app.setLayout(appLayout);
        appLayout.setHorizontalGroup(
            appLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        appLayout.setVerticalGroup(
            appLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.add(app);
        app.setBounds(0, 90, 200, 50);

        list.setBackground(new java.awt.Color(255, 255, 255));
        list.setToolTipText("View  list of patients");
        list.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                listMouseMoved(evt);
            }
        });
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/list-check.png"))); // NOI18N
        jLabel5.setText("List of Patients ");
        jLabel5.setToolTipText("View  list of patients");

        javax.swing.GroupLayout listLayout = new javax.swing.GroupLayout(list);
        list.setLayout(listLayout);
        listLayout.setHorizontalGroup(
            listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        listLayout.setVerticalGroup(
            listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.add(list);
        list.setBounds(0, 300, 200, 50);

        npat.setBackground(new java.awt.Color(255, 255, 255));
        npat.setToolTipText("Add a new patient ");
        npat.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                npatMouseMoved(evt);
            }
        });
        npat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                npatMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multiple.png"))); // NOI18N
        jLabel3.setText("New Patient");
        jLabel3.setToolTipText("Add a new patient ");

        javax.swing.GroupLayout npatLayout = new javax.swing.GroupLayout(npat);
        npat.setLayout(npatLayout);
        npatLayout.setHorizontalGroup(
            npatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(npatLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        npatLayout.setVerticalGroup(
            npatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(npatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.add(npat);
        npat.setBounds(0, 160, 200, 50);

        pres.setBackground(new java.awt.Color(255, 255, 255));
        pres.setToolTipText("Add new prescription");
        pres.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                presMouseMoved(evt);
            }
        });
        pres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                presMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prescription-bottle-pill.png"))); // NOI18N
        jLabel4.setText("Prescription");
        jLabel4.setToolTipText("Add new prescription");

        javax.swing.GroupLayout presLayout = new javax.swing.GroupLayout(pres);
        pres.setLayout(presLayout);
        presLayout.setHorizontalGroup(
            presLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(presLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        presLayout.setVerticalGroup(
            presLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(presLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.add(pres);
        pres.setBounds(0, 230, 200, 50);

        rev.setBackground(new java.awt.Color(255, 255, 255));
        rev.setToolTipText("Review patients' records");
        rev.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                revMouseMoved(evt);
            }
        });
        rev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                revMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/to-do.png"))); // NOI18N
        jLabel6.setText("Review List ");
        jLabel6.setToolTipText("Review patients' records");

        javax.swing.GroupLayout revLayout = new javax.swing.GroupLayout(rev);
        rev.setLayout(revLayout);
        revLayout.setHorizontalGroup(
            revLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(revLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        revLayout.setVerticalGroup(
            revLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(revLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.add(rev);
        rev.setBounds(0, 370, 200, 50);

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setToolTipText("Visit home");
        home.setMinimumSize(new java.awt.Dimension(200, 50));
        home.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                homeMouseMoved(evt);
            }
        });
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home-page.png"))); // NOI18N
        jLabel9.setText("Home");
        jLabel9.setToolTipText("Visit Home");

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel9)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.add(home);
        home.setBounds(0, 20, 200, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 210, 210, 570);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<html><u>LOG OUT</u></html>");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1220, 0, 70, 30);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1190, 0, 32, 40);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 30, 140, 130);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ADMIN");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(70, 170, 60, 17);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sss.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-100, 0, 1810, 780);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void appMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appMouseMoved
        home.setBackground(DefaultColor);
        app.setBackground(ClickedColor);
        npat.setBackground(DefaultColor);
        pres.setBackground(DefaultColor);
        list.setBackground(DefaultColor); 
        rev.setBackground(DefaultColor);
    }//GEN-LAST:event_appMouseMoved

    private void npatMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_npatMouseMoved
        home.setBackground(DefaultColor);
        app.setBackground(DefaultColor);
        npat.setBackground(ClickedColor);
        pres.setBackground(DefaultColor);
        list.setBackground(DefaultColor); 
        rev.setBackground(DefaultColor);
    }//GEN-LAST:event_npatMouseMoved

    private void presMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_presMouseMoved
       home.setBackground(DefaultColor);
        app.setBackground(DefaultColor);
        npat.setBackground(DefaultColor);
        pres.setBackground(ClickedColor);
        list.setBackground(DefaultColor); 
        rev.setBackground(DefaultColor);
    }//GEN-LAST:event_presMouseMoved

    private void listMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseMoved
        home.setBackground(DefaultColor);
        app.setBackground(DefaultColor);
        npat.setBackground(DefaultColor);
        pres.setBackground(DefaultColor);
        list.setBackground(ClickedColor); 
        rev.setBackground(DefaultColor);
    }//GEN-LAST:event_listMouseMoved

    private void revMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_revMouseMoved
        home.setBackground(DefaultColor);
        app.setBackground(DefaultColor);
        npat.setBackground(DefaultColor);
        pres.setBackground(DefaultColor);
        list.setBackground(DefaultColor); 
        rev.setBackground(ClickedColor);
    }//GEN-LAST:event_revMouseMoved

    private void appMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appMouseClicked
      Appointment_a a=new Appointment_a();
      desk.removeAll();
      desk.add(a).setVisible(true);
    }//GEN-LAST:event_appMouseClicked

    private void npatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_npatMouseClicked
       Newpatient_a n=new Newpatient_a();
       desk.removeAll();
       desk.add(n).setVisible(true);
    }//GEN-LAST:event_npatMouseClicked

    private void presMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_presMouseClicked
         Newpriscription_a p=new Newpriscription_a();
        desk.removeAll();
        desk.add(p).setVisible(true);
    }//GEN-LAST:event_presMouseClicked

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
         list_a l=new list_a();
        desk.removeAll();
        desk.add(l).setVisible(true);
    }//GEN-LAST:event_listMouseClicked

    private void revMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_revMouseClicked
        Review_a v=new Review_a();
        desk.removeAll();
        desk.add(v).setVisible(true);                                   
    }//GEN-LAST:event_revMouseClicked

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
      Log l=new Log();
      this.dispose();
      l.setVisible(true);
    }//GEN-LAST:event_jLabel7MousePressed

    private void homeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseMoved
       home.setBackground(ClickedColor);
        app.setBackground(DefaultColor);
        npat.setBackground(DefaultColor);
        pres.setBackground(DefaultColor);
        list.setBackground(DefaultColor); 
        rev.setBackground(DefaultColor);
    }//GEN-LAST:event_homeMouseMoved

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        Home_a h=new Home_a();
        desk.removeAll();
        desk.add(h).setVisible(true);
    }//GEN-LAST:event_homeMouseClicked

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
            java.util.logging.Logger.getLogger(admin_a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_a().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel app;
    private javax.swing.JDesktopPane desk;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel list;
    private javax.swing.JPanel npat;
    private javax.swing.JPanel pane;
    private javax.swing.JPanel pres;
    private javax.swing.JPanel rev;
    // End of variables declaration//GEN-END:variables
}
