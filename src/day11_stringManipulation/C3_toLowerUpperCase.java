package day11_stringManipulation;

import java.util.Locale;

public class C3_toLowerUpperCase {

	public static void main(String[] args) {
		
		//  str.toLowerCase() verilen String'in tamamini kucuk harfe cevirir
		// str.toUpperCase() verilen String'in tamamini buyuk harfe cevirir
		
		String str = "Techproeducation";
		
		System.out.println(str.toUpperCase());//buyuk harfle yazdirmak istersek
		
		// str'i buyuk harfe cevirmek istersek
		
		str=str.toUpperCase();// kalici olarak str BUYUK harflerden olusan String olur
		System.out.println(str);
		
		System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));

	}

}
