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
public class myAppointmentsController implements ActionListener {
    
    
     myAppointmentsView myApp;
    
    
    public myAppointmentsController(){
        
        this.myApp = myApp;
        this.myApp = new myAppointmentsView(this);
    }
    
    
     
     @Override
    public void actionPerformed(ActionEvent e) {
        
          if(e.getActionCommand().equals("LogOut")){  
                int n = JOptionPane.showConfirmDialog(myApp, 
                    "Are you sure that you want to Log Out?", 
                    "Log Out", 
                    JOptionPane.YES_NO_OPTION);
        
        if (n == 0){ 
            System.exit(0);
            }  
          }
       
           if(e.getActionCommand().equals("Cancel")){
              int n = JOptionPane.showConfirmDialog(myApp, 
                    "Are you sure that you want to Cancel?", 
                    "Cancel", 
                    JOptionPane.YES_NO_OPTION);
                      
                if (n == 0){ 
                    JOptionPane.showMessageDialog(myApp, "Booked Canceled with Success!");  
                    }         
            }
           
                if (e.getActionCommand().equals("makeapp")){
                         myApp.dispose();
                         new makeAppController();
          }
                
                if (e.getActionCommand().equals("makeComments")){
                        myApp.dispose();
                        new commentsController();
        }

    }
}
    

