package ed.osttra.hibernateDemo.HibernateDemo.dao;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Grade {
	
	@Id
	private int gid;
	private String grade;
	private int marksRange;
	public Grade(int gid, String grade, int marksRange) {
		this.gid=gid;
		this.grade=grade;
		this.marksRange=marksRange;
	}
}
