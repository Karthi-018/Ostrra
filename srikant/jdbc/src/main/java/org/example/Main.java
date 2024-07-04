package org.example;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try{
            Properties p = new Properties();
            FileReader reader = new FileReader("demo\\src\\main\\resources\\Config.properties");
            p.load(reader);
            String driver = p.getProperty("driver");
            String url = p.getProperty("url");
            String user = p.getProperty("user");
            String password = p.getProperty("password");

            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database");

            Scanner sc = new Scanner(System.in);
            int option = 0;
            boolean exit = true;

            while (exit) {
                System.out.println("Enter your input. 1 to view table, 2 to insert, 3 to update, 4 to delete rows, 5 to exit");
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        String query1 = "select * from employee";
                        Statement st1 = conn.createStatement();
                        ResultSet rs1 = st1.executeQuery(query1);
                        while (rs1.next()) {
                            System.out.println("EID - " + rs1.getInt(1) + " ENAME - " + rs1.getString(2) + " SALARY - " + rs1.getDouble(3));
                        }
                        break;
                    case 2:
                        System.out.println("Insert values for the new entry - ");
                        int empid = sc.nextInt();
                        String empname = sc.next();
                        double empsalary = sc.nextDouble();

                        String query2 = "INSERT INTO employee (eid, ename, salary) VALUES (?, ?, ?)";
                        PreparedStatement pst2 = conn.prepareStatement(query2);
                        pst2.setInt(1, empid);
                        pst2.setString(2, empname);
                        pst2.setDouble(3, empsalary);

                        int count2 = pst2.executeUpdate();
                        System.out.println(count2 + " rows inserted");
                        break;
                    case 3:
                        System.out.println("Enter the eid to update for the specified entry - ");
                        int eid = sc.nextInt();
                        System.out.println("Enter the column name (ename or salary) - ");
                        String response = sc.next();

                        if (response.equalsIgnoreCase("ename")) {
                            System.out.println("Enter the new name - ");
                            String ename = sc.next();
                            String query3a = "UPDATE employee SET ename = ? WHERE eid = ?";
                            PreparedStatement pst3a = conn.prepareStatement(query3a);
                            pst3a.setString(1, ename);
                            pst3a.setInt(2, eid);
                            int count3a = pst3a.executeUpdate();
                            System.out.println(count3a + " rows updated");
                        } else if (response.equalsIgnoreCase("salary")) {
                            System.out.println("Enter the new salary - ");
                            double salary = sc.nextDouble();
                            String query3b = "UPDATE employee SET salary = ? WHERE eid = ?";
                            PreparedStatement pst3b = conn.prepareStatement(query3b);
                            pst3b.setDouble(1, salary);
                            pst3b.setInt(2, eid);
                            int count3b = pst3b.executeUpdate();
                            System.out.println(count3b + " rows updated");
                        }
                        break;
                    case 4:
                        System.out.println("Enter the eid of the employee you want to delete - ");
                        int deleteEid = sc.nextInt();

                        String query4 = "DELETE FROM employee WHERE eid = ?";
                        PreparedStatement pst4 = conn.prepareStatement(query4);
                        pst4.setInt(1, deleteEid);

                        int count4 = pst4.executeUpdate();
                        System.out.println(count4 + " rows deleted");
                        break;
                    case 5:
                        exit = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please enter a valid option.");
                }
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
