package collections;

import java.util.*;

/**
 * Created by desair4 on 12/6/2016.
 */
public class ListDemo {

    /*
    * Collections : Library part of java
    * Data-structors written for java language : Way to store information 'efficiently' at runtime.
    *
    * 'Efficient' :
    * 1. In terms of memory
    * 2. In terms of 'speed' : Speed to answer specific queries
    *
    *   Time complexities.
    * */
    public static void main(String[] args) {

        //arrays -> 2,3,1,6,4,11
        List list = new ArrayList();
        //Object[] arr = new Object[]

        list.add(11);
        list.add(20);
        list.add(15);
        list.add(18);
        list.add(31);
        list.add("String1");

        list.add(2, "new Element");  //


        System.out.println(list);

        /*
        * 1. ArrayList is stored exactly like arrays
        * 2. Arrays are kind of static in length.
        *
        * Remember the previousAccountNumbers -> I need to say how many accounts I will have
        *
        * int[] previousAccountNumbers  = new int[10];
        *
        * what happens if my entire array is full?  Then I can manually create new array of bigger length, copy entire
        * contents from old array to new array
        * and then discard old array and continue to use new array
        *
        * If we use arrayList this is automatically done for us.
        *
        * 1. For arrays you need to store information in contagious memory location
        *
        * if length of arrayList is 3
        * 1000 100
        * 1001  10,'new Element'
        * 1002  12, 10
        * 1003  12
        *  ...
        * 1000000000  200, replaced by whats at 99999999
        * 1000000001   200
        * 20000000000
        *
        * -----------------------
        *
        * 2000000000  100
        * 2000000001   "new Element"
        * 2000000002    10
        * 2000000003     12
        *
        * 3000000001   200
        *
        * */
        System.out.println(list.get(3));        //Running time for this call is 'constant'


        //I am changing to what it refers. SO earlier it was refering to ArrayList now it Refers to LinkedList object
        list = new LinkedList();
        //What we can access, depends on the reference variable type.
        //SO besically what vraibles, methods etc we can access depends on List in our example.
        list.add(12);
        list.add(100);
        list.add("String");
        list.add(15);
        list.add(120);

        System.out.println(list);
        System.out.println(list.get(3));    //running time for this call is 'n', where n = 3 here

        //But what gets executed depends on type of Object the variable is referncing.
        //class implements a interface -> that class is also a child of that interface
        //Polymorphism can be achieved, whenever there is Inheritance. Whenever the reference variable is of type parent, and Object is itself or one of its sublcass


        //Penalty paid for getting billionth element in ArrayList is say 3 ms, then same penatly is for gettign 1st element
        //Penalty paid for getting billionth element in LinkedList is say 3*Billion ms, then same penatly is for gettign 1st element is 1*3 ms

        //ArrayList is fa more effficient for 'get()' wuery than linkedList

        /*
        *  12 -> 100 -> String -> 15 -> 120
        *
        *   You dont need contagious memory location for linkedList
        *
        * 1000  12 6000   index0
        *
        * 3000 100 4000   index1
        *
        * 4000 String 5000     index2
        *
        * 5000 15 2000         index3
        *
        * 2000 120 -> null  index4
        *
        * 6000 90 -> 3000
        *
        * */

        //Say I want to add at index 1
        //Penalty paid for inserting an element  at any index in a billion element in ArrayList is say 3 * index ms
        //Penalty paid for inserting an element at any index in a billion element LinkedList is say 3 ms


        //Whenever you want to pick datastructure : Make sure you know time complexity of those operation and weight pros and cons.
        //Say I have application where I am reading all the accountNumbers -> and then I will lookup those accountNumbers to check if they are duplicate or not
        //ArrayList -> perfect since we are mostly doing 'get()'

        //But say if my requirement changes tomorrow, and Now I also have to update and delete accounts which are added and deleeted to this list
        //Linkedlist would be perfect here.

        //Data-structures should be optimized for the operations we are going to use.

        //big O of : O() -> time complexity is always messuared with respect to number of eleemnts inside that datastructure

        //Map is equivalnt of ArrayList with difference that 'keys' or 'index' can be Objects instead of numbers
//        list.get(23);

        Map map = new HashMap();

        map.put("strin1", 12);
        map.put("strin2", 12);
        map.put("strin3", 12);
        map.put("strin4", 12);
        map.put("strin4", 13);//key,value


        System.out.println(map); //O(1) -> means constant time operation
        System.out.println(map.get("strin3")); //O(1) -> means constant time operation

        map = new HashMap();
        Account o1 = new Account(12);
        Account o2 = new Account(12);
        map.put(o1, 200);
        map.put(o2, 400);

//        o1.equals(o2);

        System.out.println(map);

        Comparator comparator = new Comparator() {
            public int compare(Object o1, Object o2) {
                Account a1 = (Account) o1;
                Account a2 = (Account) o2;
                if (a1.accountNumber > a2.accountNumber) return -1;
                if (a1.accountNumber < a2.accountNumber) return 1;
                return 0;
            }
        };

        map = new TreeMap(comparator);  //we need comparators or comparable because treemap needs a notion of how to sort elements


        Account o3 = new Account(121);
        map.put(o1, 200);
        map.put(o3, 400);

        System.out.println("TreeMap");
        System.out.println(map);


        //Set -> unordered -> bag of objects -> contains query is O(1) -> prevousAccountSet.contains(newAccountNumber)

    }

    static class Account {
        int accountNumber;

        public Account(int i) {
            accountNumber = i;
        }

        @Override
        public int hashCode() {
            return accountNumber;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "i=" + accountNumber +
                    '}';
        }

        //Here we are changing the notion of equalit for two objects, instead of saying objects are equal only if
        // references are equal we are saying objects are equal if two account numbers are equal
        @Override
        public boolean equals(Object o) {
            if (this == o) return true; //o1 == o2
            if (o == null || getClass() != o.getClass()) return false;

            Account account = (Account) o;
            System.out.println("Object refernces of o1 and o2 are not same");
            return accountNumber == account.accountNumber;
        }

        /*//this > o => 1
        //this < o => -1
        //this = o => 0
        public int compareTo(Object o) {
            Account a = (Account) o;
            if (accountNumber > a.accountNumber) return -1;
            if (accountNumber < a.accountNumber) return 1;
            return 0;
        }*/
    }

/*    static class Account implements Comparable {
        int accountNumber;

        public Account(int i) {
            accountNumber = i;
        }

        //Here we are changing the notion of equalit for two objects, instead of saying objects are equal only if
        // references are equal we are saying objects are equal if two account numbers are equal
        @Override
        public boolean equals(Object o) {
            if (this == o) return true; //o1 == o2
            if (o == null || getClass() != o.getClass()) return false;

            Account account = (Account) o;
            System.out.println("Object refernces of o1 and o2 are not same");
            return accountNumber == account.accountNumber;
        }


        @Override
        public int hashCode() {
            return accountNumber;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "i=" + accountNumber +
                    '}';
        }

        //this > o => 1
        //this < o => -1
        //this = o => 0
        public int compareTo(Object o) {
            Account a = (Account) o;
            if (accountNumber > a.accountNumber) return -1;
            if (accountNumber < a.accountNumber) return 1;
            return 0;
        }
    }*/
}
