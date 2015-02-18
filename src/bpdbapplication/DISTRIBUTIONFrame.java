package bpdbapplication;

import Utility.Utility2;
import java.awt.Frame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DISTRIBUTIONFrame extends javax.swing.JFrame {

    private Frame DISTRIBUTIONFrame;
    static Object selectedName;
    Object[][] data;
    //String total, pay, sam;
    //int t, p, r, due;
    String a, b;

    //;
    public DISTRIBUTIONFrame() {
        initComponents();
        //this.setLocation(Utility.getWindowPosition(this.getSize(), this.getToolkit()));
        this.setExtendedState(this.getExtendedState() | Frame.MAXIMIZED_BOTH);
        Table();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HRPanel = new javax.swing.JPanel();
        distribution = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();
        ComboBox = new javax.swing.JComboBox();
        search = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        BackButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HRPanel.setBackground(new java.awt.Color(255, 255, 255));
        HRPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        distribution.setFont(new java.awt.Font("Tahoma", 1, 14));
        distribution.setText("BPDB POWER DISTRIBUTION INFORMATION");

        searchLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        searchLabel.setText("Search By:");

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Company Name", "Division Name", "District Name", "Area Zone" }));

        search.setFont(new java.awt.Font("Tahoma", 1, 14));
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search d.png"))); // NOI18N
        search.setText("Search Key:");

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
        Table.setAutoscrolls(false);
        Table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Table.setEditingColumn(0);
        Table.setEditingRow(0);
        Table.setRowMargin(2);
        Table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Table.setShowVerticalLines(false);
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        BackButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Back g.png"))); // NOI18N
        BackButton.setText("Logout");
        BackButton.setMaximumSize(new java.awt.Dimension(101, 33));
        BackButton.setMinimumSize(new java.awt.Dimension(101, 33));
        BackButton.setPreferredSize(new java.awt.Dimension(101, 33));
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        DeleteButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        DeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel c.png"))); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.setMaximumSize(new java.awt.Dimension(101, 33));
        DeleteButton.setMinimumSize(new java.awt.Dimension(101, 33));
        DeleteButton.setPreferredSize(new java.awt.Dimension(101, 33));
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        AddButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add g.png"))); // NOI18N
        AddButton.setText("Add");
        AddButton.setMaximumSize(new java.awt.Dimension(101, 33));
        AddButton.setMinimumSize(new java.awt.Dimension(101, 33));
        AddButton.setPreferredSize(new java.awt.Dimension(101, 33));
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        UpdateButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        UpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit i.png"))); // NOI18N
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
                .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search)
                .addGap(26, 26, 26)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(HRPanelLayout.createSequentialGroup()
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UpdateButton)
                .addGap(18, 18, 18)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
            .addGroup(HRPanelLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(distribution)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        HRPanelLayout.setVerticalGroup(
            HRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HRPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(distribution, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton)
                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HRPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HRPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
    String searchCol = "";
    int count = 0;



    if (ComboBox.getSelectedIndex() == 0) {
        searchCol = "COMPANY_NAME";
    } else if (ComboBox.getSelectedIndex() == 1) {
        searchCol = "DIVISION_NAME";
    } else if (ComboBox.getSelectedIndex() == 2) {
        searchCol = "DISTRICT_NAME";
    } else if (ComboBox.getSelectedIndex() == 3) {
        searchCol = "AREA_ZONE";
    }

    String sql = "SELECT count(DISTRIBUTION_NUMBER) FROM bpdb.DISTRIBUTION WHERE "
            + searchCol + " LIKE '" + searchField.getText() + "%'";
    count =
            Utility2.countQuery(searchField, sql);
    data = new Object[count][8];
    sql = "SELECT * FROM bpdb.DISTRIBUTION WHERE " + searchCol + " LIKE '" + searchField.getText() + "%'";
    data = Utility2.getMultiRowQueryObjects(sql, ComboBox, count);
    Object[] header = {
        "DISTRIBUTION NUMBER",
        "COMPANY NAME",
        "DIVISION NAME",
        "DISTRICT NAME",
        "AREA ZONE",
        "TOTAL POWER AMOUNT",
        "DEMAND POWER AMOUNT",
        "LOAD SHEADING"
    };
    DefaultTableModel dtm = new DefaultTableModel(data, header);

    Table.setModel(dtm);
}//GEN-LAST:event_searchFieldKeyReleased
private void TableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMousePressed
    DeleteButton.setEnabled(true);
    UpdateButton.setEnabled(true);
}//GEN-LAST:event_TableMousePressed

private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
    setVisible(false);
    dispose();
    new LoginFrame().setVisible(true);
}//GEN-LAST:event_BackButtonActionPerformed

private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed

    if (JOptionPane.showConfirmDialog(this, "are you sure") == 0) {
        selectedName = data[Table.getSelectedRow()][0];
    }
    String sql = "DELETE bpdb.DISTRIBUTION WHERE DISTRIBUTION_NUMBER= '" + selectedName + "'";
    //  new ConfarmationDialog(this, true).setVisible(true);
    Utility2.insertUpdateQuery(sql, DeleteButton, 4);
    Table();   // selectedName = data[Table.getSelectedRow()][0];
}//GEN-LAST:event_DeleteButtonActionPerformed

private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
    new DISTRIBUTIONDialog(DISTRIBUTIONFrame, true, false).setVisible(true);
    Table();
}//GEN-LAST:event_AddButtonActionPerformed

private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
    selectedName = data[Table.getSelectedRow()][0];
    new DISTRIBUTIONDialog(DISTRIBUTIONFrame, true, true).setVisible(true);
    Table();
}//GEN-LAST:event_UpdateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DISTRIBUTIONFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DISTRIBUTIONFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DISTRIBUTIONFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DISTRIBUTIONFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new DISTRIBUTIONFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox ComboBox;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JPanel HRPanel;
    private javax.swing.JTable Table;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel distribution;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel search;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchLabel;
    // End of variables declaration//GEN-END:variables

    private void Table() {
        Object[] header = {
            "DISTRIBUTION NUMBER",
            "COMPANY NAME",
            "DIVISION NAME",
            "DISTRICT NAME",
            "AREA ZONE",
            "TOTAL POWER AMOUNT",
            "DEMAND POWER AMOUNT",
            "LOAD SHEADING"
        };
        String sql = "SELECT count(DISTRIBUTION_NUMBER) from bpdb.DISTRIBUTION";
        int Count = Utility2.countQuery(Table, sql);
        data = new Object[Count][8];
        sql = "SELECT * from bpdb.DISTRIBUTION";

        data = Utility2.getMultiRowQueryObjects(sql, Table, Count);
        DefaultTableModel dtm = new DefaultTableModel(data, header);
        Table.setModel(dtm);
        DeleteButton.setEnabled(false);
        UpdateButton.setEnabled(false);


    }
}
