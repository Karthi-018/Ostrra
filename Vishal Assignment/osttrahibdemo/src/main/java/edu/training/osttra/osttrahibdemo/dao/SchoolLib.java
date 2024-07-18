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
public class SchoolLib {
	@Id
	private int bookid;
	private String book;
	private String author;
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public SchoolLib(int bookid, String book, String author) {
		super();
		this.bookid = bookid;
		this.book = book;
		this.author = author;
	}
	
}
