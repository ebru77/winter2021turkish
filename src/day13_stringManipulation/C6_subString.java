package day13_stringManipulation;

public class C6_subString {

	public static void main(String[] args) {
		//
		
	String str = "Her ders java gibi olsa";
	
	//str'nin ilk 10 karakterini * ile gizleyin, geriye kalanlar normal yazilsin.
	
	System.out.println(str.substring(10));//10. index den alir sonuna kadar yazdirir
	
	System.out.println(str.substring(str.length()-10));//sondan 10 harfi yazdirir.
	
	System.out.println(str.substring(0,10));//ilk 10 indexi yazdirir.0(inculusive),10(exclusive)
	
	System.out.println(str.substring(10));//10. indexten alir sonuna kadar yazdirir
	
	System.out.println("**********" + str.substring(10));// 1.yol ilk 10 karakteri * yapar
														//gerisini normal yazdirir
	
	System.out.println(str.substring(0,10).replaceAll("\\D","*")+str.substring(10));// 2. yol 
	//ilk 10 karakteri * yapar gerisini normal yazdirir
	
	
	System.out.println(str.substring(10,10));
		
		
	//System.out.println(str.substring(8,7));
	
	System.out.println(str.substring(23));// cumlenin karakter uzunlugu 23 oldugundan
										// hiclik verir
		
		
	System.out.println(str.substring(22));//length()-1 son karakteri verir	
		
	//System.out.println(str.substring(24));//length()'den buyuk sayi yazarsak hata verir	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
