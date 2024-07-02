package edu.osttra.training.Custom_compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("ABC", 10));
        students.add(new Student("DEF", 12));
        students.add(new Student("GHI", 15));
        students.add(new Student("JKL", 9));

        students.forEach(student -> System.out.println(student));

        Collections.sort(students);

        System.out.println("************* SORTED ***********");

        students.forEach(student -> System.out.println(student));


        // In below we have to create seprate files called SortByMarks and SortByName
        System.out.println("************* SORTED by Marks by calling class ***********");
        Collections.sort(students, new SortByMarks());
        students.forEach(student -> System.out.println(student));


        System.out.println("************* SORTED by Name by calling class ***********");
        Collections.sort(students, new SortByName());
        students.forEach(student -> System.out.println(student));


        // in below we don't have to create seprate files for SortByMarks and SortByName
        System.out.println("************* SORTED by Marks ***********");
        Comparator<Student> sortByMarks = (s1, s2) -> s1.getMarks()>s2.getMarks()?1:-1;
        Collections.sort(students, sortByMarks);
        students.forEach(student -> System.out.println(student));

        System.out.println("************* SORTED by Name ***********");
        Comparator<Student> sortByName = (s1, s2) -> s1.getName().compareTo(s2.getName());
        Collections.sort(students, sortByName);
        students.forEach(student -> System.out.println(student));
    }
}
