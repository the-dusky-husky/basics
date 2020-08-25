package strategy;

/**
 * Created by abhisheks on 24-05-2020.
 */
public class Client {

    private Picker picker;

    public Client(Picker picker) {
        this.picker = picker;
    }

    public void show(String key){
        System.out.println(picker.fetch(key));
    }
}
