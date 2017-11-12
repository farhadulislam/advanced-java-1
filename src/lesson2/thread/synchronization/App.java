package lesson2.thread.synchronization;

import java.util.Scanner;



class Processor extends Thread{
	private volatile  boolean running = true;
	public void run() {
	
	while(running) {
			
			System.out.println("Hello " );
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	public void shutdown() {
		
		running = false;
		
	}
}

public class App {

	public static void main(String[] args) {
		
		Processor processor1 = new Processor ();
		processor1.start();
		
		System.out.println("Hit enter to stop the it");
		
		Scanner scan1 = new Scanner (System.in);
		
		scan1.nextLine();
		processor1.shutdown();
		
		
	}

}