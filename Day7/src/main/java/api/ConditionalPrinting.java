package api;

import api.interfaces.IPredicate;

/**
 * Created by desair4 on 12/2/2016.
 */
public class ConditionalPrinting {
    /*
    * 1.d Write a function with following signature: >void printCond(int[] a,boolean condition)
    * that prints a. even values if 'condition' is 'true' b. odd values if 'condition' is 'false'
    * */

    public static void printCond(int[] a, IPredicate predicate) {
        // predicate = new PrintEven()
        // predicate = new PrintOdd()
        // predicate = new PrintThree()

        //1 -> print all even nos, 2 -> print all odd nos.
        for (int i = 0; i < a.length - 1; i++) {
            int currentNumber = a[i];
//            System.out.println("your code");
            //client tells me if I should print this number or not.
//            System.out.println("client code");//someConditionByClient

            //
            boolean doPrint = predicate.doPrint(i);
            if (doPrint)
                System.out.println(i);
            //You are allowing client to give you code that you will execute when you want.
//            System.out.println("your code");
        }
        //I want to allows the client of this method to provide me on what condition should I print or not print.
    }

}
/*

//if condition == true -> print even
//if condition == false -> print odd
        for (int i = 0; i < a.length - 1; i++) {
        int currentNumber = a[i];
        if (condition) {
        //printin even numbers
        if (currentNumber % 2 == 0) {
        System.out.println(i);
        }
        } else {
        //printin odd numbers
        if (currentNumber % 2 == 1) {
        System.out.println(i);
        }
        }
        }*/
