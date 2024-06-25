public class OddNo{
public static void main(String args[])
{
int arr[]={72,51,30,17,13,47,31,7,15,3};
int sum =0, i, j;
for(i=0;i<arr.length;i++){
if(arr[i]%2==1){
System.out.println(arr[i]*arr[i]);
sum+=arr[i]*arr[i];
}
}
System.out.println("Totsl sum of square is"+sum);
for(i=0;i<arr.length;i++);
{
	for(j=i+1;j<arr.length;j++)
	{
		if(arr[i]>arr[j]){
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
System.out.println("First number: "+arr[0]);


System.out.println("Sorted list");
for(i=0;i<arr.length;i++){
if(arr[i]%2==1){
System.out.println(arr[i]*arr[i]);
}
}
}
}
