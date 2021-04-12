package day14_MethodCreation;

public class C3_MethodCreation3 {

	public static void main(String[] args) {
		// verilen 3 double sayinin ortalamasini alan bir method yazin
		// main method icinden cagirarak methodu calistirin
		
	ortalama(80,60,55);	// bu bir method ve 2. calistirir 65.0 yazdirir
	ortalama(80,60); // 1. yi calistirir sonuc olarak 70.0 yazdirir
		

	} // MM sonu
	
	public static void ortalama (double sayi1, double sayi2, double sayi3) {
		
		System.out.println("girdiginiz uc sayinin ortalamasi : " + (sayi1+sayi2+sayi3)/3);
	}

public static void ortalama (double sayi1, double sayi2) {
		
		System.out.println("girdiginiz iki sayinin ortalamasi : " + (sayi1+sayi2)/2);
}



} // C sonu
