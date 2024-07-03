import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIoMain {
    public static void main(String[] args) throws IOException {
        File file = new File("myfile.txt");
        FileOutputStream fos = new FileOutputStream(file);
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("Hi ! welcome to IO files.");
        dos.writeUTF("Testing");


        FileInputStream fis = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fis);
        String msg = dis.readUTF();
        System.out.println(msg);
    }
    
}
