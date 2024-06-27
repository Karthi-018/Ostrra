class MarkAttendance{
	void todayAttend(){
		System.out.println("All Absent");
	}
	
	void todayAttend(String... s1){
		System.out.println(s1.length+"student is present");
		for(String name:s1)
		{
			System.out.println(name);
		}
		
	}
	public static void main(String args[]){
		MarkAttendance m = new MarkAttendance();
		m.todayAttend("Palak","Ankit","Alina","Unnat","Srikant");
		MarkAttendance m1 = new MarkTeacherAttendance();
		m1.todayAttend("Palak","Ankit","Alina","Unnat","Srikant");
		MarkAttendance m2 = new MarkStudentAttendance();
		m2.todayAttend("Palak","Ankit","Alina","Unnat","Srikant");
	}
	
}
class MarkStudentAttendance extends MarkAttendance{
	void todayAttend(String... s1){
		System.out.println(s1.length+"student is present");
		for(String name:s1)
		{
			System.out.println(name);
		}
		
	}
}
class MarkTeacherAttendance extends MarkAttendance{
	void todayAttend(String... s1){
		System.out.println(s1.length+"teacher is present");
		for(String name:s1)
		{
			System.out.println(name);
		}
		
	}
}