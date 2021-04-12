package day13_stringManipulation;

import java.util.Scanner;

public class C4_replaca {

	public static void main(String[] args) {
		
		//kullanicidan bir cumle isteyiniz
		// cumledeki tum bosluklari silin ve tum a'larin yerine 'e'yazin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		
		String str = scan.nextLine();
		
		str =str.replace(" ", "");
		str = str.replace("a", "e");
		System.out.println(str);
		
		
		System.out.println("lutfen bir cumle daha giriniz");
		String str2 = scan.nextLine();
		System.out.println(str2.replace(" ", "").replace('a','e'));
		
		
		System.out.println(str2.replace('a', 'i').replace("e", "i"));
		
		System.out.println(str2.toLowerCase().replace('a', 'i').replace('e', 'i'));
		// BUYUK KUCUK HARF GOZETMEKSIZIN
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
