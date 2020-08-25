package collections;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * Created by abhisheks on 12-05-2020.
 */
public class DelayElement implements Delayed {

    private long delay;
    private String value;

    public DelayElement(long delay, String value) {
        this.delay = delay+ System.currentTimeMillis();
        this.value = value;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return delay-System.currentTimeMillis();
    }

    @Override
    public int compareTo(Delayed o) {
        return 0;
    }
}
