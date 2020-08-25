package clone;


import java.io.Serializable;

/**
 * Created by abhisheks on 25-04-2020.
 */
public class Employee implements Serializable{

    private final String name;
    private final String city;
    public static String company;
    public Address address;

    //private static final long serialversionUID=7L;
    static
    {
        company="bcl";
    }

    public Employee(String name, String city, Address address) {
        this.name = name;
        this.city = city;
        this.address=address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
