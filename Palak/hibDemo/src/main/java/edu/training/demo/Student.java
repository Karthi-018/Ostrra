package edu.training.demo;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class Student {
@Id
private int sid;
private String sName;
private int marks;
@OneToOne
private Grade grade;
@ManyToMany
List<Library> lib= new ArrayList<>();




public Student(int sid, String sName, int marks, Grade grade,List<Library> lib) {
	super();
	this.sid = sid;
	this.sName = sName;
	this.marks = marks;
	this.grade = grade;
	this.lib=lib;
}




}
