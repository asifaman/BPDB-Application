

package Utility;

import java.awt.Color;
import javax.swing.JLabel;


public class SLabel1 extends JLabel{
    
    String text = new String();
    
    public SLabel1(){
        
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sLabelMouseEntered(evt);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sLabelMouseExited(evt);
            }
            
                                           

            private void sLabelMouseEntered(java.awt.event.MouseEvent evt) {                                    
     
                text = getText();
                setForeground(new Color(0,102,152));
                setText("<html><u>"+text+"</u></html>");
                
            }                                   

            private void sLabelMouseExited(java.awt.event.MouseEvent evt) {                                   
         
                setForeground(Color.black);
                setText(text);
            }              
        });
        
    }
    
    public static void main(String[] args) {
        new SLabel1();
    }

}
