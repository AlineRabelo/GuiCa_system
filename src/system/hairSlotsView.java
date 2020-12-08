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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

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
        setLocationRelativeTo(null);
        this.setResizable(false);
    
        JPanel panelPrincipal = new JPanel();
        this.add(panelPrincipal, BorderLayout.CENTER);

        FlowLayout centerLayout = new FlowLayout();
        panelPrincipal.setLayout(centerLayout);
        centerLayout.setAlignment(FlowLayout.TRAILING);

        JPanel panelTop = new JPanel();
        this.add(panelTop, BorderLayout.PAGE_START); 
        panelTop.setPreferredSize(new Dimension(350,40));  
            
        FlowLayout labelLoginFlow = new FlowLayout();
        labelLoginFlow.setAlignment(FlowLayout.LEFT);
        JLabel labelTopo = new JLabel("Login hairdresser: Welcome");
        panelTop.add(labelTopo);
        panelTop.setLayout(labelLoginFlow);

        FlowLayout logOutFlow = new FlowLayout();
        logOutFlow.setAlignment(FlowLayout.RIGHT);
        panelPrincipal.add(panelTop);
        logoutButton = new JButton("LogOut");
        panelTop.add(logoutButton);
        panelTop.setLayout(logOutFlow);
        logoutButton.setPreferredSize(new Dimension(80,20)); 
        logoutButton.setActionCommand("LogOut");
        logoutButton.addActionListener(hairSlots);
        
        JPanel appointPanel = new JPanel();
        panelPrincipal.add(appointPanel);
        FlowLayout appointFlow = new FlowLayout();
        appointPanel.setLayout(appointFlow);
        appointFlow.setAlignment(FlowLayout.CENTER);
        appointPanel.setPreferredSize(new Dimension(370,40));
          
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
        panelTop.setBorder(BorderFactory.createLineBorder(Color.gray));


        JPanel tablePanel = new JPanel();
        panelPrincipal.add(tablePanel);
          String[] coluna = {"Date", "Hour"}; 
          String[][] data = callingDB(); 

        JTable table = new JTable(data, coluna);
        table.setPreferredSize(new Dimension(320,200));
        JScrollPane sp = new JScrollPane(table);
        tablePanel.add(sp);         
        tablePanel.add(table);
        table.setBorder(BorderFactory.createLineBorder(Color.gray));
    
}

public void validation(){
    
    this.validate();
    this.repaint();
    
}

 public  String [][]  callingDB(){
            
            String[][] data = new String [20][2];
            
            
            try {

                String dbServer = "jdbc:mysql://apontejaj.com:3306/Aline_2019438?useSSL=false";
                String user = "Aline_2019438";
                String password = "2019438";
                String query = "SELECT * FROM Freeslots";

                // Get a connection to the database
                Connection conn = DriverManager.getConnection(dbServer, user, password);

                // Get a statement from the connection
                Statement stmt = conn.createStatement();

                // Execute the query
                ResultSet rs = stmt.executeQuery(query);

                // Loop through the result set

                int row = 0;
                while (rs.next()) {

                    data[row][0] = rs.getString("date");
                    data[row][1] = rs.getString("hour");
                  

                    row++;       
                }

                // Close the result set, statement and the connection
                rs.close();
                stmt.close();
                conn.close();

                } catch (SQLException se) {
                System.out.println("SQL Exception:");

                // Loop through the SQL Exceptions
                while (se != null) {
                    System.out.println("State  : " + se.getSQLState());
                    System.out.println("Message: " + se.getMessage());
                    System.out.println("Error  : " + se.getErrorCode());

                    se = se.getNextException();
                }
            } catch (Exception e) {
                System.out.println(e);     
        }
            return data;
        }
    
}
