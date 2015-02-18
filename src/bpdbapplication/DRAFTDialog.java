package bpdbapplication;

import Utility.Utility;
import Utility.Utility2;
import javax.swing.JOptionPane;

public class DRAFTDialog extends javax.swing.JDialog {

    static boolean fals;
    Object[][] data;

    public DRAFTDialog(java.awt.Frame parent, boolean modal, boolean isFalse) {
        super(parent, modal);
        initComponents();

        //Table();

        this.setLocation(Utility.getWindowPosition(this.getSize(), this.getToolkit()));
        fals = isFalse;
        if (fals == true) {
            String sql = "SELECT count(BDN_NUMBER)FROM bpdb.DRAFT where BDN_NUMBER='" + DRAFTFrame.selectedID + "'";
            int count = Utility2.countQuery(rootPane, sql);
            System.out.println(count);
            data = new Object[count][5];
            String sq = "select BDN_NUMBER,"
                    + "NAME,"
                    + "TAKA,"
                    + "DATES,"
                    + "ADDRESS" + " from bpdb.DRAFT where BDN_NUMBER='" + DRAFTFrame.selectedID + "'";
            data = Utility2.getMultiRowQueryObjects(sq, rootPane, count);
            m0.setText(data[0][0].toString());
            m1.setText(data[0][1].toString());
            m2.setText(data[0][2].toString());
            m3.setText(data[0][3].toString());
            m4.setText(data[0][4].toString());




        }




    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a5 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        m1 = new javax.swing.JTextField();
        m2 = new javax.swing.JTextField();
        m3 = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        save = new javax.swing.JButton();
        a4 = new javax.swing.JLabel();
        m4 = new javax.swing.JTextField();
        a0 = new javax.swing.JLabel();
        m0 = new javax.swing.JTextField();

        a5.setFont(new java.awt.Font("Tahoma", 0, 14));
        a5.setText("FULL NAME");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        a1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        a1.setText("NAME");

        a2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        a2.setText("TAKA");

        a3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        a3.setText("DATE");

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        cancel.setText("Cancel ");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/undo.png"))); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        a4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        a4.setText("ADDRESS");

        a0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a0.setForeground(new java.awt.Color(0, 0, 255));
        a0.setText("Bank Draft Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(save))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a0)
                            .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(m0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(m2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE))
                            .addComponent(m4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(m3, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m0, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a0, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(cancel))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
// TODO add your handling code here:
    setVisible(false);
    dispose();
}//GEN-LAST:event_cancelActionPerformed

private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
// TODO add your handling code here:
    if (m0.getText().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "BDN Field is Empty", "Error", JOptionPane.WARNING_MESSAGE);
        m0.requestFocus();
        return;
    }
    if (m1.getText().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "NAME Field is Empty", "Error", JOptionPane.WARNING_MESSAGE);
        m1.requestFocus();
        return;
    }
    if (m2.getText().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "TAKA Field is Empty", "Error", JOptionPane.WARNING_MESSAGE);
        m2.requestFocus();
        return;
    }
    String sql;

    if (fals == false) {
        sql = "INSERT INTO bpdb.draft VALUES('"
                + m0.getText() + "','"
                + m1.getText() + "','"
                + m2.getText() + "','"
                + m3.getText() + "','"
                + m4.getText() + "')";

        Utility2.insertUpdateQuery(sql, rootPane, 1);


    } else {
        sql = "update  bpdb.draft set "
                + "BDN_NUMBER='" + m0.getText()
                + "',NAME='" + m1.getText()
                + "',TAKA='" + m2.getText()
                + "',DATES='" + m3.getText()
                + "',ADDRESS='" + m4.getText() + "' "
                + " where BDN_NUMBER ='" + DRAFTFrame.selectedID + "'";
        Utility2.insertUpdateQuery(sql, rootPane, 2);
    }
    setVisible(false);
    dispose();




}//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(DRAFTDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DRAFTDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DRAFTDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DRAFTDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                DRAFTDialog dialog = new DRAFTDialog(new javax.swing.JFrame(), true, true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a0;
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField m0;
    private javax.swing.JTextField m1;
    private javax.swing.JTextField m2;
    private javax.swing.JTextField m3;
    private javax.swing.JTextField m4;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
