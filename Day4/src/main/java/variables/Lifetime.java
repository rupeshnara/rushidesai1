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
    public static int count = 0;


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

    public Lifetime getInstance() {
        Lifetime lf = new Lifetime();

        return lf;
    }

    //This never touches the data of the object on which it was called.
    public void changeAgeLifetime(Lifetime lifetime, int a) {
        a = a + 10;
        lifetime.age = a;
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
