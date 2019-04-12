package Counteer;

public class CounterApp {
    public static void main(String[] args)  throws InterruptedException {
        Counter counter = new Counter();

        Thread tr1 = new Thread(new ThreadCounter(counter));
        Thread tr2 = new Thread(new ThreadCounter(counter));
        Thread tr3 = new Thread(new ThreadCounter(counter));
        Thread tr4 = new Thread(new ThreadCounter(counter));

        tr1.start();
        tr2.start();
        tr3.start();
        tr4.start();
        tr1.join();
        tr2.join();
        tr3.join();
        tr4.join();

        System.out.println(counter.getCount());
    }
}
