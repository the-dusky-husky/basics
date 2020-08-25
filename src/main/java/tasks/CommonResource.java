package tasks;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by abhisheks on 10-04-2020.
 */
public class CommonResource {

    private ReentrantLock reentrantLock;

    public CommonResource(ReentrantLock reentrantLock) {
        this.reentrantLock = reentrantLock;
    }

    public void accessCommonResource(){
        try {
            if(reentrantLock.tryLock()) {
                System.out.println("lock acquired by :" + Thread.currentThread().getName());
                Thread.sleep(4000);
                release();
            }
            else {
                System.out.println("lock not acquired.. exiting..");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    private void release() {
        reentrantLock.unlock();
        System.out.println("lock released by :"+Thread.currentThread().getName());
    }
}