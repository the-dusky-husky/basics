package generics;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by abhisheks on 20-05-2020.
 */
public class CustomArrayList<T> {

    private Object[] items;

    public CustomArrayList(){
        this(10);
    }

    public CustomArrayList(int size){
        items = new Object[size];
    }

    private int index=0;

    public boolean add(T item){
        rangeCheck();
        items[index]=item;
        index++;
        return true;
    }

    public T get(int index){
        if(index <items.length){
            return (T) items[index];
        }
        return null;
    }

    private void rangeCheck() {
        if(index >=items.length){
            int newLength= (int)(1.5 * items.length +1);
            items= Arrays.copyOf(items,newLength);
        }
    }
}
