package tasks;

import java.util.Random;

/**
 * Created by abhisheks on 06-04-2020.
 */
public class MyTask implements Runnable {

    private int value;

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void run() {
        Random random = new Random();
        setValue(random.nextInt(100));
    }
}