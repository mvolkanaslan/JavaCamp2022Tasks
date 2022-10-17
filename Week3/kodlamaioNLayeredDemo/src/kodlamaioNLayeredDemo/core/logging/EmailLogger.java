package kodlamaioNLayeredDemo.core.logging;

public class EmailLogger implements ILogger {
	@Override
	public void log(String info) {
		System.err.println("Logged to Email : " + info);
	}
}
