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
public class myAppointmentsController implements ActionListener {
    
    
     myAppointmentsView myApp;
    
    
    public myAppointmentsController(){
        this.myApp = new myAppointmentsView(this);
    }
    
    
     
     @Override
    public void actionPerformed(ActionEvent e) {
        
       
    }
}
    

