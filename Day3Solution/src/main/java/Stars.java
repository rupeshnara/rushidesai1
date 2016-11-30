import java.util.Scanner;


public class Stars {
    public static void main(String args[])

    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = in.nextInt();
        int i, j;
        for (i = 0; i <= n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
