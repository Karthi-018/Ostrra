package edu.osttra.training.Custom_compare;

import java.util.Comparator;

public class SortByMarks implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.getMarks()>s2.getMarks()?1:-1;
    }
}
