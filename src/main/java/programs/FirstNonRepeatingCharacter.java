package programs;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Created by abhisheks on 03-08-2020.
 */
public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "lllets find the first non repeating";
        getFirstNonRepeatingCharacter(str);
    }

    private static void getFirstNonRepeatingCharacter(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            Integer freq = map.get(c);
            if (freq==null){
                map.put(c,1);
            }
            else {
                freq++;
                map.put(c, freq);
            }
        }
        System.out.println(map);
        Set<Character> characters = map.keySet();
        for (Character c : characters){
            if (map.get(c)==1){
                System.out.println("non repeating : "+c);
                break;
            }
        }
    }
}
