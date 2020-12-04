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
public class createAccountController implements ActionListener {
    
    
    createAccountView cAccount;
    createAccountModel createAccModel;
    
    
    
    public createAccountController(){
        this.cAccount = new createAccountView(this);
        this.createAccModel = new createAccountModel();
    }
    
    
     
     @Override
    public void actionPerformed(ActionEvent e) {
        
         if (e.getActionCommand().equals("back")){
                 cAccount.dispose();
                 new loginController();
        
    }
    
    //---------------NEW USER BUTTON-------------------------
        
        String userName = cAccount.getValueName();
        String userEmail = cAccount.getValueEmail();
        String userAddress = cAccount.getValueAddress();
        String userPhone = cAccount.getValuePhone();
        String userPassword = cAccount.getValuePassword();
        
       userUsuario newUser = new userUsuario(userName, userEmail, userAddress, userPhone, userPassword);
       
      
        if(e.getActionCommand().equals("done")){
            
            if(cAccount.getValueName().isEmpty()||cAccount.getValueEmail().isEmpty() || cAccount.getValueAddress().isEmpty() || cAccount.getValuePhone().isEmpty() || cAccount.getValuePassword().isEmpty()){
                JOptionPane.showMessageDialog(cAccount, "Please fill all the field with valid credencials");
                cAccount.dispose();
                new createAccountController();
            }
            
            else if(cAccount.clientSelect()){
                createAccModel.createAccDB(newUser);
                JOptionPane.showMessageDialog(cAccount, "Account Created with Success!");
                cAccount.dispose();
                new loginController(); 
            }
            else if(cAccount.hairdresserSelect()){
                createAccModel.createAccDBHair(newUser);
                JOptionPane.showMessageDialog(cAccount, "Account Created with Success!");
                cAccount.dispose();
                new loginController(); 
            }            
        }

    }
    
}
