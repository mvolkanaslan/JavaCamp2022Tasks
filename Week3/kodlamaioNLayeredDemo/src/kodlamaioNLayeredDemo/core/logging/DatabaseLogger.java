package kodlamaioNLayeredDemo.core.logging;

public class DatabaseLogger implements ILogger {
	@Override
	public void log(String info) {
		System.err.println("Logged to Database : " + info);
	}
}
