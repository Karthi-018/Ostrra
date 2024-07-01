import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CollectionComparison{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("palak",85));
        students.add(new Student("def",75));
        students.add(new Student("ghi",65));
        students.add(new Student("abc",55));
        students.add(new Student("srikant",95));

        students.forEach(s -> System.out.println(s));
        Collections.sort(students);
        System.out.println("******************SORTED************");
        students.forEach(s -> System.out.println(s));

        
        System.out.println("******************SORTED By MARKS************");
        Collections.sort(students,(s1,s2) -> s1.mark>s2.mark? -1 : 1);
        students.forEach(s -> System.out.println(s));

        System.out.println("********Sorted by name****************");



        }
    }
