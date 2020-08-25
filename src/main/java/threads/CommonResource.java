package threads;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by abhisheks on 30-07-2020.
 */
public class CommonResource {

    private ReentrantLock reentrantLock;
    private int count =0;

    public CommonResource(ReentrantLock reentrantLock) {
        this.reentrantLock = reentrantLock;
    }

    public void  increment(){

        reentrantLock.lock();
        for (int i=0;i<10000;i++){
            count++;
        }
        unlock();
    }

    public void unlock(){
        if (reentrantLock.isHeldByCurrentThread())
        reentrantLock.unlock();
    }
    public int getCount() {
        return count;
    }
}
