package bpdbapplication;

import Utility.AboutDialog;
import Utility.User;
import Utility.Utility2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.jvnet.substance.skin.*;

public class LoginFrame extends javax.swing.JFrame {

    public LoginFrame() {

        setTitle("Developed By Man Group ...Mezba... Asif... Nannu...");
        initComponents();

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
        // time.setText("  TIME " + User.name + "& " + User.name + "DATE " + date.toLocaleString());
        time.setText("" + date.toLocaleString());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        photo = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        usrField = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        time = new javax.swing.JLabel();
        bpdb = new javax.swing.JLabel();
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
        About = new javax.swing.JMenu();
        me = new javax.swing.JMenuItem();
        software = new javax.swing.JMenuItem();
        use = new javax.swing.JMenuItem();
        userm = new javax.swing.JMenuItem();
        passwordm = new javax.swing.JMenuItem();
        File1 = new javax.swing.JMenu();
        exit1 = new javax.swing.JMenuItem();
        about = new javax.swing.JMenu();
        BPDB = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        photo.setBackground(new java.awt.Color(0, 51, 51));
        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login.png"))); // NOI18N
        photo.setToolTipText("BPDB \"SYLHET\" OFFICE");
        photo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        user.setFont(new java.awt.Font("Tahoma", 0, 14));
        user.setText("User");

        usrField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrFieldActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Tahoma", 0, 14));
        password.setText("Password");

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        login.setFont(new java.awt.Font("Tahoma", 1, 12));
        login.setForeground(new java.awt.Color(0, 0, 204));
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login a.png"))); // NOI18N
        login.setText("Login");
        login.setToolTipText("click Here");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        time.setFont(new java.awt.Font("Tahoma", 1, 14));
        time.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/kworldclock.png"))); // NOI18N

        bpdb.setFont(new java.awt.Font("Tahoma", 1, 14));
        bpdb.setText("Bangladesh Power Development Board                               www.bpdb.bd.com");
        bpdb.setToolTipText("visit www.bpdb.bd.com");

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

        About.setText("About");

        me.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        me.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/me.png"))); // NOI18N
        me.setText("me");
        me.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meActionPerformed(evt);
            }
        });
        About.add(me);

        software.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        software.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/software.png"))); // NOI18N
        software.setText("Software");
        software.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                softwareActionPerformed(evt);
            }
        });
        About.add(software);

        use.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        use.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/use.png"))); // NOI18N
        use.setText("How to use");
        use.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useActionPerformed(evt);
            }
        });
        About.add(use);

        userm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        userm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N
        userm.setText("Who user");
        userm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usermActionPerformed(evt);
            }
        });
        About.add(userm);

        passwordm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        passwordm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lock.png"))); // NOI18N
        passwordm.setText("Password");
        passwordm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordmActionPerformed(evt);
            }
        });
        About.add(passwordm);

        jMenuBar1.add(About);

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(photo)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(usrField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(password)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(passwordField)))
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bpdb, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(bpdb)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usrField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(password)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addComponent(login))
                    .addComponent(photo))
                .addGap(60, 60, 60)
                .addComponent(time)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
    login();
}//GEN-LAST:event_loginActionPerformed

private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
    int sd = JOptionPane.showConfirmDialog(this, "Are you sure?");
    if (sd == 0) {
        setVisible(false);
        dispose();
        System.exit(0);

    }
}//GEN-LAST:event_exitActionPerformed

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
            //new LoginFrame().setVisible(true);
            setVisible(false);
            dispose();
            new LoginFrame().setVisible(true);

        }
    });
}//GEN-LAST:event_AutumnActionPerformed

