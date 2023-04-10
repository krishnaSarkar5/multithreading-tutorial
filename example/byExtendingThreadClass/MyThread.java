package example.byExtendingThreadClass;



public class MyThread extends Thread{

    @Override
    public void run(){

        for(int i=0 ;i<5;i++){
                System.out.println(Thread.currentThread().getName()+" is running "+ i);
        }

    }

    public MyThread(String threadName) {
        super(threadName);
    }
}