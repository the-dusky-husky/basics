package clone;

import java.io.Serializable;

/**
 * Created by abhisheks on 25-04-2020.
 */
public class Address implements Serializable{

    private int pin;
    private String state;

    public Address(int pin, String state) {
        this.pin = pin;
        this.state = state;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "pin=" + pin +
                ", state='" + state + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
