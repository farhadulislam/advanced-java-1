package usefulStuff;

public class ReadingApp {
	
	private int id;
	private String fileName;
	public static int numOfReadingApp;
	
	public ReadingApp(int id, String fileName){
		 
		this.id = id;
		this.fileName = fileName;
		
		numOfReadingApp++;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	

}
