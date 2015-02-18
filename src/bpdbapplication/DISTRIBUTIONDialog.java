package bpdbapplication;

import Utility.Utility;
import Utility.Utility2;

public class DISTRIBUTIONDialog extends javax.swing.JDialog {

    static boolean fals;
    Object[][] data;
    String s, t;

    public DISTRIBUTIONDialog(java.awt.Frame parent, boolean modal, boolean isFalse) {
        super(parent, modal);
        initComponents();
        this.setLocation(Utility.getWindowPosition(this.getSize(), this.getToolkit()));
        fals = isFalse;
        if (fals == true) {
            String sql = "SELECT count(DISTRIBUTION_NUMBER)FROM bpdb.DISTRIBUTION where DISTRIBUTION_NUMBER='" + DISTRIBUTIONFrame.selectedName + "'";
            int count = Utility2.countQuery(rootPane, sql);
            System.out.println(count);
            data = new Object[count][8];
            String sq = "select DISTRIBUTION_NUMBER,"
                    + "COMPANY_NAME,"
                    + "DIVISION_NAME,"
                    + "DISTRICT_NAME,"
                    + "AREA_ZONE,"
                    + "TOTAL_POWER_AMOUNT,"
                    + "DEMAND_POWER_AMOUNT,"
                    + "LOAD_SHEADING" + " from bpdb.DISTRIBUTION where DISTRIBUTION_NUMBER='" + DISTRIBUTIONFrame.selectedName + "'";
            data = Utility2.getMultiRowQueryObjects(sq, rootPane, count);
            m0.setText(data[0][0].toString());
            m1.setSelectedItem(data[0][1].toString());
            m2.setSelectedItem(data[0][2].toString());
            m3.setSelectedItem(data[0][3].toString());
            m4.setSelectedItem(data[0][4].toString());
            m5.setText(data[0][5].toString());
            m6.setText(data[0][6].toString());
            m7.setText(data[0][7].toString());


        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Panel = new javax.swing.JPanel();
        a1 = new javax.swing.JLabel();
        m1 = new javax.swing.JComboBox();
        a2 = new javax.swing.JLabel();
        m2 = new javax.swing.JComboBox();
        a3 = new javax.swing.JLabel();
        m3 = new javax.swing.JComboBox();
        a4 = new javax.swing.JLabel();
        m4 = new javax.swing.JComboBox();
        a5 = new javax.swing.JLabel();
        m5 = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        a6 = new javax.swing.JLabel();
        m6 = new javax.swing.JTextField();
        a7 = new javax.swing.JLabel();
        m7 = new javax.swing.JTextField();
        a0 = new javax.swing.JLabel();
        m0 = new javax.swing.JTextField();
        a = new javax.swing.JLabel();
        a8 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        a1.setText("Company Name");

        m1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DESA", "CESA", "PDBH", "PBS" }));

        a2.setText("Division Name");

        m2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DHAKA", "BARISAL", "CHITTAGONG", "SYLHET", "RAJSHAHI", "KHULNA", "RANGPUR" }));
        m2.setPreferredSize(new java.awt.Dimension(32, 20));
        m2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2ActionPerformed(evt);
            }
        });

        a3.setText("District Name");

        m3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BHOLA", "BARISAL", "JHALOKHATI", "PATUAKHALI", "BARGUNA", "PEROJPUR", "PANCHARGARH", "THAKURGAON", "NILPHAMARI", "LALMONIRHAT", "DINAJPUR", "RANGPUR", "KURIGRAM", "NAWABGANJ", "NAOGAON", "JOYPURHAT", "GAIBANDHA", "RAJSHAHI", "BOGRA", "JAMALPUR", "SHERPUR", "NATORE", "SIRAJGANJ", "TANGAIL", "MYMENSINGH", "NETRAKONA", "SUNAMGANJ", "SYLHET", "HABIGANJ", "GAZIPUR", "KISHORGANJ", "MOULVIBAZAR", "NARSINGDI", "DHAKA", "PABNA", "KUSHTIA", "MEHERPUR", "RAJBARI", "MANIKGANJ", "FENI", "CHANDPUR", "SARIATPUR", "MADARIPUR", "GOPALGANJ", "NARIL", "MAGURA", "JESSORE", "COMMILLA", "KHULNA", "SATKHIRA", "BAGERHAT", "COX'S BAZAR", "BANDARBAN", "CHITTAGONG", "RANGAMATI", "KHAGRACHHARI", "NOAKHALI", "LAKSHMIPUR", "CHUADANGA", "JHENAIDAH", "MUNSHIGANJ", "FARIDPUR", "NARIONGANJ", "BRAHMANBARIA" }));
        m3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        m3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m3ActionPerformed(evt);
            }
        });

        a4.setText("Area Zone");

        m4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "General area", "Residential area", "Commerical area", "Business area", "Industrial area" }));

        a5.setText("Total Power Amount");

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel f.png"))); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.setMaximumSize(new java.awt.Dimension(101, 33));
        cancelButton.setMinimumSize(new java.awt.Dimension(101, 33));
        cancelButton.setPreferredSize(new java.awt.Dimension(101, 33));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save f.png"))); // NOI18N
        saveButton.setText("Save");
        saveButton.setMaximumSize(new java.awt.Dimension(101, 33));
        saveButton.setMinimumSize(new java.awt.Dimension(101, 33));
        saveButton.setPreferredSize(new java.awt.Dimension(101, 33));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        a6.setText("Demand Power Amount");

        m6.setAutoscrolls(false);

        a7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a7.setForeground(new java.awt.Color(0, 0, 255));
        a7.setText("Load Sheading");

        m7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        m7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m7MouseClicked(evt);
            }
        });
        m7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m7ActionPerformed(evt);
            }
        });

        a0.setFont(new java.awt.Font("Tahoma", 1, 12));
        a0.setForeground(new java.awt.Color(51, 0, 255));
        a0.setText("Distribution Number");

        m0.setBackground(new java.awt.Color(102, 0, 0));
        m0.setEditable(false);

        a.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a.setForeground(new java.awt.Color(255, 0, 0));
        a.setText("mw");

        a8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a8.setForeground(new java.awt.Color(255, 0, 0));
        a8.setText("mw");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a0)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(a2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(a1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(a3, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                        .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(a6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(a7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(a5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(m5, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(m2, javax.swing.GroupLayout.Alignment.LEADING, 0, 164, Short.MAX_VALUE)
                                    .addComponent(m3, 0, 164, Short.MAX_VALUE)
                                    .addComponent(m4, 0, 164, Short.MAX_VALUE)
                                    .addComponent(m1, 0, 164, Short.MAX_VALUE)
                                    .addComponent(m6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(m7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(m0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a)
                            .addComponent(a8))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a0)
                    .addComponent(m0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a1)
                    .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(m2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a3))
                .addGap(29, 29, 29)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a5)
                    .addComponent(a))
                .addGap(8, 8, 8)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(a6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(a7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a8))
                        .addGap(21, 21, 21)
                        .addComponent(m7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
    setVisible(false);
    dispose();
}//GEN-LAST:event_cancelButtonActionPerformed

private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

    String sql;

    if (fals == false) {
        sql = "INSERT INTO bpdb.DISTRIBUTION VALUES('"
                + m0.getText() + "','"
                + m1.getSelectedItem() + "','"
                + m2.getSelectedItem() + "','"
                + m3.getSelectedItem() + "','"
                + m4.getSelectedItem() + "','"
                + m5.getText() + "','"
                + m6.getText() + "','"
                + m7.getText() + "')";

        Utility2.insertUpdateQuery(sql, rootPane, 1);

    } else {

        sql = "update  bpdb.DISTRIBUTION set DISTRIBUTION_NUMBER='" + m0.getText()
                + "',COMPANY_NAME='" + m1.getSelectedItem()
                + "',DIVISION_NAME='" + m2.getSelectedItem()
                + "',DISTRICT_NAME='" + m3.getSelectedItem()
                + "',AREA_ZONE='" + m4.getSelectedItem()
                + "',TOTAL_POWER_AMOUNT='" + m5.getText()
                + "',DEMAND_POWER_AMOUNT='" + m6.getText()
                + "',LOAD_SHEADING='" + m7.getText() + "' "
                + " where DISTRIBUTION_NUMBER ='" + DISTRIBUTIONFrame.selectedName + "'";
        Utility2.insertUpdateQuery(sql, rootPane, 2);
    }
    setVisible(false);
    dispose();







}//GEN-LAST:event_saveButtonActionPerformed

private void m3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m3ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_m3ActionPerformed

private void m7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m7ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_m7ActionPerformed

private void m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_m2ActionPerformed

private void m7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m7MouseClicked
// TODO add your handling code here:
   s = (String) m5.getText();
    t = m6.getText();
    float i = Float.parseFloat(t) - Float.parseFloat(s);
    String a = String.valueOf(i);
    m7.setText(a);

}//GEN-LAST:event_m7MouseClicked

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
            java.util.logging.Logger.getLogger(DISTRIBUTIONDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DISTRIBUTIONDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DISTRIBUTIONDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DISTRIBUTIONDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                DISTRIBUTIONDialog dialog = new DISTRIBUTIONDialog(new javax.swing.JFrame(), true, true);
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
    private javax.swing.JLabel a0;
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel a6;
    private javax.swing.JLabel a7;
    private javax.swing.JLabel a8;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField m0;
    private javax.swing.JComboBox m1;
    private javax.swing.JComboBox m2;
    private javax.swing.JComboBox m3;
    private javax.swing.JComboBox m4;
    private javax.swing.JTextField m5;
    private javax.swing.JTextField m6;
    private javax.swing.JTextField m7;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
