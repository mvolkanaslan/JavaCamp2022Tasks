package abstractClasses;

public class Main {

	public static void main(String[] args) {

		BaseGameCalculator calculator = new CalculatorForWomen();
		calculator.calculateAttackPower();
		calculator.calculateScore();
		calculator.gameOver();
		
	}

}
