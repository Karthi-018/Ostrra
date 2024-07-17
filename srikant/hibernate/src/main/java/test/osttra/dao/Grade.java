package test.osttra.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="grade")
public class Grade {
	
	@Id
	private int gid;
	private String grade;
	private int marks;
	
	public Grade(int gid, String grade, int marks) {
		this.gid = gid;
		this.grade = grade;
		this.marks = marks;
	}
}
