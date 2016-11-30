/**
 * Created by bhumi on 11/22/2016.
 */
public class Ans1 {

    public static void main(String[] args) {

        /*printAll(int[] array);
        printOdd(int[] a);
        printEven(int[] a);
        printCond(int[]a, true);*/
    }

    // 1.c prints all numbers from 1 to 100
   static void printAll(int[] a) {
        int[] array = new int[100];
        for (int i = 0; i <= array.length; i++) {

            array[i] = i + 1;
            System.out.println(array[i]);
        }
    }

    // 1.d prints all odd numbers between 1 to 100
    static void printOdd(int[] a) {
        int[] array = new int[100];

        for (int i = 0; i <= array.length; i++) {

            array[i] = i + 1;
            if (array[i] % 2 == 1) {

                System.out.println(array[i]);
            }
        }
    }

    // 1.e prints all even numbers between 1 to 100
    static void printEven(int[] a) {
        int[] array = new int[100];

        for (int i = 0; i <= array.length; i++) {

            array[i] = i + 1;
            if (array[i] % 2 == 0) {

                System.out.println(array[i]);
            }
        }
    }

    //1.f prints even if doPrint is true and prints odd if doPrint is false

    static void printCond(int[] a, boolean doPrint) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            doPrint = false;
            array[i] = i + 1;

            // prints odd since doPrint is false here
            if (!doPrint)
                if (array[i] % 2 == 1) {

                    System.out.println(array[i]);
                }

            // prints even since doPrint becomes true here
            if(doPrint) {
                if (array[i] % 2 == 0) {

                    System.out.println(array[i]);
                }
            }
        }
    }
}
