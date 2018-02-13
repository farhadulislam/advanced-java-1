package lesson13callable;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {

    public static void main (String [] args) throws IOException {

        ExecutorService executor = Executors.newCachedThreadPool();

        Future<?> future = executor.submit((new Callable< Integer>)(){

            public Integer call() throws Exception{

                Random random = new Random();
                int duration = random.nextInt(4000);

                if(duration>2000) throw new IOException("Sleeping for too long");

                System.out.println("Starting ...");

                try{
                    Thread.sleep(duration);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Finshed ...");

                return duration;
            }

        });

        executor.shutdown();

        try{
            System.out.println("Result is : " + future.get());

        }catch (IOException e){

        }finally {

        }
    }
}
