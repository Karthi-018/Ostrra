class Calculator{

public static void main(String args[]){
	int num1=Integer.parseInt(args[0]);
	int num2=Integer.parseInt(args[1]);

	char op=args[2].charAt(0);

	int res=0;
	switch(op){
	case '+':res=num1+num2;break;
	case '-':res=num1-num2;break;
	case '/':res=num1/num2;break;
	case 'x':res=num1*num2;break;
	case '%':res=num1%num2;break;
	default: System.out.println("incorrect input"); return;
}
	System.out.println(res);
}
}