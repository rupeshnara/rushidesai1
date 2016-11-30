public class Array {
    private static void printAll(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void printOdd(int[] a) {


        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);

            }
        }
    }

    private static void printEven(int[] a) {


        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);

            }
        }
    }

    public static void printCond(int[] a, boolean condition) {
        if(condition)
        {
            printEven(a);
        }else
            printOdd(a);
       /* int i = 0;
        if (a[i] % 2 == 0) {
            System.out.println("even values");
            printEven(a);
        } else
            System.out.println("odd values");
        printOdd(a);*/

    }


    public static void main(String args[]) {
        int[] a = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = i + 1;
        }
        printAll(a);
        System.out.println("Even values are:");
        printEven(a);
        System.out.println("Odd values are:");
        printOdd(a);
        System.out.println("Boolean is ");
        printCond(a, true);
    }

}


	