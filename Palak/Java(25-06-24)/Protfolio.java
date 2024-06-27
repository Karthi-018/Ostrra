class Portfolio{
	public String id;
	public String name;
	
	}

	
class CompanyPortfolio extends Portfolio{
	public String address;
	public String productName;
}
class PersonPortfolio extends CompanyPortfolio{
	public String pName;
	public int mobileNo;
	public String skills;
	
}

class Details{
	
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
		
	}
}
