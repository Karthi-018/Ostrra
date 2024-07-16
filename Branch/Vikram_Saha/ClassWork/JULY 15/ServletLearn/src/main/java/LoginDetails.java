
public class LoginDetails {
	String uName;//=request.getParameter("uName");
	String pass;//=request.getParameter("pass");
	String lName;//=request.getParameter("lName");
	String fName;//=request.getParameter("fName");
	public LoginDetails(String uName, String pass, String lName, String fName) {
		super();
		this.uName = uName;
		this.pass = pass;
		this.lName = lName;
		this.fName = fName;
	}
	
	

}
