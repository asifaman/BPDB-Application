package bpdbapplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.jvnet.substance.skin.SubstanceAutumnLookAndFeel;
import org.jvnet.substance.skin.SubstanceCremeCoffeeLookAndFeel;
import org.jvnet.substance.skin.SubstanceOfficeBlue2007LookAndFeel;
import org.jvnet.substance.skin.SubstanceOfficeSilver2007LookAndFeel;
import org.jvnet.substance.skin.SubstanceRavenGraphiteLookAndFeel;

public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {
        initComponents();
        setTitle(" "
                + "                                              OnLy admin can access all the Department Information");
        //this.setExtendedState(this.getExtendedState() | Frame.MAXIMIZED_BOTH);
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
        //time.setText("  TIME " + User.name + "AND " + User.desig + "DATE " + date.toLocaleString());
        time.setText("" + date.toLocaleString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        MENU = new Utility.SLabel();
        Panel2 = new javax.swing.JPanel();
        GENERATION = new Utility.SLabel();
        APPLY = new Utility.SLabel();
        HR = new Utility.SLabel();
        ADMIN = new Utility.SLabel();
        ACCOUNT = new Utility.SLabel();
        SALARY = new Utility.SLabel();
        BILLING = new Utility.SLabel();
        DISTRIBUTION = new Utility.SLabel();
        DRAFT = new Utility.SLabel();
        photo = new javax.swing.JLabel();
        APPLYButton = new javax.swing.JButton();
        HRButton = new javax.swing.JButton();
        ADMINButton = new javax.swing.JButton();
        ACCOUNTButton = new javax.swing.JButton();
        SALARYButton = new javax.swing.JButton();
        LOGOUTButton = new javax.swing.JButton();
        GENERATIONButton = new javax.swing.JButton();
        DISTRIBUTIONButton = new javax.swing.JButton();
        BILLINGButton = new javax.swing.JButton();
        TITLE = new javax.swing.JLabel();
        Createutton = new javax.swing.JButton();
        time = new javax.swing.JLabel();
        DRAFTButtion = new javax.swing.JButton();
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
        setBackground(new java.awt.Color(255, 255, 204));

        menuPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Panel1.setBackground(new java.awt.Color(255, 153, 153));
        Panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MENU.setText("MENU");
        MENU.setToolTipText("see the menu item");
        MENU.setFont(new java.awt.Font("Tahoma", 1, 12));
        MENU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MENUMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(MENU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(MENU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Panel2.setBackground(new java.awt.Color(253, 153, 153));
        Panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        GENERATION.setText("GENERATION");
        GENERATION.setToolTipText("click For generation information");
        GENERATION.setFont(new java.awt.Font("Tahoma", 1, 12));
        GENERATION.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GENERATIONMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(GENERATION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(GENERATION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        APPLY.setText("APPLY");
        APPLY.setToolTipText("click For apply information");
        APPLY.setFont(new java.awt.Font("Tahoma", 1, 12));
        APPLY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                APPLYMouseClicked(evt);
            }
        });

        HR.setText("HR");
        HR.setToolTipText("click For HR information");
        HR.setFont(new java.awt.Font("Tahoma", 1, 12));
        HR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HRMouseClicked(evt);
            }
        });

        ADMIN.setText("ADMIN");
        ADMIN.setToolTipText("click For admin information");
        ADMIN.setFont(new java.awt.Font("Tahoma", 1, 12));
        ADMIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADMINMouseClicked(evt);
            }
        });

        ACCOUNT.setText("ACCOUNT");
        ACCOUNT.setToolTipText("click For account information");
        ACCOUNT.setFont(new java.awt.Font("Tahoma", 1, 12));
        ACCOUNT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ACCOUNTMouseClicked(evt);
            }
        });

        SALARY.setText("SALARY");
        SALARY.setToolTipText("click For salary information");
        SALARY.setFont(new java.awt.Font("Tahoma", 1, 12));
        SALARY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SALARYMouseClicked(evt);
            }
        });

        BILLING.setText("BILLING");
        BILLING.setToolTipText("click For Billing information");
        BILLING.setFont(new java.awt.Font("Tahoma", 1, 12));
        BILLING.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BILLINGMouseClicked(evt);
            }
        });

        DISTRIBUTION.setText("DISTRIBUTION");
        DISTRIBUTION.setToolTipText("click For Distribution information");
        DISTRIBUTION.setFont(new java.awt.Font("Tahoma", 1, 12));
        DISTRIBUTION.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DISTRIBUTIONMouseClicked(evt);
            }
        });

        DRAFT.setText("DRAFT");
        DRAFT.setToolTipText("click For Draft information");
        DRAFT.setFont(new java.awt.Font("Tahoma", 1, 12));
        DRAFT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DRAFTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DRAFT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DISTRIBUTION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADMIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ACCOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(APPLY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SALARY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BILLING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(DRAFT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(APPLY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(ADMIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ACCOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SALARY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BILLING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DISTRIBUTION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home.png"))); // NOI18N
        photo.setToolTipText("power generation processing");
        photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        APPLYButton.setBackground(new java.awt.Color(255, 255, 204));
        APPLYButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        APPLYButton.setText("APPLY");
        APPLYButton.setToolTipText("apply");
        APPLYButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APPLYButtonActionPerformed(evt);
            }
        });

        HRButton.setBackground(new java.awt.Color(255, 255, 204));
        HRButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        HRButton.setText("HR");
        HRButton.setToolTipText("HR");
        HRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HRButtonActionPerformed(evt);
            }
        });

        ADMINButton.setBackground(new java.awt.Color(255, 255, 204));
        ADMINButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        ADMINButton.setText("ADMIN");
        ADMINButton.setToolTipText("admin");
        ADMINButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMINButtonActionPerformed(evt);
            }
        });

        ACCOUNTButton.setBackground(new java.awt.Color(255, 255, 204));
        ACCOUNTButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        ACCOUNTButton.setText("ACCOUNT");
        ACCOUNTButton.setToolTipText("account");
        ACCOUNTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACCOUNTButtonActionPerformed(evt);
            }
        });

        SALARYButton.setBackground(new java.awt.Color(255, 255, 204));
        SALARYButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        SALARYButton.setText("SALARY");
        SALARYButton.setToolTipText("salary");
        SALARYButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALARYButtonActionPerformed(evt);
            }
        });

        LOGOUTButton.setBackground(new java.awt.Color(255, 255, 204));
        LOGOUTButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        LOGOUTButton.setText("LOGOUT");
        LOGOUTButton.setToolTipText("logout");
        LOGOUTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGOUTButtonActionPerformed(evt);
            }
        });

        GENERATIONButton.setBackground(new java.awt.Color(255, 255, 204));
        GENERATIONButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        GENERATIONButton.setText("GENERATION");
        GENERATIONButton.setToolTipText("Generation");
        GENERATIONButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GENERATIONButtonActionPerformed(evt);
            }
        });

        DISTRIBUTIONButton.setBackground(new java.awt.Color(255, 255, 204));
        DISTRIBUTIONButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        DISTRIBUTIONButton.setText("DISTRIBUTION");
        DISTRIBUTIONButton.setToolTipText("Distribution");
        DISTRIBUTIONButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DISTRIBUTIONButtonActionPerformed(evt);
            }
        });

        BILLINGButton.setBackground(new java.awt.Color(255, 255, 204));
        BILLINGButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        BILLINGButton.setText("BILLING");
        BILLINGButton.setToolTipText("Billing");
        BILLINGButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BILLINGButtonActionPerformed(evt);
            }
        });

        Createutton.setBackground(new java.awt.Color(255, 255, 204));
        Createutton.setFont(new java.awt.Font("Tahoma", 1, 11));
        Createutton.setText("CREATE USER");
        Createutton.setToolTipText("create user");
        Createutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateuttonActionPerformed(evt);
            }
        });

        time.setFont(new java.awt.Font("Tahoma", 1, 24));
        time.setForeground(new java.awt.Color(255, 153, 153));

        DRAFTButtion.setBackground(new java.awt.Color(255, 255, 204));
        DRAFTButtion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DRAFTButtion.setText("DRAFT");
        DRAFTButtion.setToolTipText("DRAFT");
        DRAFTButtion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DRAFTButtionActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TITLE, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 453, Short.MAX_VALUE))
                            .addComponent(photo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(APPLYButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(HRButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ADMINButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ACCOUNTButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(SALARYButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LOGOUTButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DRAFTButtion, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Createutton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BILLINGButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DISTRIBUTIONButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GENERATIONButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LOGOUTButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SALARYButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ACCOUNTButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ADMINButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HRButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(APPLYButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GENERATIONButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DISTRIBUTIONButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BILLINGButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Createutton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DRAFTButtion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(TITLE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void APPLYButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APPLYButtonActionPerformed

    setVisible(false);
    dispose();
    new APPLYFrame().setVisible(true);
}//GEN-LAST:event_APPLYButtonActionPerformed

private void HRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HRButtonActionPerformed
// TODO add your handling code here:
    setVisible(false);
    dispose();
    new HRFrame().setVisible(true);
}//GEN-LAST:event_HRButtonActionPerformed

private void ADMINButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMINButtonActionPerformed
// TODO add your handling code here:
    setVisible(false);
    dispose();
    new ADMINFrame().setVisible(true);
}//GEN-LAST:event_ADMINButtonActionPerformed

private void ACCOUNTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACCOUNTButtonActionPerformed
// TODO add your handling code here:
    setVisible(false);
    dispose();
    new ACCOUNTFrame().setVisible(true);
}//GEN-LAST:event_ACCOUNTButtonActionPerformed

private void SALARYButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALARYButtonActionPerformed
// TODO add your handling code here:
    setVisible(false);
    dispose();
    new SALARYFrame().setVisible(true);
}//GEN-LAST:event_SALARYButtonActionPerformed

private void LOGOUTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUTButtonActionPerformed
// TODO add your handling code here:
    int sd = JOptionPane.showConfirmDialog(this, "Are you sure?");
    if (sd == 0) {
        setVisible(false);
        dispose();
        //System.exit(0);
        new LoginFrame().setVisible(true);
    }

}//GEN-LAST:event_LOGOUTButtonActionPerformed

