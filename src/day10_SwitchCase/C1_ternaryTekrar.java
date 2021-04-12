package day10_SwitchCase;

import java.util.Scanner;

public class C1_ternaryTekrar {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve
		//sayi 3 basamakli ise "uc basamakli sayi",yoksa
		//"uc basamakli degi" yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		
		int sayi = scan.nextInt();
		
		System.out.println(sayi>99 && sayi<1000 ? "uc basamakli sayi": "uc basamakli degil");
		
		String sonuc = sayi>=100 ? (sayi<1000 ? "uc basamkli sayi" : "uc basamakli degil") :"uc basamakli degil";
		System.out.println(sonuc);
		
		
		// nested ternary olmasin diyorsak
		
		String sonuc2 = sayi>=100 && sayi<1000 || sayi<=-100 && sayi>-1000 ?"uc basamakli" : "uc basamakli degil";
		
		System.out.println(sonuc);
		
		scan.close();
		
		
		
		
		
		
		

	}

}
