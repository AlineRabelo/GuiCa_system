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
    boolean Comment;
    
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
        this.setResizable(false);

        JPanel panelPrincipal = new JPanel();
        this.add(panelPrincipal, BorderLayout.CENTER);

        FlowLayout centerLayout = new FlowLayout();
        panelPrincipal.setLayout(centerLayout);
        centerLayout.setAlignment(FlowLayout.TRAILING);
  
        JPanel panelTop = new JPanel();
        this.add(panelTop, BorderLayout.PAGE_START); 
        panelTop.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        FlowLayout labelLoginFlow = new FlowLayout();
        labelLoginFlow.setAlignment(FlowLayout.LEFT);
        JLabel labelTopo = new JLabel("Login User: ");
        panelTop.add(labelTopo);

        GridLayout myGrid = new GridLayout(5,1);
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
        logoutButton.addActionListener(comment);
        
        JPanel appointPanel = new JPanel();
        panelPrincipal.add(appointPanel);
        FlowLayout appointFlow = new FlowLayout();
        appointPanel.setLayout(appointFlow);
        appointFlow.setAlignment(FlowLayout.CENTER);
        
        JButton backAppButton = new JButton("Back to Appointments");
        appointPanel.add(backAppButton);
        backAppButton.addActionListener(comment);
        backAppButton.setActionCommand("backApp");
        
        String[] hairStrings = { "Hair Show", "HairStyle 00", "Bald Barber", "HeadOff Barber", "Cabeleileira Leila" }; 
        JPanel hairPanel = new JPanel();
        panelPrincipal.add(hairPanel);
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
        panelPrincipal.add(boxPanel);
        text = new JTextArea(30,29);
        boxPanel.add(text);
        JScrollPane spBox = new JScrollPane(boxPanel);
        panelPrincipal.add(spBox);

          
        JPanel commentPanel = new JPanel();
        panelPrincipal.add(commentPanel);
        JButton commentButton = new JButton("Comment");
        commentPanel.add(commentButton);
        commentButton.addActionListener(comment);
        commentButton.setActionCommand("comment");
        
        
    }
    
    public void validation5(){
        
        this.validate();
        this.repaint();
    }
    
    public String getValueHairdresser(){
        return hairList.getName();
    }
    
    public String getValueComments(){
        return text.getText();
    }

    String commentsDB(userUsuario newComment) {
         return text.getText();
    }

    String hairList() {
        return hairList.getName();
    }
    
   
    
}