private void GENERATIONButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GENERATIONButtonActionPerformed
// TODO add your handling code here:
    setVisible(false);
    dispose();
    new GENERATIONFrame().setVisible(true);
}//GEN-LAST:event_GENERATIONButtonActionPerformed

private void DISTRIBUTIONButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DISTRIBUTIONButtonActionPerformed
// TODO add your handling code here:
    setVisible(false);
    dispose();
    new DISTRIBUTIONFrame().setVisible(true);
}//GEN-LAST:event_DISTRIBUTIONButtonActionPerformed

private void BILLINGButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BILLINGButtonActionPerformed
// TODO add your handling code here:
    setVisible(false);
    dispose();
    new BILLINGFrame().setVisible(true);
}//GEN-LAST:event_BILLINGButtonActionPerformed

private void APPLYMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APPLYMouseClicked
    // TODO add your handling code here:
    setVisible(false);
    dispose();
    new APPLYFrame().setVisible(true);
//new APPLYDialog(this,true).setVisible(true);
}//GEN-LAST:event_APPLYMouseClicked

private void HRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HRMouseClicked
// TODO add your handling code here:
    setVisible(false);
    dispose();
    new HRFrame().setVisible(true);
}//GEN-LAST:event_HRMouseClicked

private void ADMINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMINMouseClicked
// TODO add your handling code here:
    setVisible(false);
    dispose();
    new ADMINFrame().setVisible(true);
}//GEN-LAST:event_ADMINMouseClicked

