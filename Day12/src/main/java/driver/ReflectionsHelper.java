package driver;

import java.lang.reflect.Field;

/**
 * Created by desair4 on 12/9/2016.
 */
public class ReflectionsHelper {

    public static <T> void inspect(T ob) throws NoSuchFieldException, IllegalAccessException {
        Class<?> c = ob.getClass();
//        Class<?> c = SavingsAccount.class;

        System.out.println(c);
        Field interestRateField = c.getDeclaredField("interestRate");
        interestRateField.setAccessible(true);

        interestRateField.set(ob, 12);


    }
}
