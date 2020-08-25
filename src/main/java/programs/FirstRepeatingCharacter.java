package programs;

import java.util.LinkedHashMap;

/**
 * Created by abhisheks on 03-08-2020.
 */
public class FirstRepeatingCharacter {

    public static void main(String[] args) {

        String str = "hey u o there in the cold";
        getFirstRepeatingCharacter(str);
    }

    private static void getFirstRepeatingCharacter(String str) {

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i=0;i<str.length();i++){

            char character = str.charAt(i);

            if (character!=' ') {
                Integer freq = map.get(character);

                if (freq == null) {
                    map.put(character, 1);
                } else {
                    System.out.println("repeating character :" + character);
                    break;
                }
            }
        }
    }
}
