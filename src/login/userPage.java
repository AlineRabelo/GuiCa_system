/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author aline
 */
public class userPage extends JFrame {
    
    private JTextField name;
    private JTextField phone;
    private JTextField hair;
    private JTextField location;
    private JTextField date;
    private JTextField hour;
    
    controllerUserPage userPage;

    public userPage (controllerUserPage userPage){
        
        this.userPage = userPage;
        userFrameSetter();
        validation3();
        
    }
    
    public void userFrameSetter(){
        
        
        this.setVisible(true);
        this.setSize(370,360);
        this.setTitle("User Page");
        BorderLayout fLay = new BorderLayout();
        this.setLayout(fLay);
        
        //PANEL PRINCIPAL ONDE VAI TODOS OS PANELS
        JPanel painelPrincipal = new JPanel();
            this.add(painelPrincipal, BorderLayout.CENTER);
            
        //FLOWLAYOUT CENTRAL
        FlowLayout centerLayout = new FlowLayout();
            painelPrincipal.setLayout(centerLayout);
            centerLayout.setAlignment(FlowLayout.TRAILING);

        //PANEL DO TOPO PRINCIPAL
         JPanel painelTopo = new JPanel();
            this.add(painelTopo, BorderLayout.PAGE_START);    
            
            
        //LABEL DO TOPO
        FlowLayout labelLoginFlow = new FlowLayout();
        labelLoginFlow.setAlignment(FlowLayout.LEFT);
        JLabel labelTopo = new JLabel("Login User: ");
            painelTopo.add(labelTopo);
            painelTopo.setLayout(labelLoginFlow);
            
         //GRIDLAYOUT
         GridLayout minhaGrid = new GridLayout(10,5);
            painelPrincipal.setLayout(minhaGrid);
            painelTopo.setLayout(minhaGrid);
            
            
        //BOTAO DO LOGOUT
        FlowLayout logOutFlow = new FlowLayout();
        logOutFlow.setAlignment(FlowLayout.RIGHT);
        JPanel logoutPanel = new JPanel();
        painelPrincipal.add(logoutPanel);
        JButton logoutButton = new JButton("LogOut");
       // logoutButton.addActionListener(cAccount);
        logoutPanel.add(logoutButton);
        painelTopo.setLayout(logOutFlow);
        logoutButton.setPreferredSize(new Dimension(80,20));
        
        
        
        
        //PANEL DO TOPO COM OS DOIS BOTOES
          JPanel appointPanel = new JPanel();
          painelPrincipal.add(appointPanel);
          FlowLayout appointFlow = new FlowLayout();
          appointPanel.setLayout(appointFlow);
          appointFlow.setAlignment(FlowLayout.CENTER);
          
          JButton makeAppoint = new JButton("Make an Appointment");
          JButton myAppoint = new JButton("My Appointments");
          appointPanel.add(makeAppoint);
          appointPanel.add(myAppoint);

          
          //FLOWLAYOUT DA PAGINA PRINCIPAL
          FlowLayout bookFlow = new FlowLayout();
          bookFlow.setAlignment(FlowLayout.CENTER);
          
          //FLOWLAYOUT DO OR
          FlowLayout orFlow = new FlowLayout();
          orFlow.setAlignment(FlowLayout.LEFT);
        
        //PANEL CENTRAL
        JPanel namePanel = new JPanel();
        painelPrincipal.add(namePanel);
        name = new JTextField(20);
        JLabel nameLabel = new JLabel("Name");
        painelPrincipal.add(name);
        namePanel.add(nameLabel);
        namePanel.add(name);
        painelPrincipal.setLayout(bookFlow);  
        
        JPanel phonePanel = new JPanel();
        painelPrincipal.add(phonePanel);
        phone = new JTextField(20);
        JLabel phoneLabel = new JLabel("Phone");
        painelPrincipal.add(phone);
        phonePanel.add(phoneLabel);
        phonePanel.add(phone);
        painelPrincipal.setLayout(bookFlow);
        
        
        //MUDAR PARA OPCAO SELECT E NAO JTEXTFIELD
        JPanel hairPanel = new JPanel();
        painelPrincipal.add(hairPanel);
        hair = new JTextField(20);
        JLabel hairLabel = new JLabel("Hairdresser");
        painelPrincipal.add(hair);
        hairPanel.add(hairLabel);
        hairPanel.add(hair);
        painelPrincipal.setLayout(bookFlow);
        
        JPanel orPanel = new JPanel();
        painelPrincipal.add(orPanel);
        JLabel orLabel = new JLabel("Or");
        orPanel.add(orLabel);
        orPanel.setLayout(orFlow);
        
        
        JPanel locationPanel = new JPanel();
        painelPrincipal.add(locationPanel);
        location = new JTextField(20);
        JLabel locationLabel = new JLabel("Location");
        painelPrincipal.add(location);
        locationPanel.add(locationLabel);
        locationPanel.add(location);
        painelPrincipal.setLayout(bookFlow);
        
   
        JPanel datePanel = new JPanel();
        painelPrincipal.add(datePanel);
        date = new JTextField(10);
        JLabel dateLabel = new JLabel("Date");
        painelPrincipal.add(date);
        datePanel.add(dateLabel);
        datePanel.add(date);
        painelPrincipal.setLayout(bookFlow);
        
        JPanel hourPanel = new JPanel();
        painelPrincipal.add(hourPanel);
        hour = new JTextField(10);
        JLabel hourLabel = new JLabel("Hour");
        painelPrincipal.add(hour);
        hourPanel.add(hourLabel);
        hourPanel.add(hour);
        painelPrincipal.setLayout(bookFlow);
        
        //BOTAO DE BOOK
         JPanel bookPanel = new JPanel();
        painelPrincipal.add(bookPanel);
        JButton bookButton = new JButton("BOOK");
       // doneButton.addActionListener(cAccount);
        bookPanel.add(bookButton);
   
        
    }
    
    public void validation3(){
        this.validate();
        this.repaint();
    }
    
}


