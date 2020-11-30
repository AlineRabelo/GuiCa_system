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
    private JTextField password;
    
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
        
        
        
         //PAINEL PRINCIPAL ONDE VAI TODO O FRAME
         JPanel painelPrincipal = new JPanel();
            this.add(painelPrincipal, BorderLayout.CENTER);
            
            
         //FLOWLAYOUT DO CENTRO   
         FlowLayout centerLayout = new FlowLayout();
            painelPrincipal.setLayout(centerLayout);
            centerLayout.setAlignment(FlowLayout.CENTER);
            
            
            
         //GRID LAYOUT
         GridLayout minhaGrid = new GridLayout(7,2);
            painelPrincipal.setLayout(minhaGrid);
         
        
        
        //PAINEL DO TOPO ONDE VOU INSERIR DENTRO DO PANEL PRINCIPAL  
        JPanel painelTopo = new JPanel();
            this.add(painelTopo, BorderLayout.PAGE_START);
            painelTopo.setBorder(BorderFactory.createLineBorder(Color.gray));
                     
        //LABEL DO TOPO
        JLabel labelTopo = new JLabel("Create an Account");
            painelTopo.add(labelTopo);
       
          
        //PAINEL ONDE O USUARIO VAI INSERIR SUAS CREDENCIAIS
        JPanel namePanel = new JPanel();
        painelPrincipal.add(namePanel);
        name = new JTextField(20);
        JLabel nameLabel = new JLabel("Name");
        painelPrincipal.add(name);
        namePanel.add(nameLabel);
        namePanel.add(name);
        painelPrincipal.setLayout(centerLayout);
        
        JPanel emailPanel = new JPanel();
        painelPrincipal.add(emailPanel);
        email = new JTextField(20);
        JLabel emailLabel = new JLabel("Email");
        painelPrincipal.add(email);
        emailPanel.add(emailLabel);
        emailPanel.add(email);
        painelPrincipal.setLayout(centerLayout);
        
        JPanel addressPanel = new JPanel();
        painelPrincipal.add(addressPanel);
        address = new JTextField(20);
        JLabel addressLabel = new JLabel("Address");
        painelPrincipal.add(address);
        addressPanel.add(addressLabel);
        addressPanel.add(address);
        painelPrincipal.setLayout(centerLayout);
        
        JPanel phonePanel = new JPanel();
        painelPrincipal.add(phonePanel);
        phone = new JTextField(20);
        JLabel phoneLabel = new JLabel("Phone");
        painelPrincipal.add(phone);
        phonePanel.add(phoneLabel);
        phonePanel.add(phone);
        painelPrincipal.setLayout(centerLayout);
        
        JPanel passwordPanel = new JPanel();
        painelPrincipal.add(passwordPanel);
        password = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password");
        painelPrincipal.add(password);
        passwordPanel.add(passwordLabel);
        passwordPanel.add(password);
        painelPrincipal.setLayout(centerLayout);

        
        //PAINEL ONDE O USUARIO VAI SELECIONAR AS OPCOES DE HAIRDRESSER OU USUARIO
        
        JPanel selectPanel = new JPanel();
        painelPrincipal.add(selectPanel);

        String[] optionString = { "Client", "Hairdresser" }; 
        
         client = new JRadioButton(optionString[0]);
         client.setSelected(true);
         hairdresser = new JRadioButton(optionString[1]);

         //Group the radio buttons. 
         ButtonGroup group = new ButtonGroup(); 
         group.add(client); 
         group.add(hairdresser);
         client.addActionListener(contAccount);
         client.setActionCommand("client");
         hairdresser.addActionListener(contAccount);
         hairdresser.setActionCommand("hairdresser");
 
         painelPrincipal.add(client);
         painelPrincipal.add(hairdresser);

         
        //BOTAO DE "DONE"
        JPanel donePanel = new JPanel();
        painelPrincipal.add(donePanel);
        JButton doneButton = new JButton("Done");
        donePanel.add(doneButton);
        doneButton.addActionListener(contAccount);
        doneButton.setActionCommand("done");
        

        
        JPanel backPanel = new JPanel();
        painelPrincipal.add(backPanel);
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
        return password.getText();
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

        

            

        
