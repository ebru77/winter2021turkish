package day15_methodCreation;

public class C3_methodOverloading {

	public static void main(String[] args) {
	
	// java'da ayni islemle birden fazla method olusturulursa buna overloading denir
	//Overloading yapabilmek icin Method Signature'larin farkli olmasi gerekir
	// Method Signature = isim + parametre sayisi + parametre data turu
	//birbirini kapsayan data turleri oldugunda java en optimum cozumu uretir
	//bire bir uyan varsa  o methodu calistirir,bire bir uyan yoksa en fazla uyan methodu calistirir
	//Eger kapsayan bir method bulamazsa java CTE verir
		
		toplama('a','b');
		

	}
	
public static void toplama (int sayi1, int sayi2) {
		
		System.out.println("integer method sonucu : " + (sayi1+sayi2));
	}

public static void toplama (double sayi1, double sayi2) {
		
		System.out.println("double method sonucu : " + (sayi1+sayi2));
}
public static void toplama (int sayi1, double sayi2) {
	System.out.println("integer/double method sonucu :" + (sayi1 +sayi2));
}
public static void toplama (char char1, char char2) {
	System.out.println("char method sonucu :" + (char1 + char2));
}
public static void toplama (String str1, String str2) {
	System.out.println("String method sonucu :" + (str1+str2));
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


