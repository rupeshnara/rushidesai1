package solutions;

public class Assignment1 {


    void printCond(int[] arr, boolean condition) {
        for (int i = 0; i < arr.length - 1; i++) {

            //iterate though array

//            then for each element
            if (condition) {
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i]);
                }
            } else {
                if (arr[i] % 2 == 1) {
                    System.out.println(arr[i]);
                }
            }
        }

       /* if (condition) {
            //printEven
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i]);
                }
            }
        } else {
            //printOdd
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i]);
                }
            }
        }*/
    }
}
