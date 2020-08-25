package chainOfResponsiblity;

/**
 * Created by abhisheks on 24-05-2020.
 */
public abstract class Dispenser {

    private Dispenser next;

    public Dispenser setNext(Dispenser d){
        this.next=d;
        return next;
    }

    public abstract void dispense(int amount);

    public void passToNext(int amount){

        if (next!=null)
            next.dispense(amount);
        else
            System.out.println("processing over!");

    }
}
