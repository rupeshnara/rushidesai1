package driver;

import variables.Lifetime;

/**
 * Created by desair4 on 11/22/2016.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Main started");

        //----------------------------------------
        Lifetime lf = new Lifetime();
        /*
        * ------------Heap------------------------
        *  1000 (Lifetime)
        *  weight
        *  height
        *  age = 12, 14
        *
        *  2000 (Lifetime)
        *  age
        *  height
        *  weight
        *
        * ----------------------------------
        *
        * ------------stack1-----------------
        * //main's stack
        *  lf = 1000
        *  anotherLf = 1000
        *  newLf = 2000
        *  3000 a = 100
        * --------------------------------
        *
        * ---------stack2 (changeLifetime function when called 1'st time)-----------------
        * //Every function will be given its own stack.
        * //In this case this stack is specific to changeLifetime function
        *  Lifetime lifetime    //passed as arguments
        *  int a                //as arguments
        *
        *   has all variables which that specific block can access
        *   lf = 2000   //
        *   4000 a = 100, 110
        *
        *   //stakc will be destroed as soon as you leave the function
        * -------------------------------
        *
        * * ---------stack3 (changeLifetime function when called 1'st time)-----------------
        * //Every function will be given its own stack.
        * //In this case this stack is specific to changeLifetime function
        *  Lifetime lifetime    //passed as arguments
        *  int a                //as arguments
        *
        *   has all variables which that specific block can access
        *   lf = 2000   //
        *   4000 a = 100, 110
        *
        * -------------------------------
        *
        *
        * Young gen
        * Perm Gen
        *
        *
        * */

        lf.weight = 20;
        lf.setAge(12);
        //---------------------------------------

        //Golden Rule 1: The variables lives as long as someone has reference to that variable.

        //-------------------------Digression-----------------
        //References
//        Lifetime anotherLf = new Lifetime();
        Lifetime anotherLf = lf;        //it is not 6, it is 3


        //How much memory is reserved at runtime
        //Ans : 3 units

        int i = 10;
        System.out.println(i);
        System.out.println(lf);
        System.out.println(anotherLf);          //Objects toString() method.

        anotherLf.setAge(14);
        System.out.println(lf);
        System.out.println(anotherLf);          //Objects toString() method.

        /*
        * Compile checkes if a class has a toString method,
        * if it has -> do nothing
        * if it doest not have -> then inject a default one.
        *
        * */
        //------------------------------------------------

        //---------------------Back to lifeTime discussion
        Lifetime newLf = lf.getInstance();


        //-----------------Digression
        //Pass by reference and pass by value

        int a = 100;
        lf.changeAgeLifetime(lf, a); //1000 -> age at 1000 is set to 100
        lf.changeAgeLifetime(anotherLf, a + 10);   //age at 1000 is set to 110

        System.out.println(lf);
        System.out.println(anotherLf);


        //Golden Rule 2 : In java everything except primary data types is passed by reference. If its primary data type, then its passed by value(copy)
        System.out.println(a);


        //Rule: primary variables are stored in stack not in heap //Not so important
        //-----------------------------------------

        //---------------How to change lifetime of variable-------------
        //1. lifetime of variable is tied to where it's declared
        //2. lifetime of instance variables i.e. variables declared at class level is tied to lifetime of the object.
        //3. lifetime of object is dictated by Golden Rule 1.
        //4. lifetime of instance variables which are 'static' is tied to lifetime of class in which they are declared.
        //      (For most of the cases this is lifetime enitre program. )


        /*
        *           Memory respresentation
        *
        *           Lifetime
        * -----------------------------------------------------------
        *                   static variables
        *                  count
        *
        * -----------------------------------------------------
        *           lf1                |            lf2
        *        age                   |           age
        *        weight                |         weight
        *
        * */

        lf.count++;

        System.out.println(lf.count);

        anotherLf.count++;

        System.out.println(anotherLf.count);
        //-----------------------

        System.out.println("Main end");
    }
}