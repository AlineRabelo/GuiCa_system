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
public class hairBookController implements ActionListener {
    
    hairBookView hairBook;
    
    public hairBookController(){
        this.hairBook = hairBook;
        this.hairBook = new hairBookView(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("LogOut")){  
                int n = JOptionPane.showConfirmDialog(hairBook, 
                    "Are you sure that you want to Log Out?", 
                    "Log Out", 
                    JOptionPane.YES_NO_OPTION);
        
        if (n == 0){ 
            System.exit(0);
            }  
          }
        
    }
}
