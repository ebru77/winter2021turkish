package day06_ifstatements;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		// Kullanicidan gun ismi isteyin
		// girilen gunun hafta ici veye hafta sonu oldugunu yazdirin
		
		// pazar --> haftasonu, sali -->hafta ici
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gun adini giriniz");
		
		String gunAdi=scan.next().toLowerCase();
		
		// eger String'lerde esitlik sorguluyorsak == kullanmamaliyiz
		// String'lerde esit olma durumunu sorgulamak icin equal()
		
		if(gunAdi.equals("cumartesi") || gunAdi.equals("pazar")) {
			System.out.println("Haftasonu");
		}
		if(gunAdi.equals("pazartesi")|| gunAdi.equals("sali")||
				gunAdi.equals("carsamba") || gunAdi.equals("pesembe") ||
				gunAdi.equals("cuma")) {
			System.out.println("haftaici");
		}
		
		// bu kodda gun ismi yanlis yazilmissa olusacak durum yok
		
		scan.close();

	}

}
