package bpdbapplication;

import Utility.Utility;
import Utility.Utility2;
import javax.swing.JOptionPane;

public class HRDialog extends javax.swing.JDialog {

    static boolean fals;
    Object[][] data;

    public HRDialog(java.awt.Frame parent, boolean modal, boolean isFalse) {
        super(parent, modal);
        initComponents();
        this.setLocation(Utility.getWindowPosition(this.getSize(), this.getToolkit()));
        fals = isFalse;
        if (fals == true) {
            String sql = "SELECT count(ID)FROM bpdb.HR where ID='" + HRFrame.selectedName + "'";
            int count = Utility2.countQuery(rootPane, sql);
            System.out.println(count);
            data = new Object[count][14];
            String sq = "select ID,"
                    + "DESIGNATION,"
                    + "NAME,"
                    + "FATHER_NAME,"
                    + "MOTHER_NAME,"
                    + "GENDER,"
                    + "AGE,"
                    + "DATE_OF_BIRTH,"
                    + "CONTACT_NUMBER,"
                    + "E_MAIL_ID,"
                    + "EDUCATION_BACKGROUND,"
                    + "JOINING_DATE,"
                    + "PRESENT_ADDRESS,"
                    + "PERMANENT_ADDRESS" + " from bpdb.HR where ID='" + HRFrame.selectedName + "'";
            data = Utility2.getMultiRowQueryObjects(sq, rootPane, count);
            m1.setText(data[0][0].toString());
            m2.setSelectedItem(data[0][1].toString());
            m3.setText(data[0][2].toString());
            m4.setText(data[0][3].toString());
            m5.setText(data[0][4].toString());
            m6.setSelectedItem(data[0][5].toString());
            m7.setSelectedItem(data[0][6].toString());
            m8.setText(data[0][7].toString());
            m9.setText(data[0][8].toString());
            m10.setText(data[0][9].toString());
            m11.setSelectedItem(data[0][10].toString());
            m12.setText(data[0][11].toString());
            m13.setText(data[0][12].toString());
            m14.setText(data[0][13].toString());


        }


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HRPanel = new javax.swing.JPanel();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        a6 = new javax.swing.JLabel();
        a7 = new javax.swing.JLabel();
        a8 = new javax.swing.JLabel();
        a9 = new javax.swing.JLabel();
        a10 = new javax.swing.JLabel();
        a11 = new javax.swing.JLabel();
        a12 = new javax.swing.JLabel();
        a13 = new javax.swing.JLabel();
        a14 = new javax.swing.JLabel();
        m1 = new javax.swing.JTextField();
        m3 = new javax.swing.JTextField();
        m8 = new javax.swing.JTextField();
        m4 = new javax.swing.JTextField();
        m5 = new javax.swing.JTextField();
        m9 = new javax.swing.JTextField();
        m2 = new javax.swing.JComboBox();
        m7 = new javax.swing.JComboBox();
        m10 = new javax.swing.JTextField();
        m11 = new javax.swing.JComboBox();
        m12 = new javax.swing.JTextField();
        m13 = new javax.swing.JTextField();
        m14 = new javax.swing.JTextField();
        m6 = new javax.swing.JComboBox();
        cancelButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        HRPanel.setBackground(new java.awt.Color(255, 255, 255));
        HRPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        HRPanel.setMinimumSize(new java.awt.Dimension(375, 552));
        HRPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a1.setText("ID ");
        HRPanel.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 46, -1));

        a2.setText("Designation");
        HRPanel.add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        a3.setText("Name");
        HRPanel.add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        a4.setText("Father name");
        HRPanel.add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        a5.setText("Mother name");
        HRPanel.add(a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        a6.setText("Gender");
        HRPanel.add(a6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, 23));

        a7.setText("Age");
        HRPanel.add(a7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 54, -1));

        a8.setText("Date of birth");
        HRPanel.add(a8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 70, -1));

        a9.setText("Contact number");
        HRPanel.add(a9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 100, 23));

        a10.setText("E-mail ID ");
        HRPanel.add(a10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        a11.setText("Education background");
        HRPanel.add(a11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 130, -1));

        a12.setText("Joining date");
        HRPanel.add(a12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 80, 20));

        a13.setText("Present address");
        HRPanel.add(a13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, -1, -1));

        a14.setText("Permanent address");
        HRPanel.add(a14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, -1, -1));
        HRPanel.add(m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 181, 30));
        HRPanel.add(m3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 181, 27));
        HRPanel.add(m8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 181, 27));
        HRPanel.add(m4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 181, 27));
        HRPanel.add(m5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 181, 27));
        HRPanel.add(m9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 181, 27));

        m2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Junior Officer", "Senior Officer", "Officer Grade-2", "Officer Grade-3", "Junior Engineer", "Senior Engineer", "Electrical Engineer", "Electrician", "Meter Reader", "Meter Cheaker", "Meter Inspector", "Odit Officer", "Line man ", "Accounts Offier", "Officer Attendentce" }));
        HRPanel.add(m2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 181, 30));

        m7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        HRPanel.add(m7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 181, -1));
        HRPanel.add(m10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 181, 27));

        m11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "S.S.C", "H.S.C", "Dakhil", "Alim", "Fazil", "Kamil", "B.A", "B.S.C", "M.A", "M.S.C", "B.S.C in computer engineer", "B.S.C in electrical engineer", "B.S.C in mechanical engineer", "M.S.C in computer engineer", "M.S.C in electrical engineer", "M.S.C in mechanical engineer", "B.B.A", "M.B.A" }));
        HRPanel.add(m11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 180, -1));
        HRPanel.add(m12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 181, 27));
        HRPanel.add(m13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 181, 27));
        HRPanel.add(m14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 181, 27));

        m6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        HRPanel.add(m6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 180, -1));

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel h.png"))); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.setMaximumSize(new java.awt.Dimension(99, 33));
        cancelButton.setMinimumSize(new java.awt.Dimension(99, 33));
        cancelButton.setPreferredSize(new java.awt.Dimension(99, 33));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        HRPanel.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, -1, -1));

        saveButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save h.png"))); // NOI18N
        saveButton.setText("Save");
        saveButton.setMaximumSize(new java.awt.Dimension(99, 33));
        saveButton.setMinimumSize(new java.awt.Dimension(99, 33));
        saveButton.setPreferredSize(new java.awt.Dimension(99, 33));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        HRPanel.add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HRPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HRPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    if (m3.getText().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "NAME Field is Empty", "Error", JOptionPane.WARNING_MESSAGE);
        m3.requestFocus();
        return;
    }
    if (m4.getText().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "FATHER NAME Field is Empty", "Error", JOptionPane.WARNING_MESSAGE);
        m4.requestFocus();
        return;
    }
    String sql;

    if (fals == false) {
        sql = "INSERT INTO bpdb.HR VALUES('"
                + m1.getText() + "','"
                + m2.getSelectedItem() + "','"
                + m3.getText() + "','"
                + m4.getText() + "','"
                + m5.getText() + "','"
                + m6.getSelectedItem() + "','"
                + m7.getSelectedItem() + "','"
                + m8.getText() + "','"
                + m9.getText() + "','"
                + m10.getText() + "','"
                + m11.getSelectedItem() + "','"
                + m12.getText() + "','"
                + m13.getText() + "','"
                + m14.getText() + "')";

        Utility2.insertUpdateQuery(sql, rootPane, 1);


    } else {
        sql = "update  bpdb.HR set ID='" + m1.getText()
                + "',DESIGNATION='" + m2.getSelectedItem()
                + "',NAME='" + m3.getText()
                + "',FATHER_NAME='" + m4.getText()
                + "',MOTHER_NAME='" + m5.getText()
                + "',GENDER='" + m6.getSelectedItem()
                + "',AGE='" + m7.getSelectedItem()
                + "',DATE_OF_BIRTH='" + m8.getText()
                + "',CONTACT_NUMBER='" + m9.getText()
                + "',E_MAIL_ID='" + m10.getText()
                + "',EDUCATION_BACKGROUND='" + m11.getSelectedItem()
                + "',JOINING_DATE='" + m12.getText()
                + "',PRESENT_ADDRESS='" + m13.getText()
                + "',PERMANENT_ADDRESS='" + m14.getText() + "' "
                + " where ID ='" + HRFrame.selectedName + "'";
        Utility2.insertUpdateQuery(sql, rootPane, 2);
    }
    setVisible(false);
    dispose();




}//GEN-LAST:event_saveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HRDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HRDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HRDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HRDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                HRDialog dialog = new HRDialog(new javax.swing.JFrame(), true, true);
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
    private javax.swing.JPanel HRPanel;
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
    private javax.swing.JComboBox m11;
    private javax.swing.JTextField m12;
    private javax.swing.JTextField m13;
    private javax.swing.JTextField m14;
    private javax.swing.JComboBox m2;
    private javax.swing.JTextField m3;
    private javax.swing.JTextField m4;
    private javax.swing.JTextField m5;
    private javax.swing.JComboBox m6;
    private javax.swing.JComboBox m7;
    private javax.swing.JTextField m8;
    private javax.swing.JTextField m9;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
