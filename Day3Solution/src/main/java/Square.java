import java.util.Scanner;


public class Square {
    public static void main(String args[]) {
        int n, i, j;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows in square pattern");
        n = in.nextInt();
 
        /* Row iterator for loop */
        for (i = 0; i < n; i++) {
            /* Column iterator for loop */
            for (j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

