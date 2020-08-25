package programs;

import java.util.LinkedHashMap;

/**
 * Created by abhisheks on 03-08-2020.
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "helloooozzz";
        removeDuplicates(str);
    }

    private static void removeDuplicates(String str) {

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        String unique="";
        for (int i=0;i<str.length();i++){

            char character = str.charAt(i);

            Integer freq = map.get(character);
            if(freq==null){
                map.put(character, 1);
                unique = unique + String.valueOf(character);
            }
            else{
                freq++;
                map.put(character, freq);
            }
        }

        System.out.println(unique);
    }
}
