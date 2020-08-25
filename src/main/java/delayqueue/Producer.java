package delayqueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by abhisheks on 06-06-2020.
 */
public class Producer implements Runnable {

    private BlockingQueue<Message> blockingQueue;

    public Producer(BlockingQueue<Message> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                blockingQueue.put(new Message(i*i * 100));
                System.out.println("putting : "+i);
            }
        }
        catch (Exception e){
        }
    }
}
