package multithreading.domain;

/**
 * Created by desair4 on 12/12/2016.
 */
public class SharedCounter {
    volatile private int count = 0;
//    private int count = 0;

    synchronized public int getCount() {
        return count;
    }

    synchronized public void setCount(int count) {
        this.count = count;
    }
/*    public void setCount(int count) {
        this.count = count;
    }*/
}