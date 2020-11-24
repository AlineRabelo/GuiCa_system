/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author aline
 */
public class commentsView extends JFrame{
    
    private JTextField text;
    private JButton logoutButton;
    
    commentsController comment;
    
    public commentsView (commentsController comment){
        
        this.comment = comment;
        commentsSetter();
        validation5();
        
    }

    
   
    public void commentsSetter(){
        
        this.setVisible(true);
        this.setSize(370,360);
        this.setTitle("My Comments");
        BorderLayout fLay = new BorderLayout();
        this.setLayout(fLay);
        setLocationRelativeTo(null);
        
        //PANEL PRINCIPAL ONDE VAI TODOS OS PANELS
        JPanel painelPrincipal = new JPanel();
            this.add(painelPrincipal, BorderLayout.CENTER);
//            painelPrincipal.setBackground(Color.red);

            
        //FLOWLAYOUT CENTRAL
        FlowLayout centerLayout = new FlowLayout();
            painelPrincipal.setLayout(centerLayout);
            centerLayout.setAlignment(FlowLayout.TRAILING);
            
            

        //PANEL DO TOPO PRINCIPAL
         JPanel painelTopo = new JPanel();
            this.add(painelTopo, BorderLayout.PAGE_START); 
//            painelTopo.setBackground(Color.blue);
            painelTopo.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            
            
        //LABEL DO TOPO
        FlowLayout labelLoginFlow = new FlowLayout();
        labelLoginFlow.setAlignment(FlowLayout.LEFT);
        JLabel labelTopo = new JLabel("Login User: ");
            painelTopo.add(labelTopo);
            painelTopo.setLayout(labelLoginFlow);
            
         //GRIDLAYOUT
         GridLayout minhaGrid = new GridLayout(6,1);
            painelPrincipal.setLayout(minhaGrid);
            painelTopo.setLayout(minhaGrid);
            
            
        //BOTAO DO LOGOUT
        FlowLayout logOutFlow = new FlowLayout();
        logOutFlow.setAlignment(FlowLayout.RIGHT);
        painelPrincipal.add(painelTopo);
        logoutButton = new JButton("LogOut");
        painelTopo.add(logoutButton);
        painelTopo.setLayout(logOutFlow);
        logoutButton.setPreferredSize(new Dimension(80,20));
        logoutButton.setActionCommand("LogOut");
        logoutButton.addActionListener(comment);
        
        JPanel appointPanel = new JPanel();
        painelPrincipal.add(appointPanel);
        FlowLayout appointFlow = new FlowLayout();
        appointPanel.setLayout(appointFlow);
        appointFlow.setAlignment(FlowLayout.CENTER);
        
        JButton backAppButton = new JButton("Back to Appointments");
        appointPanel.add(backAppButton);
        backAppButton.addActionListener(comment);
        backAppButton.setActionCommand("backApp");
        
        JPanel appInfo1 = new JPanel();
          painelPrincipal.add(appInfo1);
//          appInfo1.setBackground(Color.yellow);
          text = new JTextField(20);
          appInfo1.add(text);
          appInfo1.setLayout(new GridBagLayout());
          GridBagConstraints gbc = new GridBagConstraints();
          gbc.gridwidth = GridBagConstraints.REMAINDER;
          appInfo1.add(text, gbc);
          appInfo1.setBorder(BorderFactory.createLineBorder(Color.gray));
          
            FlowLayout commentFlow = new FlowLayout();
            commentFlow.setAlignment(FlowLayout.RIGHT);
            painelPrincipal.add(appInfo1);
            JButton commentButton = new JButton("Comment");
            appInfo1.add(commentButton);
            appInfo1.setLayout(commentFlow);
            

   
          
          JPanel appInfo2 = new JPanel();
          painelPrincipal.add(appInfo2);
//          appInfo2.setBackground(Color.GREEN);
          text = new JTextField(20);
//          text.setBounds(0,0,50,40);
          appInfo2.add(text);
          appInfo2.setLayout(new GridBagLayout());
          GridBagConstraints gbc1 = new GridBagConstraints();
          gbc1.gridwidth = GridBagConstraints.REMAINDER;
          appInfo2.add(text, gbc1);
          appInfo2.setBorder(BorderFactory.createLineBorder(Color.GRAY));
          
          
            painelPrincipal.add(appInfo2);
            JButton comment2Button = new JButton("Comment");
            appInfo2.add(comment2Button);
            appInfo2.setLayout(commentFlow);

          

    }
    
    public void validation5(){
        
        this.validate();
        this.repaint();
    }
    
}
