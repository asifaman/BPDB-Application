package bpdbapplication;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import org.jvnet.substance.skin.SubstanceModerateLookAndFeel;

public class BPDBApplication {

    public static void main(String[] args) {
        System.out.println("Bangladesh Power Development Board");

        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        try {
            //UIManager.setLookAndFeel(new SubstanceOfficeBlue2007LookAndFeel());
            //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            // UIManager.setLookAndFeel(new SubstanceOfficeBlue2007LookAndFeel());
            //UIManager.setLookAndFeel(new SubstanceBusinessLookAndFeel());
            //UIManager.setLookAndFeel(new SubstanceCremeCoffeeLookAndFeel());
            UIManager.setLookAndFeel(new SubstanceModerateLookAndFeel());
            //UIManager.setLookAndFeel(new SubstanceOfficeSilver2007LookAndFeel());
            //UIManager.setLookAndFeel(new SubstanceOfficeBlue2007LookAndFeel());
        } catch (Exception e) {
            //System.out.println("Substance Raven Graphite failed to initialize");
        }



        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });


    }
}
