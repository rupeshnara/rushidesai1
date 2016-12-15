package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by desair4 on 12/13/2016.
 */
public class ConcurentCollections {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        //3 -> T1 called add 2 -> For t1 when it called ensureCapacity
        //T2 is now running and capacity is still 2

//        T1
//          ensureCapacityInternal(size + 1);  // Increments modCount!!
//        T2 should not be allowed between these statements
//        elementData[size++] = e;

        //None of the collections we have seen so far are ThreadSafe.

        ConcurrentMap map = new ConcurrentHashMap();
        Map map1 = new ConcurrentHashMap();

        //jdk5
        //Executor framework : Capability Thread pooling

        //Processor has limited time -> SO for e.g. A minute.
        //Say you have 10000 threads -> OS has to ensure that all 10000 threads get a chance to run in that 1 min
        //say OS is using FAIR scheduler. 1min/10000 -> 0.1ms for each trhead -> So every 0.1ms OS has to switch trhead. Everytime you switch thread, you pay some penalty.
        //Now instead of 10000 threads you only have 10 threads -> 1min/10 -> 0.1 min -> Every 0.1 min there is a penalty.

        //How to decide size of pool -> How many procesors you have -> 8 * 10

        //You create a pool of threads : say sice of pool is 10 i.e you can only have max 10 threads at a time.
        //You can have a pool of tasks to be executed -> at one time 10 task are converted to threads -> if one thread finishes then one task from remaining tasks are converted to thread.

        //jdk 7
        //Fork-Join -> Newer hard ware is multi core, Fork-Join allows you to use all cores for running your application.


    }
}
