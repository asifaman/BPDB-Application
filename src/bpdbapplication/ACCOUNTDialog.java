package bpdbapplication;

import Utility.Utility;
import Utility.Utility2;
import javax.swing.JOptionPane;

public class ACCOUNTDialog extends javax.swing.JDialog {

    static boolean fals;
    Object[][] data;
    String a, d, w;
    String aa, aaa, aaaa, dd, ddd, dddd;

    public ACCOUNTDialog(java.awt.Frame parent, boolean modal, boolean isFalse) {
        super(parent, modal);
        initComponents();
        this.setLocation(Utility.getWindowPosition(this.getSize(), this.getToolkit()));
        fals = isFalse;
        if (fals == true) {
            String sql = "SELECT count(ID)FROM bpdb.ACCOUNT where ID='" + ACCOUNTFrame.selectedName + "'";
            int count = Utility2.countQuery(rootPane, sql);
            System.out.println(count);
            data = new Object[count][13];
            String sq = "select ID,"
                    + "BASIC_SALARY,"
                    + "HOUSE_RENT,"
                    + "BONUS,"
                    + "INCREMENTS,"
                    + "OTHER_ALLOUNCE,"
                    + "MEDICAL,"
                    + "PHONE,"
                    + "TOTAL_AMOUNT,"
                    + "PAY_AMOUNT,"
                    + "DUE_AMOUNT,"
                    + "NAME_OF_MONTH,"
                    + "NAME_OF_YEAR" + " from bpdb.ACCOUNT where ID='" + ACCOUNTFrame.selectedName + "'";
            data = Utility2.getMultiRowQueryObjects(sq, rootPane, count);
            m1.setText(data[0][0].toString());
            m2.setText(data[0][1].toString());
            m3.setText(data[0][2].toString());
            m4.setText(data[0][3].toString());
            m5.setSelectedItem(data[0][4].toString());
            m6.setText(data[0][5].toString());
            m7.setText(data[0][6].toString());
            m8.setText(data[0][7].toString());
            m9.setText(data[0][8].toString());
            m10.setText(data[0][9].toString());
            m11.setText(data[0][10].toString());
            m12.setSelectedItem(data[0][11].toString());
            m13.setSelectedItem(data[0][12].toString());



        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a7 = new javax.swing.JLabel();
        a8 = new javax.swing.JLabel();
        a9 = new javax.swing.JLabel();
        a12 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        m1 = new javax.swing.JTextField();
        m2 = new javax.swing.JTextField();
        m3 = new javax.swing.JTextField();
        m9 = new javax.swing.JTextField();
        m6 = new javax.swing.JTextField();
        m4 = new javax.swing.JTextField();
        a5 = new javax.swing.JLabel();
        m5 = new javax.swing.JComboBox();
        a6 = new javax.swing.JLabel();
        m7 = new javax.swing.JTextField();
        m8 = new javax.swing.JTextField();
        a10 = new javax.swing.JLabel();
        m10 = new javax.swing.JTextField();
        a11 = new javax.swing.JLabel();
        m11 = new javax.swing.JTextField();
        a13 = new javax.swing.JLabel();
        m12 = new javax.swing.JComboBox();
        m13 = new javax.swing.JComboBox();
        cancelButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        a1.setText("ID");

        a2.setText("Basic salary");

        a3.setText("House rent");

        a7.setText("Medical");

        a8.setText("Phone");

        a9.setFont(new java.awt.Font("Tahoma", 1, 11));
        a9.setForeground(new java.awt.Color(51, 0, 51));
        a9.setText("Total amount");

        a12.setText("Name of month");

        a4.setText("Bonus");
        a4.setToolTipText("two times in a year");

        m9.setFont(new java.awt.Font("Tahoma", 1, 11));
        m9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m9MouseClicked(evt);
            }
        });
        m9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m9ActionPerformed(evt);
            }
        });

        a5.setText("Increment");

        m5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "500", "700", "900", "1000" }));

        a6.setText("Other allounce");

        m8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m8ActionPerformed(evt);
            }
        });

        a10.setFont(new java.awt.Font("Tahoma", 1, 11));
        a10.setForeground(new java.awt.Color(0, 0, 255));
        a10.setText("Pay amount");

        m10.setFont(new java.awt.Font("Tahoma", 1, 11));
        m10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m10MouseClicked(evt);
            }
        });
        m10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m10ActionPerformed(evt);
            }
        });

        a11.setFont(new java.awt.Font("Tahoma", 1, 11));
        a11.setForeground(new java.awt.Color(255, 0, 0));
        a11.setText("Due amount");

        m11.setFont(new java.awt.Font("Tahoma", 1, 11));
        m11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m11MouseClicked(evt);
            }
        });
        m11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m11ActionPerformed(evt);
            }
        });

        a13.setText("Name of year");

        m12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        m13.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel a.png"))); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.setMaximumSize(new java.awt.Dimension(99, 30));
        cancelButton.setMinimumSize(new java.awt.Dimension(99, 30));
        cancelButton.setPreferredSize(new java.awt.Dimension(99, 30));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save a.png"))); // NOI18N
        saveButton.setText("Save");
        saveButton.setMaximumSize(new java.awt.Dimension(99, 30));
        saveButton.setMinimumSize(new java.awt.Dimension(99, 30));
        saveButton.setPreferredSize(new java.awt.Dimension(99, 30));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(a4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelLayout.createSequentialGroup()
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(a5)
                                .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(a12)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(a11, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(a13)
                                .addComponent(a9, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(79, 79, 79))
                        .addGroup(PanelLayout.createSequentialGroup()
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(m4)
                    .addComponent(m5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(m13, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(m1)
                            .addComponent(m2)
                            .addComponent(m3)
                            .addComponent(m6)
                            .addComponent(m7)
                            .addComponent(m8)
                            .addComponent(m9)
                            .addComponent(m10)
                            .addComponent(m11)
                            .addComponent(m12, 0, 161, Short.MAX_VALUE))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(a2)
                        .addGap(18, 18, 18)))
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(a3)
                    .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(a4))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a5)
                    .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a6)
                    .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a7)
                    .addComponent(m7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a8)
                    .addComponent(m8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a9)
                    .addComponent(m9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a10)
                    .addComponent(m10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a11)
                    .addComponent(m11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a12)
                    .addComponent(m12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a13)
                    .addComponent(m13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
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

private void m9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m9ActionPerformed
}//GEN-LAST:event_m9ActionPerformed

