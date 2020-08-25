package delayqueue;

/**
 * Created by abhisheks on 07-06-2020.
 */
public  class Planets {

    String name;

    public Planets() {
        this("default name");
        System.out.println("plain");
    }

    public Planets(String name) {
        this.name = name;
    }
    {
        System.out.println("init called");
    }
}
