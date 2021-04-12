package day03;

import java.util.Scanner;

public class C1_Scanner1 {
	
	public static void main(String[] args) {
		
	// kullanicidan isim ve soyismini isteyip
	// isim :mehmet
	// soyisim: bulutoz
	// kursumuza kaydiniz alinmistir,tesekkur ederiz
	// seklinde yazdirin
		
	// Scanner : kullanicidan bilgi almak icin kullaniyoruz
	// 3.adimda islemi tamamliyoruz
	// 1. adim Scanner objesi olusturuyoruz
	// Scanner'in calismasi icin Java.until (utilities)
     //kutuphanesinden ilgili kismi classimiza import etmeliyiz
	
		Scanner scan = new Scanner(System.in);
		
	// 2. adim kullaniciya ne istediginizi belirten bir mesaj yazmaliyiz
		
		System.out.println("Lutfen isminizi giriniz");
		
	// 3. adim bir variable olusturup kullanicinin girdigi degeri atayacagiz
		
		String name = scan.nextLine();
		
		System.out.println("Lutfen sadece soyisminizi giriniz");
		
	
		
		//String surnamme = scan.next// bu sekilde yazarsak sadece iki kelimeyi alir,sonrakileri almaz
	    String surname = scan.nextLine();
	    
	    
	    //eger yazdiracagimiz bir yazi sabit bir sayi ise " " arasinda yazdiriyoruz
	    //eger bir variable ye atanmis bir degeri yazdirmak istersek 
	    //" " olmadan sadece variable ismini yaziyoruz
	
	
	
	System.out.println("isminiz : " + name);
	System.out.println("soyisminiz : " + surname);
	System.out.println("Kursumuza kaydiniz alinmistir, tesekkur ederiz");
	
	
		scan.close();
				
		
		
		
	}

}
