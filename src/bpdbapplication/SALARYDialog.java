package bpdbapplication;

import Utility.Utility;
import Utility.Utility2;
import javax.swing.JOptionPane;

public class SALARYDialog extends javax.swing.JDialog {

    static boolean fals;
    Object[][] data;

    public SALARYDialog(java.awt.Frame parent, boolean modal, boolean isFalse) {
        super(parent, modal);
        initComponents();
        this.setLocation(Utility.getWindowPosition(this.getSize(), this.getToolkit()));
        fals = isFalse;
        if (fals == true) {
            String sql = "SELECT count(ID)FROM bpdb.SALARY where ID='" + SALARYFrame.selectedName + "'";
            int count = Utility2.countQuery(rootPane, sql);
            System.out.println(count);
            data = new Object[count][5];

            String sq = "select ID,"
                    + "DESIGNATION,"
                    + "ACCOUNT_NUMBER,"
                    + "NAME_OF_MONTH,"
                    + "NAME_OF_YEAR,"
                    + "CLEARANCE" + " from bpdb.SALARY where ID='" + SALARYFrame.selectedName + "'";
            data = Utility2.getMultiRowQueryObjects(sq, rootPane, count);
            m1.setText(data[0][0].toString());
            m2.setText(data[0][1].toString());
            m3.setText(data[0][2].toString());
            m4.setSelectedItem(data[0][3].toString());
            m5.setSelectedItem(data[0][4].toString());
            m6.setSelectedItem(data[0][5].toString());

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SALARYPanel = new javax.swing.JPanel();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        m1 = new javax.swing.JTextField();
        m2 = new javax.swing.JTextField();
        m4 = new javax.swing.JComboBox();
        m5 = new javax.swing.JComboBox();
        m3 = new javax.swing.JTextField();
        a4 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        a6 = new javax.swing.JLabel();
        m6 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        SALARYPanel.setBackground(new java.awt.Color(255, 255, 255));
        SALARYPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        a1.setText("ID");

        a2.setText("Designation");

        a3.setText("Account Number");

        a5.setText("Name of year");

        m4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January ", "February", "March", "April", "May", "Jun", "July", "August", "September", "October", "November", "December" }));

        m5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));

        a4.setText("Name of month");

        saveButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save c.png"))); // NOI18N
        saveButton.setText("Save");
        saveButton.setMaximumSize(new java.awt.Dimension(99, 33));
        saveButton.setMinimumSize(new java.awt.Dimension(99, 33));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel b.png"))); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.setMaximumSize(new java.awt.Dimension(99, 33));
        cancelButton.setMinimumSize(new java.awt.Dimension(99, 33));
        cancelButton.setPreferredSize(new java.awt.Dimension(99, 33));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        a6.setFont(new java.awt.Font("Tahoma", 1, 14));
        a6.setForeground(new java.awt.Color(0, 0, 255));
        a6.setText("Clearance ");

        m6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "yes", "No" }));

        javax.swing.GroupLayout SALARYPanelLayout = new javax.swing.GroupLayout(SALARYPanel);
        SALARYPanel.setLayout(SALARYPanelLayout);
        SALARYPanelLayout.setHorizontalGroup(
            SALARYPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SALARYPanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(SALARYPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SALARYPanelLayout.createSequentialGroup()
                        .addGroup(SALARYPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(SALARYPanelLayout.createSequentialGroup()
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SALARYPanelLayout.createSequentialGroup()
                                .addGroup(SALARYPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(a1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a4, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(a2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(SALARYPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(m2, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addComponent(m1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addComponent(m4, 0, 205, Short.MAX_VALUE)
                                    .addComponent(m3, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addComponent(m6, 0, 205, Short.MAX_VALUE)
                                    .addComponent(m5, 0, 205, Short.MAX_VALUE))))
                        .addGap(84, 84, 84))
                    .addGroup(SALARYPanelLayout.createSequentialGroup()
                        .addGroup(SALARYPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(a6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(a5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        SALARYPanelLayout.setVerticalGroup(
            SALARYPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SALARYPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(SALARYPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(a1)
                    .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(SALARYPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(a2)
                    .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(SALARYPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a3))
                .addGap(18, 18, 18)
                .addGroup(SALARYPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a4)
                    .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(SALARYPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SALARYPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(a5))
                    .addGroup(SALARYPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(SALARYPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a6))
                .addGap(47, 47, 47)
                .addGroup(SALARYPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SALARYPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SALARYPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
    if (m1.getText().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "ID Field is Empty", "Error", JOptionPane.WARNING_MESSAGE);
        m1.requestFocus();
        return;
    }
    if (m3.getText().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "ACCOUNT NUMBER Field is Empty", "Error", JOptionPane.WARNING_MESSAGE);
        m3.requestFocus();
        return;
    }
    String sql;

    if (fals == false) {
        sql = "INSERT INTO bpdb.SALARY VALUES('"
                + m1.getText() + "','"
                + m2.getText() + "','"
                + m3.getText() + "','"
                + m4.getSelectedItem() + "','"
                + m5.getSelectedItem() + "','"
                + m6.getSelectedItem() + "')";

        Utility2.insertUpdateQuery(sql, rootPane, 1);

    } else {
        sql = "update  bpdb.SALARY set ID='" + m1.getText()
                + "',DESIGNATION='" + m2.getText()
                + "',ACCOUNT_NUMBER='" + m3.getText()
                + "',NAME_OF_MONTH='" + m4.getSelectedItem()
                + "',NAME_OF_YEAR='" + m5.getSelectedItem()
                + "',CLEARANCE ='" + m6.getSelectedItem() + "' "
                + " where ID ='" + SALARYFrame.selectedName + "'";
        Utility2.insertUpdateQuery(sql, rootPane, 2);
    }
    setVisible(false);
    dispose();





}//GEN-LAST:event_saveButtonActionPerformed

private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
    setVisible(false);
    dispose();
}//GEN-LAST:event_cancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SALARYDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SALARYDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SALARYDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SALARYDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                SALARYDialog dialog = new SALARYDialog(new javax.swing.JFrame(), true, true);
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
    private javax.swing.JPanel SALARYPanel;
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel a6;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField m1;
    private javax.swing.JTextField m2;
    private javax.swing.JTextField m3;
    private javax.swing.JComboBox m4;
    private javax.swing.JComboBox m5;
    private javax.swing.JComboBox m6;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
