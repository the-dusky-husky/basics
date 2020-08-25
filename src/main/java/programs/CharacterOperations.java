package programs;

/**
 * Created by abhisheks on 03-08-2020.
 */
public class CharacterOperations {

    public static void main(String[] args) {

        String strupper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String strlower="abcdefghijklmnopqrstuvwxyz";
        String strdigits="123456789";
        //convertToupper(strlower);
        //convertToLower(strupper);
        //ifAllDigits(strdigits);
        countVowelsAndConsonants(strlower);
    }

    private static void countVowelsAndConsonants(String str) {

        int vowels =0;
        int consonants =0;
        str = str.toLowerCase();
        for (int i=0;i<str.length();i++){
            int c = (int) str.charAt(i);
            if (c >=97 & c <=122)
            {
                char ch = (char)c;
                if (ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u')
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("vowels : "+vowels);
        System.out.println("consonants : "+consonants);
    }

    private static void ifAllDigits(String str) {
        boolean digits=true;
        for (int i=0;i<str.length();i++){
            int ch = (int)str.charAt(i);

            if (ch >=48 && ch<=57)
                continue;
            else
            {
                digits=false;
                break;
            }
        }
        System.out.println("is all digits :"+digits);
    }

    private static void convertToLower(String str) {
        for (int i=0;i<str.length();i++){
            int ch =(int) str.charAt(i);
            if (ch >=65 && ch <=90){
                ch= ch+32;
            }
            System.out.print((char)ch);
        }
    }
    private static void convertToupper(String str) {
        for (int i =0;i<str.length();i++){
            int ch =(int) str.charAt(i);
            if (ch >=97 && ch <=122)
                ch= ch-32;
            System.out.print((char) ch);
        }
    }
}
