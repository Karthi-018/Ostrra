public class Student extends Object{
	private int sid;
	private String sName;
	private float marks;
	
	public Student(int sid,String sName,float marks){
		this.sid =sid;
		this.sName=sName;
		this.marks=marks;
	}
	
	public void setSid(int id){
		sid=id;
	}
	public void setsName(String name){
		sName=name;
	}
    public int getSid(){
		return sid;
	}
	public String getsName(){
		return sName;
	}
    public void setMarks(float mark){
		marks=mark;
	}
	public float getMarks(){
		return marks;
	}
	
	public String toString(){
		return sid+"\n"+sName+"\n"+marks;
	}
	
	public static void main(String args[]){
		Student s = new Student(101,"ABC",567.0f);
		Student s1=s;
		if(s.equals(s1)){
			System.out.println(s1);
		}
		System.out.println(s);
		
	}
}