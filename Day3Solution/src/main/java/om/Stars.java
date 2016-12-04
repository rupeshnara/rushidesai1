package om;

/**
 * Created by Paul on 12/3/2016.
 */
public class Stars {

//function for starssquare
    public static void starssquare(int n){

        int i, j;

        for (i = 0; i < n ; i++) {
            for (j = 0; j < n-1; j++) {
                // output a single "*" here
                System.out.print("*");
            }
            // output a new line here
            System.out.println("*");
        }

    }

    public static void starstraingle(int n){
        int i, j;

        for (i = 0; i < n  ; i++) {
            for (j = 0; j < i; j++) {
                // output a single "*" here
                System.out.print("*");
            }
            // output a new line here
            System.out.println("*");
        }



    }




    public static void main(String[] args){



        System.out.println("print n by n  in square: ");
        starssquare(3);

        System.out.println("print stars in triangle:");
        starstraingle(3);
}}