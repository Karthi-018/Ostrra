public class Employee extends Object{
	String empId;
	String empName;
	String empDept;
	float salary;
	
	public Employee()
	{
	   super();
	   empId=null;
	   empName=null;
	   empDept=null;
	   salary=0.0f;
	}
	public Employee(String eid,String eName,String eDept,float sal){
	   empId=eid;
	   empName=eName;
	   empDept=eDept;
	   salary=sal;
	}
	void displayEmpDetails(Employee e){
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Department: "+empDept);
		System.out.println("Employee Salary: "+salary);
	}
	public static void main(String args[]){
		Employee e = new Employee();
		e.empId="E101";
		e.empName="John";
		e.empDept="IT";
		e.salary=10000.0f;
		
		e.displayEmpDetails(e);
		
		System.out.println("*********************************");
		
		Employee e1 = new Employee("E103","Mark","IT",12000.0f);
	
		e1.displayEmpDetails(e1);
		System.out.println(e1);
	
	
	}
}