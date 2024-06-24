package osttra.training;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter the first Number:");
		num1=sc.nextInt();
		System.out.println("Enter the second Number:");
		num2=sc.nextInt();
		System.out.println("Enter the choices:");
		int choice= sc.nextInt();
		
		int result=0;
		
		
		
		switch(choice)
		{
			case 1: 
				result = sum(num1,num2);
				break;
			case 2:
				result = sub(num1,num2);
				break;
			case 3:
				result = multi(num1,num2);
				break;
			case 4:
				result = div(num1,num2);
				break;
			case 5:
				result = mod(num1,num2);
				break;
		    default:
				result = -0;
				
				
		}
		System.out.println("the result is "+ result);		
			
		
	}
	public static int sum(int n1,int n2)
	{
		return n1+n2;
	}
	public static int sub(int n1,int n2)
	{
		return n1-n2;
	}
	public static int multi(int n1,int n2)
	{
		return n1*n2;
	}
	public static int div(int n1,int n2)
	{
		return n1/n2;
	}
	public static int mod(int n1,int n2) {
		return n1%n2;
	}
	

}
