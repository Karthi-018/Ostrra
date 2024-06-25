class Calculator{
	public static void main(String args[]){
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		switch(args[2]){
			case "+":
			   System.out.println("Sum is: "+ (num1+num2));
			   break;
			case "-":
			   System.out.println("Sum is: "+ (num1-num2));
			   break;
			case "*":
			   System.out.println("Sum is: "+ (num1*num2));
			   break;
			case "/":
			   System.out.println("Sum is: "+ (num1/num2));
			   break;
			case "%":
			   System.out.println("Sum is: "+ (num1%num2));
			   break;
			default:
			   System.out.println("wrong input");
			   
		}
	}
}
