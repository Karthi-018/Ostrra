public class Employee {
	String empId = "Emp101";
	String empName = "ABC";
	String empDept = "Developer";
	float salary = 1234.43f;
	
	void displayEmployeeDetails() {
		System.out.println("EmpId is: " + empId);
		System.out.println("EmpName is: " + empName);
		System.out.println("EmpDept is: " + empDept);
		System.out.println("EmpSalary is: " + salary);
	}
}