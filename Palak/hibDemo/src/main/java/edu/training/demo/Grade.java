package edu.training.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Grade {
@Id
private int gid;
private String grade;
private int marksRange;
public Grade(int gid, String grade, int marksRange) {
	super();
	this.gid = gid;
	this.grade = grade;
	this.marksRange = marksRange;
}
}
