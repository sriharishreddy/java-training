package threads;

public class JoinsDemo extends Thread{
    @Override
    public void run() {
        System.out.println("In run method");
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("run method : " +i + " Current Thread : " +Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("in main method");

        JoinsDemo jd1 = new JoinsDemo();
        JoinsDemo jd2 = new JoinsDemo();
        JoinsDemo jd3 = new JoinsDemo();


        jd1.setDaemon(true);
        jd1.setName("Sandya");
        jd1.start();

        jd1.join();

        jd2.setName("Shasi");
        jd2.start();

        jd2.join();

        jd3.setName("Harish");
        jd3.start();

        for(int i=0;i<10;i++){
            System.out.println("main method : " +i+ " Current Thread : " +Thread.currentThread().getName());
        }

        System.out.println(jd1.isDaemon());
        System.out.println(jd2.isDaemon());
        System.out.println(jd3.isDaemon());

        //jd1 = null;
        //jd2 = null;
        //jd2 = null;
        System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("invoked finalized method");
    }
}
