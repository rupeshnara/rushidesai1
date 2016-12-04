package solutions;

import java.util.Scanner;

/**
 * Created by saikrishnareddy on 12/4/2016.
 */
public class Starsquare {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter n:");
        int in = n.nextInt();
        {
            for (int i = 0; i < in; i++) {
                for (int j = 0; j < in; j++) {
                    System.out.println("*");
                }
                System.out.println();
            }
        }
    }
}
