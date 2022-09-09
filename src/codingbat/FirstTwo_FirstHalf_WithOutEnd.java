package codingbat;
public class FirstTwo_FirstHalf_WithOutEnd {


/*
Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"
 */


          /*  String str = "Apple";*/
        public static String firstTwo(String str) {
            if(str.length() > 2){
                return str.substring(0,2);
            } else {
                return str;
            }
        }

        /*
        Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
         */

    public static String firstHalf(String str) {
        /*if (str.length() % 2 == 0){*/
        return str.substring(0,str.length()/2);
    }
    /*
    Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
     */
    public static String withoutEnd(String str) {
        return str.substring(1, str.length()-1);
    }



    public static void main(String[] args) {
        System.out.println(firstTwo("Apple"));
        System.out.println("---------------------");
        System.out.println(firstHalf("WooHoo"));
        System.out.println("-----------------------");
        System.out.println(withoutEnd("Hello"));

        for (int i = 0; i < 20; i++) {
            System.out.println(i);

        }
    }
    }
