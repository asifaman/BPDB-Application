package bpdbapplication;

import Utility.Utility;
import Utility.Utility2;
import javax.swing.JOptionPane;

public class USERCDialog extends javax.swing.JDialog {

    static boolean fals;
    Object[][] data;

    public USERCDialog(java.awt.Frame parent, boolean modal, boolean isFalse) {
        super(parent, modal);
        initComponents();

        //Table();

        this.setLocation(Utility.getWindowPosition(this.getSize(), this.getToolkit()));
        fals = isFalse;
        if (fals == true) {
            String sql = "SELECT count(ID)FROM bpdb.USR where ID='" + USERCFrame.selectedID + "'";
            int count = Utility2.countQuery(rootPane, sql);
            System.out.println(count);
            data = new Object[count][4];
            String sq = "select ID,"
                    + "NAME,"
                    + "DESIG,"
                    + "FULL_NAME" + " from bpdb.USR where ID='" + USERCFrame.selectedID + "'";
            data = Utility2.getMultiRowQueryObjects(sq, rootPane, count);
            m1.setText(data[0][0].toString());
            m2.setText(data[0][1].toString());
            m3.setSelectedItem(data[0][2].toString());
            m4.setText(data[0][3].toString());



        }




    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a5 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        m1 = new javax.swing.JTextField();
        m2 = new javax.swing.JTextField();
        m3 = new javax.swing.JComboBox();
        m4 = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        save = new javax.swing.JButton();
        m5 = new javax.swing.JTextField();
        a6 = new javax.swing.JLabel();

        a5.setFont(new java.awt.Font("Tahoma", 0, 14));
        a5.setText("FULL NAME");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        a1.setFont(new java.awt.Font("Tahoma", 0, 14));
        a1.setText("ID");

        a2.setFont(new java.awt.Font("Tahoma", 0, 14));
        a2.setText("NAME");

        a3.setFont(new java.awt.Font("Tahoma", 0, 14));
        a3.setText("DESIGANATION");

        a4.setFont(new java.awt.Font("Tahoma", 0, 14));
        a4.setText("FULL NAME");

        m3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BPDB", "DRAFT", "APPLY", "HR", "ADMIN", "ACCOUNT", "SALARY", "BILLING", "DISTRIBUTION", "GENERATION", "DHAKA", "KHULNA", "RAUJAN", "SHIDDERGANJ", "GRASHAL", " " }));
        m3.setToolTipText("choose Department\n");

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

        a6.setFont(new java.awt.Font("Tahoma", 0, 14));
        a6.setText("PASSWORD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(save))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(m2)
                            .addComponent(m3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(m5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(m4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(m1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel)
                    .addComponent(save))
                .addGap(26, 26, 26))
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
 
     if (m1.getText().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "ID Field is Empty", "Error", JOptionPane.WARNING_MESSAGE);
        
      m1.requestFocus();
      return;
    }
    if (m5.getText().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "Password Field is Empty", "Error", JOptionPane.WARNING_MESSAGE);
        
        requestFocus();
        return;
    }
    String sql;

    if (fals == false) {
        sql = "INSERT INTO bpdb.usr VALUES('"
                + m1.getText() + "','"
                + m2.getText() + "','"
                + m3.getSelectedItem() + "','"
                + m4.getText() + "','"
                + m5.getText() + "')";

        Utility2.insertUpdateQuery(sql, rootPane, 1);


    } else {
        sql = "update  bpdb.USR set ID='" + m1.getText()
                + "',NAME='" + m2.getText()
                + "',DESIG='" + m3.getSelectedItem()
                + "',FULL_NAME='" + m4.getText()
                + "',PASSWORD='" + m5.getText() + "' "
                + " where ID ='" + USERCFrame.selectedID + "'";
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
            java.util.logging.Logger.getLogger(USERCDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(USERCDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(USERCDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(USERCDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                USERCDialog dialog = new USERCDialog(new javax.swing.JFrame(), true, true);
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
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel a6;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField m1;
    private javax.swing.JTextField m2;
    private javax.swing.JComboBox m3;
    private javax.swing.JTextField m4;
    private javax.swing.JTextField m5;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
