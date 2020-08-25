package builder;

import chainOfResponsiblity.Dispenser;

/**
 * Created by abhisheks on 24-04-2020.
 */
public class Driver {

    public static void main(String[] args) {

        Dispenser dispenser = new Dispenser1000();
        dispenser.setNext(new Dispenser500()).setNext(new Dispenser100());

        dispenser.dispense(1600);
    }
}
