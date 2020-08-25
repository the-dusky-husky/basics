package tasks;

import java.util.concurrent.CountDownLatch;

/**
 * Created by abhisheks on 15-04-2020.
 */
public class DBservice implements Runnable {

    private CountDownLatch countDownLatch;

    public DBservice(CountDownLatch countDownLatch) {
        this.countDownLatch=countDownLatch;
    }

    @Override
    public void run() {

        System.out.println("staring db service..");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("db service started");
        countDownLatch.countDown();
    }
}
