import java.util.Scanner;

public class Pyramid{
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int n =sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=i;j>0;j--){
            
            System.out.print((char)(j+64));
            System.out.print(j+" ");
            
        }
        System.out.println();
    }
    }
}