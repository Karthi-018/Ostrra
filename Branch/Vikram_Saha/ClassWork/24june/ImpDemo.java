//import learn.training.*;;
import java.util.Scanner;

import com.pkTry.*;
class ImpDemo{
	public static void main(String arg[]){
	
	//int inp=Integer.parseInt(arg[0]);
	//int n=inp;
	int arr[]={72,51,30,17,13,47,31,7,15,3};
	int sum=0;
	for(int i=0;i<arr.length;i++){
		if(arr[i]%2==0) {arr[i]=-2;continue;}
		//System.out.println("square of "+arr[i]+" = "+arr[i]*arr[i]);
		arr[i]*=arr[i];
		sum+=arr[i];
	}
	System.out.println("sum = "+sum);

	for(int i=0;i<arr.length;i++){
		for(int j=1;j<arr.length;j++){
			if(arr[j]<arr[j-1]){
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
		}
	}
	for(int i:arr){
		if(i==-2) continue;
		System.out.println(i);
	}
	//System.out.println((n+(n*n)));
	// rec(inp);
	// switch(inp){
	// 	case 1:System.out.println("1");
	// 	case 2:System.out.println("2");
	// 	case 3:System.out.println("3");
	// 	case 4:System.out.println("4");
	// 	case 5:System.out.println("5");
	// 	case 6:System.out.println("6");
	// 	case 7:System.out.println("7");
	// 	case 8:System.out.println("8");
	// 	case 9:System.out.println("9");
	// 	case 10:System.out.println("10"); break;
	// 	default:System.out.println("wrong choice");
	// }

}

public static void rec(int x){
	if(x>10) return;
	System.out.println(x++);
	rec(x);
}
}