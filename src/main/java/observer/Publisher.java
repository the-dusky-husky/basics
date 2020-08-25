package observer;

/**
 * Created by abhisheks on 27-05-2020.
 */
public interface Publisher {

    void add(Subscriber subscriber);
    void remove(Subscriber subscriber);
    void notifySubscribers();


}
