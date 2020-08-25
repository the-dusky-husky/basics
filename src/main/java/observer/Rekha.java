package observer;

/**
 * Created by abhisheks on 27-05-2020.
 */
public class Rekha implements Subscriber {

    private Publisher publisher;

    public Rekha(Publisher publisher) {
        this.publisher = publisher;
        publisher.add(this);
    }

    @Override
    public void alertsubscribers(boolean available) {
        System.out.println("red dress availablity for Rekha : "+available);
    }

    public void unsubscribe(){
        publisher.remove(this);
    }
}
