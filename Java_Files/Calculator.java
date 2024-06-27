public class Demo {
	public static void main(String args[]) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		String op = args[2];
		
		switch(op) {
			case "+":
				System.out.println("Sum is: "+ (num1+num2));
				break;
			case "-":
				System.out.println("Sub is: "+ (num1-num2));
				break;
			case "*":
				System.out.println("Mul is: "+ (num1*num2));
				break;
			case "/":
				System.out.println("Div is: "+ (num1/num2));
				break;
			default:
				System.out.println("Error");
		}
	}
}