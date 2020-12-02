/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aline
 */
public class loginModel {

       public boolean loginPage(userUsuario user){
        
        boolean result = false;
        
        
        try {

            String dbServer = "jdbc:mysql://apontejaj.com:3306/Aline_2019438?useSSL=false";
            String dbUser = "Aline_2019438";
            String dbPassword = "2019438";
            String query = "SELECT * FROM LoginClient WHERE userEmail = '" + user.getEmail() + "' AND userPassword = '" + user.getPassword() + "';";
            

            // Get a connection to the database
            Connection conn = DriverManager.getConnection(dbServer, dbUser, dbPassword);

            // Get a statement from the connection
            Statement stmt = conn.createStatement();

            // Execute the query
            ResultSet rs = stmt.executeQuery(query);
            
            // Loop through the result set
            if (rs.next()) {
                result = true;
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
        
        return result;
 
         
        
    }
       
       public boolean login2(userUsuario user){
        
        boolean resultHair = false;
        
        
        try {

            String dbServer = "jdbc:mysql://apontejaj.com:3306/Aline_2019438?useSSL=false";
            String dbUser = "Aline_2019438";
            String dbPassword = "2019438";
            String query = "SELECT * FROM LoginHair WHERE hairEmail = '" + user.getEmail() + "' AND hairPassword = '" + user.getPassword() + "';";
            

            // Get a connection to the database
            Connection conn = DriverManager.getConnection(dbServer, dbUser, dbPassword);

            // Get a statement from the connection
            Statement stmt = conn.createStatement();

            // Execute the query
            ResultSet rs = stmt.executeQuery(query);
            
            // Loop through the result set
            if (rs.next()) {
                resultHair = true;
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
        
        return resultHair;
 
         
        
    }
       
       
    
}
