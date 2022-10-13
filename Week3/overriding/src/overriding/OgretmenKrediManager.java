package overriding;

public class OgretmenKrediManager extends BaseKrediManager {

	@Override
	public double calculate(double amount) {
		return amount*1.12;
	}

}
