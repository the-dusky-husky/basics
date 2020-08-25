package transferqueue;

import java.util.concurrent.*;

/**
 * Created by abhisheks on 31-05-2020.
 */
public class Driver {

    public static void main(String[] args) throws Exception {

        BlockingQueue<Integer> synchronousQueue = new SynchronousQueue<>();

        Thread producer1 = new Thread(new Producer(synchronousQueue),"thread-producer1");
        Thread producer2 = new Thread(new Producer(synchronousQueue),"thread-producer2");
        Thread producer3 = new Thread(new Producer(synchronousQueue), "thread-producer3");

        Thread consumer = new Thread(new Consumer(synchronousQueue));

        producer1.start();
        producer2.start();
        producer3.start();


        Thread.sleep(1000);
        System.out.println("queue size after starting all producers :"+synchronousQueue.size());
        System.out.println("Producer 1 state :"+ producer1.getState());
        System.out.println("Producer 2 state :"+ producer2.getState());
        System.out.println("Producer 3 state :"+ producer3.getState());
        Thread.sleep(5000);
        consumer.start();

        consumer.join();
        System.out.println("consumer finished..");
        System.out.println("Producer 1 state :"+ producer1.getState());
        System.out.println("Producer 2 state :"+ producer2.getState());
        System.out.println("Producer 3 state :"+ producer3.getState());
    }
}