package string_practice_with_boot;

public class Palindrome {


    public static void main(String[] args) {

        int x = 2567121;
        String intToString = ""+x;

        String intTo = String.valueOf(x);
        String temp = "";
        for (int i = intTo.length()-1; i >= 0 ; i--) {
            temp += "" +intTo.charAt(i);
        }
        if(intTo.equals(temp)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }


        System.out.println(" = " + isPalindrome(431134));


    }

        public static int isPalindrome(int num){
            int x = 0;
            int value = 1;
        if(num < 0){
            return x;
        }

        while (num > 0){            //
            value = num % 10;       // 121 % 10 == 1 give us the last one (1)
            x += value;             // storing the last num to x   (x = 1)
            x *= 10;                // 1 * 10 == 10
             num /= 10;              // 121 / 10 == 12
        }
        x /= 10;
        return x;
        }













}
