package tasks;

import java.util.concurrent.Callable;

/**
 * Created by abhisheks on 13-04-2020.
 */
public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        System.out.println("my callable run");
        System.out.println(5/0);
        return  100;

    }
}