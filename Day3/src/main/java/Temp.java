/**
 * Created by desair4 on 11/21/2016.
 */
public class Temp {

    public static void main(String[] args) {
        /**
         * Program execution is
         * 1. top to bottom
         * 2. left to right
         */

//        System.out.println("Hello");
        int i1 = 10;
        int sum = sum(1, 2);    //calling the function
        //sum = 3   //different from sum in function
//        System.out.println(sum);

        //Variables:
//        1. Scope of variables
//        2. Lifetime of variables

        /*
         * Scope:
         *      1. Things you can access.
         *      2. Things you can 'see'
         */

        /*
         * Lifetime of a variable:
         * 1. How long will that variable live in memory.
         */

        boolean b = 1 > 0;
        //changing the execution flow of program
        if (isGT(1, 2)) {
            //true
        } else {
//            false
        }
        int index = 1;


        if (index == 1) {

        } else if (index == 2) {

        } else {

        }

        //execute conditon
        switch (index) {
            case 1:
                //if input == 1
                System.out.println(1);
                System.out.println("exiting 1");
                break;

            case 2:
                //if input == 2
                System.out.println(2);
                break;

            default:
                //if none of cases match input
                System.out.println("Default");
                break;
        }

        System.out.println("out of switch");
        /**
         * while(condition){
         *     //true
         *     println(dfd)
         *
         *     update to condition // will lead to  breaking of loop
         * }
         *
         *
         *
         */

        index = 1;
        /**
         * 1 <= 10
         * 2 <= 10
         *
         * 10 <= 10
         * 11 <= 10 -> false
         *
         */
        while (index <= 10) {
            /**
             * index = 1
             * index = 2
             * ..
             * ..
             * index = 10
             */
            System.out.println(index);

            //update
            index++;    //index = index + 1;
        }
        System.out.println("out of while");

        /**
         * In while initialization, condition checking ,update were separate.
         */

        for (int z = 1; z <= 10; z++) {
            System.out.println(z);
        }

        System.out.println("out of for");


    }

    private static boolean isGT(int i, int i1) {
        return i < i1;

    }

    //will take input of two numbers, return sum of both
    static int sum(int i, int j) {
        //i = 1, j = 2
        //.....
        //Some complex computation. Functions allow you to reuse that computation
        //scope
        int sum = i + j;
        return sum;
    }

    /**
     * function : Does some computation : input -> computation -> output
     *
     *  DatatypeOfReturn nameOfFunction(DatatypeOfInputs variableName,...){
     *
     *  }
     */
}
