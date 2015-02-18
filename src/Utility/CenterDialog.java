

package Utility;

import java.awt.BorderLayout;
import javax.swing.JPanel;


public class CenterDialog extends javax.swing.JDialog {

    public Tracer tracer;

    public CenterDialog(java.awt.Frame parent, boolean modal, String title) {
        super(parent, modal);
        initComponents();
        this.setLocation(Utility.getWindowPosition(this.getSize(),this.getToolkit()));
        setTitle(title);
        tracer = new Tracer(title,tracerLabel);
        
    }

    public void showDialog(JPanel panel){
        
        dialogPanel.setLayout(new BorderLayout(0,0));
        dialogPanel.add("Center",panel);
        setVisible(true);

    }

    public JPanel getDialogPanel(){
        return dialogPanel;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogPanel = new javax.swing.JPanel();
        fGTracerPanel = new javax.swing.JPanel();
        tracerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout dialogPanelLayout = new javax.swing.GroupLayout(dialogPanel);
        dialogPanel.setLayout(dialogPanelLayout);
        dialogPanelLayout.setHorizontalGroup(
            dialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 857, Short.MAX_VALUE)
        );
        dialogPanelLayout.setVerticalGroup(
            dialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        fGTracerPanel.setBackground(new java.awt.Color(255, 255, 255));

        tracerLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tracerLabel.setForeground(new java.awt.Color(0, 51, 102));
        tracerLabel.setText("Tracer");

        javax.swing.GroupLayout fGTracerPanelLayout = new javax.swing.GroupLayout(fGTracerPanel);
        fGTracerPanel.setLayout(fGTracerPanelLayout);
        fGTracerPanelLayout.setHorizontalGroup(
            fGTracerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fGTracerPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tracerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(497, Short.MAX_VALUE))
        );
        fGTracerPanelLayout.setVerticalGroup(
            fGTracerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fGTracerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tracerLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fGTracerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dialogPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fGTracerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dialogPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                CenterDialog dialog = new CenterDialog(new javax.swing.JFrame(), true , "hihhi");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dialogPanel;
    private javax.swing.JPanel fGTracerPanel;
    private javax.swing.JLabel tracerLabel;
    // End of variables declaration//GEN-END:variables



}
