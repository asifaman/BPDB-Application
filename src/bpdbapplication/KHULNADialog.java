package bpdbapplication;

import Utility.Utility;
import Utility.Utility2;
import javax.swing.JOptionPane;

public class KHULNADialog extends javax.swing.JDialog {

    static boolean fals;
    Object[][] data;
    String s, t;

    public KHULNADialog(java.awt.Frame parent, boolean modal, boolean isFalse) {

        super(parent, modal);
        initComponents();
        this.setLocation(Utility.getWindowPosition(this.getSize(), this.getToolkit()));
        fals = isFalse;

        if (fals == true) {
            String sql = "SELECT count(TRANSMETER_ID) FROM bpdb.GENERATION_KHULNA where TRANSMETER_ID ='" + KHULNAFrame.selectedName + "'";
            int count = Utility2.countQuery(rootPane, sql);
            System.out.println(count);
            data = new Object[count][10];
            String sq = "select TRANSMETER_ID ,"
                    + "COMPANY_NAME,"
                    + "NAME_OF_MONTH,"
                    + "NAME_OF_YEAR,"
                    + "BUDGETING_AMOUNT,"
                    + "TARGET_POWER_AMOUNT,"
                    + "POWER_SYSTEM_LOSS,"
                    + "USABLE_POWER_AMOUNT,"
                    + "TOTAL_BALENCE_AMOUNT,"
                    + "SERIAL_NUMBER"
                    + " from bpdb.GENERATION_KHULNA where TRANSMETER_ID='" + KHULNAFrame.selectedName + "' ";
            data = Utility2.getMultiRowQueryObjects(sq, rootPane, count);
            m1.setText(data[0][0].toString());
            m2.setText(data[0][1].toString());
            m3.setSelectedItem(data[0][2].toString());
            m4.setSelectedItem(data[0][3].toString());
            m5.setText(data[0][4].toString());
            m6.setText(data[0][5].toString());
            m7.setText(data[0][6].toString());
            m8.setText(data[0][7].toString());
            m9.setText(data[0][8].toString());
            m10.setText(data[0][9].toString());




        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        a1 = new javax.swing.JLabel();
        m1 = new javax.swing.JTextField();
        a2 = new javax.swing.JLabel();
        m2 = new javax.swing.JTextField();
        a3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        m3 = new javax.swing.JComboBox();
        m4 = new javax.swing.JComboBox();
        a5 = new javax.swing.JLabel();
        m5 = new javax.swing.JTextField();
        a6 = new javax.swing.JLabel();
        m6 = new javax.swing.JTextField();
        a7 = new javax.swing.JLabel();
        m7 = new javax.swing.JTextField();
        a8 = new javax.swing.JLabel();
        m8 = new javax.swing.JTextField();
        a9 = new javax.swing.JLabel();
        m9 = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        a10 = new javax.swing.JLabel();
        m10 = new javax.swing.JTextField();
        a = new javax.swing.JLabel();
        a11 = new javax.swing.JLabel();
        a12 = new javax.swing.JLabel();
        a13 = new javax.swing.JLabel();
        a14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        a1.setText("Transmeter ID");

        a2.setText("Company Name");

        a3.setText("Name of Month");

        a4.setText("Name of Year");

        m3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        m4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));

        a5.setText("Budgeting Balance");

        a6.setText("Target Power Amount");

        a7.setText("Power System Loss");

        a8.setText("Usable Power Amount");

