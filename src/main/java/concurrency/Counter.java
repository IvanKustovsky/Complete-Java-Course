package concurrency;

public class Counter {

    private int i = 0;
    synchronized public void increment() { // synchronized makes it thread safe
        i++;
        // get i
        // increment
        // set i
    }

    public int getI(){
        return i;
    }


}
