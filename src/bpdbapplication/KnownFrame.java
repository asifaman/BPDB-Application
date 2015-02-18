package bpdbapplication;

public class KnownFrame extends javax.swing.JFrame {

    public KnownFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        out = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        known = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        out.setText("Out");
        out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outActionPerformed(evt);
            }
        });

        known.setColumns(20);
        known.setEditable(false);
        known.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        known.setRows(5);
        known.setText("Bangladesh Power Development Board (BPDB) is a statutory body created in May 1, 1972, \nby presidentialOrder No. 59 after bifurcation of erstwhileBangladesh Water and Power Dev\nelopment Authority. BPDB started its opertion with Generation capacity of only 180 MW. In\n FY 2012, Generation capacity (both public and private) has increased to about 8100 MW.\nAs part of reform and restructuring a number of Generation and Distribution companies have\nbeen created.The subsidiaries of BPDB are:\n\n- Ashuganj Power Station Company Ltd. (APSCL) \n- Electricity Generation Company of Bangladesh (EGCB) \n- North West Power Generation Company Ltd. (NWPGCL) \n- West Zone Power Distribution Company Ltd. (WZPDCL)\n\nThe BPDB is responsible for major portion of generation and distribution of electricity mainly\n in urban areas except Dhaka and West Zone of the country. The Board is under the Power \nDivision of the Ministry of power, Energy and Mineral Resources, Government of Bangladesh.\nBPDB has taken a massive capacity expansion plan to add about 12000 MW Generation capacity\n in next 5 years and about 25000 MW by 2021 with the aim to provide quality and reliable \nelectricity to all the people of Country for desired economic and social development. The power \nsystem has been expanded to keep pace with the fast growing demand.\n\n\n\n                                                    www.bpdb.bd.com\n");
        known.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(known);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(out, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(out)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outActionPerformed
    setVisible(false);
    dispose();
   // new ABOUTFrame().setVisible(true);
}//GEN-LAST:event_outActionPerformed

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
            java.util.logging.Logger.getLogger(KnownFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KnownFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KnownFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KnownFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new KnownFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea known;
    private javax.swing.JButton out;
    // End of variables declaration//GEN-END:variables
}
