package multithreading.driver;

import multithreading.domain.SharedCounter;
import multithreading.threads.custom.ConsumerRunnable;
import multithreading.threads.custom.ProducerThread;

/**
 * Created by desair4 on 12/12/2016.
 */
public class MultiThreadingDriver {
    public static void main(String[] args) {

        SharedCounter sharedCounter = new SharedCounter();

        /*
        * Two ways to create threads.
        * 1. Using inheritance
        * 2. To use interface
        *
        * Producer -> incrementing a counter    (Will run in diff thread than main and consumer)
        * Consumer -> reading the counter and printing it  (Will run in diff thread than main and producer)
        *
        * You run into issues only if there is shared data between threads
        *
        * */


        //Producer and consumer have same object of counter
        ProducerThread producerThread = new ProducerThread(sharedCounter);
        ConsumerRunnable consumerRunnable = new ConsumerRunnable(sharedCounter);
        Thread consumerThread = new Thread(consumerRunnable);
        consumerThread.setName("ConsumerThread");

        producerThread.start(); //producer thread 'kindof' starts
        consumerThread.start(); //consumer thread 'kindof' starts

        /*
        * Life cycle of thread
        *
        * 'readyToRun' -> OS will choose this thread -> 'running' -> OS ->'paused'
        *
        * 'run' -> thread itself decides ->'wait'
        *
        * 'wait' -> some other thread -> 'readyToRun'
        *
        * So at this point
        *
        * producerThread -> 'readyToRun'
        * consumerThread -> 'readyToRun'
        * main -> 'running'
        *
        * after 1ms
        * main -> 'readyToRun'
        * producerThread -> 'readyToRun'
        * consumerThread -> 'run'
        *
        * after  2ms
        * main -> 'readyToRun'
        * producerThread -> 'running'
        * consumerThread -> 'readyToRun'
        *
        *
        * */

        //P -> 1
        //C - > 1 wait til producer produces next value
        //P -> 2
        //C -> 2
        //P -> 7
        //C -> index -> 7,8
        //C -> index -> 8,8
        //C -> index -> 9,6
        //C -> index -> 10,6
        //C -> index -> 11,6
        //Wait till consumer finishes

        //mainThread got its own copy of consumerRunnable.isFinished = false
        //This is seperete from ConsumerThread copy consumerRunnable.isFinished = true
        //Java specific -> dirty read of variables since they are store separately on thread stack.
        while (!consumerRunnable.isFinished) {
            //waiting
            //Polling
        }
        System.out.println(consumerRunnable.consumedEvents);
        System.out.println("Main Ending");
    }
}