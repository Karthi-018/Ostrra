
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileObjectReadWrite {
     public static void main(String[] args)throws ClassNotFoundException,IOException {
         Employee e = new Employee(1,"yash","cs");
         File file = new File("object.txt");
         FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream dos = new ObjectOutputStream(fos);
        dos.writeObject(e);

         FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
       Employee e1 =(Employee) ois.readObject();
       ois.close();
       fis.close();
       System.out.println("Object read from object.txt: " + e1);
     }
    
}