private void ACCOUNTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACCOUNTMouseClicked
// TODO add your handling code here:
    setVisible(false);
    dispose();
    new ACCOUNTFrame().setVisible(true);
}//GEN-LAST:event_ACCOUNTMouseClicked

private void SALARYMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALARYMouseClicked
// TODO add your handling code here:
    setVisible(false);
    dispose();
    new SALARYFrame().setVisible(true);
}//GEN-LAST:event_SALARYMouseClicked

private void BILLINGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BILLINGMouseClicked
// TODO add your handling code here:
    setVisible(false);
    dispose();
    new BILLINGFrame().setVisible(true);
}//GEN-LAST:event_BILLINGMouseClicked

private void DISTRIBUTIONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DISTRIBUTIONMouseClicked
// TODO add your handling code here:
    setVisible(false);
    dispose();
    new DISTRIBUTIONFrame().setVisible(true);
}//GEN-LAST:event_DISTRIBUTIONMouseClicked

private void GENERATIONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GENERATIONMouseClicked
// TODO add your handling code here:
    setVisible(false);
    dispose();
    new GENERATIONFrame().setVisible(true);
}//GEN-LAST:event_GENERATIONMouseClicked

private void MENUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MENUMouseClicked
// TODO add your handling code here:
}//GEN-LAST:event_MENUMouseClicked

