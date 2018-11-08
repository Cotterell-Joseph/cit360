import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class ThreadExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Run a program that retrieves 25 random numbers (between 1 and 1000) and averages them.
        //Use threads to speed up the process.

        //Create a pool of threads
        ExecutorService service = Executors.newFixedThreadPool(10);

        //Create individual threads and return a number. Store the results in an ArrayList
        List<Future> futureList = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            Future<Integer> future = service.submit(new Task());
            futureList.add(future);
        }
        //Can continue on the main, while threads from the pool are executing
        double b = 0;
        for (int i = 0; i < 25; i++) {
            Future<Integer> future = futureList.get(i);
            //Pause the main thread if this thread has not returned it's future
            Integer result = future.get();
            double a = result.doubleValue() * .04;
            b += a;
            System.out.println("Index " + i + ": " + result);
            //System.out.println("a: " + a);
            //System.out.println("b: " + b);
        }
        //Stop the thread pool
        service.shutdown();
        //Print the average
        System.out.println("\nAverage of 25 random numbers is: " + b);
    }
    //Uses Callable to be able to return a value. Runnable is void.
    static class Task implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            //Simulate a delay in the task
            Thread.sleep(500);
            return new Random().nextInt(1000) + 1;
        }
    }
}
