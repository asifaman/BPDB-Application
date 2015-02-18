package bpdbapplication;

import Utility.Utility;
import Utility.Utility2;
import javax.swing.JOptionPane;

public class BILLINGDialog extends javax.swing.JDialog {

    static boolean fals;
    Object[][] data;
    String s, t;

    public BILLINGDialog(java.awt.Frame parent, boolean modal, boolean isFalse) {
        super(parent, modal);
        initComponents();
        this.setLocation(Utility.getWindowPosition(this.getSize(), this.getToolkit()));
        fals = isFalse;
        if (fals == true) {
            String sql = "SELECT count(METER_ID)FROM bpdb.BILLING where METER_ID='" + BILLINGFrame.selectedName + "'";
            int count = Utility2.countQuery(rootPane, sql);
            System.out.println(count);
            data = new Object[count][9];
            String sq = "select METER_ID,"
                    + "CUSTOMER_NAME,"
                    + "CONTACT_NUMBER,"
                    + "AREA_ZONE,"
                    + "TARIFF_CATEGORY,"
                    + "USING_WATT,"
                    + "NAME_OF_MONTH,"
                    + "NAME_OF_YEAR,"
                    + "TOTAL_AMOUNT" + " from bpdb.BILLING where METER_ID='" + BILLINGFrame.selectedName + "'";
            data = Utility2.getMultiRowQueryObjects(sq, rootPane, count);
            m1.setText(data[0][0].toString());
            m2.setText(data[0][1].toString());
            m3.setText(data[0][2].toString());
            m4.setSelectedItem(data[0][3].toString());
            m5.setSelectedItem(data[0][4].toString());
            m6.setText(data[0][5].toString());
            m7.setSelectedItem(data[0][6].toString());
            m8.setSelectedItem(data[0][7].toString());
            m9.setText(data[0][8].toString());



        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BILLINGPanel = new javax.swing.JPanel();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a6 = new javax.swing.JLabel();
        m1 = new javax.swing.JTextField();
        m2 = new javax.swing.JTextField();
        m3 = new javax.swing.JTextField();
        m6 = new javax.swing.JTextField();
        m4 = new javax.swing.JComboBox();
        cancelButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        a7 = new javax.swing.JLabel();
        m7 = new javax.swing.JComboBox();
        a8 = new javax.swing.JLabel();
        m8 = new javax.swing.JComboBox();
        a9 = new javax.swing.JLabel();
        m9 = new javax.swing.JTextField();
        m5 = new javax.swing.JComboBox();
        a10 = new javax.swing.JLabel();
        a11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BILLINGPanel.setBackground(new java.awt.Color(255, 255, 255));
        BILLINGPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        a1.setText("Meter ID");

        a2.setText("Customer name");

        a3.setText("Contact number");

        a5.setText("Tariff category");

        a4.setText("Area zone");

        a6.setText("Using watt");

        m6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m6ActionPerformed(evt);
            }
        });

        m4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "General Area", "Residential Area", "Commerical Area", "Business Area" }));
        m4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m4ActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel d.png"))); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save d.png"))); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        a7.setText("Month");

        m7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        a8.setText("Year");

        m8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));

        a9.setBackground(new java.awt.Color(0, 0, 204));
        a9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a9.setForeground(new java.awt.Color(0, 0, 204));
        a9.setText("TOTAL BiLL");

        m9.setFont(new java.awt.Font("Tahoma", 1, 11));
        m9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m9MouseClicked(evt);
            }
        });

        m5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "3.78", "4.72", "6.92", "7.78" }));
        m5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m5ActionPerformed(evt);
            }
        });

        a10.setBackground(new java.awt.Color(0, 0, 204));
        a10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a10.setForeground(new java.awt.Color(0, 0, 204));
        a10.setText("Taka");

        a11.setBackground(new java.awt.Color(0, 0, 204));
        a11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a11.setForeground(new java.awt.Color(0, 0, 204));
        a11.setText("kw");

        javax.swing.GroupLayout BILLINGPanelLayout = new javax.swing.GroupLayout(BILLINGPanel);
        BILLINGPanel.setLayout(BILLINGPanelLayout);
        BILLINGPanelLayout.setHorizontalGroup(
            BILLINGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BILLINGPanelLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(BILLINGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BILLINGPanelLayout.createSequentialGroup()
                        .addGroup(BILLINGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BILLINGPanelLayout.createSequentialGroup()
                                .addGroup(BILLINGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(BILLINGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(a5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cancelButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(BILLINGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(BILLINGPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(saveButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BILLINGPanelLayout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(BILLINGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(m4, 0, 193, Short.MAX_VALUE)
                                            .addComponent(m8, 0, 193, Short.MAX_VALUE)
                                            .addComponent(m7, 0, 193, Short.MAX_VALUE)
                                            .addComponent(m9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                            .addComponent(m6, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                            .addComponent(m5, 0, 193, Short.MAX_VALUE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BILLINGPanelLayout.createSequentialGroup()
                                .addGroup(BILLINGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(a2)
                                    .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(BILLINGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(m2, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(m3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(m1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BILLINGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a10)
                            .addComponent(a11))
                        .addGap(26, 26, 26))
                    .addComponent(a9)
                    .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        BILLINGPanelLayout.setVerticalGroup(
            BILLINGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BILLINGPanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(BILLINGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BILLINGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a2))
                .addGap(6, 6, 6)
                .addGroup(BILLINGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a3))
                .addGap(18, 18, 18)
                .addGroup(BILLINGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a4))
                .addGap(18, 18, 18)
                .addGroup(BILLINGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a5)
                    .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a10))
                .addGap(18, 18, 18)
                .addGroup(BILLINGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a6)
                    .addComponent(a11))
                .addGroup(BILLINGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BILLINGPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(a7))
                    .addGroup(BILLINGPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(m7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(BILLINGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a8)
                    .addComponent(m8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(BILLINGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BILLINGPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(a9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BILLINGPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(m9)))
                .addGroup(BILLINGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BILLINGPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(cancelButton)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BILLINGPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(saveButton)
                        .addGap(20, 20, 20))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BILLINGPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BILLINGPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
    setVisible(false);
    dispose();
}//GEN-LAST:event_cancelButtonActionPerformed

private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
    if (m1.getText().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "Meter ID FIELD IS EMPTY", "ERROR", JOptionPane.WARNING_MESSAGE);
        m1.requestFocus();
        return;
    }
    if (m3.getText().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "Contact Number FIELD IS EMPTY", "ERROR", JOptionPane.WARNING_MESSAGE);
        m3.requestFocus();
        return;
    }
    if (m6.getText().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "Using Watt FIELD IS EMPTY", "ERROR", JOptionPane.WARNING_MESSAGE);
        m6.requestFocus();
        return;
    }
    String sql;
    if (fals == false) {
        sql = "INSERT INTO bpdb.BILLING VALUES('"
                + m1.getText() + "','"
                + m2.getText() + "','"
                + m3.getText() + "','"
                + m4.getSelectedItem() + "','"
                + m5.getSelectedItem() + "','"
                + m6.getText() + "','"
                + m7.getSelectedItem() + "','"
                + m8.getSelectedItem() + "','"
                + m9.getText() + "')";


        Utility2.insertUpdateQuery(sql, rootPane, 1);


    } else {
        sql = "update  bpdb.BILLING set METER_ID='" + m1.getText()
                + "',CUSTOMER_NAME ='" + m2.getText()
                + "',CONTACT_NUMBER ='" + m3.getText()
                + "',AREA_ZONE ='" + m4.getSelectedItem()
                + "',TARIFF_CATEGORY ='" + m5.getSelectedItem()
                + "',USING_WATT='" + m6.getText()
                + "',NAME_OF_MONTH='" + m7.getSelectedItem()
                + "',NAME_OF_YEAR='" + m8.getSelectedItem()
                + "',TOTAL_AMOUNT ='" + m9.getText() + "' "
                + " where METER_ID ='" + BILLINGFrame.selectedName + "'";
        Utility2.insertUpdateQuery(sql, rootPane, 2);
    }
    setVisible(false);
    dispose();
}//GEN-LAST:event_saveButtonActionPerformed

private void m4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m4ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_m4ActionPerformed

private void m6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m6ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_m6ActionPerformed

private void m5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m5ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_m5ActionPerformed

private void m9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m9MouseClicked
// TODO add your handling code here:  
    s = (String) m5.getSelectedItem();
    t = m6.getText();
    float i = Float.parseFloat(s) * Float.parseFloat(t);
    String a = String.valueOf(i);
    m9.setText(a);

}//GEN-LAST:event_m9MouseClicked
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
            java.util.logging.Logger.getLogger(BILLINGDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BILLINGDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BILLINGDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BILLINGDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                BILLINGDialog dialog = new BILLINGDialog(new javax.swing.JFrame(), true, true);
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
    private javax.swing.JPanel BILLINGPanel;
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a10;
    private javax.swing.JLabel a11;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel a6;
    private javax.swing.JLabel a7;
    private javax.swing.JLabel a8;
    private javax.swing.JLabel a9;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField m1;
    private javax.swing.JTextField m2;
    private javax.swing.JTextField m3;
    private javax.swing.JComboBox m4;
    private javax.swing.JComboBox m5;
    private javax.swing.JTextField m6;
    private javax.swing.JComboBox m7;
    private javax.swing.JComboBox m8;
    private javax.swing.JTextField m9;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
