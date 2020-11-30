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
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author aline
 */
public class hairBookView extends JFrame {
    
    hairBookController hairBook;
    
    private JButton logoutButton;
    


public hairBookView (hairBookController hairBook){

        this.hairBook = hairBook;
        hairBookSetter();
        validation();


}

public void hairBookSetter(){

    this.setVisible(true);
    this.setSize(370,360);
    this.setTitle("Hairdresser Books");
    BorderLayout fLay = new BorderLayout();
    this.setLayout(fLay);
    setLocationRelativeTo(null);
    
    
    
    //PANEL PRINCIPAL ONDE VAI TODOS OS PANELS
        JPanel painelPrincipal = new JPanel();
            this.add(painelPrincipal, BorderLayout.CENTER);
//            painelPrincipal.setBackground(Color.RED);
            
            
        //FLOWLAYOUT CENTRAL
        FlowLayout centerLayout = new FlowLayout();
//            painelPrincipal.setLayout(centerLayout);
            centerLayout.setAlignment(FlowLayout.TRAILING);
            

        //PANEL DO TOPO PRINCIPAL
         JPanel painelTopo = new JPanel();
            this.add(painelTopo, BorderLayout.PAGE_START);    
//            painelTopo.setBackground(Color.BLUE);
            painelTopo.setPreferredSize(new Dimension(350,40));

            
        //LABEL DO TOPO
        FlowLayout labelLoginFlow = new FlowLayout();
        labelLoginFlow.setAlignment(FlowLayout.LEFT);
        JLabel labelTopo = new JLabel("Login hairdresser: ");
            painelTopo.add(labelTopo);
            painelTopo.setLayout(labelLoginFlow);
            
         //GRIDLAYOUT
         GridLayout minhaGrid = new GridLayout(3,1);
//            painelPrincipal.setLayout(minhaGrid);
//            painelTopo.setLayout(minhaGrid);  
            
        //BOTAO DO LOGOUT
        FlowLayout logOutFlow = new FlowLayout();
        logOutFlow.setAlignment(FlowLayout.RIGHT);
        painelPrincipal.add(painelTopo);
        logoutButton = new JButton("LogOut");
        painelTopo.add(logoutButton);
        painelTopo.setLayout(logOutFlow);
        logoutButton.setPreferredSize(new Dimension(80,20)); 
        logoutButton.setActionCommand("LogOut");
        logoutButton.addActionListener(hairBook);
        
        //PANEL DO TOPO COM OS DOIS BOTOES
          JPanel appointPanel = new JPanel();
          painelPrincipal.add(appointPanel);
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
          myAppoint.addActionListener(hairBook);
          myAppoint.setActionCommand("freeSlots");
          myComments.addActionListener(hairBook);
          myComments.setActionCommand("comments");
//          appointPanel.setBackground(Color.green);

          painelTopo.setBorder(BorderFactory.createLineBorder(Color.gray));
          
          JPanel tabelaPanel = new JPanel();
          painelPrincipal.add(tabelaPanel);
//          tabelaPanel.setBackground(Color.ORANGE);
          tabelaPanel.setPreferredSize(new Dimension(370,220));

          String[] coluna = {"Status", "Client", "Date", "Hour"}; 
          String[][] data = callingDB(); 
  
          JTable tabela = new JTable(data, coluna);
          JScrollPane sp = new JScrollPane(tabela);
          tabelaPanel.add(sp);         
          tabelaPanel.add(tabela);
          tabela.setBorder(BorderFactory.createLineBorder(Color.gray));
}

         public void validation(){
    
                this.validate();
                this.repaint();

            }
         
         
        public  String [][]  callingDB(){
            
            String[][] data = new String [10][5];
            
            
            try {

                String dbServer = "jdbc:mysql://apontejaj.com:3306/Aline_2019438?useSSL=false";
                String user = "Aline_2019438";
                String password = "2019438";
                String query = "SELECT * FROM Booked ";

                // Get a connection to the database
                Connection conn = DriverManager.getConnection(dbServer, user, password);

                // Get a statement from the connection
                Statement stmt = conn.createStatement();

                // Execute the query
                ResultSet rs = stmt.executeQuery(query);

                // Loop through the result set

                int row = 0;
                while (rs.next()) {

                    data[row][0] = rs.getString("StatusBook");
                    data[row][1] = rs.getString("client_name");
                    data[row][2] = rs.getString("date");
                    data[row][3] = rs.getString("time");

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