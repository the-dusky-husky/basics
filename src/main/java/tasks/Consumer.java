package tasks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;

/**
 * Created by abhisheks on 10-04-2020.
 */
public class Consumer implements Runnable {

    private Object object;

    public Consumer(Object object) {
        this.object = object;
    }
    @Override
    public void run() {
        try {
            synchronized (object) {
                for (int i = 1; i <= 20; i += 2) {
                    System.out.println(Thread.currentThread().getName() + "::" + i);

                    object.notify();
                    object.wait();
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}