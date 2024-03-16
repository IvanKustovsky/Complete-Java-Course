package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Task extends Thread {
    private int number;
    public Task(int number){
        this.number = number;
    }
    public void run(){  //Signature
        System.out.print("Task " + number + " started\n");
        for (int i = number*100; i <=number*100 + 99 ; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\nTask " + number + " Done\n");
    }
}

public class ExecutorServiceRunner {
    public static void main(String[] args) {
        //ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));
        executorService.execute(new Task(5));
        executorService.execute(new Task(6));
        executorService.execute(new Task(7));
        //task3
        /*System.out.print("\nTask3 kicked off\n");
        for (int i = 301; i <=399 ; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\nTask3 done");
        System.out.print("\nMain done");*/
        executorService.shutdown();
    }
}
