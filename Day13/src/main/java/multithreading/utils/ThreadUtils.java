package multithreading.utils;

/**
 * Created by desair4 on 12/12/2016.
 */
public class ThreadUtils {

    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
