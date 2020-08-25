package generics;

import java.io.*;

/**
 * Created by abhisheks on 27-04-2020.
 */
public class Employee implements Externalizable{

    private String name;
    private String city;

    private static final long serialVersionUID=4L;

    public Employee(String name, String city) {
        this.name = name;
        this.city=city;
    }

    public Employee() {
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeUTF(city);
        out.writeInt(1);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name=in.readUTF();
        city=in.readUTF();
        System.out.println(in.readInt());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
