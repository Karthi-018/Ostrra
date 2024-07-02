class T1 implements Runnable{

    Demo d= new Demo();
    @Override
    public void run()
    {
    try {
        for (int i = 1; i < 100; i++) {
            Demo.increment();
            Thread.sleep(2);
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }
}
