package abstractClasses;

// Bir Class in abstract olabilmesi icin <abstract> keywordu almalidir.
// Abstract siniflar newlenmezlar.
// method imzalari tutabildiklari gibi tamamlanmis methodlar da barindirirlar.
public abstract class BaseGameCalculator {
	// abstruct classlar methodlarin imzalari yani sirasi islevini de bunyesinde barindiran classlardir.
	// Bu abstract base siniflardan miras alan subclasslar base classdaki methodu direk kullanabildiklari gibi kendi ozel durumlarini geregi override edebilir
	// Bu senaryomuzda base class oyunscorunu genel olarak hesaplayan bir methoda sahip olmasina ragmen farkli durumlar icin bazi subclasslar bu methodu override ederek yeniden hesapama yapacaktir
	
	public void calculateScore() {
		System.out.println("Your Score : 100");
	}
	
	// abstract siniflardaki bir methodun imzasini verip subclasslarin tumunun bu methodu override ederek kendi icersinde olusturabilmesi icin de 
	// <abstract> keywordu kullanilir.
	public abstract void calculateAttackPower();
	
	// Diger bir durum olarak override edilmesi istenmeyen ve tum sininflar icin ortak sekilde tanimlanan methodlaricin <final> keywordu kullanilir
	public final void gameOver() {
		System.out.println("Game is Over !");
	}
}
