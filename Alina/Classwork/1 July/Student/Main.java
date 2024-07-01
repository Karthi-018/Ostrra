import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
    List<Student> students=new ArrayList<>();
    students.add(new Student("Alina", 85));
    students.add(new Student("Palak", 70));
    students.add(new Student("Shiva", 65));
    students.add(new Student("Shivani", 73));
    students.add(new Student("Shubham", 55));
    students.forEach(student -> System.out.println(student));
    Collections.sort(students);
    System.out.println("*************************");
    students.forEach(student ->System.out.println(student));
    System.out.println("*************************");
    SortByMarks sortmarks= new SortByMarks();
    Collections.sort(students, sortmarks);
    students.forEach(student ->System.out.println(student));
    System.out.println("*************************");
    SortbyName sortnames= new SortbyName();
    Collections.sort(students, sortnames);
    students.forEach(student ->System.out.println(student));
    System.out.println("*************************");
}
}
