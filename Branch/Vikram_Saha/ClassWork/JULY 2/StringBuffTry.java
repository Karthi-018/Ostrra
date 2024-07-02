public class StringBuffTry {
public static void main(String[] args) {
    String s="";
    StringBuffer sb=new StringBuffer();

    long t1=System.currentTimeMillis();
    for(int i=1;i<100000;i++) s+=i;
    System.out.println(System.currentTimeMillis()-t1);
    t1=System.currentTimeMillis();
    for(int i=1;i<100000;i++) sb.append(i);
    System.out.println(System.currentTimeMillis()-t1);
}
}
