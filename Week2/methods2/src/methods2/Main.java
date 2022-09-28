package methods2;

public class Main {

	public static void main(String[] args) {
			
			System.out.println(topla(2,5,6,7,5,10));
			System.out.println(cikar(5,3));
			System.out.println(carp(2,5));
	}
	
	
	
	public static int topla(int... sayilar) {
		int toplam = 0;
		for(int sayi:sayilar) {
			toplam += sayi;
		}
		return toplam;
	}
	public static int cikar(int sayi1,int sayi2) {
		return sayi1 - sayi2;
	}
	public static int carp(int sayi1,int sayi2) {
		return sayi1 * sayi2;
	}


}
