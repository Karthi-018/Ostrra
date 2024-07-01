import java.util.Comparator;

public class Student implements Comparable{

    public int marks;
    public String name;
    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
    @Override
    public int compareTo(Object o) {
        Student s=(Student) o;
        if(this.marks<s.marks) return -1; else return 1;
    }
    @Override
    public String toString() {
        return "Student [marks=" + marks + ", name=" + name + "]";
    }
   
    
}
