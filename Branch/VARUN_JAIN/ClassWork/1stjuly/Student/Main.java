import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Varun",99));
        students.add(new Student("Varun2",99));
        students.add(new Student("Yashi",101));
        students.add(new Student("Alina",96));
        students.add(new Student("Vidhi",100));

        students.forEach(student -> System.out.println(student));

        Collections.sort(students);

        System.out.println("****************************");

        students.forEach(student -> System.out.println(student));

        System.out.println("****************************");

        SortByMarks sortmarks = new SortByMarks();

        Collections.sort(students, sortmarks);

        students.forEach(student -> System.out.println(student));

        System.out.println("****************************");

        SortByName sortName = new SortByName();

        Collections.sort(students, sortName);

        students.forEach(student -> System.out.println(student));

        System.out.println("****************************");

        
    }
}
