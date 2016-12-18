Multithreading and Java:


* Understanding multi-threading is challenge not java.
* Problem: 

    Processor -> Can only process single instruction at a time.
    
Program1
   
   p1.i1
   p1.i2
   p1.i3
   p1.i4
   p1.i5
   
Program2

   p2.i1
   p2.i2
   p2.i3
   p2.i4
   p2.i5
   
   
   
OS will 'time slice'
    P1 -> 3ms
        p1.i1
        p1.i2
        
    P1 is paused
    
    P2 -> 2ms
        p2.i1
        p2.i2
        
    P2 is paused    
        
    P1 -> 1ms
        p1.i3
        p1.i4
        p1.i5
   
        P1 is finished
        
    P2 is now executed and finishes.
    
    OS is 'Scheduling' process/threads as to who should run when.
        
How is it beneficial to run like above compared to below:        
P1 -> start to finish
P2 -> start to finish


Ans: Allows programs to progress in parrellal.

Processes and Threads:

Process and Threads bot are programs.

1. Process spawns its own threads
2. Difference is that each Process have their own heap and stack.
   while threads share heap and stack of the process that spawned it.
   
   
Process and threads are both programs.

OS use process to achieve parrarelism, process use smaller unit of threads to achieve parrelilsm within it.

Windows word -> Process

    Internally uses many threads like spell check thread to check spellings, 
    Notification thread to show notifications etc..
    
The advntages and challenges that process or threads face is common and solutions to those issues are also common.

1. Thread:

    Small piece of computation which runs in parerral with other trheads.
   2.8 10^12 instructions per second is executed by processor typically
   

####Problems that we run into when things are done with scheduling.

You run into problems only if threads/process shared common information.

You run into issues only if, there is some common data between Threads.

1. 





        