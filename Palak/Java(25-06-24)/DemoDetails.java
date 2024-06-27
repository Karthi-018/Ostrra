class Demo{
	int i;
	Demo (int i){
		this.i=i;
	}
	void displayI()
	{
		System.out.println(i);
	}
}
class Demo1 extends Demo{
	int i= 20;
	Demo1()
	{
		super(10);
	}
	
}
class DemoDetails{
	public static void main(String args[]){
		Demo1 d = new Demo1();
		System.out.println(d.i);
	}
}
