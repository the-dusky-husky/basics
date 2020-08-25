package threads;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by abhisheks on 30-07-2020.
 */
public class Driver {

    public static void main(String[] args) throws Exception{

        ReentrantLock reentrantLock = new ReentrantLock(true);
        CommonResource commonResource = new CommonResource(reentrantLock);
        Runnable r1 = ()-> {
            commonResource.increment();
        };

        Runnable r2 = ()->{
            commonResource.increment();
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(commonResource.getCount());
    }
}


