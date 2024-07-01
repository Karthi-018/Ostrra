import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1 ;
        String str2;
        System.out.println("Enter the string: ");
        str1 = sc.nextLine();
        System.out.println("Enter the another string: ");
        str2 = sc.nextLine();
        boolean found = false;
        int index = -1;

        for(int i=0;i<str1.length()-str2.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str2.charAt(i+j)!=str1.charAt(j)){
                break;
                }
            if(j==str2.length()){
                   found = true;
                   index = i;
                   break;

                }
            
              
                }
               

            }
         if(found){
            System.out.println("String found: "+index);
         }
         else{
            System.out.println("String not Found");
         }
        }


    }

