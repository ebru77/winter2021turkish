package day16_forLoop2;

import java.util.Scanner;

public class C7_ForLoopInterview {

	public static void main(String[] args) {
	//Kullanicidan bir String isteyin ve 
	//String'i tersine ceviren bir program yaziniz
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Lutfen tersine cevirmek icin bir yazi giriniz");
	
	
	// 1. YOL Variable olusturup en son yazdirabilirim.
	String yazi = scan.nextLine();
	
	String tersYazi ="";
	
	for (int i = yazi.length()-1; i >=0; i--) {
		
		 tersYazi += yazi.charAt(i);
		
	}
		System.out.println("Girdiginiz yazinin tersten yazilisi :" + tersYazi);
	
		
	// 2.YOL Ters yazi'yi sadece yazdiracaksak variable olusturmadan da yapabiliriz.
	
		System.out.print("Girdiginiz yazinin tersi : ");//forLoop'tan once yazdirmaliyiz
		
		for (int i = yazi.length()-1; i >=0; i--) {
			
			System.out.print(yazi.charAt(i));
			}
		System.out.println("");
		
	// 3.YOL method olusturup bunu yazdirabiliriz
		
		tersineCevir(yazi);
	}

	public static void tersineCevir(String yazi) {
		System.out.println("Girdiginiz yazinin tersi method ile : ");
		
		for (int i = yazi.length()-1; i >=0; i--) {
			
			System.out.print(yazi.charAt(i));
			
		}
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


