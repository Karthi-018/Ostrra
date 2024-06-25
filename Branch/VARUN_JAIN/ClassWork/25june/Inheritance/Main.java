
public class Main{
    public static void main(String a[]){
	  Engineer e = new Engineer();
	  e.engId = "100";
	  e.engName = "Vvv";
	  
	  e.displayEngDetails();
	  
	  System.out.println("*********");
	  
	  Profession p = new Profession();
	  p.engId = "200";
	  p.engName = "hhh";
	  p.role = "Dev";
	  p.major = "CS";
	  
	  p.displayEngDetails();
	  p.displayProfDetails();
	  
	  System.out.println("*********");

	  OnRole o = new OnRole();
	  o.onrole = "Full Time";
	  o.engId = "300";
	  o.engName = "ttt";
	  o.role = "Infra";
	  o.major = "CST";
	  
	  o.displayEngDetails();
	  o.displayProfDetails();
	  o.displayOnRDetails();

	  System.out.println("*********");
	  
	  Unemployed u = new Unemployed();
	  u.engId = "250";
	  u.engName = "kkk";
	  u.unemp = "Unplaced";
	  
	  u.displayEngDetails();
	  u.displayUnempDetails();	
      System.out.println("*********");
	  
	
	}


}