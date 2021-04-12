package day12_stringManipulation;

import java.util.Scanner;

public class C4_indexOf {

	public static void main(String[] args) {
		//indexOf medhodu bize istedigimiz karakterlerin indexini dondurur
		
		String str = "Java ogren, is sahibi ol";
		
		System.out.println(str.charAt(6));// g
		
		System.out.println("char arama " + str.indexOf('g'));//6
		
		System.out.println("String arama " + str.indexOf("g"));//6
		
		System.out.println("String kelime arama " + str.indexOf("is"));//12
		
		System.out.println("birden fazla varsa " + str.indexOf('i'));//12
		//ilk  i harfinin yerini yazdirir
		
		
		System.out.println("baslangic indexi ile " + str.indexOf('a', 4));//16
		// baslangic index'i inclusive (4. satiri baslangic alir ilk a harfinin sirasini verir
		
		
		System.out.println("olmayan harf" + str.indexOf("dert"));//-1
		
		
		// kullanicidan bir cumle isteyin
		// case sensitive olmadan java kelimesi icerip icermedigini yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle = scan.nextLine().toLowerCase();
		
		//int sonuc = cumle.indexOf("java");// java varsa ilk java kelimesinin index'ini dondurur
		
		                                  // java yoksa -1 verir
		
		//System.out.println(sonuc==-1 ? "java icermiyor":"java iceriyor");
		
		
		if (cumle.indexOf("java")>=0) {
			System.out.println("cumle java iceriyor");
			
		} else {
			System.out.println("cumle java icermiyor");

		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
