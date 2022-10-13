package polymorphism;

public class EmailLogger implements BaseLogger{

	@Override
	public void log() {
		System.out.println("Logged to Email !");
	}

}
