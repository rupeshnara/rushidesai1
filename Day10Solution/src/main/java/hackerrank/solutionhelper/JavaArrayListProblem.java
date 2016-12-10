package hackerrank.solutionhelper;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by desair4 on 12/7/2016.
 */
public class JavaArrayListProblem {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<List<Integer>> input = readInput();

        //Prints input to make sure we have recorded input correctly.
        //NOTE: Not related to problem statement and can be removed in final submission
        for (List<Integer> listy : input) {
            for (Integer i : listy) {
                System.out.println(i);
            }
            System.out.println();
        }

        //Query part
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();

        for (int i = 0; i < queries - 1; i++) {
            int y = scanner.nextInt();
            int x = scanner.nextInt();

            //write your code here to answer the queries
        }

        scanner.close();

    }

    static List<List<Integer>> readInput() {
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();

        List<List<Integer>> xLinkedList = new LinkedList<>();
        for (int i = 0; i < lines - 1; i++) {
            int totalNumbers = scanner.nextInt();
            List<Integer> yLinkedList = new LinkedList<>();
            for (int j = 0; j < totalNumbers - 1; j++) {
                yLinkedList.add(scanner.nextInt());
            }
            xLinkedList.add(yLinkedList);
        }

        scanner.close();

        return xLinkedList;
    }
}
