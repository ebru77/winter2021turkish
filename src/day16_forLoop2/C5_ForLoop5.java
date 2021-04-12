package day16_forLoop2;

import java.util.Scanner;

public class C5_ForLoop5 {

	public static void main(String[] args) {
	//kullanicidan 100'den kucuk bir tamsayi isteyin.1'den 
	//baslayarak girilen sayiya kadar tum sayilari yazdirin.
	//ancak;sayi 3'un kati ise "Java"sayi 5'in kati ise "Guzeldir"
	//sayi hem 3'un hem 5'in kati ise "Java Guzeldir"yazdirin
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Lutfen 100'den kucuk bir tamsayi giriniz");
	int sayi = scan.nextInt();
	
	for (int i = 1; i <=sayi; i++) {
		
		if (i%15==0) {
			System.out.println("Java Guzeldir");
			
		} else if (i%5==0){
			System.out.println("Guzeldir");
			
		} else if (i%3==0) {
			System.out.println("Java");
			

		}else {
			System.out.println(i);
		}
		scan.close();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
