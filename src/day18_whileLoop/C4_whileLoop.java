package day18_whileLoop;

import java.util.Scanner;

public class C4_whileLoop {

	public static void main(String[] args) {
	//kullanicidan baslangic ve bitis harfleri alin ve 
	//baslangic harfinden baslayip bitis harfinde biten
	//tum harfleri buyuk harf olarak ekrana yazdirin
	//kullanicinin hata yapmadigini farzedelim
		
	//FORLOOP
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen baslangic harfini giriniz");
		char basHarf = scan.next().toUpperCase().charAt(0);
		
		System.out.println("Lutfen bitis harfini giriniz");
		char bitHarf = scan.next().toUpperCase().charAt(0);
		
		for (char i = basHarf; i <= bitHarf; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		
		// WHILELOOP
		
		while(basHarf<=bitHarf) {
			System.out.print(basHarf + " ");
			
			basHarf++;
			scan.close();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
