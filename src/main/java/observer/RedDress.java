package observer;

import java.util.ArrayList;

/**
 * Created by abhisheks on 27-05-2020.
 */
public class RedDress implements Publisher {

    private boolean avialable;

    public void setAvialable(boolean avialable) {
        this.avialable = avialable;
        notifySubscribers();
    }

    private ArrayList<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void add(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void remove(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        subscribers.stream().forEach(subscriber -> subscriber.alertsubscribers(avialable));
    }
}
