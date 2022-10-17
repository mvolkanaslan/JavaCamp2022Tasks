package kodlamaioNLayeredDemo.core.logging;

public class FileLogger implements ILogger{
	@Override
	public void log(String info) {
		System.err.println("Logged to File : " + info);
	}
}
