package bpdbapplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import org.jvnet.substance.skin.SubstanceAutumnLookAndFeel;
import org.jvnet.substance.skin.SubstanceCremeCoffeeLookAndFeel;
import org.jvnet.substance.skin.SubstanceOfficeBlue2007LookAndFeel;
import org.jvnet.substance.skin.SubstanceOfficeSilver2007LookAndFeel;
import org.jvnet.substance.skin.SubstanceRavenGraphiteLookAndFeel;

public class GENERATIONFrame extends javax.swing.JFrame {

    public GENERATIONFrame() {
        initComponents();
        //this.setExtendedState(this.getExtendedState()|Frame.MAXIMIZED_BOTH);



        javax.swing.Timer t;
        t = new javax.swing.Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setDate();
            }
        });
        t.start();
    }

    public void setDate() {
        Date date = new Date();
        //  time.setText("  TIME " + User.name + "AND " + User.desig + "DATE " + date.toLocaleString());
        time.setText("" + date.toLocaleString());


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        a6 = new javax.swing.JLabel();
        G1 = new Utility.SLabel();
        G2 = new Utility.SLabel();
        G3 = new Utility.SLabel();
        G4 = new Utility.SLabel();
        G5 = new Utility.SLabel();
        G6 = new Utility.SLabel();
        photo = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        DHAKAButton = new javax.swing.JButton();
        KHULNAButton = new javax.swing.JButton();
        GRASHALButton = new javax.swing.JButton();
        RAUJANButton = new javax.swing.JButton();
        SHIDDERGANJButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        undo = new javax.swing.JMenuItem();
        cut = new javax.swing.JMenuItem();
        copy = new javax.swing.JMenuItem();
        paste = new javax.swing.JMenuItem();
        delete = new javax.swing.JMenuItem();
        View = new javax.swing.JMenu();
        Autumn = new javax.swing.JMenuItem();
        Business = new javax.swing.JMenuItem();
        Creme = new javax.swing.JMenuItem();
        use1 = new javax.swing.JMenuItem();
        use2 = new javax.swing.JMenuItem();
        File1 = new javax.swing.JMenu();
        exit1 = new javax.swing.JMenuItem();
        about = new javax.swing.JMenu();
        BPDB = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(255, 255, 204));

        Panel1.setBackground(new java.awt.Color(255, 255, 204));
        Panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        a6.setFont(new java.awt.Font("Tahoma", 1, 18));
        a6.setForeground(new java.awt.Color(0, 0, 255));
        a6.setText("MENU ");
        a6.setToolTipText("see the menu item");
        a6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a6MouseClicked(evt);
            }
        });

        G1.setText("DHAKA");
        G1.setToolTipText("Dhaka power station");
        G1.setFont(new java.awt.Font("Tahoma", 1, 12));
        G1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G1MouseClicked(evt);
            }
        });

        G2.setText("KHULNA");
        G2.setToolTipText("khulna power station");
        G2.setFont(new java.awt.Font("Tahoma", 1, 12));
        G2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G2MouseClicked(evt);
            }
        });

        G3.setText("GRASHAL");
        G3.setToolTipText("grashal power station");
        G3.setFont(new java.awt.Font("Tahoma", 1, 12));
        G3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G3MouseClicked(evt);
            }
        });

        G4.setText("RAUJAN");
        G4.setToolTipText("Raujan power station");
        G4.setFont(new java.awt.Font("Tahoma", 1, 12));
        G4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G4MouseClicked(evt);
            }
        });

        G5.setText("SHIDDRGANJ");
        G5.setToolTipText("shidderganj power station");
        G5.setFont(new java.awt.Font("Tahoma", 1, 12));
        G5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G5MouseClicked(evt);
            }
        });

        G6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        G6.setForeground(new java.awt.Color(0, 0, 255));
        G6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout a.png"))); // NOI18N
        G6.setText("Log out");
        G6.setToolTipText("Back to login Frame");
        G6.setFont(new java.awt.Font("Tahoma", 1, 12));
        G6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(G6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(G5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a6))
                        .addGap(54, 54, 54))))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addComponent(a6)
                .addGap(26, 26, 26)
                .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(G4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(G5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(G6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/generaton.png"))); // NOI18N
        photo.setToolTipText("electricty Distribution Line");
        photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        time.setFont(new java.awt.Font("Tahoma", 1, 18));

        DHAKAButton.setBackground(new java.awt.Color(255, 255, 204));
        DHAKAButton.setText("DHAKA");
        DHAKAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DHAKAButtonActionPerformed(evt);
            }
        });

        KHULNAButton.setBackground(new java.awt.Color(255, 255, 204));
        KHULNAButton.setText("KHULNA");
        KHULNAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KHULNAButtonActionPerformed(evt);
            }
        });

        GRASHALButton.setBackground(new java.awt.Color(255, 255, 204));
        GRASHALButton.setText("GRASHAL");
        GRASHALButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GRASHALButtonActionPerformed(evt);
            }
        });

        RAUJANButton.setBackground(new java.awt.Color(255, 255, 204));
        RAUJANButton.setText("RAUJAN");
        RAUJANButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RAUJANButtonActionPerformed(evt);
            }
        });

        SHIDDERGANJButton.setBackground(new java.awt.Color(255, 255, 204));
        SHIDDERGANJButton.setText("SHIDDERGANJ");
        SHIDDERGANJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SHIDDERGANJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(DHAKAButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KHULNAButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GRASHALButton, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RAUJANButton, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SHIDDERGANJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 486, Short.MAX_VALUE)
                    .addComponent(time, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DHAKAButton)
                    .addComponent(KHULNAButton)
                    .addComponent(GRASHALButton)
                    .addComponent(RAUJANButton)
                    .addComponent(SHIDDERGANJButton))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        File.setText("File");

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.png"))); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        File.add(exit);

        jMenuBar1.add(File);

        Edit.setText("Edit");

        undo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        undo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/undo.png"))); // NOI18N
        undo.setText("Undo");
        undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoActionPerformed(evt);
            }
        });
        Edit.add(undo);

        cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cut.png"))); // NOI18N
        cut.setText("Cut");
        cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutActionPerformed(evt);
            }
        });
        Edit.add(cut);

        copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/copy.png"))); // NOI18N
        copy.setText("Copy");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
        Edit.add(copy);

        paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        paste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/paste.png"))); // NOI18N
        paste.setText("Paste");
        paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteActionPerformed(evt);
            }
        });
        Edit.add(paste);

        delete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        Edit.add(delete);

        jMenuBar1.add(Edit);

        View.setText("View");

        Autumn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        Autumn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bell.png"))); // NOI18N
        Autumn.setText("Autumn");
        Autumn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutumnActionPerformed(evt);
            }
        });
        View.add(Autumn);

        Business.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK));
        Business.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/business.png"))); // NOI18N
        Business.setText("Business");
        Business.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusinessActionPerformed(evt);
            }
        });
        View.add(Business);

        Creme.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        Creme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/agent.png"))); // NOI18N
        Creme.setText("Creme");
        Creme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CremeActionPerformed(evt);
            }
        });
        View.add(Creme);

        use1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        use1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/chat.png"))); // NOI18N
        use1.setText("Moderate");
        use1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                use1ActionPerformed(evt);
            }
        });
        View.add(use1);

        use2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        use2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/silver.png"))); // NOI18N
        use2.setText("Silver");
        use2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                use2ActionPerformed(evt);
            }
        });
        View.add(use2);

        jMenuBar1.add(View);

        exit1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        exit1.setText("Exit");
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });
        File1.add(exit1);

        jMenuBar1.add(File1);

        about.setText("Help");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });

        BPDB.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        BPDB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/help.png"))); // NOI18N
        BPDB.setText("BPDB");
        BPDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPDBActionPerformed(evt);
            }
        });
        about.add(BPDB);

        jMenuBar1.add(about);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void DHAKAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DHAKAButtonActionPerformed
    setVisible(false);
    dispose();
    new DHAKAFrame().setVisible(true);
}//GEN-LAST:event_DHAKAButtonActionPerformed

