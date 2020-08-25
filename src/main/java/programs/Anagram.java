package programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

/**
 * Created by abhisheks on 03-08-2020.
 */
public class Anagram {

    public static void main(String[] args) {

        String str1="dancepappucant";
        String str2="pappucantdance";

        checkanagram(str1, str2);
    }

    private static void checkanagram(String str1, String str2) {

        String sortedstr1= sortString(str1);
        String sortedstr2= sortString(str2);

        if (sortedstr1.equals(sortedstr2))
            System.out.println("anagram");
        else
            System.out.println("not anagram");
    }

    private static String sortString(String str) {

        String[] arr  = str.split("");

        Arrays.sort(arr);

        return Arrays.toString(arr);
    }
}
