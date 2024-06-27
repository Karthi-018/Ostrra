public interface Phone {
    abstract void makeCall();
    default void turnOn() {
        System.out.println("Phone Turn On");
    }
}
