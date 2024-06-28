import java.util.Scanner;

public class PatternChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num > 0 && num < 10) {
            for(int i = 1; i <= num; i++) {
                for(int j = i; j > 0; j--) {
                    System.out.print((char)(j+64) + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Enter number between 1 and 9");
        }
        sc.close();
    }
}
