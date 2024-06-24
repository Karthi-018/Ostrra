package edu.osttra.training;
public class Calculator
{
	
	public static void print(String xyz){
		System.out.println("Hi from calc class" + " " + xyz);
	}
	
public static void main (String args[])
{
	int x= Integer.parseInt(args[0]);
	int y=Integer.parseInt(args[1]);
	switch(args[2])
	{
		case "+":
		System.out.println("Sum of two numbers:"+ (x+y));
		break;
		case "-":
		System.out.println("Difference of two numbers:" + (x-y));
		break;
		case "*":
		System.out.println("Product of two numbers:" + (x*y));
		break;
		case "/":
		System.out.println("Division of two numbers:" + (x/y));
		break;
		case "%":
		System.out.println("Modulo of two numbers:" + (x%y));
		break;
	}
}

}
		