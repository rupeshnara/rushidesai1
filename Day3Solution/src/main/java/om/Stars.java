package om;

/**
 * Created by Paul on 12/3/2016.
 */
public class Stars {


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

    public static void main(String[] args){



        System.out.println("print n by n stars: ");
        starssquare(3);
}}