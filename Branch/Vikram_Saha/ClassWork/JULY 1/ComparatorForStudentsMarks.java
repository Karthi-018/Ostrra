import java.util.Comparator;

public class ComparatorForStudentsMarks implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Student s1=(Student) o1;
        Student s2=(Student) o2;

        if(s1.marks>s2.marks) return -1; else return 1;
    }

}