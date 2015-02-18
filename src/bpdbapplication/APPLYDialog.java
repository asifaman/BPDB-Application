package bpdbapplication;

import Utility.Utility;
import Utility.Utility2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class APPLYDialog extends javax.swing.JDialog {
    
    static boolean fals;
    Object[][] data;
    
    public APPLYDialog(java.awt.Frame parent, boolean modal, boolean isFalse) {
        super(parent, modal);
        initComponents();
        this.setLocation(Utility.getWindowPosition(this.getSize(), this.getToolkit()));
        fals = isFalse;
        if (fals == true) {
            String sql = "SELECT count(FROM_NUMBER)FROM bpdb.APPLY where FROM_NUMBER='" + APPLYFrame.selectedName + "'";
            int count = Utility2.countQuery(rootPane, sql);
            System.out.println(count);
            data = new Object[count][13];
            String sq = "select FROM_NUMBER,"
                    + "NAME,"
                    + "FATHER_NAME,"
                    + "MOTHER_NAME,"
                    + "GENDER,"
                    + "AGE,"
                    + "EDUCATION_QUALIFICATION,"
                    + "CONTACT_NUMBER,"
                    + "BDN_NUMBER,"
                    + "EMAIL_ADDRESS" + " from bpdb.APPLY where FROM_NUMBER='" + APPLYFrame.selectedName + "'";
            data = Utility2.getMultiRowQueryObjects(sq, rootPane, count);
            m0.setText(data[0][0].toString());
            m1.setText(data[0][1].toString());
            m2.setText(data[0][2].toString());
            m3.setText(data[0][3].toString());
            m4.setSelectedItem(data[0][4].toString());
            m5.setSelectedItem(data[0][5].toString());
            m6.setSelectedItem(data[0][6].toString());
            m7.setText(data[0][7].toString());
            m8.setText(data[0][8].toString());
            m9.setText(data[0][9].toString());
            
            
            
            
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
        m3 = new javax.swing.JTextField();
        a4 = new javax.swing.JLabel();
        m4 = new javax.swing.JComboBox();
        a5 = new javax.swing.JLabel();
        m5 = new javax.swing.JComboBox();
        a6 = new javax.swing.JLabel();
        m6 = new javax.swing.JComboBox();
        a7 = new javax.swing.JLabel();
        m7 = new javax.swing.JTextField();
        a8 = new javax.swing.JLabel();
        m8 = new javax.swing.JTextField();
        exitButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        a9 = new javax.swing.JLabel();
        m9 = new javax.swing.JTextField();
        a0 = new javax.swing.JLabel();
        m0 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        a1.setText("Name");

        m1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        m1.setPreferredSize(new java.awt.Dimension(3, 20));

        a2.setText("Father Name");

        m2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        m2.setMinimumSize(new java.awt.Dimension(3, 20));
        m2.setPreferredSize(new java.awt.Dimension(3, 20));
        m2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2ActionPerformed(evt);
            }
        });

        a3.setText("Mother Name");

        m3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        m3.setMinimumSize(new java.awt.Dimension(3, 20));
        m3.setPreferredSize(new java.awt.Dimension(3, 20));

        a4.setText("Gender");

        m4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "male", "Female" }));
        m4.setMinimumSize(new java.awt.Dimension(6, 20));
        m4.setPreferredSize(new java.awt.Dimension(6, 20));
        m4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m4ActionPerformed(evt);
            }
        });

        a5.setText("Age");

        m5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "18 years", "19 years", "20 years", "21 years", "22 years", "23 years", "24 years", "25 years", "26 years", "27 years", "28 years", "29 years", "30 years" }));
        m5.setMinimumSize(new java.awt.Dimension(6, 20));
        m5.setPreferredSize(new java.awt.Dimension(6, 20));
        m5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m5ActionPerformed(evt);
            }
        });

        a6.setText("Education Qualification");

        m6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "S.S.C", "H.S.C", "B.A", "M.A", "B.B.A", "M.B.A", "B.S.C (Honours)", "M.S.C (Honours)", "B.S.C in Electrical Engineer", "M.S.C in Electrical Engineer", "B.S.C in Electronic Engineer", "M.S.C in Electronic Engineer", "B.S.C in Mechanical Engineer", "M.S.C in Mechanical Engineer", "B.S.C in Computer Engineer", "M.S.C in Computer Engineer" }));
        m6.setMinimumSize(new java.awt.Dimension(6, 20));
        m6.setPreferredSize(new java.awt.Dimension(6, 20));
        m6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m6ActionPerformed(evt);
            }
        });

        a7.setText("Contact Number");

        m7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        m7.setMinimumSize(new java.awt.Dimension(3, 20));
        m7.setPreferredSize(new java.awt.Dimension(3, 20));

        a8.setText("BDN  Number");

        m8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        m8.setMinimumSize(new java.awt.Dimension(3, 20));
        m8.setPreferredSize(new java.awt.Dimension(3, 20));
        m8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m8ActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel c.png"))); // NOI18N
        exitButton.setText("Exit");
        exitButton.setMaximumSize(new java.awt.Dimension(89, 33));
        exitButton.setMinimumSize(new java.awt.Dimension(89, 33));
        exitButton.setPreferredSize(new java.awt.Dimension(89, 33));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save c.png"))); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        a9.setText("E mail address");

        m9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        m9.setMinimumSize(new java.awt.Dimension(3, 20));
        m9.setPreferredSize(new java.awt.Dimension(3, 20));
        m9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m9ActionPerformed(evt);
            }
        });

        a0.setFont(new java.awt.Font("Tahoma", 1, 11));
        a0.setForeground(new java.awt.Color(0, 0, 255));
        a0.setText("From Number");

        m0.setBackground(new java.awt.Color(255, 0, 0));
        m0.setEditable(false);
        m0.setFont(new java.awt.Font("Tahoma", 1, 14));
        m0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        m0.setPreferredSize(new java.awt.Dimension(3, 20));

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(a8, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(m8, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(a9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(m9, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                        .addComponent(saveButton))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a3)
                            .addComponent(a2)
                            .addComponent(a1)
                            .addComponent(a4)
                            .addComponent(a5)
                            .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a0))
                        .addGap(22, 22, 22)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m7, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(m4, javax.swing.GroupLayout.Alignment.TRAILING, 0, 208, Short.MAX_VALUE)
                            .addComponent(m1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(m2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(m3, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(m6, javax.swing.GroupLayout.Alignment.TRAILING, 0, 208, Short.MAX_VALUE)
                            .addComponent(m5, javax.swing.GroupLayout.Alignment.TRAILING, 0, 208, Short.MAX_VALUE)
                            .addComponent(m0, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))))
                .addGap(116, 116, 116))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(a1))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a0))
                        .addGap(18, 18, 18)
                        .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(a2))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(a3))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a4)
                    .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a5)
                    .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a6)
                    .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a7)
                    .addComponent(m7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(m8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(m9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(a8)
                        .addGap(18, 18, 18)
                        .addComponent(a9)))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(459, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
    setVisible(false);
    dispose();
}//GEN-LAST:event_exitButtonActionPerformed
    
private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
    if (m1.getText().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "NAME Field is Empty", "Error", JOptionPane.WARNING_MESSAGE);
        m1.requestFocus();
        return;
    }
    if (m7.getText().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane,"CONTACT NUMBER Field is Empty", "Error", JOptionPane.WARNING_MESSAGE);
        m7.requestFocus();
        return;
    }
    if (m8.getText().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "BDN NUMBER Field is Empty", "Error", JOptionPane.WARNING_MESSAGE);
        m8.requestFocus();
        return;
        
    }
    
    
    
    String sql;
    
    if (fals == false) {
        sql = "INSERT INTO bpdb.APPLY VALUES('"
                + m0.getText() + "','"
                + m1.getText() + "','"
                + m2.getText() + "','"
                + m3.getText() + "','"
                + m4.getSelectedItem() + "','"
                + m5.getSelectedItem() + "','"
                + m6.getSelectedItem() + "','"
                + m7.getText() + "','"
                + m8.getText() + "','"
                + m9.getText() + "')";
        
        Utility2.insertUpdateQuery(sql, rootPane, 1);
        
        
    } else {
        sql = "update  bpdb.APPLY set FROM_NUMBER='" + m0.getText()
                + "',NAME='" + m1.getText()
                + "',FATHER_NAME='" + m2.getText()
                + "',MOTHER_NAME='" + m3.getText()
                + "',GENDER='" + m4.getSelectedItem()
                + "',AGE='" + m5.getSelectedItem()
                + "',EDUCATION_QUALIFICATION='" + m6.getSelectedItem()
                + "',CONTACT_NUMBER='" + m7.getText()
                + "',BDN_NUMBER='" + m8.getText()
                + "',EMAIL_ADDRESS='" + m9.getText() + "' "
                + " where FROM_NUMBER ='" + APPLYFrame.selectedName + "'";
        Utility2.insertUpdateQuery(sql, rootPane, 2);
    }
    setVisible(false);
    dispose();
    
    
    
}//GEN-LAST:event_saveButtonActionPerformed
    
