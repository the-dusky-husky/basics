package programs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Created by abhisheks on 03-08-2020.
 */
public class Permutations {

    public static void main(String[] args) {


        String str = "park";

        permutations(str);
    }

    private static void permutations(String str) {


        for (int i = 0; i < str.length(); i++) {
            String character = String.valueOf(str.charAt(i));
            String substr = str.substring(0, i) + str.substring(i + 1);
            System.out.println("character : " + character + ", substring :" + substr);
            merge(character, substr);

        }
    }

    private static void merge(String character, String str) {

        for (int i = 0; i <= str.length(); i++) {

            String permutation = str.substring(0, i) + character + str.substring(i);
            System.out.println(permutation);
        }
    }

}

