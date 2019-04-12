package Counteer;

public class Counter {
    private int count = 0;
    public void setCount(){
        count++;
    }
    public int getCount(){
        return count;
    }
}

class ThreadCounter implements Runnable{

    Counter counter;

    public ThreadCounter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < 1000; i++) {
            counter.setCount();
        }
    }
}