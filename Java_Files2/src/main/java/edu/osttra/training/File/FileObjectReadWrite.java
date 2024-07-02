package edu.osttra.training.File;

import java.io.*;

public class FileObjectReadWrite {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee e = new Employee(1, "ABC", "Developer");
        File file = new File("Object.txt");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e);

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee e1 = (Employee) ois.readObject();

        System.out.println(e1);
    }
}
