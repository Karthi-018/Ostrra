class OddSum
{
public static void main(String args[])
{
int sum=0;
int [] a= new int[] {72,51,30,17,13,47,31,7,15,3};
for (int i=0;i<a.length; i++)
if (a[i]%2==1)
{
 System.out.println("Square is:" + (a[i] * a[i]));
 sum+=a[i]*a[i];
}
 System.out.println("Sum is:" + sum);

}
}
