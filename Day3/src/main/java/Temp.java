/**
 * Created by desair4 on 11/21/2016.
 */
public class Temp {

    public static void main(String[] args) {
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
}
