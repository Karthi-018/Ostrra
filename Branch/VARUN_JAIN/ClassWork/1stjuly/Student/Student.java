
public class Student implements Comparable<Student> {

    private int marks;
    private String name;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getMarks() {
        return marks;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student name: "+name+", Marks: "+marks;
    }
    @Override
    public int compareTo(Student s) {
       if(this.marks>s.marks){
        return 1;
       }
       return -1;
    }

}