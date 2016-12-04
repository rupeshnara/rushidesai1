package controlStatements;

public class StarProgram1 {
    public static void main(String[] args) {
        int n = 2;
        for (int i = 1; i <= n; i++) {
            for (int st = 1; st <= 2; st++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int m = 3;
        for (int i = 1; i <= m; i++)  // no of rows
        {
            for (int st = 1; st <= 3; st++) // no of columns
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
