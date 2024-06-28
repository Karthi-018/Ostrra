import java.util.Scanner;

/**
 * Pattern
 */
public class Pattern {

    public static void main(String a[]){
        int num =0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        char ch = 'a'-1;
        for(int i=0;i<num+1;i++){
            for(int j=i;j>0;j--){
                System.out.print(j + " ");
                System.out.print((char)(ch+j)+" ");
            }
            System.out.println();
        }
        sc.close();
    }

    
}