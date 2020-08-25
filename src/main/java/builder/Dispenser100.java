package builder;

import chainOfResponsiblity.Dispenser;

/**
 * Created by abhisheks on 24-05-2020.
 */
public class Dispenser100 extends Dispenser {

    @Override
    public void dispense(int amount) {

        if (amount != 0) {
            int notes = amount / 100;
            int left = amount % 100;

            System.out.println("100 notes ::" + notes);
            passToNext(left);
        }
    }
}
