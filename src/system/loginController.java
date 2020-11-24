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
        
        String usuario = view.getValueOne();
        String senha = view.getValueTwo();
        
        loginUser user = new loginUser(usuario, senha);
        
        boolean result = model.login(user);
        
        String resultMessage = "Try again with valid credentials";
        
        if(result){
            resultMessage = "Welcome in";
        }
        
        view.setResult(resultMessage);
        
        
        if (e.getActionCommand().equals("newuser")){
            view.dispose();
            new createAccountController();
        }
        
       
          }
    }

