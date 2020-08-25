package generics;

import java.util.List;

/**
 * Created by abhisheks on 26-04-2020.
 */
public class GenericClass<T> {

    private T var1;

    public GenericClass(T var1){
        this.var1=var1;
    }

    public T getVar1() {
        return var1;
    }

    public void setVar1(T var1) {
        this.var1 = var1;
    }

    public T show(){
        return var1;
    }

    public void  showList(List<? extends Number> list){
    }
}
