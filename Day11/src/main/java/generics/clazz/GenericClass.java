package generics.clazz;

import java.util.List;

/**
 * Created by desair4 on 12/8/2016.
 */
//public class GenericClass<Type extends Number> extends GenericParent<Type>{
public class GenericClass<T> extends GenericParent<T> {
    ///T -> Integer
    List<T> list;
    public T type;

    public GenericClass() {

    }

    //List<Integer>
    public GenericClass(List<T> list, Class<T> clazz, T i) {
        super(clazz);
        this.list = list;
        type = i;
        System.out.println(type.getClass());
    }

    public void printAndReturn() {
        for (T o : list) {
            System.out.println(o);
        }
    }

    public <R> void printAndReturn(List<R> list) {
        for (R o : list) {
            System.out.println(o);
        }
    }

    @Override
    public void thismethodPrintsTheClassInformation() {
        System.out.println("In parent");
    }
/*
    @Override
    public static void thismethodPrintsTheClassInformation(){
        System.out.println("InChild");
    }
*/


    @Override
    public String toString() {
        return "GenericClass{" +
                "list=" + list +
                ", type=" + type +
                "} " + super.toString();
    }
}