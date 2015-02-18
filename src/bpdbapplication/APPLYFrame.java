package bpdbapplication;

import Utility.Utility2;
import java.awt.Frame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class APPLYFrame extends javax.swing.JFrame {

    static Object selectedName;
    Object[][] data;
    private Frame APPLYFrame;

    public APPLYFrame() {
        initComponents();
        // this.setExtendedState(this.getExtendedState().Frame);
        this.setExtendedState(this.getExtendedState() | Frame.MAXIMIZED_BOTH);
        Table();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        HRPanel = new javax.swing.JPanel();
        apply = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();
        ComboBox = new javax.swing.JComboBox();
        search = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        BackButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        PrintButton = new javax.swing.JButton();
        InsertButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HRPanel.setBackground(new java.awt.Color(255, 255, 255));
        HRPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        apply.setFont(new java.awt.Font("Tahoma", 1, 14));
        apply.setText("BPDB EMPLOYEE  APPLY  INFORMATION");

        searchLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        searchLabel.setText("Search By:");

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Name", "BDN Number", "Contact Number" }));

        search.setFont(new java.awt.Font("Tahoma", 1, 14));
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search b.png"))); // NOI18N
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
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        BackButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Back a.png"))); // NOI18N
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
        DeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel g.png"))); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.setMaximumSize(new java.awt.Dimension(101, 33));
        DeleteButton.setMinimumSize(new java.awt.Dimension(101, 33));
        DeleteButton.setPreferredSize(new java.awt.Dimension(101, 33));
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        EditButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        EditButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit d.png"))); // NOI18N
        EditButton.setText("Edit");
        EditButton.setMaximumSize(new java.awt.Dimension(101, 33));
        EditButton.setMinimumSize(new java.awt.Dimension(101, 33));
        EditButton.setPreferredSize(new java.awt.Dimension(101, 33));
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        PrintButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        PrintButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit i.png"))); // NOI18N
        PrintButton.setText("Print");
        PrintButton.setToolTipText("click For print out");
        PrintButton.setMaximumSize(new java.awt.Dimension(101, 33));
        PrintButton.setMinimumSize(new java.awt.Dimension(101, 33));
        PrintButton.setPreferredSize(new java.awt.Dimension(101, 33));
        PrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintButtonActionPerformed(evt);
            }
        });

        InsertButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        InsertButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add c.png"))); // NOI18N
        InsertButton.setText("Insert");
        InsertButton.setMaximumSize(new java.awt.Dimension(101, 33));
        InsertButton.setMinimumSize(new java.awt.Dimension(101, 33));
        InsertButton.setPreferredSize(new java.awt.Dimension(101, 33));
        InsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertButtonActionPerformed(evt);
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
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HRPanelLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(PrintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
            .addGroup(HRPanelLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(apply, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        HRPanelLayout.setVerticalGroup(
            HRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HRPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(apply, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(PrintButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        searchCol = "NAME";
    } else if (ComboBox.getSelectedIndex() == 1) {
        searchCol = "BDN_NUMBER";
    } else if (ComboBox.getSelectedIndex() == 2) {
        searchCol = "CONTACT_NUMBER";
    }

    String sql = "SELECT count(FROM_NUMBER) FROM bpdb.APPLY WHERE "
            + searchCol + " LIKE '" + searchField.getText() + "%'";
    count =
            Utility2.countQuery(searchField, sql);

    data = new Object[count][10];

    sql = "SELECT * FROM bpdb.APPLY WHERE " + searchCol + " LIKE '" + searchField.getText() + "%'";
    data = Utility2.getMultiRowQueryObjects(sql, ComboBox, count);


    Object[] header = {
        "FROM NUMBER",
        "NAME",
        "FATHER NAME",
        "MOTHER NAME",
        "GENDER",
        "AGE",
        "EDUCATION QUALIFICATION",
        "CONTACT NUMBER",
        "BDN NUMBER",
        "EMAIL ADDRESS",};
    DefaultTableModel dtm = new DefaultTableModel(data, header);
    Table.setModel(dtm);

}//GEN-LAST:event_searchFieldKeyReleased

private void TableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMousePressed
    DeleteButton.setEnabled(true);
    EditButton.setEnabled(true);
    PrintButton.setEnabled(true);
}//GEN-LAST:event_TableMousePressed

private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
    setVisible(false);
    dispose();
    new LoginFrame().setVisible(true);
}//GEN-LAST:event_BackButtonActionPerformed

private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
if (JOptionPane.showConfirmDialog(this, "Are you sure.............\n                      to Delete") == 0) {
    selectedName = (String) data[Table.getSelectedRow()][0];
    String sql = "DELETE  BPDB.APPLY WHERE FROM_NUMBER = '" + selectedName + "'";
    //JOptionPane.showConfirmDialog(DeleteButton, selectedName);
    Utility2.insertUpdateQuery(sql, DeleteButton, 4);
    Table();
}
}//GEN-LAST:event_DeleteButtonActionPerformed

private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
    selectedName = data[Table.getSelectedRow()][0];
    new APPLYDialog(APPLYFrame, true, true).setVisible(true);
    Table();
}//GEN-LAST:event_EditButtonActionPerformed

private void PrintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintButtonActionPerformed
    // JOptionPane.showConfirmDialog(rootPane,"ARE YOU SURE TO PRINT" );
}//GEN-LAST:event_PrintButtonActionPerformed

private void InsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertButtonActionPerformed
// TODO add your handling code here:
    new APPLYDialog(APPLYFrame, true, false).setVisible(true);
    Table();
}//GEN-LAST:event_InsertButtonActionPerformed

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
            java.util.logging.Logger.getLogger(APPLYFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(APPLYFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(APPLYFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(APPLYFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new APPLYFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox ComboBox;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JPanel HRPanel;
    private javax.swing.JButton InsertButton;
    private javax.swing.JButton PrintButton;
    private javax.swing.JTable Table;
    private javax.swing.JLabel apply;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel search;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchLabel;
    // End of variables declaration//GEN-END:variables

    private void Table() {
        Object[] header = {
            "FROM NUMBER",
            "NAME",
            "FATHER NAME",
            "MOTHER NAME",
            "GENDER",
            "AGE",
            "EDUCATION QUALIFICATION",
            "CONTACT NUMBER",
            "BDN NUMBER",
            "EMAIL ADDRESS"
        };
        String sql = "SELECT count(FROM_NUMBER) from bpdb.APPLY";
        int Count = Utility2.countQuery(Table, sql);

        data = new Object[Count][10];

        sql = "SELECT * from bpdb.APPLY";
        data = Utility2.getMultiRowQueryObjects(sql, Table, Count);
        DefaultTableModel dtm = new DefaultTableModel(data, header);
        Table.setModel(dtm);
        //Table.setModel(dtm);
        DeleteButton.setEnabled(false);
        EditButton.setEnabled(false);
        PrintButton.setEnabled(false);



    }
}
