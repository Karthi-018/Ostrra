package edu.osttra.training.Custom_compare;

public class Student implements Comparable<Student> {
    private String name;
    private int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }


    @Override
    public String toString() {
        return "Student name: "+name+", marks: "+marks;
    }

    @Override
    public int compareTo(Student o) {
        //  To compare according to Marks
        // if(this.name. o.name) {
        //     return 1;
        // } else {
        //     return -1;
        // }

        return this.name.compareTo(name);
    }

}

