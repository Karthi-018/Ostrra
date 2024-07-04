package com.july4.learn;

import java.beans.Statement;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) throws IOException {
        FileInputStream f = new FileInputStream("dbProp.txt");
        Properties p = new Properties();
        p.load(f);
        try (Connection conn = DriverManager.getConnection(p.getProperty("url"), p.getProperty("user"),
                p.getProperty("pass"))) {

            Scanner sc = new Scanner(System.in);
            String choice = "";
            do {
                System.out.println(
                        "\n\n\n\n\nENTER YOUR CHOICE \n1.list All\n2.Update Marks\n3.Remove Student\n4.insert Data\n5.SEARCH\n6.EXIT\n\n\n\n\n");
                choice = sc.nextLine();
                switch (choice) {
                    case "1":
                        printAll(conn);
                        break;
                    case "2":
                        updateMarks(conn);
                        break;
                    case "3":
                        delStudent(conn);
                        break;
                    case "4":
                        insertData(conn);
                        break;
                    case "5":
                        searchStudent(conn);
                        break;
                    case "6":
                        System.out.println("exiting");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("bad input");
                        break;
                }
            } while (true);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void searchStudent(Connection conn) throws SQLException {
        Scanner sc = new Scanner(System.in);

        PreparedStatement ps = conn.prepareStatement("select * from stTable where rollno = ?");
        System.out.println("ENTER ROLL NO");
        ps.setInt(1, sc.nextInt());
        ResultSet rs = ps.executeQuery();
        int count = 0;
        while (rs.next()) {
            count++;
            for (int i = 1; i <= 4; i++)
                System.out.print(rs.getString(i) + " ");
            System.out.println();
        }
        if (count == 0)
            System.out.println("NO STUDENT FOUND");
    }

    private static void delStudent(Connection conn) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("DELETE FROM STTABLE  WHERE ROLLNO = ?");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ROLL NO");
        ps.setInt(1, sc.nextInt());
        int res = ps.executeUpdate();
        if (res > 0)
            System.out.println("done");
        else
            System.out.println("BAD INPUT");
    }

    private static void updateMarks(Connection conn) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("UPDATE STTABLE SET MARKS = ? WHERE ROLLNO = ?");
        System.out.println("ENTER MARKS");
        Scanner sc = new Scanner(System.in);
        ps.setInt(1, sc.nextInt());
        System.out.println("ENTER ROLL NO");
        ps.setInt(2, sc.nextInt());
        int res = ps.executeUpdate();
        if (res > 0)
            System.out.println("done");
        else
            System.out.println("BAD INPUT");
    }

    private static void insertData(Connection conn) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("insert into sttable (name,class,marks) values(?,?,?)");
        System.out.println("ENTER NAME");
        Scanner sc = new Scanner(System.in);
        ps.setString(1, sc.nextLine());
        System.out.println("ENTER Class");
        ps.setInt(2, sc.nextInt());
        System.out.println("ENTER Marks");
        ps.setInt(3, sc.nextInt());
        int res = ps.executeUpdate();
        if (res > 0)
            System.out.println("done");
    }

    private static void printAll(Connection conn) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("select * from stTable");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            for (int i = 1; i <= 4; i++)
                System.out.print(rs.getString(i) + " ");
            System.out.println();
        }
    }
}
