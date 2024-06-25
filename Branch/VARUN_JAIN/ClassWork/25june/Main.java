class Demo{
 int i;
 Demo(int i){this. i=i;}
 
 void dis(){
  System.out.println(i);
 }

}

class Demo1 extends Demo{
int i=20;
Demo1(){
super(10);
}
}

class Main{
 public static void main(String a[]){
 
 Demo1 d = new Demo1();
 System.out.println(d.i);
 
 
 }

}