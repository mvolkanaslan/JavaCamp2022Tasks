package polymorphism;

public class ConsoleLogger implements BaseLogger{

	@Override
	public void log() {
		System.out.println("Logged to Console !");
		
	}

}
