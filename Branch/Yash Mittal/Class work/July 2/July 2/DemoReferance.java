@FunctionalInterface interface Demo{
    void display();
}
class DemoImp{
    static void write(){
        System.out.println("hello");
    }

public static void main(String[] args){
    Demo d= DemoImp::write;
    d.display();
}}