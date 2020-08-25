package delayqueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * Created by abhisheks on 06-06-2020.
 */
public class Message implements Delayed {

    //10
    private long score;

    //500
    public Message(long score){
        //510
        this.score=System.currentTimeMillis() + score;
    }


    @Override
    public long getDelay(TimeUnit unit) {
        return score - System.currentTimeMillis();
        //510-500
        //510-501
        //510-502
        //510-503..
    }

    @Override
    public int compareTo(Delayed o) {
        return (int) (this.score - ((Message)o).getScore());
    }

    public long getScore() {
        return score;
    }
}
