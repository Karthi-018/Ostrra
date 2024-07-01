import java.util.Scanner;

class Pattern{
    
    public static void main(String[] args) {
        System.out.println("enter the Number:");
 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        // int print;
        for(int i=1;i<=num;i++){
            // print=i;
            for(int j=i;j>=1;j--){
               System.out.print((char)(j+64) + " ");
            //    print--;
            }
            System.out.println();
        }
    
    }
}