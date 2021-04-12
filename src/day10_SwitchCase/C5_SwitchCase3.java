package day10_SwitchCase;

import java.util.Scanner;

public class C5_SwitchCase3 {

	public static void main(String[] args) {
		// Kullanicidan hangi gunde oldugumuzu isteyin
		//girilen gunun hafta ici yada hafta sonu oldugunu yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen hangi gunde oldugunuzu giriniz");
		
		String gun = scan.nextLine().toLowerCase();
				
		switch (gun) {
		
		case "pazartesi" :
		case "sali" :
		case "carsamba" :
		case "persembe" :
		case "cuma" :
			System.out.println("Hafta ici");
			break;
		case "cumartesi" :
		case "pazar" :
			System.out.println("Hafta sonu");
			break ;
			default :
				System.out.println("Lutfen gecerli bir gun giriniz");
			
			
		scan.close();
		
		
		
		
		
		
		
		
		
		}

	}

}
