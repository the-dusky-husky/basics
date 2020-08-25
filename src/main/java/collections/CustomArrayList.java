package collections;

import java.util.Arrays;

/**
 * Created by abhisheks on 12-05-2020.
 */
public class CustomArrayList<T> {

    private Object[] elementData;

    public CustomArrayList(){
        elementData = new Object[10];
    }

    public CustomArrayList(int size){
        if(size >0)
        elementData = new Object[size];

        else
            throw new IllegalArgumentException();
    }

    public int size =0;

    public boolean add(T element){
        ensureCapacity(size);
        elementData[size]=element;
        size++;
        return true;
    }

    public boolean add(T element, int index){
       ensureCapacity(index);
       elementData[index]=element;
       size++;
       return true;
    }

    private void ensureCapacity(int size) {
        if(size >= elementData.length){
            int newLength= (int)(elementData.length*1.5+1);
            elementData = Arrays.copyOf(elementData, newLength);
        }
    }

    public T get(int index){

        return (T) elementData[index];
    }


    @Override
    public String toString() {
        return Arrays.toString(elementData);
    }
}
