package lesson1demo1;

class Runner extends Thread{
	
	public void run() {
		
		for(int i = 0; i<10 ; i++) {
			
			System.out.println("Hello " + i);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Application {

	public static void main(String[] args) {
	System.out.println("First app");
	
	Runner r1 = new Runner();
	r1.start();
	Runner r2 = new Runner();
	r2.start();

	}

}
