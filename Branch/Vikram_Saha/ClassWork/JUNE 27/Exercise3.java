import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int n=5;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        char ch='a'-1;
        for(int i=1;i<=n;i++){
            for(int j=i;j>0;j--){
                System.out.print((char)(ch+j)+" ");
            }
            System.out.println();
        }
    }

}
