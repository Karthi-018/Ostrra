import java.util.Scanner;

public class Main {

    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        String str1 = new String();
        String str2 = new String();
        System.out.println("Enter string 1");
        str1 = sc.next();
        System.out.println("Enter string 2");
        str2 = sc.next();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();


        if(str1.length()<str2.length()) System.out.println("False");

        for(int i=0;i<(str1.length()-str2.length());i++){
            int j;
            for(j=0;j<str2.length();j++){
                if(str1.charAt(i+j) != str2.charAt(j)){
                    break;
                }
            }
            if(j == str2.length()){
                System.out.println(" true");
            }else{
                System.out.println("False");
            }
        }

        for(int i=0;i<(str1.length()-str2.length());i++){
            int j;
            for(j=0;j<str2.length();j++){
                if(arr1[i+j] != arr2[j]){
                    break;
                }
            }
            if(j == str2.length()){
                System.out.println(" true");
            }else{
                System.out.println("False");
            }
        }
        sc.close();
    }
    
}