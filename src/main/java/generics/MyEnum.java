package generics;

import java.util.List;

/**
 * Created by abhisheks on 27-04-2020.
 */
public enum MyEnum {

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY;

    private String name;

     MyEnum() {

    }

    public static void main(String[] args) {

        MyEnum[] values = MyEnum.values();

        for (MyEnum val : values){
            System.out.println(val);
        }
    }
}
