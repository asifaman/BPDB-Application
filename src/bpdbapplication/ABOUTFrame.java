package bpdbapplication;

public class ABOUTFrame extends javax.swing.JFrame {

    public ABOUTFrame() {
        initComponents();

        //this.setExtendedState(this.getExtendedState() | Frame.MAXIMIZED_BOTH);





    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel10 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        photo = new javax.swing.JLabel();
        m1 = new Utility.SLabel();
        m2 = new Utility.SLabel();
        m3 = new Utility.SLabel();
        m4 = new Utility.SLabel();
        m5 = new Utility.SLabel();
        m6 = new Utility.SLabel();
        m7 = new Utility.SLabel();
        m8 = new Utility.SLabel();
        m9 = new Utility.SLabel();
        m10 = new Utility.SLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel10.setBackground(new java.awt.Color(255, 255, 255));
        Panel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel10.setForeground(new java.awt.Color(51, 51, 51));

        backButton.setBackground(new java.awt.Color(51, 51, 51));
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BPDB.png"))); // NOI18N
        photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        m1.setText("ADDRESS");
        m1.setFont(new java.awt.Font("Tahoma", 1, 12));
        m1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m1MouseClicked(evt);
            }
        });

        m2.setText("ADDRESS");
        m2.setFont(new java.awt.Font("Tahoma", 1, 12));
        m2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m2MouseClicked(evt);
            }
        });

        m3.setText("CHAIRMAN");
        m3.setFont(new java.awt.Font("Tahoma", 1, 12));
        m3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m3MouseClicked(evt);
            }
        });

        m4.setText("VICE CHAIRMAN");
        m4.setFont(new java.awt.Font("Tahoma", 1, 12));
        m4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m4MouseClicked(evt);
            }
        });

        m5.setText("MD");
        m5.setFont(new java.awt.Font("Tahoma", 1, 12));
        m5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m5MouseClicked(evt);
            }
        });

        m6.setText("DMD");
        m6.setFont(new java.awt.Font("Tahoma", 1, 12));
        m6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m6MouseClicked(evt);
            }
        });

        m7.setText("GM");
        m7.setFont(new java.awt.Font("Tahoma", 1, 12));
        m7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m7MouseClicked(evt);
            }
        });

        m8.setText("DGM");
        m8.setFont(new java.awt.Font("Tahoma", 1, 12));
        m8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m8MouseClicked(evt);
            }
        });

        m9.setText("KNOWN");
        m9.setFont(new java.awt.Font("Tahoma", 1, 12));
        m9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m9MouseClicked(evt);
            }
        });

        m10.setText("DIRECTOR PANEL");
        m10.setFont(new java.awt.Font("Tahoma", 1, 12));
        m10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel10Layout = new javax.swing.GroupLayout(Panel10);
        Panel10.setLayout(Panel10Layout);
        Panel10Layout.setHorizontalGroup(
            Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel10Layout.createSequentialGroup()
                .addGroup(Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel10Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(m9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(m10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(339, 339, 339)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel10Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21)
                            .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)
                            .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(m7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(m8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10))
                        .addComponent(photo, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        Panel10Layout.setVerticalGroup(
            Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel10Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addGroup(Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(m10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(m9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
    setVisible(false);
    dispose();
    new LoginFrame().setVisible(true);
}//GEN-LAST:event_backButtonActionPerformed

private void m1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m1MouseClicked
    // TODO add your handling code here:
    new Address().setVisible(true);

}//GEN-LAST:event_m1MouseClicked

private void m2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m2MouseClicked
// TODO add your handling code here:
    new Addresss().setVisible(true);
}//GEN-LAST:event_m2MouseClicked

private void m3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m3MouseClicked
// TODO add your handling code here:
    new CHAIRMANFrame().setVisible(true);
}//GEN-LAST:event_m3MouseClicked

private void m4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m4MouseClicked
// TODO add your handling code here:
    new Vc().setVisible(true);
}//GEN-LAST:event_m4MouseClicked

private void m5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m5MouseClicked
// TODO add your handling code here:
    new Md().setVisible(true);
}//GEN-LAST:event_m5MouseClicked

private void m6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m6MouseClicked
// TODO add your handling code here:
    new Dmd().setVisible(true);
}//GEN-LAST:event_m6MouseClicked

private void m7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m7MouseClicked
// TODO add your handling code here:
    new Gm().setVisible(true);
}//GEN-LAST:event_m7MouseClicked

private void m8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m8MouseClicked
// TODO add your handling code here:
    new Dgm().setVisible(true);
}//GEN-LAST:event_m8MouseClicked

private void m9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m9MouseClicked
// TODO add your handling code here:
    new KnownFrame().setVisible(true);
}//GEN-LAST:event_m9MouseClicked

private void m10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m10MouseClicked
// TODO add your handling code here:
    new Employeer().setVisible(true);
}//GEN-LAST:event_m10MouseClicked

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(ABOUTFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ABOUTFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ABOUTFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ABOUTFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new ABOUTFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel10;
    private javax.swing.JButton backButton;
    private Utility.SLabel m1;
    private Utility.SLabel m10;
    private Utility.SLabel m2;
    private Utility.SLabel m3;
    private Utility.SLabel m4;
    private Utility.SLabel m5;
    private Utility.SLabel m6;
    private Utility.SLabel m7;
    private Utility.SLabel m8;
    private Utility.SLabel m9;
    private javax.swing.JLabel photo;
    // End of variables declaration//GEN-END:variables
}
