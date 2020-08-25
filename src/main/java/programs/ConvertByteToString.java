package programs;

/**
 * Created by abhisheks on 03-08-2020.
 */
public class ConvertByteToString {

    public static void main(String[] args) throws Exception{

        String str = new String("bytes".getBytes("UTF-8"), "UTF-8");
        System.out.println(str);
    }
}
