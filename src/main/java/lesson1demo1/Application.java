package lesson1demo1;

/*Extend Thread class and write implementation of its run () method in the subclass
Then invoke start () method   */

class Runner extends Thread {

	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println("Hello " + i);

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

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
		Runner r3 = new Runner();
		r3.start();

	}

}
