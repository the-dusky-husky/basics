package collections;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TransferQueue;

/**
 * Created by abhisheks on 12-05-2020.
 */
public class Consumer implements Runnable {
    private TransferQueue<Integer> concurrentLinkedQueue;

    public Consumer(TransferQueue<Integer> concurrentLinkedQueue) {
        this.concurrentLinkedQueue = concurrentLinkedQueue;
    }

    @Override
    public void run() {

        while(true){
            try {
            Integer x= concurrentLinkedQueue.take();

            if(x!=null && x==1000){
                break;
            }

            System.out.println("Consumer took :"+x);


                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
