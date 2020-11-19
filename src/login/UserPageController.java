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
public class UserPageController implements ActionListener {
    
    
    userPageView userpg;
    
    
    public UserPageController(){
        this.userpg = new userPageView(this);
    }
    
    
     
     @Override
    public void actionPerformed(ActionEvent e) {
        
       
    }
}