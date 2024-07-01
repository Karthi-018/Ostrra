import java.util.Scanner;

public class BubbleSort {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int marks[] = new int[10];
       System.out.println("Enter 10 Student marks: ");
       for(int i =0;i<10;i++){
        marks[i] = sc.nextInt();
       }

       for(int i =0;i<marks.length;i++){
        int j;
        for(j=i+1;j<marks.length;j++)
        {
            if(marks[i]>marks[j]){
            int temp= marks[i];
            marks[i]= marks[j];
            marks[j]= temp;
            }
        }

    }
    System.out.println("Sorted list is:");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        
        
    }
}
