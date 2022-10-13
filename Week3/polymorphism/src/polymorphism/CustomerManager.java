package polymorphism;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger baseLogger) {
		this.logger = baseLogger;
	}


	public void add() {
		System.out.println("New Costomer Added !");
		logger.log();
	};

}