private void BusinessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusinessActionPerformed
    JFrame.setDefaultLookAndFeelDecorated(true);
    JDialog.setDefaultLookAndFeelDecorated(true);
    try {
        //UIManager.setLookAndFeel(new SubstanceOfficeBlue2007LookAndFeel());
        //UIManager.setLookAndFeel(new SubstanceBusinessLookAndFeel());
        UIManager.setLookAndFeel(new SubstanceRavenGraphiteLookAndFeel());
    } catch (Exception e) {
    }
    javax.swing.SwingUtilities.invokeLater(new Runnable() {

        @Override
        public void run() {
            //new LoginFrame().setVisible(true);
            setVisible(false);
            dispose();
            new LoginFrame().setVisible(true);
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
            //new LoginFrame().setVisible(true);
            setVisible(false);
            dispose();
            new LoginFrame().setVisible(true);
        }
    });
}//GEN-LAST:event_CremeActionPerformed

private void undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_undoActionPerformed

private void cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_cutActionPerformed

private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_copyActionPerformed

private void meActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meActionPerformed
// TODO add your handling code here:
    new AboutDialog(this, true).setVisible(true);

}//GEN-LAST:event_meActionPerformed

private void softwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_softwareActionPerformed
// TODO add your handling code here:
    new SoftwareDialog(this, true).setVisible(true);
}//GEN-LAST:event_softwareActionPerformed

private void useActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useActionPerformed
// TODO add your handling code here:
    new USEFrame().setVisible(true);
}//GEN-LAST:event_useActionPerformed

private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
// TODO add your handling code here:
    new USEFrame().setVisible(true);
}//GEN-LAST:event_exit1ActionPerformed

private void BPDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPDBActionPerformed
// TODO add your handling code here:
    setVisible(false);
    dispose();
    new ABOUTFrame().setVisible(true);
}//GEN-LAST:event_BPDBActionPerformed

private void pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_pasteActionPerformed

private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_deleteActionPerformed

private void usermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usermActionPerformed
// TODO add your handling code here:
    new USERFrame().setVisible(true);
}//GEN-LAST:event_usermActionPerformed

private void passwordmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordmActionPerformed
// TODO add your handling code here:
    new PASSFrame().setVisible(true);
}//GEN-LAST:event_passwordmActionPerformed

private void use1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_use1ActionPerformed
// TODO add your handling code here:
    JFrame.setDefaultLookAndFeelDecorated(true);
    JDialog.setDefaultLookAndFeelDecorated(true);
    try {
        UIManager.setLookAndFeel(new SubstanceOfficeBlue2007LookAndFeel());
        // UIManager.setLookAndFeel(new SubstanceModerateLookAndFeel());
    } catch (Exception e) {
    }
    javax.swing.SwingUtilities.invokeLater(new Runnable() {

        @Override
        public void run() {
            //  new LoginFrame().setVisible(true);
            setVisible(false);
            dispose();
            new LoginFrame().setVisible(true);
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
            //new LoginFrame().setVisible(true);
            setVisible(false);
            dispose();
            new LoginFrame().setVisible(true);
        }
    });
}//GEN-LAST:event_use2ActionPerformed

private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
// TODO add your handling code here:
//    setVisible(false);
    //  dispose();
    new ABOUTFrame().setVisible(true);
}//GEN-LAST:event_aboutActionPerformed

private void usrFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrFieldActionPerformed
// TODO add your handling code here:
    login();
}//GEN-LAST:event_usrFieldActionPerformed

