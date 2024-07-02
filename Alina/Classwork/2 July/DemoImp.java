import java.util.*;
@FunctionalInterface
interface Demo{
void display();
}
public class DemoImp
{
    static void print()
    {
        System.out.println("Hello World");
    }
}
class DemoClass
{
    public static void main(String[] args) {
        {
            List<Integer> nums=Arrays.asList(1,2,3,4,5);
            List<Nums> n= new ArrayList<>();
            n=nums.stream().map(Nums::new).toList();
            n=n.stream().map(n1->new Nums(n1.i*n1.i)).toList();
            n.forEach(System.out::println);
           DemoImp.print();
           Demo d=DemoImp::print;

        }
    }
}