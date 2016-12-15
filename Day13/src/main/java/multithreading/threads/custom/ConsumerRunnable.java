package multithreading.threads.custom;

import multithreading.domain.SharedCounter;
import multithreading.utils.ThreadMessenger;
import multithreading.utils.ThreadUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by desair4 on 12/12/2016.
 */
public class ConsumerRunnable implements Runnable {

    final private SharedCounter sharedCounter;
    public List<Integer> consumedEvents = new ArrayList<>();
    public volatile boolean isFinished = false; //This instructs java that it is being used between threads so when someone modified or reads value make sure it is consitent accross all threads.
//    public boolean isFinished = false;

    public ConsumerRunnable(SharedCounter sharedCounter1) {
        sharedCounter = sharedCounter1;
    }

    @Override
    public void run() {
//        ThreadUtils.sleep(1);
        for (int i = 0; i < 100; i++) {
            while (ThreadMessenger.isLocked) {
                //if locked then producer is was in middle of doing something so wait.
            }
            while (ThreadMessenger.doProduce) {
            }
            //consumer can run in between
            ThreadMessenger.isLocked = true;
            if (sharedCounter.getCount() % 2 == 0) {    //when I checked the value of count it was infact even
                ThreadUtils.sleep(1);   //go to paused state for some fized amount of time.
                System.out.println(Thread.currentThread().getName() + " index=" + i + ": count=" + sharedCounter.getCount() + " Even"); //checking and printing of count is not Atomic
            } else
                System.out.println(Thread.currentThread().getName() + " index=" + i + ": count=" + sharedCounter.getCount() + " Odd");

            consumedEvents.add(sharedCounter.getCount());
            ThreadMessenger.doProduce = true;
            ThreadMessenger.isLocked = false;
//            ThreadUtils.sleep(1);

        }
        isFinished = true;
        System.out.println("Consumed ending");

        //Unit testing. Mockito
    }
}