/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author benja
 */
import java.sql.*;
public class Vii extends ebcdc{
    public static void main(String[] args) {
        // TODO code application logic here
       //register JDBC driver
      try {
         Class.forName("com.mysql.jdbc.Driver") ;
         //establishing connection to database  
         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/main1","root","");
         System.out.println("Connection Established");
      
         Statement st=conn.createStatement();
         
         String query1="INSERT INTO LOGIN VALUES ('ben','pass')";
         st.executeUpdate(query1);
         System.out.println("Query 1 success");
         
         String query2="SELECT *FROM LOGIN";
         ResultSet rs=st.executeQuery(query2);
         while (rs.next()){
        String name=rs.getString("username");
        String pass=rs.getString("password");
                
         System.out.print("Name:"+name+"   Password: "+pass);
         }  
      System.out.println("Results obtained");
      }catch(Exception e){
          System.out.println("error");
      }
      
      }

}
    

