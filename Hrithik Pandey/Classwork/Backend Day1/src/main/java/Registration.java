import java.util.*;
public class Registration {
	private String fname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	private String lname;
	private String uname;
	private String pass;
	public Registration(String fname, String lname, String uname, String pass) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.uname = uname;
		this.pass = pass;
		
	}
	
}
