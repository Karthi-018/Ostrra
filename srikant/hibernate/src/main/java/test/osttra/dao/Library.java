package test.osttra.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="library")
public class Library {
	
	@Id
	private int bid;
	private String name;
	private String author;
	
	public Library(int bid, String name, String author) {
		this.bid = bid;
		this.name = name;
		this.author = author;
	}
}
