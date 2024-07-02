public class Student implements Comparable<Student>{
    public String name;
    public int marks;


 public Student(int m,String N){
    this.name=N;
    this.marks=m;
 }
 @Override
 public String toString(){
    return this.name +" "+ this.marks;
 }

@Override
public int compareTo(Student o){
    if(this.marks<o.marks){
        return -1;
    }else{
        return 1;
    }
}
}