package day13_stringManipulation;

import java.util.Scanner;

public class C9_examples3 {

	public static void main(String[] args) {
		
	// Kullanicidan ismini soyismini ve kredi karti bilgisini isteyin
	// ve asagidaki gibi yazdirin
		
		//isim_soyisim:E*** S**
		//kart no:**** **** **** 1234
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		String isim = scan.nextLine();
		
		System.out.println("Lutfen soyisminizi giriniz");
		String soyisim = scan.nextLine();
		
		
		System.out.println("Lutfen kart numaranizi  giriniz");
		String kartno = scan.nextLine();
		
		char isimIlkHarf = isim.toUpperCase().charAt(0);
		String isimGeriKalan = isim.substring(1).replaceAll("\\w","*");
		
		String soyisimIlkHarf = soyisim.toUpperCase().substring(0,1);
		String soyisimGeriKalan = soyisim.substring(1).replaceAll("\\w","*");
		
		String kartNoBasi = "**** **** **** ";
		String kartNoSonu = kartno.substring(kartno.length()-4);
		
		System.out.println("isminiz ve soyisminiz :" + isimIlkHarf + isimGeriKalan +" "+
													soyisimIlkHarf + soyisimGeriKalan);
		
		System.out.println("kart no :" + kartNoBasi + kartNoSonu);
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
