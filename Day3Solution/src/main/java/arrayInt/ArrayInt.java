package arrayInt;

public class ArrayInt {
    private static void printAll(int[] anArray) {
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = i;
            System.out.print(anArray[i] + " ");
        }
    }

    private static void printOdd(int[] anArray) {
        for (int i = 0; i <= anArray.length; i++) {

            //if the number is not divisible by 2 then it is odd
            if (i % 2 != 0) {
                System.out.print(anArray[i] + " ");
            }
        }
    }
         /*   private static void printEven(int[] anArray)
            {
                for(int i=0; i <= anArray.length; i++){

                    //if the number is not divisible by 2 then it is odd
                    if( i % 2 == 0){
                        System.out.print(anArray[i] + " ");
                    }
                }
            }*/

    public static void main(String[] args) {
        int[] testArray = new int[100];
        printAll(testArray);
        printOdd(testArray);
        // printEven(testArray);
    }

}
