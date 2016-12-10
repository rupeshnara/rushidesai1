package generics.clazz;

/**
 * Created by desair4 on 12/8/2016.
 */
public class GenericParent<T> {
    public Class<T> aClass;

    public GenericParent() {

    }

    public GenericParent(Class<T> aClass) {
        this.aClass = aClass;
    }

    public void thismethodPrintsTheClassInformation() {
        System.out.println("In parent");
    }
}
