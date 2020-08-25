package clone;

import java.io.*;

/**
 * Created by abhisheks on 25-04-2020.
 */
public class Driver {

    public static void main(String[] args) throws Exception{

        Employee employee = new Employee("akhil","noida", new Address(284003,"up"));
        FileOutputStream fout = new FileOutputStream("D:\\obj.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fout);
        objectOutputStream.writeObject(employee);
        objectOutputStream.close();

        String name="D:\\obj.ser";
        FileInputStream fileInputStream = new FileInputStream(name);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object object = objectInputStream.readObject();
        System.out.println(object);
        System.out.println(Employee.company);

    }
}
