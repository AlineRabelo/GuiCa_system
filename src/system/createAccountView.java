/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author aline
 */
public class createAccountView extends JFrame {
    
    private JTextField name;
    private JTextField email;
    private JTextField address;
    private JTextField phone;
    private JPasswordField password;
    private JPasswordField confPass;
    
    JRadioButton client;
    JRadioButton hairdresser;
 
    createAccountController contAccount;
    

    
    public createAccountView (createAccountController contAccount){
        
        this.contAccount = contAccount;
        
        frameSetter();
        validation2();
        
    }
    
    public void frameSetter(){
        
        this.setVisible(true);
        this.setSize(370,360);
        this.setTitle("Create an Account");
        BorderLayout fLay = new BorderLayout();
        this.setLayout(fLay);
        setLocationRelativeTo(null);
        this.setResizable(false);

        JPanel panelPrincipal = new JPanel();
        this.add(panelPrincipal, BorderLayout.CENTER);
     
        FlowLayout centerLayout = new FlowLayout();
        panelPrincipal.setLayout(centerLayout);
        centerLayout.setAlignment(FlowLayout.CENTER);
            
        GridLayout myGrid = new GridLayout(7,2);
        panelPrincipal.setLayout(myGrid);
 
        JPanel panelTop = new JPanel();
        this.add(panelTop, BorderLayout.PAGE_START);
        panelTop.setBorder(BorderFactory.createLineBorder(Color.gray));
                     

        JLabel labelTop = new JLabel("Create an Account");
        panelTop.add(labelTop);
       

        JPanel namePanel = new JPanel();
        panelPrincipal.add(namePanel);
        name = new JTextField(20);
        JLabel nameLabel = new JLabel("Name");
        panelPrincipal.add(name);
        namePanel.add(nameLabel);
        namePanel.add(name);
        panelPrincipal.setLayout(centerLayout);
        
        JPanel emailPanel = new JPanel();
        panelPrincipal.add(emailPanel);
        email = new JTextField(20);
        JLabel emailLabel = new JLabel("Email");
        panelPrincipal.add(email);
        emailPanel.add(emailLabel);
        emailPanel.add(email);
        panelPrincipal.setLayout(centerLayout);
        
        JPanel addressPanel = new JPanel();
        panelPrincipal.add(addressPanel);
        address = new JTextField(19);
        JLabel addressLabel = new JLabel("Address");
        panelPrincipal.add(address);
        addressPanel.add(addressLabel);
        addressPanel.add(address);
        panelPrincipal.setLayout(centerLayout);
        
        JPanel phonePanel = new JPanel();
        panelPrincipal.add(phonePanel);
        phone = new JTextField(20);
        JLabel phoneLabel = new JLabel("Phone");
        panelPrincipal.add(phone);
        phonePanel.add(phoneLabel);
        phonePanel.add(phone);
        panelPrincipal.setLayout(centerLayout);
        
        JPanel passwordPanel = new JPanel();
        panelPrincipal.add(passwordPanel);
        password = new JPasswordField(18);
        JLabel passwordLabel = new JLabel("Password");
        panelPrincipal.add(password);
        passwordPanel.add(passwordLabel);
        passwordPanel.add(password);
        panelPrincipal.setLayout(centerLayout);
        
        JPanel confPassPanel = new JPanel();
        panelPrincipal.add(confPassPanel);
        password = new JPasswordField(17);
        JLabel confPassLabel = new JLabel("Conf. Password");
        panelPrincipal.add(password);
        confPassPanel.add(confPassLabel);
        confPassPanel.add(password);
        panelPrincipal.setLayout(centerLayout);
        
        JPanel selectPanel = new JPanel();
        panelPrincipal.add(selectPanel);

        
        String[] optionString = { "Client", "Hairdresser" }; 
         client = new JRadioButton(optionString[0]);
         client.setSelected(true);
         hairdresser = new JRadioButton(optionString[1]);

         ButtonGroup group = new ButtonGroup(); 
         group.add(client); 
         group.add(hairdresser);
         client.addActionListener(contAccount);
         client.setActionCommand("client");
         hairdresser.addActionListener(contAccount);
         hairdresser.setActionCommand("hairdresser");
 
         panelPrincipal.add(client);
         panelPrincipal.add(hairdresser);

         
        JPanel donePanel = new JPanel();
        panelPrincipal.add(donePanel);
        JButton doneButton = new JButton("Done");
        donePanel.add(doneButton);
        doneButton.addActionListener(contAccount);
        doneButton.setActionCommand("done");
        
        JPanel backPanel = new JPanel();
        panelPrincipal.add(backPanel);
        JButton backButton = new JButton("Back to Login");
        backPanel.add(backButton);
        backButton.addActionListener(contAccount);
        backButton.setActionCommand("back");

     
    }
    
    private void validation2(){
        this.validate();
        this.repaint();
    }
    
    public String getValueName(){
        return name.getText();
    }
    
     public String getValueEmail(){
        return email.getText();
    }

     public String getValueAddress(){
        return address.getText();
    }
     
     public String getValuePhone(){
        return phone.getText();
    }
     
    public String getValuePassword(){
        String passwordString = String.valueOf(password.getPassword());
        return passwordString;
    }

   
     public boolean clientSelect(){
        if (client.isSelected()){
            return true;
        }
         else{
           return false;
       }
  
    }
     
     public boolean hairdresserSelect(){
        if (hairdresser.isSelected()){
            return true;
        }
         else{
           return false;
       }  
}
     
}

        

            

        
