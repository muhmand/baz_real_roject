package string_practice_with_boot;

public class StringPQ9_11 {


    /*
    Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
     */
    public static void main(String[] args) {
        System.out.println(nonStart("Hello", "Three"));

        System.out.println();

        System.out.println(left2("Hello"));

        System.out.println();
        System.out.println(right2("Hello"));

    }

    public static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    /*Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.


    left2("Hello") → "lloHe"
    left2("java") → "vaja"
    left2("Hi") → "Hi"*/

    public static String left2(String str) {
        if(str.length() > 2){
            return str.substring(2) + str.substring(0,2);
        } else{
            return str;
        }
    }



    /*
    Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"

     */

    public static String right2(String str) {
        if (str.length() > 2)
            return str.substring(str.length()-2) + str.substring(0,str.length()-2);
        else
            return str;


    }

}

