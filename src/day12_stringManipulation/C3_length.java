package day12_stringManipulation;

import java.util.Scanner;

public class C3_length {

	public static void main(String[] args) {
		// kullanicidan bir String girmesini isteyin
		//girilen stringin son harfini buyuk harf olarak yazdirin
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		
		String str = scan.nextLine().toUpperCase();
		
		System.out.println("girdiginiz cumlenin son harfi :" + str.charAt(str.length()-1));
		
		System.out.println(str);//kullanici ne girdiyse buyuk harfle yazdirir
		
		
		String str2 = "";
		System.out.println(str2.length());//0 yazdirir
		
		
		String str3 =null;
		//System.out.println(str3.length()); RTE verir. hata
		
		
		//System.out.println(str3.equals(2));// null deger atanan String ile 
											// String manipulation methodlari kullanilamaz
		
		
		System.out.println(str.charAt(1));//indexi bir olan bastan ikinci harfi verir
		
		
		//System.out.println(str3.charAt(1));//RTE verir. null degeri atanmis bir String ile
										// String manipulation medhodlari kullanilamaz.
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		

	}

}
