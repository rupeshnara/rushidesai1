/**
 * Created by bhumi on 11/29/2016.
 */
public class Ans3{
       static void printStars(int n){

            for (int i =0; i <n; i++){

                System.out.println("");

                for (int j=0; j <=i; j++){
                    System.out.print("*");
                }
            }
        }

        public static void main(String[] args) {

            printStars(4);

        }
}