private void KHULNAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KHULNAButtonActionPerformed
    setVisible(false);
    dispose();
    new KHULNAFrame().setVisible(true);
}//GEN-LAST:event_KHULNAButtonActionPerformed

private void GRASHALButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GRASHALButtonActionPerformed
    setVisible(false);
    dispose();
    new GRASHALFrame().setVisible(true);
}//GEN-LAST:event_GRASHALButtonActionPerformed

private void RAUJANButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RAUJANButtonActionPerformed
    setVisible(false);
    dispose();
    new RAUJANFrame().setVisible(true);
}//GEN-LAST:event_RAUJANButtonActionPerformed

private void SHIDDERGANJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SHIDDERGANJButtonActionPerformed
    setVisible(false);
    dispose();
    new SHIDDERGANJFrame().setVisible(true);
}//GEN-LAST:event_SHIDDERGANJButtonActionPerformed

private void a6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a6MouseClicked
// TODO add your handling code here:
}//GEN-LAST:event_a6MouseClicked

private void G1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G1MouseClicked
    // TODO add your handling code here:
    setVisible(false);
    dispose();
    new DHAKAFrame().setVisible(true);

}//GEN-LAST:event_G1MouseClicked

private void G2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G2MouseClicked
// TODO add your handling code here:
    setVisible(false);
    dispose();
    new KHULNAFrame().setVisible(true);
}//GEN-LAST:event_G2MouseClicked

