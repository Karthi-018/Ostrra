import java.util.*;


public class MainClass {
    public static void main(String[] args) {
        List<Student> st = new ArrayList<>();
        st.add(new Student(110,"A"));
        st.add(new Student(120,"B"));
        st.add(new Student(130,"C"));
        sortByMarks sm=new sortByMarks();
        Collections.sort(st,(s1,s2)->{if(s1.marks>s2.marks)return -1; else return 1;} );
        st.forEach(n->System.out.println(n));
    }
}
