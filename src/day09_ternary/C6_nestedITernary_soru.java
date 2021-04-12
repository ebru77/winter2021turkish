package day09_ternary;

import java.util.Scanner;

public class C6_nestedITernary_soru {

	public static void main(String[] args) {
		// kullanicidan dikdortgenin uzunlugunu ve genisligini alin, 
		// girilen degerlere dikdortgenin kare olup olmadigini yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kontrol icin dikdortgenin kenar uzunluklarini giriniz");
		
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		
		System.out.println(kenar1>0 && kenar2>0 ? (kenar1==kenar2 ? "kare" :"kare degil") : "gecersiz kenar uzunlugu");
		
		scan.close();

	}

}
