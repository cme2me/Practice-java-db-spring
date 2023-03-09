package core.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PingPong implements Runnable {
    String word;

    public PingPong(String word) {
        this.word = word;
    }

    @Override
    public void run() {
        while(true){
            System.out.println(word);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        while(true){
            ex.submit(new PingPong("ping"));
            ex.submit(new PingPong("pong"));
        }
    }
}
