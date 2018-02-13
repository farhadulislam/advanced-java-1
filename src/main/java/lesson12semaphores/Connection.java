package lesson12semaphores;

import java.util.concurrent.Semaphore;

public class Connection {

    private static Connection instance = new Connection();
    private int connections = 0;
    private Semaphore sem  = new Semaphore(10);


    private Connection(){

    }

    public static Connection getInstance (){

        return instance;
    }
    public void connect() throws InterruptedException {

        sem.acquire();

        try{
            doConnect();

        }finally {
            sem.release();
        }
    }

    public void doConnect() throws InterruptedException {



        synchronized (this){

            connections++;
            System.out.println("Connections : " + connections);

        }

        try{

            Thread.sleep(1000);
        }catch(InterruptedException e){

            e.printStackTrace();

        }


        synchronized (this){

            connections--;
            System.out.println("Connections : " + connections);
        }




    }
}
