package multithreading.domain;

/**
 * Created by desair4 on 12/12/2016.
 */
public class SharedCounter {
    volatile private int count = 0;
//    private int count = 0;

    //1. Before executing this method, JRE has to check if lock for that specific object on which this method was called
    // is not attained by any other thread.
    //2. If not attained by anyone else, then JRE gives the lock to the current thread thats trying to invoke this method.
    //3. Last penalty and the biggest penalty is that only one thread can invoke this method at a time.
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