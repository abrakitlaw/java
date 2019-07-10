package concurrencyUtilities;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorUsageExample {

    private static ExecutorService executorService;

    private static volatile Future taskOneResults = null;

    private static volatile Future taskTwoResults = null;

    public static void main(String[] args) {
        executorService = Executors.newFixedThreadPool(2);

        while (true) {

            try {
                checkTask();
                Thread.sleep(1000);
            } catch (Exception e) {
                System.err.println("Caught exception: " + e.getMessage());
            }
        }
    }

    private static void checkTask() throws Exception {

        if (taskOneResults == null || taskOneResults.isDone() || taskOneResults.isCancelled()) {
            taskOneResults = executorService.submit(new TestOne());
        }

        if (taskTwoResults == null || taskTwoResults.isDone() || taskTwoResults.isCancelled()) {
            taskTwoResults = executorService.submit(new TestTwo());

        }
    }
}


