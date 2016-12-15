package multithreading.threads.custom;

import multithreading.domain.SharedCounter;
import multithreading.utils.ThreadMessenger;
import multithreading.utils.ThreadUtils;

/**
 * Created by desair4 on 12/12/2016.
 */
public class ProducerThread extends Thread {

    final private SharedCounter sharedCounter;

    public ProducerThread(SharedCounter sharedCounter1) {
        sharedCounter = sharedCounter1;
        this.setName("ProducerThread");
    }

    @Override
    public void run() {
//        ThreadUtils.sleep(2);
        for (int i = 0; i < 100; i++) {
            while (ThreadMessenger.isLocked) {
                //waiting
                //Polling
            }
            while (!ThreadMessenger.doProduce) {
            }
            ThreadMessenger.isLocked = true;
            int count = sharedCounter.getCount() + 1;
            sharedCounter.setCount(count);
            //consumer
            System.out.println(Thread.currentThread().getName() + " index=" + i + ": count=" + sharedCounter.getCount());
            ThreadMessenger.doProduce = false; //so I can consume
            ThreadMessenger.isLocked = false;
            ThreadUtils.sleep(1);
        }
        System.out.println("Producer ending");
    }
}
