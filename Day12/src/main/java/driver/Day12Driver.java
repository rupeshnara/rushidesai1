package driver;

import child.SavingsAccount;

/**
 * Created by desair4 on 12/9/2016.
 */
public class Day12Driver {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //final

        //Problem: We dont want certain fields to change once initialized
        //e.g. In account class we dont want accountNumber to change after a value is given.

        //field to be given a value once, we can think of not providing setter method.
        //constructors

        //Java decided to make this a language feature.
        //if you declare any field as final, compiler can then do many optimizations.
        //compiler can now change the order of assignments of final fields etc..

        //final with variables -> cannot change values. 1. If its instance variable : You have to init where you declare or use constructor. 2. static : assign value when you declre it
        //final with methods -> final methods cannot be overriden
        //final with classes -> fnial classes cannot be extended

        //final classes and immutability
        //funtional programming languages like Haskell, clojure follow complete immutability
        //immutability : means you cannot change the value once defined.
        //this means if you define string -> then if you try to change it -> it will be different object

        String s = "String1";
        String s1 = s;
        /*
        * ------------------------------Heap----------------
        *
        * 1000 String1,//String1String2
        * 2000 String1String2
        * 3000 String1
        * 4000 String1
        * 5000 -1
        * 6000 -10
        * 7000 -101
        * 8000 -1012
        *
        *
        * 10000 -1,-10,-101,-1012..
        * -----------------------------Stack-----------------
        * s = 1000
        * s1 = 1000
        * s3 = 2000
        * s4 = 3000
        * s5 = 4000
        * s12 = 5000,6000,7000,8000
        *
        *
        * Pool of Strings: can be reused.
        *
        * */
        String s3 = s.concat("String2");

        System.out.println(s);
        System.out.println(s3);

        //String are immutable so whenever you do any 'modify' operations on any string they are actually never modified

        String s4 = new String("String1");
        String s5 = "String1";


        //what if you are in a for loop
        String s12 = "-1";
        //extremely bad
        for (int i = 0; i < 10; i++) {
            s12 = s12 + i;      //    s12 + i -> creates a new string -> then assigns to s12 again
        }
        System.out.println(s12);    //BAD

        //StringBuilder or StringBuffer mutable version of String
        StringBuilder sb = new StringBuilder("-1");
        for (int i = 0; i < 10; i++) {
            sb.append(i);
        }
        System.out.println(sb.toString());  //THis version is far more effiient than first one.

        //s = s1 != s4 != s5
        //s -> s1 -> s4 -> s5 -> 452(memory address)
        //if objects were mutable -> then we have to worry that if I modify s then it should modify s1 but not s4 and s5
        //but since string is immutable we dont have to worry about 'modify'
        //At max you can point s to different string -> s = "String124"

        System.out.println("something");

        //Memory model
        //Access Modifiers
        //Lifetime of variables
        //Inheritance

        //Reflections
        //relfections allow you to read private fields, allow you to bypass encapsulation, allow you to query objects and classes
        SavingsAccount savingsAccount = new SavingsAccount(1, 12345678);
        System.out.println(savingsAccount);
//        ------------------------------------
        ReflectionsHelper.inspect(savingsAccount);

        System.out.println(savingsAccount); //So we bypass encapsulation !!

        //You can disable access of private fields by something called security managers


        //Autoboxing - Unboxing
        //Wrapper types
        //int , char , boolean
//        List<int> l = new ArrayList<int>(); // this will not compile

        int i1 = 12;//int - 32 bits
        Integer i = new Integer(12); //Auto-Boxing  //Con -> this occupies more space than int
        int i2 = i; //Auto-Unboxing

        Character char1 = 'c';
        char char2 = 'c';

        Float f;
        Double do1 = 12d;
        double do2 = 12d;

        Boolean b = true;
        boolean b1 = b;

        //-----------Enums
        //Problem statement: In mane cases you want a public static String field

 /*       switch (savingsAccount.TYPE){
            case "Checking":
                System.out.println("Checking");
                break;
            case "Savings":
                System.out.println("Savings");
        }
 */
        switch (savingsAccount.TYPE) {
            case CHECKING:
                System.out.println(savingsAccount.TYPE.value);
                break;
            case SAVINGS:
                System.out.println(savingsAccount.TYPE.value);
        }


    }
}


/*
Will not compile since String is final and you cannot inherit from final class

class CustomString extends String{

}
*/
