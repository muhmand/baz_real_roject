package java_recap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {


    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        System.out.println(numbers.lastIndexOf(300));
        System.out.println(numbers.indexOf(200));

        boolean num1 = numbers.contains(400);
        System.out.println(num1);

        System.out.println("-------------------------------------------------------");

        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(100);
        numbers1.add(200);
        numbers1.add(300);
        boolean equals = numbers.equals(numbers1);
        System.out.println(equals);

        System.out.println("-------------------------------------------------------");
        boolean empty = numbers1.isEmpty();
        System.out.println(empty);

        System.out.println("-------------------------------------------------------");
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(10);
        numbers2.add(20);
        numbers2.add(30);
        numbers2.add(40);
        numbers2.add(50);


        boolean r4 = numbers2.containsAll(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println(r4);

        System.out.println("-------------------------------------------------------");
        System.out.println(numbers2);
        numbers2.addAll(Arrays.asList(60,70,80,90,100));

        System.out.println(numbers2);

        System.out.println("-------------------------------------------------------");

        // removeAll(Collection Type)
        numbers2.removeAll(Arrays.asList(80,90,100));
        System.out.println(numbers2);

        System.out.println("-------------------------------------------------------");

        // retainAll(Collection Type)
        numbers2.retainAll(Arrays.asList(60,70));
        System.out.println(numbers2);



    }



}
