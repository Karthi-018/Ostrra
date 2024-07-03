class MethodRef{
    public static void main(String[] args) {
        demo d = DemoImp::print;
        d.display();
        DemoImp s = new DemoImp();
        demo d1 = s::show;
         d1.display();


    }
}