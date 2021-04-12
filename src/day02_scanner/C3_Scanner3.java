package day02_scanner;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		// Kullanicidan ismini ve soyismini alip aralarinda bir bosluk birakarak
		// isim ve soyismi yazdirin
		// Mehmet , Bulutoz => Mehmet Bulutoz
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("lutfen isminizi giriniz");
		
		String name=scan.nextLine();// sadece next() secilirse kullanici birden fazla kelime girse de ilk kelimeyi alir
		                        // eger kullanicinin girdigi tum yaziyi almak istersek nextline() secmeliyiz
		
		System.out.println("lutfen soy isminizi giriniz");
		
		String surname= scan.nextLine();
		
		System.out.println(name + " " + surname);

		scan.close();
	}

}
