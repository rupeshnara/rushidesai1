package client;

import api.ConditionalPrinting;
import api.interfaces.IPredicate;

/**
 * Created by desair4 on 12/2/2016.
 */
public class Driver {

    public static void main(String[] args) {

        //Polymorphism
        //How does java implement polymorphism ? Ans: Via Dynamic method dispatch.
        //Dynamic method dispatch is mechanism whereby the implementation of method is only attached at runtime and not compile time
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        PrintEven printEven = new PrintEven();
        ConditionalPrinting.printCond(a, printEven);

       /* System.out.println("Printing odd");
        ConditionalPrinting.printCond(a, new PrintOdd());

        System.out.println("Printing 3 multiples");
        PrintThree printThree = new PrintThree();
        ConditionalPrinting.printCond(a, printThree);*/

        //1. What methods can be called depends on the 'type' of the reference variable
        //2. What code gets executed depends on the 'type' of the objects being referenced or in other words what is
        //   the implementation attached to the reference variable.

    }
}

class PrintThree implements IPredicate {
    //forced overriding
    public boolean doPrint(int i) {
        if (i % 3 == 0)
            return true;

        return false;
    }

    public void dummy() {

    }
}


class PrintOdd implements IPredicate {
    public boolean doPrint(int i) {
        if (i % 2 == 1)
            return true;

        return false;
    }
}