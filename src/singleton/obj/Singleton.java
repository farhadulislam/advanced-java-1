package singleton.obj;

public class Singleton {
	
    private static Singleton instance;
    
	public static synchronized  Singleton getInstance () {
		
		if (instance == null) {
			
			Singleton singleton1 = getInstance();
		}
		return instance;
		
	}

}
