package string_practice_with_boot;
public class PQ7_8 {

    public static void main(String[] args) {
        System.out.println(withoutEnd("Hello"));
        System.out.println("-------------------");
        System.out.println(comboString("Hello", "Hi"));
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

    /*
    Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"
     */

    public static String comboString(String a, String b) {
        if (a.length() > b.length()){
            return b + a + b;
        } else {
            return a + b + a;
        }
    }

    // just comments to see in the terminal job


}

