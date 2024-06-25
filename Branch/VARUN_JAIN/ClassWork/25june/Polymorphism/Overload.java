class Overload{
 public String std1;
 public String std2;
 public String std3;
 public String std4;
 public String std5;
 
 void attendance(){
 System.out.println("All Absent");
 }
 void attendance(String std1){
 System.out.println("One present");
 }
 void attendance(String std1,String std2){
 System.out.println("two present");
 }
 void attendance(String std1,String std2,String std3){
 System.out.println("three present");
 }
 void attendance(String std1,String std2,String std3,String std4){
 System.out.println("Four presentt");
 }
 void attendance(String std1,String std2,String std3,String std4,String std5){
 System.out.println("Five presentt");
 }
 
 public void tatten(String... s){
	 System.out.println(s.length);
 }
 

}