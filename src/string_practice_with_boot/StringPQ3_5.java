package string_practice_with_boot;

public class StringPQ3_5 {
    public static void main(String[] args) {
        System.out.println(makeTags("i", "Yay"));
        System.out.println();
        System.out.println(makeOutWord("(())", "Baz"));
        System.out.println();
        System.out.println(extraEnd("Baz"));
    }
    /*
    The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
     makeTags("i", "Yay") → "<i>Yay</i>"
     */
    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
    /*
     Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
     makeOutWord("<<>>", "Yay") → "<<Yay>>"
    */
    public static String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2);
    }
    /*
    Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
    extraEnd("Hello") → "lololo"     */
    public static String extraEnd(String str) {
        if (str.length() >2){
            return  str.substring(str.length() -2) + str.substring(str.length() -2) +str.substring(str.length() -2);
        } else {
            return str + str + str;
        }
    }


}
