package lesson11deadlock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {

    private Account acc1 = new Account();
    private Account acc2 = new Account();
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    private void acquireLocks(Lock firstLock, Lock secondLock ) throws InterruptedException{

        while (true){

            boolean gotFirstlock = false;
            boolean gotSecondlock = false;

            try{
                gotFirstlock = firstLock.tryLock();
                gotSecondlock = secondLock.tryLock();
            }
            finally {
                if(gotFirstlock && gotSecondlock){
                    return;
                    // John used all if statements instead of if else, I'm unsure why
                }else if(gotFirstlock){

                    //firstLock.unlock(); // John may have unlocked firstLock by mistake, I believe, here
                                          // I want to unlock secondLock since firstLock is already unlocked.
                    secondLock.unlock();
                }else if(gotSecondlock){
                    secondLock.unlock();
                    //firstLock.unlock();
                }
            }

            Thread.sleep(1);

        }


    }



    public void firstThread() throws InterruptedException{

        Random random = new Random();

        for(int i = 0; i<10000; i++){
            acquireLocks(lock1, lock2);
            Account.transfer(acc1, acc2, random.nextInt(100));
        }

    }

    public void secondThread() throws InterruptedException{

        Random random = new Random();

        for(int i = 0; i<10000; i++){

            acquireLocks(lock1, lock2);

            Account.transfer(acc2, acc1, random.nextInt(100));
        }

    }

    public void finished(){

        System.out.println("Account 1 balance is " + acc1.getBalance());
        System.out.println("Account 2 balance is " + acc1.getBalance());
        System.out.println("Total balance " + acc1.getBalance() + acc2.getBalance());


    }



}
