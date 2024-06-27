import java.util.Scanner;

class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            for(int j = i; j>=1; j--)
                System.out.print(j + " ");
            System.out.println();
        }

        System.out.println("Enter a letter");
        char ch = sc.next().charAt(0);
        for(char i = 'a'; i <= ch; i++){
            for(char j = i; j>='a'; j--)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}