package java_recap.groupPractice;


import java.util.ArrayList;
import java.util.Arrays;

public class day01 {



    public static ArrayList<Integer> missingNumbers(ArrayList<Integer> input){

        ArrayList<Integer> output = new ArrayList<>();

        outer:  for (int i = 1; i <= 10; i++){ //1,2:10
            int count = 0;
            inner: for(int j = 0; j < input.size(); j++) { //1,7,4,3,9,10

                if(i == input.get(j)){
                    count++;
                }
            }
            if(count == 0){
                output.add(i);
            }
        }
        return output;

    }
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,7,4,3,9,10));
        System.out.println(missingNumbers(nums));

        String str ="()"; //true
        String str1 ="()[](}"; //T
        String str2 ="(]"; //F
        System.out.println(brackets(str1));
         /*
        Baz
            1.charArray
            Loop through
            if-->
            else if -->
          */


        System.out.println(isPalindrome("ava"));

    }

    private static boolean isPalindrome(String input) {
        // boolean isEqual = false;
        String reversed = "";

        for(int i = input.length()-1; i >= 0 ; i-- ){
            reversed += ""+input.charAt(i);
        }
        if(input.equals(reversed)){
            return true;
        }

        return false;
    }


    public static boolean brackets(String input){

        // System.out.println(input.charAt(1));

        boolean isTrue = false;

        char[] arr = input.toCharArray();// ['(',')','[',....]

        //Str - length(), arr - length , list=map - size()
        //    System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i=i+2){ //0,2,4
            if(arr[i]=='(' && arr[i+1] == ')'){
                isTrue = true;
            } else if (arr[i] =='{' && arr[i+1] == '}') {
                isTrue = true;
            }else if (arr[i] =='[' && arr[i+1] == ']') {
                isTrue = true;
            }else {
                return false;
            }
        }

        return isTrue;
    }
}





/*
Find missing numbers from 1,7,4,3,9,10
Logic: ?
Baz --> newlist = 1-10
        emptyArrayList
        compare arg with newlist
        if (newlist.get(i) != )

Alper --> count 1-10
           compare (list)
 */