private void G3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G3MouseClicked
// TODO add your handling code here:
    setVisible(false);
    dispose();
    new GRASHALFrame().setVisible(true);
}//GEN-LAST:event_G3MouseClicked

private void G4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G4MouseClicked
// TODO add your handling code here:
    setVisible(false);
    dispose();
    new RAUJANFrame().setVisible(true);
}//GEN-LAST:event_G4MouseClicked

private void G5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G5MouseClicked
// TODO add your handling code here:
    setVisible(false);
    dispose();
    new SHIDDERGANJFrame().setVisible(true);
}//GEN-LAST:event_G5MouseClicked

private void G6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G6MouseClicked
// TODO add your handling code here:
    setVisible(false);
    dispose();
    new LoginFrame().setVisible(true);
}//GEN-LAST:event_G6MouseClicked

private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
    setVisible(false);
    dispose();
    new LoginFrame().setVisible(true);
}//GEN-LAST:event_exitActionPerformed

private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_undoActionPerformed

private void cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_cutActionPerformed

private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_copyActionPerformed

private void pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_pasteActionPerformed

private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_deleteActionPerformed

private void AutumnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutumnActionPerformed

    JFrame.setDefaultLookAndFeelDecorated(true);
    JDialog.setDefaultLookAndFeelDecorated(true);
    try {
        UIManager.setLookAndFeel(new SubstanceAutumnLookAndFeel());
    } catch (Exception e) {
    }

    javax.swing.SwingUtilities.invokeLater(new Runnable() {

        @Override
        public void run() {
            setVisible(false);
            dispose();
            new GENERATIONFrame().setVisible(true);
        }
    });
}//GEN-LAST:event_AutumnActionPerformed

private void BusinessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusinessActionPerformed
    JFrame.setDefaultLookAndFeelDecorated(true);
    JDialog.setDefaultLookAndFeelDecorated(true);
    try {
        //UIManager.setLookAndFeel(new SubstanceBusinessLookAndFeel());
         UIManager.setLookAndFeel(new SubstanceRavenGraphiteLookAndFeel());
    } catch (Exception e) {
    }
    javax.swing.SwingUtilities.invokeLater(new Runnable() {

        @Override
        public void run() {
            setVisible(false);
            dispose();
            new GENERATIONFrame().setVisible(true);
        }
    });
}//GEN-LAST:event_BusinessActionPerformed

