package day17_forLoop;

import java.util.Scanner;

public class C1_forLoop1 {

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
	System.out.println("Lutfen bir tamsayi giriniz");
	
	int sayi = scan.nextInt();
	if (sayi<=0) {
		System.out.println("Lutfen pozitif bir tamsayi giriniz");
		
	}else {
		
		
		rakamlarToplamiYazdir(sayi);
	}
	scan.close();
		
		}

	public static void rakamlarToplamiYazdir(int sayi) {
		
	int rakamlarToplami = 0;
	
	for (int i = 1; i < Integer.SIZE; i++) {
		rakamlarToplami += sayi%10;
		sayi/=10;
		
	}
	System.out.println("rakamlar toplami :" + rakamlarToplami);
	
		
		
		
		
		
		
	}

}
