package com.july4.learn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CreateProp {
public static void main(String[] args) {
    Properties p= new Properties();
    p.setProperty("url", "jdbc:postgresql://localhost:5432/pgLearnStudents");
    p.setProperty("user", "postgres");
    p.setProperty("pass", "root");
    try (FileOutputStream f = new FileOutputStream("dbProp.txt")) {
        p.store(f, "");
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
}
