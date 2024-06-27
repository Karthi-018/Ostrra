public class Main {
    public static void main(String args[]) {

        // Anno
        Phone phone = new Phone() {
            @Override
            public void makeCall() {
                System.out.println("Calling from Ano class");
            }
        };
        phone.makeCall();

        Phone p = new Smartphone();
        p.makeCall();
        p.playMusic();

        Smartphone s = (Smartphone) p;
        s.makeCall();

        
    }
}
