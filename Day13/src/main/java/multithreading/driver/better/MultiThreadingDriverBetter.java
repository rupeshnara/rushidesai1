package multithreading.driver.better;

import multithreading.domain.SharedCounter;
import multithreading.threads.better.ConsumerRunnableBetter;
import multithreading.threads.better.ProducerThreadBetter;

/**
 * Created by desair4 on 12/12/2016.
 */
public class MultiThreadingDriverBetter {
    public static void main(String[] args) {

        SharedCounter sharedCounter = new SharedCounter();
        ProducerThreadBetter producerThreadBetter = new ProducerThreadBetter(sharedCounter);
        ConsumerRunnableBetter consumerRunnableBetter = new ConsumerRunnableBetter(sharedCounter);
        Thread consumerThreadBetter = new Thread(consumerRunnableBetter);
        consumerThreadBetter.setName("ConsumerThreadBetter");

        producerThreadBetter.start();
        consumerThreadBetter.start();

        while (!consumerRunnableBetter.isFinished) {
        }
        System.out.println(consumerRunnableBetter.consumedEvents);
        System.out.println("Main Ending");

    }
}
