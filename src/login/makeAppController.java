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
public class makeAppController implements ActionListener {
    
    
    makeAppView userpg;
    
    
    public makeAppController(){
        this.userpg = new makeAppView(this);
    }
    
    
     
     @Override
    public void actionPerformed(ActionEvent e) {
        
       
    }
}