package programs;

/**
 * Created by abhisheks on 03-08-2020.
 */
public class LongestWord {

    public static void main(String[] args) {

        String str="welcome to the machine";
        longestword(str);
    }

    private static void longestword(String str) {

        String[] words = str.split(" ");

        int maxWordLength=0;
        String maxWord="";

        for (int i=0;i<words.length;i++){

            int length = words[i].trim().length();

            if (length >= maxWordLength){
                maxWordLength=length;
                maxWord=words[i];
            }
        }

        System.out.println("max word : "+maxWord);
    }
}
