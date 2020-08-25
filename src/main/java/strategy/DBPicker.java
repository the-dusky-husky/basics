package strategy;

/**
 * Created by abhisheks on 24-05-2020.
 */
public class DBPicker implements Picker {

    @Override
    public String fetch(String key) {
        return key + "picked from database";
    }
}
