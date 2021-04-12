package day08_ifElseIfNestedIf;

import java.util.Scanner;

public class C5_NestedIf {

	public static void main(String[] args) {
		// kullanicidan bir sifre isteyiniz
		// eger ilk harf buyukse 'A'olup olmadigini kontrol edin.
		// ilk harf 'A'ise "gecerli sifre " degilse "gecersiz sifre"yazdirin
		//eger ilk harf kucuk harf ise 'z' olup olmadigini kontrol edin.
		// ilk harf 'z'ise "gecerli sifre" degilse "gecersiz sifre"yazdirin
		
		
		
	// 1. islem kullanicidan sifreyi alip ilk harfine bak buyuk mu kucuk mu
	// 
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen sifrenizi giriniz");
		
		char ilkHarf = scan.next().charAt(0); // girilen sifrenin ilk harfini alir
		
		
		if (ilkHarf>='A' && ilkHarf<='Z') { // ilkharf buyukse
			if(ilkHarf =='A') {
				System.out.println("sifre gecerli");
				
			}else {
				System.out.println("sifre gecersiz buyuk harf");
			}
			
			
			
		} else if (ilkHarf>='a' && ilkHarf<='z'){ // ilkharf kucukse
			if(ilkHarf=='z') {
				System.out.println("sifre gecerli");
				
			} else {
				System.out.println("sifre gecersiz kucuk harf");
			}
		} else { // ilk harf buyuk yada kucuk degilse
			System.out.println("sifre gecersiz, lutfen ilk karakterini harf yapiniz"); 
			
			
			
			

		}
		
		
		
		
		
		
		
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


