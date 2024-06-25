class Engineer{
    public String engId;
	public String engName;
	Engineer(){
		super();
		engId = "100";
		engName =  "engineer";
	}	
	void displayEngDetails(){
	  System.out.println(engId);
	  System.out.println(engName);
	}
}

class Profession extends Engineer{
	public String role;
	public String major;
	Profession(){
		role = "Developer";
		major ="CSE";
	}
	void displayProfDetails(){
		System.out.println(role);
		System.out.println(major);
	}
	
}

class OnRole extends Profession{
	public String onrole;
	OnRole(){
		onrole = "Intern";
	}
	void displayOnRDetails(){
		System.out.println(onrole);
	}
}

class Unemployed extends Engineer{
	public String unemp;
	void displayUnempDetails(){
		System.out.println(unemp);
	}
}