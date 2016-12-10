package generics;

import generics.clazz.GenericClass;
import generics.clazz.GenericParent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by desair4 on 12/8/2016.
 */
public class Driver {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("S1", 12);
        map.put(1, "12");

//        System.out.println(map);


        //----------------------------------
        //Problem:

        List list = new ArrayList();//{1,2,3,4};
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.get(1);
        list.add("String");

        List<Object> list12 = new ArrayList<Object>();//{1,2,3,4};
//        list12.get(1);

        //Three ways to iterate through collections

        for (int i = 0; i < list.size(); i++) {
//            Object temp = list.get(i);
//            Integer temp = list.get(i); //If compiler knew that this list only contained Integers
//            if (temp instanceof Integer) {
//                Integer i1 = (Integer) temp;
//            Integer i1 = list.get(i);
//            System.out.println(i1.floatValue() + 12);
            System.out.println(list.get(i).getClass());
//            }
        }

        /*for (Integer i : list) {
            System.out.println(i);
        }*/

        List<? super Number> list1 = new ArrayList<Number>();
//        list.add(1);    //List<Number> l = new ArrayList<Integer>(); //illegal
//        list.add(1.1);

//        Number num = 1;
        Number num = new Integer(1);

        //Generics are completely compile time concept.
        //At runtime List<Integer> and List<String> are exactly the same
        //At runtime generics information doesnt exist. List<Object> List<Object>
        //Reasons to do that was backwards compatiblity.
        //They also did this because it was possible.

        /*Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object i = iterator.next();
        }*/

        /*for(int i: list){

        }*/

        GenericClass<Integer> genericClass = new GenericClass<Integer>(list, Integer.class, 12);

        System.out.println(genericClass.aClass);

        GenericClass<Float> genericClass1 = new GenericClass<Float>(null, Float.class, 12.0f);
        GenericClass<String> genericClass2 = new GenericClass<String>(null, String.class, "123");

        genericClass2.type = "Stirng";
        genericClass1.type = 12f;


        /*List<Integer> anotherList = new ArrayList<Integer>();
        anotherList.add("String1");*/
        genericClass2.printAndReturn(list);
//        genericClass.printAndReturn();

        //Webserviice
        // RequestObject -> String -> make webservice call
        // Response -> String -> ResponseObject

        //Webservice1 -> P RequestObject1, R ResponseObject1
        //Webservice2 -> P RequestObject2, R ResponseObject2


        //Annotations
        //1. Using annotations
        //2. Create your own annotations.       //Spring

        /*
        * Problem :
        *
        * 1. Annotations a configurations
        * 2. Metadata -> 'meta' extra data, 'data' about 'data'
        *
        * */
        GenericParent genericParent = new GenericClass();
        genericParent.thismethodPrintsTheClassInformation();    //fixed. Now it calls correct method in child class
    }
}
