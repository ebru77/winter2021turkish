package day16_forLoop2;

import java.util.Scanner;

public class C1_forLoop1 {

	public static void main(String[] args) {
	//Kullanicidan iki tam sayi alin, aldigimiz degerlerden
	// kucuk olanlardan baslayip ,buyuk olana kadar tum
	//sayilari yanyana (virgulle ayirarak)yazdirin
		
	
	Scanner scan = new Scanner(System.in);
	System.out.println("lutfen iki pozitif tam sayi giriniz");
	
	
	int sayi1 = scan.nextInt();
	int sayi2 = scan.nextInt();
	
	int kucukSayi = 0;
	int buyukSayi = 0;
	
	if (sayi1<0 || sayi2<0) {
		System.out.println("Lutfen pozitif tamsayi giriniz");
		
	} else if (sayi1>sayi2){
		buyukSayi = sayi1;
		kucukSayi = sayi2;

	}else {
		buyukSayi = sayi2;
		kucukSayi = sayi1;
	}
			
	for(int i = kucukSayi; i <= buyukSayi; i++) {
		
		System.out.print(i + ",");
	}
		
		
	scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
