package serialize;

import java.io.*;

/**
 * Created by abhisheks on 18-05-2020.
 */
public class Student implements Serializable {

    private static final long serialVersionUID = 4L;
    private String name;

    public String id;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public Student() {
        System.out.println("cons");
    }

    public static String city;

    static {
        city = "noida";
    }

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        Student.city = city;
    }

    public void writeObject(ObjectOutputStream outputStream) throws IOException {
        throw new IllegalArgumentException();
    }

    private void readObject(ObjectInputStream in) throws IOException {
        throw new IllegalArgumentException();
    }
}