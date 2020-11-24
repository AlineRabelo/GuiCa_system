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
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author aline
 */
public class makeAppView extends JFrame {
    
    private JTextField name;
    private JTextField phone;
    private JTextField hair;
    private JTextField location;
    private JButton logoutButton;
    private JButton bookButton;
    
    JComboBox hourList = null;
    JComboBox dateList = null;
    JComboBox hairList = null;
    JComboBox locationList = null;
    
    makeAppController userPage;

    public makeAppView (makeAppController userPage){
        
        this.userPage = userPage;
        userFrameSetter();
        validation3();
        
    }
    
    public void userFrameSetter(){
        
        
        this.setVisible(true);
        this.setSize(370,360);
        this.setTitle("Make an Appointment");
        BorderLayout fLay = new BorderLayout();
        this.setLayout(fLay);
        setLocationRelativeTo(null);
        
        //PANEL PRINCIPAL ONDE VAI TODOS OS PANELS
        JPanel painelPrincipal = new JPanel();
            this.add(painelPrincipal, BorderLayout.CENTER);
//            painelPrincipal.setBackground(Color.RED);
            
        //FLOWLAYOUT CENTRAL
        FlowLayout centerLayout = new FlowLayout();
            painelPrincipal.setLayout(centerLayout);
            centerLayout.setAlignment(FlowLayout.TRAILING);
            

        //PANEL DO TOPO PRINCIPAL
         JPanel painelTopo = new JPanel();
            this.add(painelTopo, BorderLayout.PAGE_START);    
//            painelTopo.setBackground(Color.BLUE);
            
            
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
        painelPrincipal.add(painelTopo);
        logoutButton = new JButton("LogOut");
        painelTopo.add(logoutButton);
        painelTopo.setLayout(logOutFlow);
        logoutButton.setPreferredSize(new Dimension(80,20)); 
        logoutButton.setActionCommand("LogOut");
        logoutButton.addActionListener(userPage);
        
        //PANEL DO TOPO COM OS DOIS BOTOES
          JPanel appointPanel = new JPanel();
          painelPrincipal.add(appointPanel);
          FlowLayout appointFlow = new FlowLayout();
          appointPanel.setLayout(appointFlow);
          appointFlow.setAlignment(FlowLayout.CENTER);
          
          JButton makeAppoint = new JButton("Make an Appointment");
          JButton myAppoint = new JButton("Appointments");
          appointPanel.add(makeAppoint);
          appointPanel.add(myAppoint);
          myAppoint.addActionListener(userPage);
          myAppoint.setActionCommand("appointments");
//          appointPanel.setBackground(Color.green);
         

          
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
        
        
        JPanel phonePanel = new JPanel();
        painelPrincipal.add(phonePanel);
        phone = new JTextField(20);
        JLabel phoneLabel = new JLabel("Phone");
        painelPrincipal.add(phone);
        phonePanel.add(phoneLabel);
        phonePanel.add(phone);       
        
        //MUDAR PARA OPCAO SELECT E NAO JTEXTFIELD
        String[] hairStrings = { "Hair Show", "HairStyle 00", "Bald Barber", "HeadOff Barber", "Cabeleileira Leila" }; 
        JPanel hairPanel = new JPanel();
        painelPrincipal.add(hairPanel);
        JLabel hairLabel = new JLabel("Hairdresser");
        hairPanel.add(hairLabel);

        hairList = new JComboBox(hairStrings); 
        hairList.setSelectedIndex(4); 
        hairPanel.add(hairList);
        System.out.println(hairList.getSelectedItem());
        hairList.setPreferredSize(new Dimension(200,20));
        hairList.addActionListener(userPage);
        hairList.setActionCommand("Hairdresser");
        
        //ESSA PARTE EU AINDA NAO SEI COMO SERA ENCAIXADO, PQ QUERO QUE QUANDO A 
        //PESSOA SELECIONAR O HAIRDRESSER O LOCATION APARECA CONFORME O ENDERECO DA PESSOA
//        JPanel orPanel = new JPanel();
//        painelPrincipal.add(orPanel);
//        JLabel orLabel = new JLabel("Or");
//        orPanel.add(orLabel);
//        orPanel.setLayout(orFlow);
//        
//        String[] locationStrings = { "D01", "D02", "D03", "D04", "D06" }; 
//        JPanel locationPanel = new JPanel();
//        painelPrincipal.add(locationPanel);
//        JLabel locationLabel = new JLabel("Location");
//        locationPanel.add(locationLabel);
//        
//        locationList = new JComboBox(locationStrings); 
//        locationList.setSelectedIndex(4); 
//        locationPanel.add(locationList);
//        System.out.println(locationList.getSelectedItem());
//        locationList.setPreferredSize(new Dimension(200,20));
//        locationList.addActionListener(userPage);
//        locationList.setActionCommand("Location");
        
   
        JPanel datePanel = new JPanel();
        painelPrincipal.add(datePanel);
        JLabel dateLabel = new JLabel("Date");
        datePanel.add(dateLabel);
        
        String[] dateStrings = { "01/02", "02/02", "03/03", "04/04", "05/05" }; 
        
        dateList = new JComboBox(dateStrings); 
        dateList.setSelectedIndex(4); 
        datePanel.add(dateList);
        System.out.println(dateList.getSelectedItem());
        dateList.setPreferredSize(new Dimension(70,20));
        dateList.addActionListener(userPage);
        dateList.setActionCommand("Date");
        
        JPanel hourPanel = new JPanel();
        painelPrincipal.add(hourPanel);
        JLabel hourLabel = new JLabel("Hour");
        hourPanel.add(hourLabel);
        
        String[] hourStrings = { "10:00", "11:00", "13:00", "13:30", "14:00" }; 
        
        hourList = new JComboBox(hourStrings); 
        hourList.setSelectedIndex(4); 
        hourPanel.add(hourList);
        System.out.println(hourList.getSelectedItem());
        hourList.setPreferredSize(new Dimension(70,20));
        hourList.addActionListener(userPage);
        hourList.setActionCommand("Hour");

        
        //BOTAO DE BOOK
         JPanel bookPanel = new JPanel();
        painelPrincipal.add(bookPanel);
        bookButton = new JButton("BOOK");
        bookPanel.add(bookButton);
        bookButton.addActionListener(userPage);
        bookButton.setActionCommand("BOOK");
        
         painelTopo.setBorder(BorderFactory.createLineBorder(Color.gray));
   
        
    }
    
    public void validation3(){
        this.validate();
        this.repaint();
    }
    
}


