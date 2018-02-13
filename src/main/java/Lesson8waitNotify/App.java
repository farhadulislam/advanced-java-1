package Lesson8waitNotify;

public class App {

    public static void main (String [] args){

    	
    	Processor processor1 = new Processor ();
    	Processor processor2 = new Processor ();
       try {
		processor1.produce();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
        try {
			processor2.consume();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
     

    }
}

