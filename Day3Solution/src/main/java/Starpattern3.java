import java.util.Scanner;

public class Starpattern3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter number");
        n = sc.nextInt();
        for (int in = 1; in <= n; in++) {
            for (int j = 1; j <= in; j++) {
                //if(j<=in)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}