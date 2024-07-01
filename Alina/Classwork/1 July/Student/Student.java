public class Student implements Comparable<Student>
{
private String sname;
private int smarks;
public Student(String sname,int smarks)
{
   this.sname=sname;
   this.smarks=smarks;
}
public String getNames()
{
    return sname;
}
public int getMarks()
{
    return smarks;
}
@Override
public String toString()
{
     return "Stuent name:"+ sname+ ",Marks:"+ smarks;
            
}
@Override
public int compareTo(Student s)
{
    if (this.smarks>s.smarks)
    return -1;
    else
    return 1;
}

}