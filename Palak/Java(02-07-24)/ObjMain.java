import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjMain {
    public static void main(String[] args) throws Exception{
        File file = new File("ObjectDemo.txt");
        FileOutputStream fos = new FileOutputStream(file);
        Student s = new Student(1, "ABC", "Java");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s1 = (Student)ois.readObject();
        System.out.println(s1);



        
    }
}
