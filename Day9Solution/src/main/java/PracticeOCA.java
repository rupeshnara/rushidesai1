/**
 * Created by bhumi on 12/13/2016.
 */
public class PracticeOCA extends TestClass implements PractiveInterface {

    public int add(int a, int b){
        return a+b;
    }

    public int multiply(int a, int b){
        return 10;
    }
    public static void main(String[] args){

        PracticeOCA poca1 = new PracticeOCA();
        TestClass tc1 = new TestClass();
        TestClass tc2 = new PracticeOCA();

        System.out.println(poca1.multiply(2,3));
        System.out.println(poca1.add(1,2));
        System.out.println(tc1.multiply(2,3));
        System.out.println(tc1.x);

    }
}
