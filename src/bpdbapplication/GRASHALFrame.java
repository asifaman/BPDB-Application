package bpdbapplication;

import Utility.Utility2;
import java.awt.Frame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GRASHALFrame extends javax.swing.JFrame {

    static Object selectedName;
    Object[][] data;
    private Frame GRASHALFrame;

    public GRASHALFrame() {
        initComponents();
        //this.setLocation(Utility.getWindowPosition(this.getSize(), this.getToolkit()));
        this.setExtendedState(this.getExtendedState() | Frame.MAXIMIZED_BOTH);
        Table();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HRPanel = new javax.swing.JPanel();
        employee = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();
        ComboBox = new javax.swing.JComboBox();
        search = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        BackButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        InsertButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HRPanel.setBackground(new java.awt.Color(255, 255, 255));
        HRPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        employee.setFont(new java.awt.Font("Tahoma", 1, 14));
        employee.setForeground(new java.awt.Color(0, 155, 55));
        employee.setText("POWER GENERATION INFORMATION \"GRASHAL\"");

        searchLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        searchLabel.setText("Search By:");

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Transmeter ID", "Company Name", "Serial Number" }));

        search.setFont(new java.awt.Font("Tahoma", 1, 14));
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search e.png"))); // NOI18N
        search.setText("Search Key:");

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        Table.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        BackButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Back f.png"))); // NOI18N
        BackButton.setText("Back");
        BackButton.setMaximumSize(new java.awt.Dimension(101, 33));
        BackButton.setMinimumSize(new java.awt.Dimension(101, 33));
        BackButton.setPreferredSize(new java.awt.Dimension(101, 33));
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        RemoveButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        RemoveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel d.png"))); // NOI18N
        RemoveButton.setText("Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        InsertButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        InsertButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add h.png"))); // NOI18N
        InsertButton.setText("Insert");
        InsertButton.setMaximumSize(new java.awt.Dimension(101, 33));
        InsertButton.setMinimumSize(new java.awt.Dimension(101, 33));
        InsertButton.setPreferredSize(new java.awt.Dimension(101, 33));
        InsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertButtonActionPerformed(evt);
            }
        });

        UpdateButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        UpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit g.png"))); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HRPanelLayout = new javax.swing.GroupLayout(HRPanel);
        HRPanel.setLayout(HRPanelLayout);
        HRPanelLayout.setHorizontalGroup(
            HRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HRPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search)
                .addGap(26, 26, 26)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HRPanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RemoveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
            .addGroup(HRPanelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(employee)
                .addContainerGap(161, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
        );
        HRPanelLayout.setVerticalGroup(
            HRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HRPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(employee, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(HRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchLabel)
                    .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(HRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RemoveButton)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton)
                    .addComponent(InsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HRPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HRPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
    String searchCol = "";
    int count = 0;



    if (ComboBox.getSelectedIndex() == 0) {
        searchCol = "TRANSMETER_ID";
    } else if (ComboBox.getSelectedIndex() == 1) {
        searchCol = "COMPANY_NAME";
    } else if (ComboBox.getSelectedIndex() == 2) {
        searchCol = "SERIAL_NUMBER";
    }


    String sql = "SELECT count(TRANSMETER_ID) FROM bpdb.GENERATION_GRASHAL WHERE "
            + searchCol + " LIKE '" + searchField.getText() + "%'";
    count =
            Utility2.countQuery(searchField, sql);

    data = new Object[count][10];

    sql = "SELECT * FROM bpdb.GENERATION_GRASHAL WHERE " + searchCol + " LIKE '" + searchField.getText() + "%'";
    data = Utility2.getMultiRowQueryObjects(sql, ComboBox, count);


    Object[] header = {
        "TRANSMETER ID",
        "COMPANY NAME",
        "NAME OF MONTH",
        "NAME OF YEAR",
        "BUDGETING AMOUNT",
        "TARGET POWER AMOUNT ",
        "POWER SYSTEM LOSS ",
        "USABLE POWER AMOUNT",
        "TOTAL BALENCE AMOUNT",
        "SERIAL NUMBER"
    };
    DefaultTableModel dtm = new DefaultTableModel(data, header);
    Table.setModel(dtm);


}//GEN-LAST:event_searchFieldKeyReleased

private void TableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMousePressed
    RemoveButton.setEnabled(true);
    UpdateButton.setEnabled(true);
}//GEN-LAST:event_TableMousePressed

private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
    setVisible(false);
    dispose();
    new LoginFrame().setVisible(true);
}//GEN-LAST:event_BackButtonActionPerformed

private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
    
    if (JOptionPane.showConfirmDialog(this, "are you confirm") == 0) {
    selectedName = data[Table.getSelectedRow()][0];
    String sql = "DELETE bpdb.GENERATION_GRASHAL WHERE TRANSMETER_ID = '" + selectedName + "'";
    // new ConfarmationDialog(this, true).setVisible(true);
    Utility2.insertUpdateQuery(sql, UpdateButton, 4);
    Table();
    }
}//GEN-LAST:event_RemoveButtonActionPerformed

private void InsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertButtonActionPerformed
    new GRASHALDialog(GRASHALFrame, true, false).setVisible(true);
    Table();
}//GEN-LAST:event_InsertButtonActionPerformed

private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
    selectedName = data[Table.getSelectedRow()][0];
    new GRASHALDialog(GRASHALFrame, true, true).setVisible(true);
    Table();
}//GEN-LAST:event_UpdateButtonActionPerformed

private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
}//GEN-LAST:event_searchFieldActionPerformed

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
            java.util.logging.Logger.getLogger(GRASHALFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GRASHALFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GRASHALFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GRASHALFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new GRASHALFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox ComboBox;
    private javax.swing.JPanel HRPanel;
    private javax.swing.JButton InsertButton;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JTable Table;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel employee;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel search;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchLabel;
    // End of variables declaration//GEN-END:variables

    private void Table() {
        Object[] header = {
            "TRANSMETER ID",
            "COMPANY NAME",
            "NAME OF MONTH",
            "NAME OF YEAR",
            "BUDGETING AMOUNT",
            "TARGET POWER AMOUNT ",
            "POWER SYSTEM LOSS ",
            "USABLE POWER AMOUNT",
            "TOTAL BALENCE AMOUNT",
            "SERIAL NUMBER"
        };
        String sql = "SELECT count(TRANSMETER_ID) from bpdb.GENERATION_GRASHAL";
        int Count = Utility2.countQuery(Table, sql);

        data = new Object[Count][10];

        sql = "SELECT * from bpdb.GENERATION_GRASHAL";
        data = Utility2.getMultiRowQueryObjects(sql, Table, Count);
        DefaultTableModel dtm = new DefaultTableModel(data, header);
        Table.setModel(dtm);
        UpdateButton.setEnabled(false);
        RemoveButton.setEnabled(false);

    }
}
