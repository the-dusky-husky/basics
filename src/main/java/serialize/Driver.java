package serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by abhisheks on 18-05-2020.
 */
public class Driver {

    public static void main(String[] args) throws Exception{

        Student student = new Student("shanky","abcd");

        FileOutputStream fileOutputStream = new FileOutputStream("D:\\object.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);

        FileInputStream fileInputStream = new FileInputStream("D:\\object.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student object=(Student) objectInputStream.readObject();

        System.out.println("id : "+object.getId());
        System.out.println("name : "+object.getName());
        System.out.println(Student.city);
    }
}
