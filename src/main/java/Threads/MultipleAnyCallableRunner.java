package Threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<CallableTask> tasks = List.of(new CallableTask("Volodya"),
                new CallableTask("Sanya"),new CallableTask("There"));
        Future<String> welcomeFuture = executorService.submit(new CallableTask("Volodya"));
        String result = executorService.invokeAny(tasks);
        System.out.println(result);
        executorService.shutdown();
        }
    }

