package solutions;

import java.util.Scanner;

/**
 * Created by saikrishnareddy on 12/4/2016.
 */
public class Startriangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = in.nextInt();
        {
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
