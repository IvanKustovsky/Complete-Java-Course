package Threads;

// extend Thread - 1 way to use Threads
// implement Runnable - 2 way to use Threads

class Task1 extends Thread {
    public void run() {  // Signature
        System.out.print("Task1 started");
        for (int i = 101; i <= 199; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\nTask1 done");
    }
}

class Task2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Task2 started");
        for (int i = 201; i <= 299; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\nTask2 done");
    }
}

public class ThreadBasicsRunner {

    public static void main(String[] args) throws InterruptedException {
        // task1
        System.out.println("Task1 kicked off");
        Task1 task1 = new Task1();
        task1.setPriority(5);
        task1.start(); // start() to execute like a thread, run() to execute like a usual method

        // task2
        System.out.println("Task2 kicked off");
        Task2 task2 = new Task2();
        Thread task2thread = new Thread(task2);
        task2thread.setPriority(5);
        task2thread.start();

        // wait to task1 to complete
        task1.join();
        task2thread.join();
        // task3
        System.out.print("\nTask3 kicked off\n");
        for (int i = 301; i <= 399; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\nTask3 done");
        System.out.print("\nMain done");
    }
}
