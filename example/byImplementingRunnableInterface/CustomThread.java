package example.byImplementingRunnableInterface;

public class CustomThread implements Runnable{


    @Override
    public void run() {
        for(int i=0 ;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" is running "+ i);
    }
    }
    
}
