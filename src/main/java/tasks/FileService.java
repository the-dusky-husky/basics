package tasks;

import java.util.concurrent.CountDownLatch;

/**
 * Created by abhisheks on 15-04-2020.
 */
public class FileService implements Runnable {

    private CountDownLatch countDownLatch;

    public FileService(CountDownLatch countDownLatch) {
        this.countDownLatch=countDownLatch;
    }

    @Override
    public void run() {

        System.out.println("staring file service..");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("file service started");
        countDownLatch.countDown();
    }
}
