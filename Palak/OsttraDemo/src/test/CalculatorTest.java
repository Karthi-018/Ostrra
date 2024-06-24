package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import osttra.training.*;

class CalculatorTest {
	Scanner sc=new Scanner(System.in);
	Calculator c=new Calculator();

	@Test
	void test() {
		System.out.println("Enter the first Number:");
		int num1=sc.nextInt();
		System.out.println("Enter the second Number:");
		int num2=sc.nextInt();
		int result = Calculator.sum(num1, num2);
		assertEquals(num1+num2,c.sum(num1,num2));
		System.out.println("Test is executed");
	}
	@Test
	void test1()
	{
		System.out.println("Enter the first Number:");
		int num1=sc.nextInt();
		System.out.println("Enter the second Number:");
		int num2=sc.nextInt();
		int result = Calculator.sub(num1, num2);
		assertEquals(num1-num2,c.sub(num1,num2));
		System.out.println("Test1 is executed");
	}
	
	@Test
	void test2()
	{
		System.out.println("Enter the first Number:");
		int num1=sc.nextInt();
		System.out.println("Enter the second Number:");
		int num2=sc.nextInt();
		int result = Calculator.multi(num1, num2);
		assertEquals(num1*num2,c.multi(num1,num2));
		System.out.println("Test2 is executed");
	}
	
	@Test
	void test3()
	{
		System.out.println("Enter the first Number:");
		int num1=sc.nextInt();
		System.out.println("Enter the second Number:");
		int num2=sc.nextInt();
		int result = Calculator.div(num1, num2);
		assertEquals(num1/num2,c.div(num1,num2));
		System.out.println("Test3 is executed");
	}
	@Test
	void test4()
	{
		System.out.println("Enter the first Number:");
		int num1=sc.nextInt();
		System.out.println("Enter the second Number:");
		int num2=sc.nextInt();
		int result = Calculator.mod(num1, num2);
		assertEquals(num1%num2,c.mod(num1,num2));
		System.out.println("Test4 is executed");
	}
	

}