private void m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_m2ActionPerformed
    
private void m4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m4ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_m4ActionPerformed
    
private void m6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m6ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_m6ActionPerformed
    
private void m5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m5ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_m5ActionPerformed
    
private void m8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m8ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_m8ActionPerformed
    
private void m9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m9ActionPerformed
// TODO add your handling code here:
    // String email = "test@test.com";
    String email = m9.getText();
    Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
    Matcher m = p.matcher(email);
    boolean matchFound = m.matches();
    
    if (matchFound) {
        email = m9.getText();
//System.out.println("EMAIL OK");
        JOptionPane.showMessageDialog(this, email);
        
    } else {
//System.out.println("EMAIL ERROR");
        JOptionPane.showMessageDialog(this, email);
    }
}//GEN-LAST:event_m9ActionPerformed
    
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
            java.util.logging.Logger.getLogger(APPLYDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(APPLYDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(APPLYDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(APPLYDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                APPLYDialog dialog = new APPLYDialog(new javax.swing.JFrame(), true, true);
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
    private javax.swing.JLabel a0;
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel a6;
    private javax.swing.JLabel a7;
    private javax.swing.JLabel a8;
    private javax.swing.JLabel a9;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField m0;
    private javax.swing.JTextField m1;
    private javax.swing.JTextField m2;
    private javax.swing.JTextField m3;
    private javax.swing.JComboBox m4;
    private javax.swing.JComboBox m5;
    private javax.swing.JComboBox m6;
    private javax.swing.JTextField m7;
    private javax.swing.JTextField m8;
    private javax.swing.JTextField m9;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
