class numbers{
    public static void main(String arr[]){
        int n=0;
int[] ar= {72,51,30,17,13,47,31,7,15,3};
for(int i=0;i<10;i++){
    if(ar[i]%2==0){
        ar[i]=-2;
        continue;
    }
    ar[i]*=ar[i];
    n+=ar[i];
    }

System.out.println(n);
for(int i=0;i<ar.length;i++){
    for(int j=1;j<ar.length;j++){
        if(ar[j]<ar[j-1]){
            int temp=ar[j];
            ar[j]=ar[j-1];
            ar[j-1]=temp;
        }
    }
}
for(int i:ar){
    if(i==-2) continue;
    System.out.println(i);
}
}}