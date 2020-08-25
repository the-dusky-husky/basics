package programs;

/**
 * Created by abhisheks on 03-08-2020.
 */
public class Palindrom {

    public static void main(String[] args) {

        String str = "ooloo is a very olooloolo place xxxxxyyyyxxxxx";
//        palindromchecker(str);

        longestpalindrom(str);
    }

    private static void longestpalindrom(String str) {

        String[] words = str.split(" ");
        String maxPalindrom="";
        for (int i=0;i<words.length;i++){

            boolean ispalindrom=palindromchecker(words[i].trim());
            System.out.println("word :"+words[i] + ", "+ ispalindrom);

            if (ispalindrom){
                int maxLength =0;

                int length = words[i].trim().length();
                if (length >maxLength){
                    maxLength=length;
                    maxPalindrom=words[i];
                }
            }
        }

        System.out.println("max palindrom : "+maxPalindrom);
    }

    private static boolean palindromchecker(String str) {

        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse= reverse+str.charAt(i);
        }

        if (reverse.equals(str))
            return  true;

        else return false;
    }
}
