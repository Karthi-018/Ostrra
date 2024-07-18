package edu.training.osttra.osttrahibdemo.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
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
	public int getGid() {
		return gid;
	}
	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getMarksRange() {
		return marksRange;
	}
	public void setMarksRange(int marksRange) {
		this.marksRange = marksRange;
	}
	
	
	
}
