package java_recap;

import java.util.ArrayList;

public class ArrayListPractice {


    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        System.out.println(numbers.lastIndexOf(300));
        System.out.println(numbers.indexOf(200));
    }



}
