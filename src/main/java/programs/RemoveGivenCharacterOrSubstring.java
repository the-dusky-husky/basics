package programs;

/**
 * Created by abhisheks on 03-08-2020.
 */
public class RemoveGivenCharacterOrSubstring {

    public static void main(String[] args) {

        String str="hey you out there in the cold getting lonely getting out cold";
        removeCharacter(str,'y');
        removeSubsstring(str,"out");
    }

    private static void removeSubsstring(String str, String remove) {

        String[] words = str.split(" ");
        String finalString="";

        for (int i=0;i<words.length;i++){
            String word = words[i];

            if (!word.equals(remove))
                finalString+=word+" ";
        }
        System.out.println(finalString);
    }

    private static void removeCharacter(String str, char charToRemove) {
        String finalString = "";
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if (ch!=charToRemove){
                finalString=finalString+ch;
            }
        }
        System.out.println(finalString);
    }
}
