package programs;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Created by abhisheks on 03-08-2020.
 */
public class FindDuplicates {

    public static void main(String[] args) {

        String str = "welcom";

        findDuplicates(str);
        System.out.println(findifStringContainsAllUnique(str));
    }

    private static boolean findifStringContainsAllUnique(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            Integer freq = map.get(ch);
            if (freq == null)
                freq = 0;

            if (freq == 0) {
                map.put(ch, 1);
            } else {
                freq++;
                map.put(ch, freq);
            }
        }
        System.out.println(map);
        boolean unique = true;
        Set<Character> characters = map.keySet();
        for (Character c : characters) {
            if (map.get(c) > 1)
                unique = false;
        }

        return unique;
    }

    private static void findDuplicates(String str) {

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            Integer freq = map.get(ch);
            if (freq == null)
                freq = 0;

            if (freq == 0) {
                map.put(ch, 1);
            } else {
                freq++;
                map.put(ch, freq);
            }
        }

    }
}
