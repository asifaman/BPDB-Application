

package bpdbapplication;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;


public class SoftwareDialog extends javax.swing.JDialog {
    
    /** Creates  aboutDialog */
    public SoftwareDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        setTitle("About Software");
        
       
        Rectangle parentBounds = parent.getBounds();
        Dimension size = getSize();
        //Center in the parent
        int x = Math.max(0, parentBounds.x + (parentBounds.width - size.width) / 2);
        int y = Math.max(0, parentBounds.y + (parentBounds.height - size.height) / 2);
       setLocation(new Point(x, y));        
        
        
        
        
        
        //setIconImage(new ImageIcon(Main.class.getResource("/icon/icon.png")).getImage());
        
    }
    

 
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        Separator = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        photo = new javax.swing.JLabel();
        sunsoft = new Utility.SLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        okButton.setFont(new java.awt.Font("Tahoma", 1, 12));
        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        area.setColumns(20);
        area.setEditable(false);
        area.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        area.setRows(5);
        area.setText("The software is designed to perform the \nactivities related to HR, Admin, Account, \nGeneration, Distribution and Billing information.\nIt will store data related to personnel, \nadministrative, accounting information \nand data base of customers. ");
        jScrollPane1.setViewportView(area);

        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ktip.png"))); // NOI18N

        sunsoft.setForeground(new java.awt.Color(255, 0, 51));
        sunsoft.setText("sunsoftware & techonology LTD.");
        sunsoft.setFont(new java.awt.Font("Tahoma", 1, 12));
        sunsoft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sunsoftMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Separator, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(266, 266, 266)
                                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(sunsoft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(sunsoft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(okButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_okButtonActionPerformed

private void sunsoftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sunsoftMouseClicked
        // TODO add your handling code here:
        
}//GEN-LAST:event_sunsoftMouseClicked
    
    /**
   
     * 
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SoftwareDialog dialog = new SoftwareDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JSeparator Separator;
    private javax.swing.JTextArea area;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel photo;
    private Utility.SLabel sunsoft;
    // End of variables declaration//GEN-END:variables
    
}
