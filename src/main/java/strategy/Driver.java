package strategy;

/**
 * Created by abhisheks on 24-05-2020.
 */
public class Driver {

    public static void main(String[] args) {

        Client client = new Client(new DBPicker());

        client.show("mango ");

    }
}
