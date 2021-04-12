package day06_ifstatements;

import java.util.Scanner;

public class C8_alistirma {

	public static void main(String[] args) {
		// kullanicidan gun isminin ilk harfini isteyin ve harfe uygun olan gun isimlerini yazdirin
		// c --> cuma ,cumartesi
		// s --> sali
		
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen gun adini yaziniz");
		
		String gunAdi=scan.next().toLowerCase();
		
		if(gunAdi.equals("cumartesi") || gunAdi.equals("pazar")) {
			System.out.println("Hafta sonu");
		}
		
		if(gunAdi.equals("pazartesi") || gunAdi.equals("sali") || gunAdi.equals("carsamba") || gunAdi.equals("persembe") || gunAdi.equals("cuma")) {
			System.out.println("Hafta ici");
		}
       
       
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   scan.close();
    	   
    	   
       }
       
	}
	
	
	
	

