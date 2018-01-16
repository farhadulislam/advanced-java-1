package lesson5executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Processor implements Thread {
    public void run() {
        try {

            Thread.sleep(100);

        } catch(Exception e) {

        }
    }

}

public class AppThreadPool {

    ExecutorService executor = Executors.newFixedThreadPool(2);

    for(
    int i = 0;
    i<5;i++)

    {

        executor.submit(new Processor(i));

        executor.shutdown();

        System.out.println("All tasks submitted");
        try {

            executor.awaitTermination(1, TimeUnit.Days);

        } catch(InterruptedException e) {

        }
    }


}
