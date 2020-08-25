package tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Exchanger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by abhisheks on 15-04-2020.
 */
public class Thread2 implements Runnable {
    private ReentrantLock reentrantLock;
    private Condition condition;
    private int i;

    public Thread2(ReentrantLock reentrantLock, Condition condition, int i) {
        this.reentrantLock = reentrantLock;
        this.condition=condition;
        this.i=i;
    }
    @Override
    public void run() {
        reentrantLock.lock();
        try {
            for (int i=2;i<20;i+=3){
                System.out.println(Thread.currentThread().getName()+"::"+ i);
                Thread.sleep(1000);
                condition.signal();
                condition.await();
            }

        }catch (Exception e){

        }
        finally {
            reentrantLock.unlock();
        }
    }
}
