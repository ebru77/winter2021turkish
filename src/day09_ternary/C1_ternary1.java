package day09_ternary;

public class C1_ternary1 {

	public static void main(String[] args) {
		
		
	int sayi =10;
	
	// ternary islemi bir sonuc dondurdugunden bir variable olusturup ona assign etmeliyiz
	
	String sonuc = sayi%2==0 ? "cift sayi": "tek sayi"	;
	
	System.out.println(sonuc);
		
		
		// ben bir variable ye assign etmek istemezsem syso icine yazabiliriz
	
	
	
	System.out.println(sayi%2==0 ? "cift sayi": "tek sayi");
	
	// basina aciklama yazmak istersen
	// ternary operatorunu parantez icine almaliyim
	
	
	System.out.println("islem sonucu : " + (sayi%2==0 ? "cift sayi" : "tek sayi"));
	
		
		
		
		
		
		

	}

}
