package com.example.max.core.multithreading.counter;

import java.util.concurrent.locks.Lock;

public class CounterAdvise implements Runnable{
    private final Lock lock;
    private final Counter counter;
    public CounterAdvise(Lock lock, Counter counter) {
        this.lock = lock;
        this.counter = counter;
    }

    @Override
    public void run() {
        try {
            lock.lock();
            var value = counter.incrementAndGetValue();
            System.out.println("thread with name = " +
                    Thread.currentThread().getName() + " update value " + value);
        }finally {
            lock.unlock();
        }
    }
}
