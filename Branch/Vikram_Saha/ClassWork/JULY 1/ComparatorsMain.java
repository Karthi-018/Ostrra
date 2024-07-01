import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ComparatorsMain {

    public static void main(String[] args) {
        List<Student> lis = new ArrayList<>();
        lis.add(new Student(110, "B"));
        lis.add(new Student(10, "A"));
        lis.add(new Student(30, "D"));
        lis.add(new Student(20, "C"));

        Collections.sort(lis, new ComparatorForStudentsName());
        lis.forEach(n -> System.out.println(n));
        Collections.sort(lis, new ComparatorForStudentsMarks());
        lis.forEach(n -> System.out.println(n));
        Collections.sort(lis, (s1, s2) -> s1.name.compareTo(s2.name));
        Collections.sort(lis, (s1, s2) -> {
            if (s1.marks > s2.marks)
                return -1;
            else
                return 1;
        });

    }
}
