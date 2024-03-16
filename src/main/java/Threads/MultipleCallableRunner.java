package Threads;

import java.util.List;
import java.util.concurrent.*;

public class MultipleCallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<CallableTask> tasks = List.of(new CallableTask("Volodya"),
                new CallableTask("Sanya"),new CallableTask("There"));
        Future<String> welcomeFuture = executorService.submit(new CallableTask("Volodya"));
        List<Future<String>> results = executorService.invokeAll(tasks);
        executorService.shutdown();
        for(Future<String> result : results){
            System.out.println(result.get());
        }
    }
}
