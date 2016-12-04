package solutions;

/**
 * Created by saikrishnareddy on 11/22/2016.
 */
public class ArrayTest {

    public static void main(String[] args) {

        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            //void printall(int[] a);
            //System.out.println(a[i]);
            //i++;
        }
        System.out.println("Printing list of Array");
        printAll(a);
        System.out.println("Printing Even list of Array");
        printEven(a);
        System.out.println("Printing Odd list of Array");
        printOdd(a);
        System.out.println("Printing condition");
        printCond(a, true);
    }

    public static void printAll(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

    public static void printEven(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) ;
            System.out.println(a[i]);
        }
    }

    public static void printOdd(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) ;
            System.out.println(a[i]);
        }
    }

    public static void printCond(int[] a, boolean condition) {
        if (condition) {
            printEven(a);
        } else {
            printOdd(a);
        }
        System.out.println(condition);
    }
}

