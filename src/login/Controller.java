/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author aline
 */
public class Controller implements ActionListener{
    
    View view;
    Model model;
    
    
    public Controller(){
        this.view = new View(this);
        this.model = new Model();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String usuario = view.getValueOne();
        String senha = view.getValueTwo();
        
        User user = new User(usuario, senha);
        
        boolean result = model.login(user);
        
        String resultMessage = "Try again with valid credentials";
        
        if(result){
            resultMessage = "Welcome in";
        }
        
        view.setResult(resultMessage);
        
    }
    
}
