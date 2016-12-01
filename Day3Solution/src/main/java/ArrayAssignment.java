public class ArrayAssignment {


    static void printAll(int[] anArray) {
        for (int i = 0; i < anArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(anArray[i]);
        }


    }

    static void printEven(int[] anArray) {
        for (int in = 0; in < anArray.length; in++) {
            if (anArray[in] % 2 == 0) {
                System.out.print(anArray[in]);
                System.out.print(",");
            }

        }
    }

    static void printOdd(int[] anArray) {
        for (int in = 0; in < anArray.length; in++) {
            if (anArray[in] % 2 != 0) {
                System.out.print(anArray[in]);
                System.out.print(",");
            }
        }

    }

    static void printBoolean(int[] anArray, boolean condition) {
        if (condition) {
            //true then print even numebrs
            for (int in = 0; in < anArray.length; in++) {
                if (anArray[in] % 2 == 0) {
                    System.out.print(anArray[in]);
                    System.out.print(",");
                }
            }

        } else {
            for (int in = 0; in < anArray.length; in++) {
                if (anArray[in] % 2 != 0) {
                    System.out.print(anArray[in]);
                    System.out.print(",");

                }
            }
        }

		 /*for(int in=0;in<anArray.length; in++){   
             if( anArray[in]% 2 == 0){
            	 System.out.print(anArray[in]);
                 System.out.print(",");
             }
		 }
		 */
    }

    public static void main(String[] args) {

        int[] ar = new int[100];
        for (int i = 1; i < 100; ++i) {
            ar[i] = i;
        }
        printAll(ar);
        System.out.println();
        printEven(ar);
        System.out.println();
        printOdd(ar);
        System.out.println();
        printBoolean(ar, true);
    }

}
