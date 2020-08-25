package builder;

import chainOfResponsiblity.Dispenser;

/**
 * Created by abhisheks on 24-05-2020.
 */
public class Dispenser1000 extends Dispenser {

    @Override
    public void dispense(int amount) {
        if (amount != 0) {
            int notes = amount/1000;
            int left=amount%1000;

            System.out.println("1000 notes ::"+ notes);

            passToNext(left);

        }
    }
}
