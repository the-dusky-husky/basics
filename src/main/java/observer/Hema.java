package observer;

/**
 * Created by abhisheks on 27-05-2020.
 */
public class Hema implements Subscriber {

    private Publisher publisher;

    public Object object;
    public Hema(Publisher publisher) {
        this.publisher = publisher;
        publisher.add(this);
    }

    @Override
    public void alertsubscribers(boolean available) {
        System.out.println("red dress availablity for Hema : "+available);
    }

    public void unsubscribe(){
        publisher.remove(this);
    }
}