private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
    int sd = JOptionPane.showConfirmDialog(this, "Are you sure?");
    if (sd == 0) {
        setVisible(false);
        dispose();
       // System.exit(0);
        new LoginFrame().setVisible(true);
    }
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
            //new HomeFrame().setVisible(true);
            setVisible(false);
            dispose();
            new HomeFrame().setVisible(true);
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
            //new HomeFrame().setVisible(true);
            setVisible(false);
            dispose();
            new HomeFrame().setVisible(true);
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
            //new HomeFrame().setVisible(true);
            setVisible(false);
            dispose();
            new HomeFrame().setVisible(true);
        }
    });
}//GEN-LAST:event_CremeActionPerformed

private void use1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_use1ActionPerformed
// TODO add your handling code here:
    JFrame.setDefaultLookAndFeelDecorated(true);
    JDialog.setDefaultLookAndFeelDecorated(true);
    try {
        //UIManager.setLookAndFeel(new SubstanceModerateLookAndFeel());
        UIManager.setLookAndFeel(new SubstanceOfficeBlue2007LookAndFeel());
    } catch (Exception e) {
    }
    javax.swing.SwingUtilities.invokeLater(new Runnable() {

        @Override
        public void run() {
            //new HomeFrame().setVisible(true);
            setVisible(false);
            dispose();
            new HomeFrame().setVisible(true);
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
            //new HomeFrame().setVisible(true);
            setVisible(false);
            dispose();
            new HomeFrame().setVisible(true);
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

private void CreateuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateuttonActionPerformed
// TODO add your handling code here:
    setVisible(false);
    dispose();
    new USERCFrame().setVisible(true);
}//GEN-LAST:event_CreateuttonActionPerformed

private void DRAFTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DRAFTMouseClicked
// TODO add your handling code here:
    setVisible(false);
    dispose();
    new DRAFTFrame().setVisible(true);

}//GEN-LAST:event_DRAFTMouseClicked

private void DRAFTButtionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DRAFTButtionActionPerformed
// TODO add your handling code here:
    setVisible(false);
    dispose();
    new DRAFTFrame().setVisible(true);
}//GEN-LAST:event_DRAFTButtionActionPerformed

    /**
    
     */
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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Utility.SLabel ACCOUNT;
    private javax.swing.JButton ACCOUNTButton;
    private Utility.SLabel ADMIN;
    private javax.swing.JButton ADMINButton;
    private Utility.SLabel APPLY;
    private javax.swing.JButton APPLYButton;
    private javax.swing.JMenuItem Autumn;
    private Utility.SLabel BILLING;
    private javax.swing.JButton BILLINGButton;
    private javax.swing.JMenuItem BPDB;
    private javax.swing.JMenuItem Business;
    private javax.swing.JButton Createutton;
    private javax.swing.JMenuItem Creme;
    private Utility.SLabel DISTRIBUTION;
    private javax.swing.JButton DISTRIBUTIONButton;
    private Utility.SLabel DRAFT;
    private javax.swing.JButton DRAFTButtion;
    private javax.swing.JMenu Edit;
    private javax.swing.JMenu File;
    private javax.swing.JMenu File1;
    private Utility.SLabel GENERATION;
    private javax.swing.JButton GENERATIONButton;
    private Utility.SLabel HR;
    private javax.swing.JButton HRButton;
    private javax.swing.JButton LOGOUTButton;
    private Utility.SLabel MENU;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private Utility.SLabel SALARY;
    private javax.swing.JButton SALARYButton;
    private javax.swing.JLabel TITLE;
    private javax.swing.JMenu View;
    private javax.swing.JMenu about;
    private javax.swing.JMenuItem copy;
    private javax.swing.JMenuItem cut;
    private javax.swing.JMenuItem delete;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem exit1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JMenuItem paste;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel time;
    private javax.swing.JMenuItem undo;
    private javax.swing.JMenuItem use1;
    private javax.swing.JMenuItem use2;
    // End of variables declaration//GEN-END:variables
}