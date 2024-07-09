package com.learn.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/osttra", "root", "root")) {
            System.out.println("Connected");

            do {
                printMenu();
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        selectStudents(c);
                        break;
                    case 2:
                        insertStudent(c, sc);
                        break;
                    case 3:
                        updateStudent(c, sc);
                        break;
                    case 4:
                    	 deleteStudent(c,sc);
                    	 break;
                    case 0:
                        System.out.println("Exited");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } while (choice != 0);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } 
        
    }

    public static void printMenu() {
        System.out.println("\nStudent Management System");
        System.out.println("1. View Students");
        System.out.println("2. Insert Student");
        System.out.println("3. Update Student");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void selectStudents(Connection c) throws SQLException {
        String query = "SELECT * FROM student";
        PreparedStatement st = c.prepareStatement(query);
        ResultSet rs = st.executeQuery();

        System.out.println("\nStudent List:");
        while (rs.next()) {
            String name = rs.getString("name");
            String marks = rs.getString("marks");
            System.out.println( name + " (" + marks + ")");
        }

    }

    private static void insertStudent(Connection c, Scanner sc) throws SQLException {
        System.out.print("Enter student name: ");
        String name = sc.next();
        System.out.print("Enter student marks: ");
        String marks = sc.next();

        String query = "INSERT INTO student (name, marks) VALUES (?, ?)";
        PreparedStatement st = c.prepareStatement(query);
        st.setString(1, name);
        st.setString(2, marks);
        st.executeQuery();

      

    }

    private static void updateStudent(Connection c, Scanner sc) throws SQLException {
      

        System.out.print("Enter new name : ");
        String newName = sc.nextLine().trim(); 
        System.out.print("Enter new marks : ");
        String newMarks = sc.nextLine().trim(); 

        String query = "UPDATE student SET name =?, marks =? ";
        PreparedStatement st = c.prepareStatement(query);
        st.setString(1, newName);
        st.setString(2, newMarks);
        st.executeQuery();
        
        
}
    private static void deleteStudent(Connection c, Scanner sc) throws SQLException {
        

        System.out.print("Enter name : ");
        String Name = sc.nextLine().trim(); 
        
        String query = "Delete From student where name =? ";
        PreparedStatement st = c.prepareStatement(query);
        st.setString(1, Name);
        st.executeQuery();
        
        
}

    }

    
