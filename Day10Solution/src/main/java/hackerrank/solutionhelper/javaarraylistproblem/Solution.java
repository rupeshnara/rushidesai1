package hackerrank.solutionhelper.javaarraylistproblem;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by desair4 on 12/7/2016.
 */
public class Solution {
    private static Scanner scanner = new Scanner(System.in);

    /*
    * NOTE: Dont modify this class. Copy this class into new class called "SolutionFinal" and make changes there.
    * You can copy this entire code (except package declaration) and paste it in hackerrank link and run it there to
    * pass all test cases and then create new File here in same package called 'SolutionFinal' with your entire 'Sccucesfull' code
    * which passes all test cases from hacker rank link.
    * */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<List<Integer>> input = readInput();

        //Prints input to make sure we have recorded input correctly.
        //NOTE: Not related to problem statement and can be removed in final submission
        for (List<Integer> listy : input) {
            for (Integer i : listy) {
                System.out.print(i);
            }
            System.out.println();
        }


        //Query part
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();

        for (int i = 0; i < queries; i++) {
            int y = scanner.nextInt();
            int x = scanner.nextInt();

            //write your code here to answer the queries
            //You can modify input reading code also if you wish
            //Hint : The data-structure (DS) that I am using to store input is terrible to answering the queries
            //You need to
            // 1. Pick a better DS suitable for the kind of queries being answered here.
            // 2. You need to either modify input code to directly store your input in that chosen DS
            //    or copy input from the DS that I am using for storign the input to the one you chose.
            // 3. Finally answer the queries using the new DS you chose and have stored input in.
        }

        scanner.close();

    }

    static List<List<Integer>> readInput() {
        int lines = scanner.nextInt();  //read first line

        List<List<Integer>> xLinkedList = new LinkedList<>();
        for (int i = 0; i < lines; i++) {
            int totalNumbers = scanner.nextInt(); //First number in that line
            List<Integer> yLinkedList = new LinkedList<>();
            for (int j = 0; j < totalNumbers; j++) {
                yLinkedList.add(scanner.nextInt());
            }
            xLinkedList.add(yLinkedList);
        }

//        scanner.close();
        return xLinkedList;
    }
}
