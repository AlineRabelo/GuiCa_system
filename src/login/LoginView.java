/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author aline
 */
public class LoginView extends JFrame{
    
    
    private JTextField email;
    private JPasswordField senha;
    private JTextField palavra;
    LoginController controller;
    
    public LoginView (LoginController controller){
        
        this.controller = controller;
        
        attributesSetter();
        validation();
        
    }
    
    private void attributesSetter(){
        
        //Estetica do frame
        this.setVisible(true);
        this.setSize(370,360);
        this.setTitle("Login");
        BorderLayout fLay = new BorderLayout();
        this.setLayout(fLay);
        
                
        //PAINEL PARA DEFINIR O TOPO COM O NOME DE "HAIRDRESSER APPOINTMENT"
        JPanel topPanel = new JPanel();
            this.add(topPanel, BorderLayout.PAGE_START);
        
        //PAINEL CENTRAL QUE VAI LOGIN E SENHA     
        JPanel center = new JPanel();
            this.add(center);
            this.add(center, BorderLayout.CENTER);
            
        
        //FLOWLAYOUT PARA COLOCAR TUDO NO CENTRO
        FlowLayout centerLayout = new FlowLayout();
            center.setLayout(centerLayout);
            centerLayout.setAlignment(FlowLayout.TRAILING);
            
            
        //GRID PARA CONSEGUIR QUE TUDO FIQUE NO LUGAR MSMO QUANDO EU AUMENTO OU DIMINUO MINHA JANELA    
        GridLayout minhaGrid = new GridLayout(7,2);
            center.setLayout(minhaGrid);
    
            
        //LABEL DO TOPO, ADICIONANDO NO PANEL PRINCIPAL E NO TOPO
        JLabel firstPage = new JLabel("Hairdresser Appointment");
        topPanel.add(firstPage);
   
        
        //LABEL E CAIXA DE TEXTO PARA O USUARIO DIGITAR O EMAIL
        JPanel emailPanel = new JPanel();
        center.add(emailPanel);
        email = new JTextField(20);
        JLabel emailLabel = new JLabel("Email");
        center.add(email);
        emailPanel.add(emailLabel);
        emailPanel.add(email);
        center.setLayout(centerLayout);
        
        
       //LABEL E CAIXA DE TEXTO PARA O USUARIO DIGITAR A SENHA
        JPanel senhaPanel = new JPanel();
        center.add(senhaPanel);
        senha = new JPasswordField(20);
        JLabel senhaLabel = new JLabel("Password");
        center.add(senha);
        senhaPanel.add(senhaLabel);
        senhaPanel.add(senha);
        center.setLayout(centerLayout);
       
       
        //ESSA LINHA DE CODIGO NAO FICARA NO PROJETO FINAL, SERVE APENAS PARA MOSTRAR SE MEU DB ESTA FUNCIONANDO.
        palavra = new JTextField(20);
        
        //BOTAO DE LOGIN 
        JPanel botaoPanel = new JPanel();
        center.add(botaoPanel);
        JButton botaoLogin = new JButton("Login");
        botaoLogin.addActionListener(controller);
        center.add(palavra);
        botaoPanel.add(botaoLogin);
        
    
        //RODAPE 
        JPanel rodape = new JPanel();
          this.add(rodape, BorderLayout.SOUTH);
        
        //LINK PARA USUARIO CLICAR CASO NAO TENHA UMA CONTA 
        JLabel footPage = new JLabel("New here? Make an account");
          rodape.add(footPage);
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
