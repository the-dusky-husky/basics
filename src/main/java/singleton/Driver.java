package singleton;

import builder.RequestParams;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * Created by abhisheks on 24-04-2020.
 */
public class Driver {

    public static void main(String[] args) throws Exception{

        Singleton singleton1= Singleton.getSingletonInstance();

        System.out.println(singleton1);

        FileOutputStream fileOutputStream = new FileOutputStream("D:\\ob.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(singleton1);

        FileInputStream fileInputStream = new FileInputStream("D:\\ob.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Singleton singleton2 = (Singleton) objectInputStream.readObject();

        System.out.println(singleton2);


    }
}