private void m10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m10ActionPerformed
}//GEN-LAST:event_m10ActionPerformed

private void m11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m11ActionPerformed
}//GEN-LAST:event_m11ActionPerformed

private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
    setVisible(false);
    dispose();
}//GEN-LAST:event_cancelButtonActionPerformed

private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
    if (m1.getText().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "ID Field is Empty", "Error", JOptionPane.WARNING_MESSAGE);
        m1.requestFocus();
        return;
    }
    if (m2.getText().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "BASIC SALARY Field is Empty", "Error", JOptionPane.WARNING_MESSAGE);
        m2.requestFocus();
        return;
    }
    String sql;

    if (fals == false) {
        sql = "INSERT INTO bpdb.ACCOUNT VALUES('"
                + m1.getText() + "','"
                + m2.getText() + "','"
                + m3.getText() + "','"
                + m4.getText() + "','"
                + m5.getSelectedItem() + "','"
                + m6.getText() + "','"
                + m7.getText() + "','"
                + m8.getText() + "','"
                + m9.getText() + "','"
                + m10.getText() + "','"
                + m11.getText() + "','"
                + m12.getSelectedItem() + "','"
                + m13.getSelectedItem() + "')";

        Utility2.insertUpdateQuery(sql, rootPane, 1);


    } else {
        sql = "update  bpdb.ACCOUNT set ID='" + m1.getText()
                + "',BASIC_SALARY='" + m2.getText()
                + "',HOUSE_RENT='" + m3.getText()
                + "',BONUS='" + m4.getText()
                + "',INCREMENTS='" + m5.getSelectedItem()
                + "',OTHER_ALLOUNCE='" + m6.getText()
                + "',MEDICAL='" + m7.getText()
                + "',PHONE='" + m8.getText()
                + "',TOTAL_AMOUNT='" + m9.getText()
                + "',PAY_AMOUNT='" + m10.getText()
                + "',DUE_AMOUNT='" + m11.getText()
                + "',NAME_OF_MONTH='" + m12.getSelectedItem()
                + "',NAME_OF_YEAR='" + m13.getSelectedItem() + "' "
                + " where ID ='" + ACCOUNTFrame.selectedName + "'";
        Utility2.insertUpdateQuery(sql, rootPane, 2);
    }
    setVisible(false);
    dispose();



}//GEN-LAST:event_saveButtonActionPerformed

private void m8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m8ActionPerformed
}//GEN-LAST:event_m8ActionPerformed

    private void m10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_m10MouseClicked

    private void m9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m9MouseClicked
        // TODO add your handling code here:
        a = m2.getText();
        int b = 100;
        int i = Integer.parseInt(a);
        int p = i / b;

        int c = p * 35;
        d = String.valueOf(c);
        m3.setText(d);

        int cc = p * 40;
        dd = String.valueOf(cc);
        m4.setText(dd);

        int ccc = p * 7;
        ddd = String.valueOf(ccc);
        m7.setText(ddd);

        int cccc = p * 2;
        dddd = String.valueOf(cccc);
        m8.setText(dddd);


        String q = m3.getText();
        String r = m4.getText();
        String s = (String) m5.getSelectedItem();
        String t = m6.getText();
        String u = m7.getText();
        String v = m8.getText();

        int j = Integer.parseInt(q);
        int k = Integer.parseInt(r);
        int l = Integer.parseInt(s);
        int m = Integer.parseInt(t);
        int n = Integer.parseInt(u);
        int o = Integer.parseInt(v);
        int x = i + j + k + l + m + n + o;
        w = String.valueOf(x);
        m9.setText(w);
    }//GEN-LAST:event_m9MouseClicked

    private void m11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m11MouseClicked
        // TODO add your handling code here:
        a = m9.getText();
        w = m10.getText();
        int i = Integer.parseInt(a) - Integer.parseInt(w);
        String a = String.valueOf(i);
        m11.setText(a);
    }//GEN-LAST:event_m11MouseClicked

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
            java.util.logging.Logger.getLogger(ACCOUNTDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ACCOUNTDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ACCOUNTDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ACCOUNTDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                ACCOUNTDialog dialog = new ACCOUNTDialog(new javax.swing.JFrame(), true, true);
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
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a10;
    private javax.swing.JLabel a11;
    private javax.swing.JLabel a12;
    private javax.swing.JLabel a13;
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
    private javax.swing.JTextField m11;
    private javax.swing.JComboBox m12;
    private javax.swing.JComboBox m13;
    private javax.swing.JTextField m2;
    private javax.swing.JTextField m3;
    private javax.swing.JTextField m4;
    private javax.swing.JComboBox m5;
    private javax.swing.JTextField m6;
    private javax.swing.JTextField m7;
    private javax.swing.JTextField m8;
    private javax.swing.JTextField m9;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
