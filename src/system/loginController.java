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
public class loginController implements ActionListener{
    
    loginView view;
    loginModel model;
    
    
    public loginController(){
        this.view = new loginView(this);
        this.model = new loginModel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String usuario = view.getValueEmail();
        String senha = view.getValuePassword();
        
        userUsuario userPage = new userUsuario(usuario, senha);
        
        boolean result = model.loginPage(userPage);
        boolean resultHair = model.login2(userPage);
        
        String resultMessage = "Try again with valid credentials";
        
        if(e.getActionCommand().equals("login") && result){
            view.dispose();
            new makeAppController();
            
        }
        
        if (e.getActionCommand().equals("login") && resultHair){
            view.dispose();
            new hairBookController();
            
        }
        
        view.setResult(resultMessage);
        
   //-------------------NEW USER-----------------------------------
        
        if (e.getActionCommand().equals("newuser")){
            view.dispose();
            new createAccountController();
        }
        
       
          }
    }

