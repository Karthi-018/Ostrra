package ed.osttra.hibernateDemo.HibernateDemo.dao;

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
	private int bookId;
	private String book;
	private String author;
	
	
	public SchoolLib(int bookId, String book, String author) {
		this.bookId=bookId;
		this.book=book;
		this.author=author;
	}
}
	

