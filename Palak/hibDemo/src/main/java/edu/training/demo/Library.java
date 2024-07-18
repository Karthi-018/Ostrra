package edu.training.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Library {
	@Id
	private int bookid;
	private String book;
	private String author;
	@ManyToMany(mappedBy ="lib")
	List<Student> st= new ArrayList<>();
	public Library(int bookid, String book, String author) {
		super();
		this.bookid = bookid;
		this.book = book;
		this.author = author;
	}
	

}
