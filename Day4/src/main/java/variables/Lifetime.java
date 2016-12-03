package variables;

/**
 * Created by desair4 on 11/22/2016.
 */
public class Lifetime {
    /*
    * Variables :
    * 1. Scope
    * 2. Lifetime
    *
    * */
    private int age;
    int height;
    public int weight;
    public static int count = 0;    //no longer attached to object, instead it is attached to lifetime of the class itself.
    //class is loaded in the memory, and when we want to create an object, template of
    // class is looked at and object is created as per that template


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static Lifetime getInstance() {
        count++;
        Lifetime lf = new Lifetime();

        return lf;
    }

    //This never touches the data of the object on which it was called.
    public void changeAgeLifetime(Lifetime lifetime, int a) {
        a = a + 10;
        lifetime.age = a;
    }


    /*
    *           Memory
    * ----------------------------------
    *           Lifetime
    * -------------------------------------
    *
    *
    *       count
    *
    *
    * -----------------------------------
    * on start of createTempInstance()
    *
    *           lf 5000
    *     age  0
    *     height 0
    *     weight  100
    *
    * on end of createTempInstance()        ---> lf is destryoed
    *
    * ----------------------------------
    *
    * ---------------------------------
    * stack for createTempInstance
    *
    * lf = 5000     //destryoed when createTempInstance() is exited
    *
    * --------------------------------
    *
    * */

    //anotherLf
    public static void createTempInstance() {
        //createTempInstance never uses the data of the object on which it was called

        //anotherLf.age
        //anotherLf.weight
        //anotherLf.height

        //this lf will always be different than the object on which this method is called
        Lifetime lf = new Lifetime();
        lf.weight = 100;

        System.out.println(lf.toString());
    }

    //    @Override
    public String toString() {
        return "Lifetime{" +
                "age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
