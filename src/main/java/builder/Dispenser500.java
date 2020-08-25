package builder;

import chainOfResponsiblity.Dispenser;

/**
 * Created by abhisheks on 24-05-2020.
 */
public class Dispenser500 extends Dispenser {

    @Override
    public void dispense(int amount) {

        if (amount!=0){
            int notes = amount/500;
            int left = amount%500;

            System.out.println("500 notes :"+ notes);

            passToNext(left);
        }
    }
}
