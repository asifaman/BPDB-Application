

package Utility;

import Utility.*;
import java.awt.BorderLayout;

public class LoadPanel extends javax.swing.JPanel {

    Tracer tracer;
    javax.swing.JPanel lPan;


    public LoadPanel() {
        initComponents();
   
        lPanel.setLayout(new BorderLayout(0,0));
        lPanel.add("Center",lPan);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupFolioPanel = new javax.swing.JPanel();
        tracerPanel = new javax.swing.JPanel();
        tracerLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lPanel = new javax.swing.JPanel();

        tracerPanel.setBackground(new java.awt.Color(255, 255, 255));

        tracerLabel.setFont(new java.awt.Font("Tahoma", 1, 12));
        tracerLabel.setForeground(new java.awt.Color(0, 51, 102));
        tracerLabel.setText("Tracer");

        javax.swing.GroupLayout tracerPanelLayout = new javax.swing.GroupLayout(tracerPanel);
        tracerPanel.setLayout(tracerPanelLayout);
        tracerPanelLayout.setHorizontalGroup(
            tracerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tracerPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tracerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(347, Short.MAX_VALUE))
        );
        tracerPanelLayout.setVerticalGroup(
            tracerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tracerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tracerLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout lPanelLayout = new javax.swing.GroupLayout(lPanel);
        lPanel.setLayout(lPanelLayout);
        lPanelLayout.setHorizontalGroup(
            lPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
        );
        lPanelLayout.setVerticalGroup(
            lPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(lPanel);

        javax.swing.GroupLayout groupFolioPanelLayout = new javax.swing.GroupLayout(groupFolioPanel);
        groupFolioPanel.setLayout(groupFolioPanelLayout);
        groupFolioPanelLayout.setHorizontalGroup(
            groupFolioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tracerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(groupFolioPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                .addContainerGap())
        );
        groupFolioPanelLayout.setVerticalGroup(
            groupFolioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupFolioPanelLayout.createSequentialGroup()
                .addComponent(tracerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(groupFolioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(groupFolioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel groupFolioPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel lPanel;
    private javax.swing.JLabel tracerLabel;
    private javax.swing.JPanel tracerPanel;
    // End of variables declaration//GEN-END:variables


    public void setIFTracer(String title){
        tracerLabel.setText(title);
    }


    public javax.swing.JPanel getLPanel(){
        return lPanel;
    }

    public javax.swing.JPanel getLPan(){
        return lPan;
    }


}
