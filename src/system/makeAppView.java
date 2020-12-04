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
        this.setResizable(false);
        
        JPanel panelPrincipal = new JPanel();
        this.add(panelPrincipal, BorderLayout.CENTER);

        FlowLayout centerLayout = new FlowLayout();
        panelPrincipal.setLayout(centerLayout);
        centerLayout.setAlignment(FlowLayout.TRAILING);
            
        JPanel panelTop = new JPanel();
        this.add(panelTop, BorderLayout.PAGE_START);    

        FlowLayout labelLoginFlow = new FlowLayout();
        labelLoginFlow.setAlignment(FlowLayout.LEFT);
        JLabel labelTopo = new JLabel("Login User: ");
        panelTop.add(labelTopo);
        panelTop.setLayout(labelLoginFlow);

        GridLayout myGrid = new GridLayout(10,5);
        panelPrincipal.setLayout(myGrid);
        panelTop.setLayout(myGrid);
            
        FlowLayout logOutFlow = new FlowLayout();
        logOutFlow.setAlignment(FlowLayout.RIGHT);
        panelPrincipal.add(panelTop);
        logoutButton = new JButton("LogOut");
        panelTop.add(logoutButton);
        panelTop.setLayout(logOutFlow);
        logoutButton.setPreferredSize(new Dimension(80,20)); 
        logoutButton.setActionCommand("LogOut");
        logoutButton.addActionListener(userPage);

        JPanel appointPanel = new JPanel();
        panelPrincipal.add(appointPanel);
        FlowLayout appointFlow = new FlowLayout();
        appointPanel.setLayout(appointFlow);
        appointFlow.setAlignment(FlowLayout.CENTER);
          
        JButton makeAppoint = new JButton("Make an Appointment");
        JButton myAppoint = new JButton("My Appointments");
        appointPanel.add(makeAppoint);
        appointPanel.add(myAppoint);
        myAppoint.addActionListener(userPage);
        myAppoint.setActionCommand("appointments");


        FlowLayout orFlow = new FlowLayout();
        orFlow.setAlignment(FlowLayout.LEFT);

        JPanel namePanel = new JPanel();
        panelPrincipal.add(namePanel);
        name = new JTextField(20);
        JLabel nameLabel = new JLabel("Name");
        panelPrincipal.add(name);
        namePanel.add(nameLabel);
        namePanel.add(name);
        
        
        JPanel phonePanel = new JPanel();
        panelPrincipal.add(phonePanel);
        phone = new JTextField(20);
        JLabel phoneLabel = new JLabel("Phone");
        panelPrincipal.add(phone);
        phonePanel.add(phoneLabel);
        phonePanel.add(phone);       
        
        String[] hairStrings = { "Hair Show - 10, Grafton Street", "HairStyle 00 - 06, George Street", "Bald Barber - 10, Henry Street", "HeadOff Barber - 8, Grafton Street", "Cabeleileira Leila - 101, Stephens Green" }; 
        JPanel hairPanel = new JPanel();
        panelPrincipal.add(hairPanel);
        JLabel hairLabel = new JLabel("Hairdresser");
        hairPanel.add(hairLabel);

        hairList = new JComboBox(hairStrings); 
        hairList.setSelectedIndex(4); 
        hairPanel.add(hairList);
        System.out.println(hairList.getSelectedItem());
        hairList.setPreferredSize(new Dimension(250,20));
        hairList.addActionListener(userPage);
        hairList.setActionCommand("Hairdresser");
   
        JPanel datePanel = new JPanel();
        panelPrincipal.add(datePanel);
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
        panelPrincipal.add(hourPanel);
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

        JPanel bookPanel = new JPanel();
        panelPrincipal.add(bookPanel);
        bookButton = new JButton("BOOK");
        bookPanel.add(bookButton);
        bookButton.addActionListener(userPage);
        bookButton.setActionCommand("BOOK");
        panelTop.setBorder(BorderFactory.createLineBorder(Color.gray));
  
    }
    
    public void validation3(){
        this.validate();
        this.repaint();
    }
    
}


