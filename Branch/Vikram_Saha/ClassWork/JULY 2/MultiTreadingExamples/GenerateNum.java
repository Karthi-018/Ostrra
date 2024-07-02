package MultiTreadingExamples;

public class GenerateNum extends Thread {

 static int i=0;
 private String name;
 public GenerateNum(String name) {
    this.name = name;
}
void func(){
    i++;
    System.out.println(name+" ->" +i);
 }
 @Override
 public void run() {

     for(int i=1;i<100;i++)func();
 }

}
