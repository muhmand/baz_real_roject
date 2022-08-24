package string_practice_with_boot;

public class StringPQs {
    /*
    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
    helloName("Bob") → "Hello Bob!"
    helloName("Alice") → "Hello Alice!"
    helloName("X") → "Hello X!"
     */
    public static void main(String[] args) {
        System.out.println(helloName("Baz"));
        System.out.println();
        System.out.println(makeAbba("Java", "fun"));

    }
    // String Q1
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }


   // Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi"
   // String Q2
    public static String makeAbba(String a, String b) {
        return a + b + " " + b + a;
    }


}
