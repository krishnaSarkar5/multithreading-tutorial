package example.byExtendingThreadClass;

import example.byImplementingRunnableInterface.CustomThread;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main thread starting");
        MyThread thread1 = new MyThread("Thread1");
        // thread1.setDaemon(true);

        Thread thread2 = new Thread(new CustomThread(),"Thread2");

        thread1.start(); /// this will not start the thread executing immediately . it will basically tells jvm is that this thread is to be run asynchrounously. so whenever jvm feels right time to run, run this thread
       thread2.start();
       
        System.out.println("Main thread existing");  

    }
}


//  the o/p is


// Main thread starting
// Main thread existing
// Thread1 is running 0
// Thread1 is running 1
// Thread1 is running 2
// Thread1 is running 3
// Thread1 is running 4

// N.P the order of the output will be random as the main thread and thread1 is running asynchronously


// if we make the thread1 as daemon thread

// Main thread starting
// Main thread existing
// Thread1 is running 0