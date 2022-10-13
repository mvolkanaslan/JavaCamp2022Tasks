package polymorphism;

public class Databaselogger implements BaseLogger{

	@Override
	public void log() {
		System.out.println("Logged to Database !");
		
	}

}
