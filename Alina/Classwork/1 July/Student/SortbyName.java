import java.util.Comparator;
public class SortbyName implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2)
    {
        return s1.getNames().compareTo(s2.getNames());
    }
    
}
