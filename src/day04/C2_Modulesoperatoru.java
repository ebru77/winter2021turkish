package day04;

public class C2_Modulesoperatoru {

	public static void main(String[] args) {
		// modulus operatoru bolme isleminde kalan verir
        // 15 tek mi cift mi ? 15/2 kalan =1 se bu sayi tektir
		// 25 uce bolunur mu ? 25/3 kalan =1
		// herhangi bir sayinin 7 ile bolunebildigini kontrol etmek icin modulus islemini kullaniriz
		
		int kalan = 15 % 4;
		System.out.println(kalan); //3
		
		System.out.println(26 % 8); //2
		
		// 856 sayisinin birler basamagi kactir ? 6
		int sayi=856;
		
		int birlerBasamagi = 856 % 10 ;
		System.out.println("sayinin birler basamagi :" + birlerBasamagi);
		
		// 856 sayisinin 10'lar basamagi kactir
		//bunun icin buldugum birler basamagindan kurtulmam gerekiyor
		// birler basamagindan kurtulmak icin ise sayiyi 10'a boluyorum
		
		
		sayi/=10; // 85
		System.out.println("on'a boldukten sonra sayinin degeri : " + sayi);
	
		int onlarBasamagi = sayi % 10;
		System.out.println("onlar basamagi :" + onlarBasamagi);
		
		// yuzler basamagini bulmak icin bir kere daha ayni islemi yapiyorum
		
		sayi/=10; // bu satirla onlar basamagindan da kurtuluyorum
		System.out.println("2.defa 10'a boldukten sonra " + sayi);
		int yuzlerBasamagi = sayi;
		System.out.println(yuzlerBasamagi);
	}
	
	

}
