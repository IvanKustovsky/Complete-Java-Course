package Threads;

import java.util.concurrent.*;

class CallableTask implements Callable<String>{
    private final String name;
    public CallableTask(String name){
        this.name = name;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "\nHello " + name;
    }
}

public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> future = executorService.submit(new CallableTask("Volodya"));
        System.out.print("\n new CallableTask(\"Volodya\") executed");
        String  futureStr = future.get();
        System.out.println(futureStr);
        System.out.print("\n Main Completed");
        executorService.shutdown();
    }
}
