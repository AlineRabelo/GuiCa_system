/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author aline
 */
public class View extends JFrame{
    
    
    private JTextField email;
    private JTextField senha;
    private JTextField palavra;
    Controller controller;
    
    public View (Controller controller){
        
        this.controller = controller;
        
        attributesSetter();
        componentes();
        validation();
        
    }
    
    private void attributesSetter(){
        
        //Estetica do frame
        this.setVisible(true);
        this.setSize(330,400);
        this.setTitle("Login");
        BorderLayout fLay = new BorderLayout();
        this.setLayout(fLay);
        
        //criar um gridLayout o professor falou pra fazer apenas em duas linhas. 
        
        
        //Frame para definir o texto inicial do meu primeiro panel
        JPanel topPanel = new JPanel();
        //GridLayout topLayout = new GridLayout(1,2);
       // topPanel.setLayout(topLayout);
        
        this.add(topPanel, BorderLayout.PAGE_START);
        
        JPanel center = new JPanel();
        FlowLayout centerLayout = new FlowLayout();
        center.setLayout(centerLayout);
        centerLayout.setAlignment(FlowLayout.CENTER);
        
        this.add(center, BorderLayout.CENTER);
        
        JLabel firstPage = new JLabel("Hairdresser Appoitment");
        topPanel.add(firstPage);
        
        
        
        //topPanel.add(center);
        
        
        JPanel bottonPanel = new JPanel();
        //GridLayout bottonLayout = new GridLayout(1,2);
       // bottonPanel.setLayout(bottonLayout);
        
        this.add(bottonPanel, BorderLayout.SOUTH);
        
       //JPanel foot = new JPanel();
       // FlowLayout footLayout = new FlowLayout();
        //foot.setLayout(footLayout);
       // footLayout.setAlignment(FlowLayout.CENTER);
        
        JLabel footPage = new JLabel("New here? \n Make an account"); //Perguntar pro prof. pq nao consigo quebrar a linha.
       // foot.add(footPage);
       bottonPanel.add(footPage);
       
       //JPanel pLogin = new JPanel();

        //this.add(pLogin);
            
        email = new JTextField(20);
        JLabel em = new JLabel("Email");
        center.add(em);
        center.add(email); 
        
        
        senha = new JTextField(20);
        JLabel pss = new JLabel("Password"); //Perguntar pro prof. pq nao esta do lado do password e sim do lado do email.
        center.add(pss);
        center.add(senha);
        
       
        
        
        palavra = new JTextField(20);
        JButton button = new JButton("Login");
        button.addActionListener(controller);
        center.add(palavra);
        center.add(button);
        
        
       
//        pLogin.add(email);
//        pLogin.add(senha);
//	pLogin.add(palavra);
//        pLogin.add(button);
        
        
        
    }
    
    private void componentes(){
         
       //login
        
        
        
        
    }
    
    private void validation(){
        this.validate();
        this.repaint();
    }
    
    // Getters for username and password
    public String getValueOne(){
        return email.getText();
    }
    public String getValueTwo(){
        return senha.getText();
    }
    public void setResult(String result){
        palavra.setText(result);
    }

}
