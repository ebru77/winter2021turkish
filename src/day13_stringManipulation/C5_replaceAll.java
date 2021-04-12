package day13_stringManipulation;

public class C5_replaceAll {

	public static void main(String[] args) {
		
	// replaceAll() method'u replace() methoduna benzer 2 farkla
	// 1) replace() method'u char kabul eder ama replaceAll()kabul etmez
	// 2) replaceAll() method'u regex kullanimina izin verir.
		
		
		
		String str = "Java ogren, mutlu ol, Java candir 12345";
		System.out.println(str.replace("Java", "hava"));
		
		
		System.out.println(str.replaceAll("\\w", "*"));//harfleri ve rakamlari * cevirir
		
		System.out.println(str.replaceAll("\\W", "*"));//harf ve rakam disindakileri * cevirir
		
		System.out.println(str.replaceAll("\\d", "."));//rakamlari . ya cevirir
		
		System.out.println(str.replaceAll("\\D", "."));//rakam olmayanlari . ya cevirir
		
		System.out.println(str.replaceAll("\\s", "&"));//bosluklari & yapar
		
		System.out.println(str.replaceAll("\\d", ""));//rakamlari siler
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
