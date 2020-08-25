package transferqueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by abhisheks on 06-06-2020.
 */
public class Producer implements Runnable{

    BlockingQueue<Integer> blockingQueue;
    public Producer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("adding : " + i +", By :"+Thread.currentThread().getName());
                blockingQueue.put(i);
            }
            blockingQueue.put(-1);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
