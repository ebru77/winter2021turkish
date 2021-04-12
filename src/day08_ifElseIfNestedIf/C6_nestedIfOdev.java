package day08_ifElseIfNestedIf;

import java.util.Scanner;

public class C6_nestedIfOdev {

	public static void main(String[] args) {
	// kullanicidan 4 basamakli bir sayi girmesini isteyin.girdigi sayi 5'e bolunuyorsa son rakamini kontrol edin.
	// son rakami 0 ise ekrana "5'e bolunen cift sayi"yazdirin.
	// son rakami 0 degil ise "5'e bolunen tek sayi"yazdirin.
	// girdigi password 5'e bolunmuyorsa ekrana "tekrar deneyin" yazdirin
		
		
	Scanner scan = new Scanner(System.in);
	System.out.println("lutfen dort basamakli bir sayi giriniz");
	
	double sayi =scan.nextDouble();
	
	if(sayi%10!=0) {
			
		if(sayi%5==0) {
			System.out.println("5'e bolunebilen tek sayi");
		}else {
			System.out.println("tekrar deneyiniz");
			
		}
		
	}else if (sayi%5==0) {
		if (sayi%10==0)
		 
			System.out.println("5'e bolunebilen tek sayi");
			
		} else {
			System.out.println("cift sayi degil");

		}
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


