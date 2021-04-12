package day17_forLoop;

import java.util.Scanner;

public class C2_forLoop2 {

	public static void main(String[] args) {
		// kullanicidan bir tamsayi isteyin sayi negatif
		// veya sifirsa "Lutfen pozitif bir tamsayi giriniz"yazdirin
		//girilen sayinin rakamlar toplamini ayri bir method da hesapla
		
		
		//Main method icinde kullanicidan bir sinir deger isteyin
		//rakamlar toplami sinir degerden buyukse
		//"Girdiginiz sayinin rakamlar toplami,girdiginiz sinir degerinden buyuk",
		//degilse"Girdiginiz sayinin rakamlar toplami'girdiginiz sinir degerinden buyuk degil"
		//yazdirin.
			
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen rakamlar toplamini bulmak icin pozitif bir tamsayi giriniz");
		
		int sayi = scan.nextInt();
		System.out.println("Lutfen sinir degeri icin pozitif bir tam sayi giriniz");
		
		int sinir = scan.nextInt();
		
		if (sayi<=0) {
			System.out.println("Lutfen pozitif bir tamsayi giriniz");
			
		}else {
			
			
		if(rakamlarToplamiHesapla(sayi)>sinir){//girilen sayinin rakamlar toplami integer
			System.out.println("Girdiginiz sayinin rakamlar toplami,girdiginiz sinir degerinden buyuk");
			
		}else {
			System.out.println("Girdiginiz sayinin rakamlar toplami,girdiginiz sinir degerinden buyuk degil");
		}
	}
		
		scan.close();
		
	}

	public static int rakamlarToplamiHesapla(int sayi) {
		
		int rakamlarToplami = 0;
		
		String sayi2 = sayi+"";
		
		for (int i = 0; i < sayi2.length(); i++) {
			
			rakamlarToplami += sayi%10;
			sayi/=10;
		
		}	
		
		System.out.println(rakamlarToplami);
		
		return rakamlarToplami;
		
	}
	
}
		




	


