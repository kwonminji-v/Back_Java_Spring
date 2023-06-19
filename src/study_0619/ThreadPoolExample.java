package study_0619;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            final int taskNumber = i;
            executorService.submit(() -> {
                System.out.println("Task " + taskNumber + " executed by " + Thread.currentThread().getName());
            });
        }

        executorService.shutdown();
    }
}