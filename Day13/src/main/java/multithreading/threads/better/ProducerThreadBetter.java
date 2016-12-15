package multithreading.threads.better;

import multithreading.domain.SharedCounter;
import multithreading.utils.ThreadUtils;

/**
 * Created by desair4 on 12/12/2016.
 */
public class ProducerThreadBetter extends Thread {

    final private SharedCounter sharedCounter;

    public ProducerThreadBetter(SharedCounter sharedCounter1) {
        sharedCounter = sharedCounter1;
        this.setName("ProducerThreadBetter");
    }

    @Override
    public void run() {
        ThreadUtils.sleep(2);
        for (int i = 0; i < 100; i++) {
            /*while (ThreadMessenger.isLocked) {
            }*/
            /*while (!ThreadMessenger.doProduce) {
            }*/
//            ThreadMessenger.isLocked = true;
            synchronized (sharedCounter) {
                int count = sharedCounter.getCount() + 1;
                sharedCounter.setCount(count);
                System.out.println(Thread.currentThread().getName() + " index=" + i + ": count=" + sharedCounter.getCount());

                sharedCounter.notifyAll();  //consumer, if you were waiting on the lock of shared counter, please go ahead now.
                try {
                    if (i < 99)
                        sharedCounter.wait();   //Will wait until consumer notifes
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//            ThreadMessenger.doProduce = false;
//            ThreadMessenger.isLocked = false;
            }
            ThreadUtils.sleep(1);
        }
        System.out.println("Producer ending");
    }
}