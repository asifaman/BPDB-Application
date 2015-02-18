
package bpdbapplication;


public class Dgm extends javax.swing.JFrame {

    public Dgm() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        Panel2 = new javax.swing.JPanel();
        B1 = new javax.swing.JLabel();
        B2 = new javax.swing.JLabel();
        B3 = new javax.swing.JLabel();
        B4 = new javax.swing.JLabel();
        B5 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(0, 0, 0));
        Panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel2.setBackground(new java.awt.Color(51, 51, 51));
        Panel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel2.setForeground(new java.awt.Color(51, 51, 51));

        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/photo-3.png"))); // NOI18N

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(B1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(B1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Panel.add(Panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 61, -1, -1));

        B2.setBackground(new java.awt.Color(255, 255, 0));
        B2.setFont(new java.awt.Font("Tahoma", 1, 18));
        B2.setForeground(new java.awt.Color(255, 255, 0));
        B2.setText("SirajuL IsLam Siraj");
        Panel.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 88, -1, 34));

        B3.setBackground(new java.awt.Color(255, 255, 0));
        B3.setFont(new java.awt.Font("Tahoma", 1, 14));
        B3.setForeground(new java.awt.Color(255, 255, 0));
        B3.setText("DEPUTY GENERAL MANAGER");
        Panel.add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 140, -1, 31));

        B4.setBackground(new java.awt.Color(255, 255, 0));
        B4.setFont(new java.awt.Font("Tahoma", 1, 12));
        B4.setForeground(new java.awt.Color(255, 255, 0));
        B4.setText("CONTACT   01711556699");
        Panel.add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 182, 180, 23));

        B5.setBackground(new java.awt.Color(255, 255, 0));
        B5.setFont(new java.awt.Font("Tahoma", 1, 11));
        B5.setForeground(new java.awt.Color(255, 255, 0));
        B5.setText("e-maiL siraj99@yahoo.com");
        Panel.add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 223, 163, 25));

        backButton.setBackground(new java.awt.Color(255, 255, 0));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        Panel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
    setVisible(false);
    dispose();
}//GEN-LAST:event_backButtonActionPerformed

   
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
            java.util.logging.Logger.getLogger(Dgm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dgm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dgm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dgm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Dgm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B1;
    private javax.swing.JLabel B2;
    private javax.swing.JLabel B3;
    private javax.swing.JLabel B4;
    private javax.swing.JLabel B5;
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel Panel2;
    private javax.swing.JButton backButton;
    // End of variables declaration//GEN-END:variables
}
