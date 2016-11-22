package variable.driver;

import variable.pojo.Point;
import variable.scope.Friend;
import variable.scope.Student;

/**
 * Created by desair4 on 11/21/2016.
 */
public class Test {

    //Variables: Understand two things to completely understand Java language
    //1. Scope of variables
    //2. Lifetime of variables
    /*
     * Scope:
     *      1. Things you can access.
     *      2. Things you can 'see'
     */

    /*
     * Lifetime of a variable:
     * 1. How long will that variable live in memory.
     */

    /**
     * OOP's : Object Oriented programming.
     * <p>
     * 1. Encapsulation -> Scope
     */
    public static void main(String[] args) {

        Friend hk = new Friend();       //object
        Friend otherFriend = new Friend();
        Student sai = new Student();

//        hk.icecream = "Vanilla"; //This is not valid since it is default scope

//        hk.password = "1212";     //This

//        System.out.println(hk.password);
        hk.movies = "Horror";
        otherFriend.movies = "comedies";
//        hk.printPassword();
        hk.printMovies();
        otherFriend.printMovies();


        Point p = new Point();

//        p.x = "Other";
        p.setX("Anitha");   //p.x = "Anitha"
        p.setY(10);

        System.out.println(p.getX());
        System.out.println(p.getY());
    }

    /**
     * Memory representation:
     *
     *   ----------------------------------memory space for hk---------------
     *      movies = "Horror"
     *
     *      printMovies(){
     *
     *          movies -> horror
     *      }
     *   --------------------------------------------------------------------
     *
     *
     *   ----------------------------------memory space for otherFriend---------------
     *      movies = "Comedy"
     *
     *      printMovies(){
     *
     *          movies -> comedy
     *      }
     *   --------------------------------------------------------------------
     */
}