private void CremeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CremeActionPerformed
    JFrame.setDefaultLookAndFeelDecorated(true);
    JDialog.setDefaultLookAndFeelDecorated(true);
    try {
        UIManager.setLookAndFeel(new SubstanceCremeCoffeeLookAndFeel());
    } catch (Exception e) {
    }
    javax.swing.SwingUtilities.invokeLater(new Runnable() {

        @Override
        public void run() {
            setVisible(false);
            dispose();
            new GENERATIONFrame().setVisible(true);
        }
    });
}//GEN-LAST:event_CremeActionPerformed

private void use1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_use1ActionPerformed
// TODO add your handling code here:
    JFrame.setDefaultLookAndFeelDecorated(true);
    JDialog.setDefaultLookAndFeelDecorated(true);
    try {
       // UIManager.setLookAndFeel(new SubstanceModerateLookAndFeel());
        UIManager.setLookAndFeel(new SubstanceOfficeBlue2007LookAndFeel());
    } catch (Exception e) {
    }
    javax.swing.SwingUtilities.invokeLater(new Runnable() {

        @Override
        public void run() {
            setVisible(false);
            dispose();
            new GENERATIONFrame().setVisible(true);
        }
    });
}//GEN-LAST:event_use1ActionPerformed

private void use2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_use2ActionPerformed
// TODO add your handling code here:
    JFrame.setDefaultLookAndFeelDecorated(true);
    JDialog.setDefaultLookAndFeelDecorated(true);
    try {
        UIManager.setLookAndFeel(new SubstanceOfficeSilver2007LookAndFeel());
    } catch (Exception e) {
    }
    javax.swing.SwingUtilities.invokeLater(new Runnable() {

        @Override
        public void run() {
            setVisible(false);
            dispose();
            new GENERATIONFrame().setVisible(true);
        }
    });
}//GEN-LAST:event_use2ActionPerformed

private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
// TODO add your handling code here:
    new USEFrame().setVisible(true);
}//GEN-LAST:event_exit1ActionPerformed

private void BPDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPDBActionPerformed
// TODO add your handling code here:
    //new ABOUTFrame().setVisible(true);
}//GEN-LAST:event_BPDBActionPerformed

private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
// TODO add your handling code here:
    //  new ABOUTFrame().setVisible(true);
}//GEN-LAST:event_aboutActionPerformed

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
            java.util.logging.Logger.getLogger(GENERATIONFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GENERATIONFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GENERATIONFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GENERATIONFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new GENERATIONFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Autumn;
    private javax.swing.JMenuItem BPDB;
    private javax.swing.JMenuItem Business;
    private javax.swing.JMenuItem Creme;
    private javax.swing.JButton DHAKAButton;
    private javax.swing.JMenu Edit;
    private javax.swing.JMenu File;
    private javax.swing.JMenu File1;
    private Utility.SLabel G1;
    private Utility.SLabel G2;
    private Utility.SLabel G3;
    private Utility.SLabel G4;
    private Utility.SLabel G5;
    private Utility.SLabel G6;
    private javax.swing.JButton GRASHALButton;
    private javax.swing.JButton KHULNAButton;
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton RAUJANButton;
    private javax.swing.JButton SHIDDERGANJButton;
    private javax.swing.JMenu View;
    private javax.swing.JLabel a6;
    private javax.swing.JMenu about;
    private javax.swing.JMenuItem copy;
    private javax.swing.JMenuItem cut;
    private javax.swing.JMenuItem delete;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem exit1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem paste;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel time;
    private javax.swing.JMenuItem undo;
    private javax.swing.JMenuItem use1;
    private javax.swing.JMenuItem use2;
    // End of variables declaration//GEN-END:variables
}
