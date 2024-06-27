import java.util.Scanner;
public class Pattern
{
    public static void main (String args[])
    {
      int i,j,num;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      num = sc.nextInt();
      for (i=1;i<=num;i++)
      {
        for (j=i;j>=1;j--)
        {
            System.out.print(j + " ");
        }
        System.out.println(); 
      }
       
    }
}


