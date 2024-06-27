class PersonProtfolio{
	public String compName;
	public String name;
	protected int mobileNo;
	public String skill;
	
	public void displayPortfolioDetails(){
		System.out.println("Person Details: "+compName+"\n"+name+"\n"+mobileNo+"\n"+skill);
	}
	
	public static void main(String args[]){
		PersonProtfolio p = new PersonProtfolio();
		p.compName="Osttra";
		p.name="Palak";
		p.mobileNo=1234567893;
		p.skill="Python";
		
		p.displayPortfolioDetails();
	}
}