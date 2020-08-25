package programs;

import java.util.LinkedHashMap;

/**
 * Created by abhisheks on 03-08-2020.
 */
public class FrequencyChar {

    public static void main(String[] args) {

        String str = "thisxisxaxwarmxplace";
        count(str);
    }

    private static void count(String str) {

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        int max = 0;
        char maxchar=0;
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
            if (freq >= max) {
                max = freq;
                maxchar=ch;
            }
        }

        System.out.println(map);
        System.out.println("max char : "+maxchar);
    }
}
