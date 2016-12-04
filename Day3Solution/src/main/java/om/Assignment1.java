package om;

/**
 * Created by Paul on 12/3/2016.
 */
public class Assignment1 {

   public static void printAll(int[] a){
        for (int i = 0; i < 100; ++i) {
            a[i] = i;
            System.out.print(a[i]+ " ");

        }}
    // if the number is divisible by 2 then it is even method
    public static void printEven(int[] a){

        for(int i=1; i <= a.length; i++){


            if( i % 2 == 0){
                System.out.print(i + " ");
            }
    }}

    // if the number is not divisible by 2 then it is odd method
    public static  void printOdd(int[] a) {
            for (int i = 1; i <= a.length; i++) {


                if (i % 2 == 1) {
                    System.out.print(i + " ");
                }
            }
        }

    void printCond(int[] a, boolean condition) {

        if (condition == true) {

            printEven(a);


        } else {
            printOdd(a);
        }
    }



    public static void main(String[] args) {

        int[] a;
        a = new int[100];

        System.out.println("prints all elements : ");
        printAll(a);

        System.out.println("\n prints all even  elements :");
        printEven(a);

        System.out.println("\n prints all odd  elements :");
        printOdd(a);



    }}
















