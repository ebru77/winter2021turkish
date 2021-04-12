package day08_ifElseIfNestedIf;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {
		// KULLANICIDAN GUN ISMINI YAZMASINI ISTEYIN
		// GIRILEN ISIM GECERLI BIR GUN ISE GUN ISMININ ILK HARF BUYUK DIGERLERI KUCUK OLARAK YAZDIRIN 
		// GUN ISMI GECERLI DEGILSE "GECERLI GUN ISMI GIRINIZ " YAZDIRIN
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen gun ismini giriniz");
		
		String gunIsmi = scan.nextLine(); // girilen tum yaziyi kucuk harfe cevirdik
		// next() sadece kelimeyi alir (ilk space'a kadar olan kismini alir)
		//nextline() : o satirin tamamini alir
		
		if(gunIsmi.equalsIgnoreCase("pazar") || gunIsmi.equalsIgnoreCase("pazartesi")){
			System.out.println("paz");
		} else if
		(gunIsmi.equalsIgnoreCase("Sali")) { // sali , SALI, SaLi
			System.out.println("sal");
			} else if 
		(gunIsmi.equalsIgnoreCase("CARSAMBA")) {
				System.out.println("Car");
			} else if
		(gunIsmi.equalsIgnoreCase("persembe")) {
				System.out.println("per"); 
			} else if (gunIsmi.equalsIgnoreCase("cumartesi")) {
				System.out.println("cum");
			} else {
				System.out.println("Lutfen gecerli gun ismi giriniz");
				}
		    scan.close();
		    // equalsIgnoreCase() : methodu iki String'in buyuk,kucuk harf hassasiyeti olmadan
		    // esit olup olmadigini kontrol eder
	}
	
	}

