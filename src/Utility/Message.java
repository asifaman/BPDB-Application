

package Utility;


import java.awt.Component;
import javax.swing.JOptionPane;
public class Message {

    public Message() {
    }
    public static void error1(Component c, String message)
    {  
        if(!message.startsWith("Listener refused"))
        JOptionPane.showMessageDialog(c, message, "Error", JOptionPane.WARNING_MESSAGE);
       
    }
    
    public static void success1(Component c, String message)
    {
        JOptionPane.showMessageDialog(c, message, "Successful", JOptionPane.PLAIN_MESSAGE);
       
    }
    
 
     public static void message(Component c, String message)
    {
        JOptionPane.showMessageDialog(c, message, "Message", JOptionPane.OK_OPTION);
    }
     
     

}

