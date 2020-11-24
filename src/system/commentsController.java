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
public class commentsController implements ActionListener {
    
        commentsView comment;
    
    public commentsController(){
        
        this.comment = comment;
        this.comment = new commentsView(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("LogOut")){  
                int n = JOptionPane.showConfirmDialog(comment, 
                    "Are you sure that you want to Log Out?", 
                    "Log Out", 
                    JOptionPane.YES_NO_OPTION);
        
        if (n == 0){ //n==0 signigica o Yes entao ira fechar o programa
            System.exit(0);
            }  
          }
        if (e.getActionCommand().equals("backApp")){
               comment.dispose();
               new myAppointmentsController();
       
        
    }
    
}
}
