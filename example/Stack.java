package example;

public class Stack {
    

    private int[] array;
    private int stackTop;

    public Stack(int capacity){
        array =  new int[capacity];
        stackTop=-1;
    }

    public boolean isEmpty(){
        return stackTop<0;
    }

    public boolean isFull(){
        return stackTop>=array.length-1;
    }

    public boolean push(int element){

            if(isFull()){
                return false;
            }
            try{
                Thread.sleep(1000);
            }catch(Exception e){ }

            array[stackTop]=element;
            return true;

    }

    public int pop(){
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        int obj = array[stackTop];

        try{
            Thread.sleep(1000);
        }catch(Exception e){ }

        stackTop--;
        return obj;
    }
}
