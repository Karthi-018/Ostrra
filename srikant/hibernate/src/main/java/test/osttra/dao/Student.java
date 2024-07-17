package test.osttra.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="student")
public class Student {
	@Id
	private int sid;
	private String name;
	private int marks;
	
	@OneToOne
	private Grade grade;
	
	@OneToMany
	private List<Library> l = new ArrayList<>();
	
	public Student(int sid, String name, int marks, Grade grade, List<Library> l) {
		this.sid = sid;
		this.marks = marks;
		this.name = name;
		this.grade = grade;
		this.l = l;
	}
	
	
}
