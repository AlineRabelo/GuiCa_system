/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

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

/**
 *
 * @author aline
 */
public class hairSlotsView extends JFrame {
    
    hairSlotsController hairSlots;
    JComboBox dateList = null;
    JComboBox hourList = null;
    
    private JButton logoutButton;
    
    
public hairSlotsView (hairSlotsController hairSlots){
    
    this.hairSlots = hairSlots;
    hairSlotsSetter();
    validation();
}

public void hairSlotsSetter(){
    
    this.setVisible(true);
    this.setSize(370,360);
    this.setTitle("Hairdresser Free Slots");
    BorderLayout fLay = new BorderLayout();
    this.setLayout(fLay);
    
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
        JLabel labelTopo = new JLabel("Login hairdresser: ");
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
        logoutButton.addActionListener(hairSlots);
        
        //PANEL DO TOPO COM OS DOIS BOTOES
          JPanel appointPanel = new JPanel();
          painelPrincipal.add(appointPanel);
          FlowLayout appointFlow = new FlowLayout();
          appointPanel.setLayout(appointFlow);
          appointFlow.setAlignment(FlowLayout.CENTER);
          
          JButton makeAppoint = new JButton("Booked");
          JButton myAppoint = new JButton("Free Slots");
          JButton myComments = new JButton("Client Comments");
          appointPanel.add(makeAppoint);
          appointPanel.add(myAppoint);
          appointPanel.add(myComments);
          makeAppoint.addActionListener(hairSlots);
          makeAppoint.setActionCommand("booked");
          myComments.addActionListener(hairSlots);
          myComments.setActionCommand("comments");
//          appointPanel.setBackground(Color.green);

          painelTopo.setBorder(BorderFactory.createLineBorder(Color.gray));
          
          JPanel slotPanel = new JPanel();
          painelPrincipal.add(slotPanel);
//          slotPanel.setBackground(Color.orange);
          
          JLabel dateLabel = new JLabel("Date");
          slotPanel.add(dateLabel);
          
          String[] dateStrings = { "01/02", "02/02", "03/03", "04/04", "05/05" }; 
        
            dateList = new JComboBox(dateStrings); 
            dateList.setSelectedIndex(4); 
            slotPanel.add(dateList);
            System.out.println(dateList.getSelectedItem());
            dateList.setPreferredSize(new Dimension(70,20));
//            dateList.addActionListener(userPage);
            dateList.setActionCommand("Date");
            
            JLabel hourLabel = new JLabel("Hour");
            slotPanel.add(hourLabel);

            String[] hourStrings = { "10:00", "11:00", "13:00", "13:30", "14:00" }; 

            hourList = new JComboBox(hourStrings); 
            hourList.setSelectedIndex(4); 
            slotPanel.add(hourList);
            System.out.println(hourList.getSelectedItem());
            hourList.setPreferredSize(new Dimension(70,20));
//            hourList.addActionListener(userPage);
            hourList.setActionCommand("Hour");
    
}

public void validation(){
    
    this.validate();
    this.repaint();
    
}
    
}
