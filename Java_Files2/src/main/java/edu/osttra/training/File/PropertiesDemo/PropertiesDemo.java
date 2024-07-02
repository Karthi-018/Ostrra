package edu.osttra.training.File.PropertiesDemo;

import java.io.*;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();

        OutputStream os = new FileOutputStream("demo.properties");

        p.setProperty("Name", "ABC");
        p.setProperty("Dept", "Developer");

        p.store(os,"Properties Demo");

        InputStream is = new FileInputStream("demo.properties");

        p.load(is);

        System.out.println(p.getProperty("Name"));
        System.out.println(p.getProperty("Dept"));

        p.list(System.out);
    }
}
