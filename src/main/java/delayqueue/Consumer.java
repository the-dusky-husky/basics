package delayqueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by abhisheks on 06-06-2020.
 */
public class Consumer implements Runnable {

    private BlockingQueue<Message> blockingQueue;

    public Consumer(BlockingQueue<Message> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("taking : " + blockingQueue.take());
            }
        }
        catch (Exception e){

        }
    }
}
