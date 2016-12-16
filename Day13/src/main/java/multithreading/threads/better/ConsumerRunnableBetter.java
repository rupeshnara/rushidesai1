package multithreading.threads.better;

import multithreading.domain.SharedCounter;
import multithreading.utils.ThreadUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by desair4 on 12/12/2016.
 */
public class ConsumerRunnableBetter implements Runnable {

    final private SharedCounter sharedCounter;
    public List<Integer> consumedEvents = new ArrayList<>();
    public volatile boolean isFinished = false; //prevent dirty read,dirty read happens of the fact that each thread has its onw copy of variables.

    public ConsumerRunnableBetter(SharedCounter sharedCounter1) {
        sharedCounter = sharedCounter1;
    }

    @Override
    public void run() {
        ThreadUtils.sleep(1);
        for (int i = 0; i < 100; i++) {
            /*while (ThreadMessenger.isLocked) {
            }*/
            /*while (ThreadMessenger.doProduce) {
            }*/
            //ThreadMessenger.isLocked = true;
            synchronized (sharedCounter) {  //isLocked replacement, All in this synchronized block need to be atomic
                //We enter this only if no other Thread has acquired the lock of sharedCounted
                if (sharedCounter.getCount() % 2 == 0) {
                    ThreadUtils.sleep(1);
                    System.out.println(Thread.currentThread().getName() + " index=" + i + ": count=" + sharedCounter.getCount() + " Even");
                } else
                    System.out.println(Thread.currentThread().getName() + " index=" + i + ": count=" + sharedCounter.getCount() + " Odd");
                consumedEvents.add(sharedCounter.getCount());
                sharedCounter.notifyAll();
                try {
                    if (i < 99)
                        sharedCounter.wait();   //at this point I was waiting on producer to notify me on sharedCounter
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                ThreadMessenger.doProduce = true;
            }
//            ThreadMessenger.isLocked = false;
            ThreadUtils.sleep(1);

        }
        isFinished = true;
        System.out.println("Consumed ending");
    }
}