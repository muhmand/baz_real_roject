package string_practice_with_boot;

public class Palindrome {

        public static int isPalindrome(int num) {
            int x = 0;
            int value = 1;
            if (num < 0) {
                return x;
            }
            while (num > 0) {            //
                value = num % 10;       // 121 % 10 == 1 give us the last one (1)
                x += value;             // storing the last num to x   (x = 1)
                x *= 10;                // 1 * 10 == 10
                num /= 10;              // 121 / 10 == 12
            }
            x /= 10;
            return x;
            // 121
        }
    public static void palindrome(Integer x){
      String str = String.valueOf(x) ;
      String temp = "";
        for (int i = str.length()-1; i > -1; i--) {        // 7 8 9 7
            temp += "" + str.charAt(i);                 //   0 1 2 3 4
        }
        if (str.equals(temp)){
            System.out.println("IS PALINDROME");
        } else {
            System.out.println("IN NOT PALINDROME");
        }

    }

    public static void main(String[] args) {

        palindrome(787);



    }








}
