/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author aline
 */
public class hairSlotsController implements ActionListener {
    
    hairSlotsView hairSlots;
    
    public hairSlotsController(){
       this.hairSlots = hairSlots;
       this.hairSlots = new hairSlotsView(this);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("LogOut")){  
                int n = JOptionPane.showConfirmDialog(hairSlots, 
                    "Are you sure that you want to Log Out?", 
                    "Log Out", 
                    JOptionPane.YES_NO_OPTION);
        
        if (n == 0){ 
            System.exit(0);
            }  
          }
          
            if (e.getActionCommand().equals("comments")){
                 hairSlots.dispose();
                 new hairCommentsController();  
    }
            if (e.getActionCommand().equals("booked")){
                 hairSlots.dispose();
                 new hairBookController();
        
    }
    }
    
}
