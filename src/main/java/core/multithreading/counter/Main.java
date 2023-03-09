package core.multithreading.counter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        final Counter counter = new Counter();
        final Lock lock = new ReentrantLock();
        for (int i = 0; i < 10; i++) {
            new Thread(new CounterAdvise(lock, counter)).start();
        }


    }
}