private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
// TODO add your handling code here:
    login();
}//GEN-LAST:event_passwordFieldActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu About;
    private javax.swing.JMenuItem Autumn;
    private javax.swing.JMenuItem BPDB;
    private javax.swing.JMenuItem Business;
    private javax.swing.JMenuItem Creme;
    private javax.swing.JMenu Edit;
    private javax.swing.JMenu File;
    private javax.swing.JMenu File1;
    private javax.swing.JMenu View;
    private javax.swing.JMenu about;
    private javax.swing.JLabel bpdb;
    private javax.swing.JMenuItem copy;
    private javax.swing.JMenuItem cut;
    private javax.swing.JMenuItem delete;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem exit1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton login;
    private javax.swing.JMenuItem me;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JMenuItem passwordm;
    private javax.swing.JMenuItem paste;
    private javax.swing.JLabel photo;
    private javax.swing.JMenuItem software;
    private javax.swing.JLabel time;
    private javax.swing.JMenuItem undo;
    private javax.swing.JMenuItem use;
    private javax.swing.JMenuItem use1;
    private javax.swing.JMenuItem use2;
    private javax.swing.JLabel user;
    private javax.swing.JMenuItem userm;
    private javax.swing.JTextField usrField;
    // End of variables declaration//GEN-END:variables

    private void login() {
        if (usrField.getText().equals("") || passwordField.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane,
                    "YOU MUST ENTER USER AND PASSWORD",
                    "ERROR",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        //User.ID = userField.getText();
        User.ID = "BPDB";

        //User.password = passwordField.getText();

        User.password = "BPDB";


        //String sql = "SELECT desig FROM BPDB.usr WHERE name = '" + userField.getText() + "',"and" +passwordField.getText() +"'";

        String sql = "select desig from BPDB.usr where name='" + usrField.getText()
                + "' and password='" + passwordField.getText() + "'";

        User.desig = Utility2.singleStOPQuery(login, sql);
        System.out.println("Designation : " + User.desig);
        if (User.desig.isEmpty()) {


            JOptionPane.showMessageDialog(rootPane,
                    "YOU MUST ENTER USER AND PASSWORD",
                    "ERROR",
                    JOptionPane.WARNING_MESSAGE);
            return;
        } else {

            sql = "SELECT name FROM BPDB.usr WHERE name = '" + usrField.getText() + "'";
            User.name = Utility2.singleStOPQuery(login, sql);

            if (User.desig.equalsIgnoreCase("BPDB")) {
                setVisible(false);
                dispose();
                new HomeFrame().setVisible(true);

            } else if (User.desig.equalsIgnoreCase("DRAFT")) {
                setVisible(false);
                dispose();
                new DRAFTFrame().setVisible(true);
            } else if (User.desig.equalsIgnoreCase("APPLY")) {
                setVisible(false);
                dispose();
                new APPLYFrame().setVisible(true);

            } else if (User.desig.equalsIgnoreCase("HR")) {
                setVisible(false);
                dispose();
                new HRFrame().setVisible(true);

            } else if (User.desig.equalsIgnoreCase("ADMIN")) {
                setVisible(false);
                dispose();
                new ADMINFrame().setVisible(true);
            } else if (User.desig.equalsIgnoreCase("ACCOUNT")) {
                setVisible(false);
                dispose();
                new ACCOUNTFrame().setVisible(true);
            } else if (User.desig.equalsIgnoreCase("SALARY")) {
                setVisible(false);
                dispose();
                new SALARYFrame().setVisible(true);
            } else if (User.desig.equalsIgnoreCase("BILLING")) {
                setVisible(false);
                dispose();
                new BILLINGFrame().setVisible(true);
            } else if (User.desig.equalsIgnoreCase("DISTRIBUTION")) {
                setVisible(false);
                dispose();
                new DISTRIBUTIONFrame().setVisible(true);
            } else if (User.desig.equalsIgnoreCase("GENERATION")) {
                setVisible(false);
                dispose();
                new GENERATIONFrame().setVisible(true);

            } else if (User.desig.equalsIgnoreCase("DHAKA")) {
                setVisible(false);
                dispose();
                new DHAKAFrame().setVisible(true);
            } else if (User.desig.equalsIgnoreCase("KHULNA")) {
                setVisible(false);
                dispose();
                new KHULNAFrame().setVisible(true);
            } else if (User.desig.equalsIgnoreCase("RAUJAN")) {
                setVisible(false);
                dispose();
                new RAUJANFrame().setVisible(true);
            } else if (User.desig.equalsIgnoreCase("SHIDDERGANJ")) {
                setVisible(false);
                dispose();
                new SHIDDERGANJFrame().setVisible(true);
            } else if (User.desig.equalsIgnoreCase("GRASHAL")) {
                setVisible(false);
                dispose();
                new GRASHALFrame().setVisible(true);
            }
        }
    }
}