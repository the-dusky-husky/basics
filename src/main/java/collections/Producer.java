package collections;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TransferQueue;

/**
 * Created by abhisheks on 12-05-2020.
 */
public class Producer implements Runnable {

    private TransferQueue<Integer> concurrentLinkedQueue;

    public Producer(TransferQueue<Integer> concurrentLinkedQueue) {
        this.concurrentLinkedQueue = concurrentLinkedQueue;
    }

    @Override
    public void run() {
        try {
            for (int i = 20; i > 0; i--) {

                concurrentLinkedQueue.tryTransfer(i);
                System.out.println("Producer put :" + i);

                Thread.sleep(100);
            }
            concurrentLinkedQueue.offer(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
