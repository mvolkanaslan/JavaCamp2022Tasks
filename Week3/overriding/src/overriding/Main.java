package overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[]  krediManagers = new BaseKrediManager[] {new AracKrediManager(), new OgrenciKrediManager(), new OgretmenKrediManager()};
		for(BaseKrediManager krediManager:krediManagers) {
			System.out.println(krediManager.calculate(1000));
		}

	}

}
