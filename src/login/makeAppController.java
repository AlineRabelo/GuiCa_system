/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author aline
 */
public class makeAppController implements ActionListener {
    
    
    makeAppView userpg;
    
    
    public makeAppController(){
        
        this.userpg = userpg;
        this.userpg = new makeAppView(this);
        
        
        
    }
    
    
     
     @Override
    public void actionPerformed(ActionEvent e) {
        
       if(e.getActionCommand().equals("LogOut")){  
                int n = JOptionPane.showConfirmDialog(userpg, 
                    "Are you sure that you want to Log Out?", 
                    "Log Out", 
                    JOptionPane.YES_NO_OPTION);
        
        if (n == 0){ //n==0 signigica o Yes entao ira fechar o programa
            System.exit(0);
            }  
          }
       
       else if(e.getActionCommand().equals("BOOK")){
           int n = JOptionPane.showConfirmDialog(userpg, 
                    "Are you sure that you want to procced?", 
                    "Log Out", 
                    JOptionPane.YES_NO_OPTION);
           if (n==0){
               JOptionPane.showMessageDialog(userpg, "Booked Confirmed");
           }

       }
       
       if(e.getActionCommand().equals("Date")){
           System.out.println(userpg.dateList.getSelectedItem());
       }
       else if(e.getActionCommand().equals("Hour")){
           System.out.println(userpg.hourList.getSelectedItem());
       }
       
       if(e.getActionCommand().equals("Hairdresser")){
           System.out.println(userpg.hairList.getSelectedItem());
       }
    }
}