public class NumberFound  {
    public static void fun(int x) throws Exception{
        if(x<0) throw new NotfoundException();
        else System.out.println("positive umber found");
    }
    public static void main(String[] args) {
        try {
            int ar[]={2,1,-2,-1,0};
            for(int n:ar){
                fun(n);
            }
        } catch (Exception e) {
System.out.println(e);
        }
    }
    
}
