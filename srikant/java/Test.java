package org.osttra.training.java.demo;

public class Test{

	public void print(){ System.out.println("Hello"); }

	public static void main(String[] args){

		int x = Integer.parseInt(args[0]);

		int y = Integer.parseInt(args[2]);

		String op = args[1];

		int res = 0;

		switch(op){
			case "+" : res = x + y;
				break;
			case "-" : res = x - y;
				break;
			case "x" : res = x * y;
				break;
			case "/" : res = x / y;
				break;
			case "%" : res = x % y;
				break;
			default : System.out.println("Invalid Operator");
		}

		System.out.println(res);
	}

}