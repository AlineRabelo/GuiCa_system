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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author aline
 */
public class commentsView extends JFrame{
    
    
    private JButton logoutButton;
    
    JTextArea text;
    commentsController comment;
    JComboBox hairList = null;
    
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
//            painelTopo.setLayout(labelLoginFlow);
            
         //GRIDLAYOUT
         GridLayout minhaGrid = new GridLayout(5,1);
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
        hairList.addActionListener(comment);
        hairList.setActionCommand("hairdresser");
        
        JPanel boxPanel = new JPanel();
          painelPrincipal.add(boxPanel);
//          boxPanel.setBackground(Color.yellow);
          text = new JTextArea(30,29);
          boxPanel.add(text);
          JScrollPane spBox = new JScrollPane(boxPanel);
          painelPrincipal.add(spBox);

          
         JPanel commentPanel = new JPanel();
         painelPrincipal.add(commentPanel);
         JButton commentButton = new JButton("Comment");
         commentPanel.add(commentButton);
        
        
    }
    
    public void validation5(){
        
        this.validate();
        this.repaint();
    }
    
}
