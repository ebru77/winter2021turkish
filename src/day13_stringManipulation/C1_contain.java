package day13_stringManipulation;

import java.util.Scanner;

public class C1_contain {

	public static void main(String[] args) {
		// kullanicidan bir cumle aramak istedigi bir string isteyin
		// cumle string'i iceriyorsa "basarili", degilse "basarisiz" yazdirin
		
		
		
		Scanner scan = new Scanner (System.in);
		/*
		System.out.println("lutfen bir cumle giriniz");
		
		String cumle = scan.nextLine().toLowerCase();
		System.out.println("lutfen aramami istediginiz String'i giriniz");
		
		String arama =scan.nextLine().toLowerCase();
		System.out.println(cumle.contains(arama) ? "Basarili" : "Basarisiz");
		
		// kullanicidan mail adresini isteyin. mail adresi @gmail.com iceriyorsa
		//"mailiniz kaydedildi", yoksa "lutfen gmail adresinizi giriniz"yazdirin
		*/
		
		System.out.println("lutfen email adresinizi giriniz");
		
		String email = scan.next();// email tek kelimeden olustugu icin next kullandik
		
		int sondami = email.indexOf("@gmail.com",email.length()-10);
		// index olarak "lenght()-10"yazarsak eger email gmail.com ile biterse
		//islemin sonucu index olur bitmiyorsa -1 olur
		
		if (email.contains("@gmail.com")&& sondami !=-1) {
			System.out.println("mailiniz kaydedildi");
			
		} else {
			System.out.println("lutfen gecerli gmail adresinizi giriniz");

		}

		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
