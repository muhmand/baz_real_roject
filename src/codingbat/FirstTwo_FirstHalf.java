package codingbat;
public class FirstTwo_FirstHalf {


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


    public static void main(String[] args) {
        System.out.println(firstTwo("Apple"));
        System.out.println("---------------------");
        System.out.println(firstHalf("WooHoo"));
    }
    }
