package transferqueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by abhisheks on 06-06-2020.
 */
public class Consumer implements Runnable {
    private BlockingQueue<Integer> blockingQueue;
    public Consumer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }
    @Override
    public void run() {
        try {
            int x = 0;
            while ((x = blockingQueue.take()) != -1) {
                System.out.println("taking : "+x);
                Thread.sleep(500);
            }
        }catch (Exception e){

        }
    }
}
