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
        
        if (n == 0){ 
            System.exit(0);
            }  
          }
        if (e.getActionCommand().equals("backApp")){
               comment.dispose();
               new myAppointmentsController();     
    }
   //-------------------------------------------------------------
   
        if(e.getActionCommand().equals("hairdresser")){
            System.out.println(comment.hairList.getSelectedItem());
        }
  //--------------------------------------------------------------
  
       String hairdresser = comment.getValueHairdresser();
       String Comment = comment.getValueComments();
       
       userUsuario newComment = new userUsuario(hairdresser, Comment);
       
       if(e.getActionCommand().equals("comment")){
           
           if(comment.getValueHairdresser().isEmpty() || comment.getValueComments().isEmpty()){
               JOptionPane.showMessageDialog(comment, "Please make a comment");
           }
           else if(comment.toString().equals(Comment)){
                  comment.commentsDB(newComment);
                 JOptionPane.showMessageDialog(comment, "Comment Created with Success!");
           }
       }
        
           
          
    
       
       
       
       
    }
}
