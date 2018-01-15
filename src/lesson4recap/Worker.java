package lesson4recap;
import java.util.*;
import java.util.ArrayList;

public class Worker {

    private Object lock1 = new Object();
    private Object lock1 = new Object();
    private Random random = new Random();
    private List<Integer> list1 = new ArrayList<Integer>();
    private List<Integer> list2 = new ArrayList<Integer>();

    /* Using "synchronized" keyword in the following method will
    make other thread to wait before this finishes execution and vice versa
    An example, " public synchronized void stageOne() "
     */

    public void stageOne(){

        synchronized (lock1) {
          try {
            Thread.sleep(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    list1.add(random.nextInt(100));

    }

    public void stageTwo(){

        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        list2.add(random.nextInt(100));

    }

    public void process(){

        for (int i =0; i<1000;i++){
            stageOne();
            stageTwo();
        }
    }
    public void main(){
        System.out.println("  ");
        long start = System.currentTimeMillis();


        // Using a runnable interface and its direct implementation within a Thread obj
        new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        }).start();

        long end = System.currentTimeMillis();

        System.out.println("Time taken " + (end-start);
        System.out.println("List 1 is " + list1.size() + " ; List 2 is "+ list2.size());

    }
}
