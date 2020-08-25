package singleton;

import java.io.Serializable;

/**
 * Created by abhisheks on 24-05-2020.
 */
public class Singleton implements Serializable{

    private static Singleton singletonInstance;

    private Singleton(){

    }
    static {
        singletonInstance= new Singleton();
    }

    public static Singleton getSingletonInstance(){

        return singletonInstance;
    }

    public Object readResolve(){
        return singletonInstance;
    }
}
