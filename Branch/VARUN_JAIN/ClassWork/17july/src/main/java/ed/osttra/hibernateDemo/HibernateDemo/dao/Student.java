package ed.osttra.hibernateDemo.HibernateDemo.dao;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Id
	private int id;
	private String sname;
	private int marks;
	@OneToOne
	private Grade grade;
	@OneToMany
	private List<SchoolLib> lib = new ArrayList<>();
	
	public Student(int id, String sname, int marks, Grade grade,List<SchoolLib> lib) {
		this.id=id;
		this.sname=sname;
		this.marks=marks;
		this.grade=grade;
		this.lib=lib;
	}
}
