public class Main {
	public static void main(String args[]) {
			Employee e = new Employee();
			e.displayEmployeeDetails();
			
			System.out.println("\nNew Record\n");
			
			Employee e2 = new Employee();
			e2.empId = "Emp102";
			e2.empName = "DEF";
			e2.empDept = "Tester";
			e2.salary = 1223.45f;
			e2.displayEmployeeDetails();
	}
}
