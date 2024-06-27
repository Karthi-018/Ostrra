 public class Details{
	
	public static void main(String args[]){
		PersonPortfolio p = new PersonPortfolio();
		p.id = "1";
		p.pName="ABC";
		p.mobileNo=1234567893;
		p.skills="Python";
		p.address="Delhi";
		CompanyPortfolio c = new CompanyPortfolio();
		c.id="C101";
		c.name="osttra";
		c.address="Gurgaon";
	System.out.println(c);
	System.out.println(p);
	}
}

class Portfolio{
	public String id;
	public String name;
	
}

	
class CompanyPortfolio extends Portfolio{
	public String address;
	public String productName;
	
	public String toString(){
		return id+"\n"+name+"\n"+address+"\n"+productName ;
	}
}
class PersonPortfolio extends CompanyPortfolio{
	public String pName;
	public int mobileNo;
	public String skills;
	
	public String toString(){
		return id+"\n"+name+"\n"+address+"\n"+productName+"\n"+pName+"\n"+mobileNo+"\n"+skills ;
	}
}


