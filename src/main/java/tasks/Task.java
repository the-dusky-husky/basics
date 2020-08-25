package tasks;

import java.util.concurrent.Callable;

/**
 * Created by abhisheks on 09-04-2020.
 */
public class Task implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        System.out.println("performing task..."+Thread.currentThread().getName());
        return "done";
    }
}
