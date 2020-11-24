/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author aline
 */
public class createAccountController implements ActionListener {
    
    
    createAccountView cAccount;
    
    
    public createAccountController(){
        this.cAccount = new createAccountView(this);
    }
    
    
     
     @Override
    public void actionPerformed(ActionEvent e) {
        
         if (e.getActionCommand().equals("back")){
                 cAccount.dispose();
                 new loginController();
        
    }
        
       
    }
    
}
