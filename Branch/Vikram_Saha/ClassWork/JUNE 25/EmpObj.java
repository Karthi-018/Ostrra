public class EmpObj{
public static void main(String args[]){
	Employee emp=new Employee();
	emp.empId="E101";
	emp.empName="Siva";
	emp.empDept="HR";
	emp.salary=10000.0f;
	
	System.out.println(emp);

	Employee emp2=new Employee();
	emp2.empId="E102";
	emp2.empName="Yaaz";
	emp2.empDept="IT";
	emp2.salary=15000.0f;
	
	System.out.println(emp2);
}
}