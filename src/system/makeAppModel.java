/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aline
 */
public class makeAppModel {
    
    userUsuario loginUser;
    
    
    public  void createAccDB(userUsuario loginUser){

            try {
         
                String dbServer = "jdbc:mysql://apontejaj.com:3306/Aline_2019438?useSSL=false";
                String user = "Aline_2019438";
                String password = "2019438";
                String query = "INSERT INTO LoginClient(userName, userEmail, userAddress, userPhone, userPassword) VALUES ('" + loginUser.getName() + "','" + loginUser.getEmail() + "','" + loginUser.getAddress()+ "','" + loginUser.getPhone()+ "','" + loginUser.getPassword()+ "')" ;


               Connection conn = DriverManager.getConnection(dbServer, user, password);

               Statement stmt = conn.createStatement();
               stmt.execute(query);


              
                stmt.close();
                conn.close();

                } catch (SQLException se) {
                System.out.println("SQL Exception:");

                while (se != null) {
                    System.out.println("State  : " + se.getSQLState());
                    System.out.println("Message: " + se.getMessage());
                    System.out.println("Error  : " + se.getErrorCode());

                    se = se.getNextException();
                }
            } catch (Exception e) {
                System.out.println(e);     
        }
          
        }
    
}
