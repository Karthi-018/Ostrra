package com.learn.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class jdbclearn1 {
	
	
public static void main(String[]args) {
        
        try(Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/osttra","root", "root"))
        {
//            Class.forName("com.mysql.cj.jdbc.Driver");
        	System.out.println("Hi");
        	Scanner sc = new Scanner(System.in);
        	
//        
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	String marks = sc.next();
  	      String query1 = "select * from student where marks > ?";
	      
  	      PreparedStatement ps = c.prepareStatement(query1);
  	      ps.setString(1, marks);
  	      ResultSet rs = ps.executeQuery();
  	      while(rs.next()) {
  	    	  System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3));
  	      }
//            Statement s = c.createStatement();
//            int count = s.executeUpdate("insert into student values(1,'Varun','45'),(2,'yashi','99'),(3,'Gaurav','0')");
//            System.out.println(count);
        }
        catch(Exception e) {
            
            System.out.println(e.getMessage());
            
        }
	

        
    }

}
