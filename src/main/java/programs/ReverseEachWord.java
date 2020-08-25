package programs;

/**
 * Created by abhisheks on 03-08-2020.
 */
public class ReverseEachWord {

    public static void main(String[] args) {

        String str = "this is a cool cold drink";
        reverseEachWord(str);
    }

    private static void reverseEachWord(String str) {
        String[] words = str.split(" ");
        String totalString="";
        for (int i=0;i<words.length;i++){
            String word = words[i];
            String reverseWord="";
            for (int j=word.length()-1;j>=0;j--){
                reverseWord=reverseWord+word.charAt(j);
            }
            totalString=totalString+reverseWord + " ";
        }
        System.out.println(totalString);
    }
}
