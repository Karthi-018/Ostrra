package edu.osttra.training.File;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("TestFile.txt");
        FileOutputStream fos = new FileOutputStream(file);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("Hello this is for testing");

        FileInputStream f = new FileInputStream(file);
        DataInputStream d = new DataInputStream(f);
        String result = d.readUTF();
        System.out.println(result);
    }
}
