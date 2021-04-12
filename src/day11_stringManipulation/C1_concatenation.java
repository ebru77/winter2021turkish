package day11_stringManipulation;

public class C1_concatenation {

	public static void main(String[] args) {
		// Concatenation : java'da + islemi yapilirken eger toplanan ifadelerden 
		// biri veya her ikisi 
		
		
		System.out.println(15 + 20 + "Merhaba");// 35Merhaba
		
		System.out.println("Merhaba" +15 +20);// Merhaba1520
		
		System.out.println("Merhaba" + (15 +20));// Merhaba35
		
		System.out.println("Merhaba" + 15 * 20);// Merhaba300 (islem onceligi carpmanindir)
		
		
		
		String str1 = "Hello";
		String str2 = "World";
		
		System.out.println(str1 +" "+str2);// Hello World
		
		System.out.println(str1.concat(str2));// HelloWorld  arada bosluk birakmaz
		
		System.out.println(str1.concat(" ").concat(str2));// Hello World
		
		System.out.println(str1.concat(" "+ str2));// Hello World
		
		
		
		
		
		

	}
	
	

}