        m8.setFont(new java.awt.Font("Tahoma", 1, 11));
        m8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m8MouseClicked(evt);
            }
        });

        a9.setText("Total Balance Amount");

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel c.png"))); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.setMaximumSize(new java.awt.Dimension(99, 33));
        cancelButton.setMinimumSize(new java.awt.Dimension(99, 33));
        cancelButton.setPreferredSize(new java.awt.Dimension(99, 33));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save i.png"))); // NOI18N
        saveButton.setText("Save");
        saveButton.setMaximumSize(new java.awt.Dimension(99, 33));
        saveButton.setMinimumSize(new java.awt.Dimension(99, 33));
        saveButton.setPreferredSize(new java.awt.Dimension(99, 33));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        a10.setFont(new java.awt.Font("Tahoma", 1, 11));
        a10.setForeground(new java.awt.Color(0, 0, 255));
        a10.setText("Serial Number");

        m10.setBackground(new java.awt.Color(102, 0, 0));
        m10.setEditable(false);

        a.setFont(new java.awt.Font("Tahoma", 1, 11));
        a.setForeground(new java.awt.Color(0, 0, 255));
        a.setText("Taka");

        a11.setFont(new java.awt.Font("Tahoma", 1, 11));
        a11.setForeground(new java.awt.Color(0, 0, 255));
        a11.setText("Taka");

        a12.setFont(new java.awt.Font("Tahoma", 1, 11));
        a12.setForeground(new java.awt.Color(0, 0, 255));
        a12.setText("mw");

        a13.setFont(new java.awt.Font("Tahoma", 1, 11));
        a13.setForeground(new java.awt.Color(0, 0, 255));
        a13.setText("mw");

        a14.setFont(new java.awt.Font("Tahoma", 1, 11));
        a14.setForeground(new java.awt.Color(0, 0, 255));
        a14.setText("mw");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(m5, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(m3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(m2, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(m4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(m7, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(a9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)))
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(m6, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                        .addComponent(m8, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                        .addComponent(m9, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(m10, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a)
                            .addComponent(a11)
                            .addComponent(a12)
                            .addComponent(a13)
                            .addComponent(a14))
                        .addGap(23, 23, 23))))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a10)
                    .addComponent(m10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(a3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(a4))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(a2)))
                    .addComponent(a1))
                .addGap(15, 15, 15)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a))
                    .addComponent(a5))
                .addGap(7, 7, 7)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a12))
                    .addComponent(a6))
                .addGap(16, 16, 16)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(m7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a13))
                    .addComponent(a7))
                .addGap(7, 7, 7)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(m8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a14))
                    .addComponent(a8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(m9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(a11))
                    .addComponent(a9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
    setVisible(false);
    dispose();
}//GEN-LAST:event_cancelButtonActionPerformed

private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
    if (m1.getText().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "Transmeter ID Field is Empty", "Error", JOptionPane.WARNING_MESSAGE);

        m1.requestFocus();
        return;
    }
    if (m2.getText().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "Company Name Field is Empty", "Error", JOptionPane.WARNING_MESSAGE);
        m2.requestFocus();
        return;
    }
    String sql;
    if (fals == false) {
        sql = "INSERT INTO bpdb.GENERATION_KHULNA VALUES('"
                + m1.getText() + "','"
                + m2.getText() + "','"
                + m3.getSelectedItem() + "','"
                + m4.getSelectedItem() + "','"
                + m5.getText() + "','"
                + m6.getText() + "','"
                + m7.getText() + "','"
                + m8.getText() + "','"
                + m9.getText() + "','"
                + m10.getText() + "')";


        Utility2.insertUpdateQuery(sql, rootPane, 1);

    } else {
        sql = "update  bpdb.GENERATION_KHULNA set TRANSMETER_ID='" + m1.getText()
                + "',COMPANY_NAME ='" + m2.getText()
                + "',NAME_OF_MONTH='" + m3.getSelectedItem()
                + "',NAME_OF_YEAR='" + m4.getSelectedItem()
                + "',BUDGETING_AMOUNT='" + m5.getText()
                + "',TARGET_POWER_AMOUNT='" + m6.getText()
                + "',POWER_SYSTEM_LOSS='" + m7.getText()
                + "',USABLE_POWER_AMOUNT='" + m8.getText()
                + "',TOTAL_BALENCE_AMOUNT='" + m9.getText()
                + "',SERIAL_NUMBER='" + m10.getText() + "' "
                + " where TRANSMETER_ID ='" + KHULNAFrame.selectedName + "'";
        Utility2.insertUpdateQuery(sql, rootPane, 2);
    }
    setVisible(false);
    dispose();



}//GEN-LAST:event_saveButtonActionPerformed

private void m8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m8MouseClicked
// TODO add your handling code here:
    s = m6.getText();
    t = m7.getText();
    float i = Float.parseFloat(s) - Float.parseFloat(t);
    String a = String.valueOf(i);
    m8.setText(a);
}//GEN-LAST:event_m8MouseClicked

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
            java.util.logging.Logger.getLogger(KHULNADialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KHULNADialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KHULNADialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KHULNADialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                KHULNADialog dialog = new KHULNADialog(new javax.swing.JFrame(), true, true);
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
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel a;
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a10;
    private javax.swing.JLabel a11;
    private javax.swing.JLabel a12;
    private javax.swing.JLabel a13;
    private javax.swing.JLabel a14;
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
    private javax.swing.JTextField m10;
    private javax.swing.JTextField m2;
    private javax.swing.JComboBox m3;
    private javax.swing.JComboBox m4;
    private javax.swing.JTextField m5;
    private javax.swing.JTextField m6;
    private javax.swing.JTextField m7;
    private javax.swing.JTextField m8;
    private javax.swing.JTextField m9;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
