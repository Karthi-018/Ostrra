package FileManagement;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManageMain {
public static void main(String[] args) {
    File f= new File("abc.txt");
    try {
        FileOutputStream fo=new FileOutputStream(f);
        DataOutputStream do1=new DataOutputStream(fo);
        do1.writeUTF("hi writing in file");

        File f2=new File("abc.txt");
        FileInputStream fi= new FileInputStream(f2);
        DataInputStream di1=new DataInputStream(fi);
        System.out.println(di1.readUTF());
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
}
