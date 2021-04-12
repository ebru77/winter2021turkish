package day16_forLoop2;

import java.util.Scanner;

public class C3_ForLoop3 {
	
	public static void main(String[] args) {
		
	//kullanicidan 	pozitif bir tam sayi alin
	//1'den kullanicinin girdigi sayiya kadar olan tum tamsayilarin 
	//toplamini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen pozitif bir tamsayi giriniz");
		
		int sayi = scan.nextInt();
		
		int toplam = 0;// toplami icine yazmak icin olusturulan konteyner
		
		for (int i = 1; i <= sayi; i++) {
			
			toplam+=sayi;
		}
			
			System.out.println(toplam);
			
			scan.close();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


