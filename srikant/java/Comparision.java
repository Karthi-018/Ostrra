import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Comparision {

    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> nums = new ArrayList<>();

        for(int i = 0; i<50; i++){
            nums.add(r.nextInt(100));
        }

        // nums.forEach(n -> System.out.print(n + " "));
        // Collections.sort(nums);
        // nums.forEach(n -> System.out.print(n + " "));


        List<Student> stu = new ArrayList<>();
        stu.add(new Student("abc", 80));
        stu.add(new Student("def", 60));
        stu.add(new Student("ghi", 90));
        stu.add(new Student("xyz", 45));
        stu.add(new Student("mno", 70));

        // stu.forEach(n -> System.out.println(n + " "));
        // Collections.sort(stu);
        // System.out.println("*************************");
        // stu.forEach(n -> System.out.println(n + " "));

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("abc", 80000));
        emp.add(new Employee("def", 60000));
        emp.add(new Employee("ghi", 90000));
        emp.add(new Employee("xyz", 45000));
        emp.add(new Employee("mno", 70000));


        emp.forEach(n -> System.out.println(n + " "));
        Collections.sort(emp, new CompareSalary());
        System.out.println("*************************");
        emp.forEach(n -> System.out.println(n + " "));

    }    
}

class Student implements Comparable<Student>{

    String name;
    int marks;
    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Name - " + name + " marks - " + marks;
    }

    @Override
    public int compareTo(Student o){
        if(this.marks > o.marks)
            return 1;
        else
            return -1;
    }
}

class Employee{
    String name;
    int salary;

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name,int salary) {
        this.name=name;
        this.salary=salary;
    }
    

    @Override
    public String toString() {
        return "Name - " + name + " salary - " + salary;
    }
}

class CompareSalary implements Comparator<Employee>{
    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getSalary() > e2.getSalary())
            return 1;
        else
            return -1;
    }
}