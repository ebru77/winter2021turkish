package day15_methodCreation;

import java.util.Scanner;

public class C1_methodCreation {

	public static void main(String[] args) {
		
	// Soru 1 ) Kullanicidan bir sayi alin,sayinin 
	//negativ mi pozitif mi ,tek mi cift mi oldugunu
	//100'den buyukse birler ,onlar yuzler basamagindaki 
	//rakamlarin toplamini,100'den kucukse sadece birler basamagini yazdirin.
		
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		int sayi = scan.nextInt();
		scan.close();
		
		pozitifNegatif(sayi);
		tekmiCiftmi(sayi);
		
		if (sayi>=100) {
			yuzdenBuyuk(sayi);
			
		} else {
			yuzdenKucuk(sayi);

		}

	}
	private static void yuzdenKucuk(int sayi) {
		System.out.println(sayi%10);
		
	}
	private static void yuzdenBuyuk(int sayi) {
		int rakamlarToplami = 0;//birler basamagindan kurtulmak icin
		rakamlarToplami = sayi%10;
		sayi/=10;//onlar basamagindan kurtulup 100ler basamagini bulmak icin
		rakamlarToplami+=sayi%10;
		sayi/=10;
		rakamlarToplami+=sayi%10;
		System.out.println(rakamlarToplami);
		
	}
	public static void tekmiCiftmi(int sayi) {
		System.out.println(sayi%2==0 ?"cift" :"tek");
		
	}
	public static void pozitifNegatif(int sayi) {
		System.out.println(sayi>0 ? "pozitif" : (sayi<0 ? "negatif":"pozitif yada negatif degil"));
		
		
		
	}
	

	}

