package day11_stringManipulation;

public class C4_Equals {

	public static void main(String[] args) {
		// str.equals(str2) str ve str2'yi karsilastirir ve 
		// String olarak esit olup olmadiklarina bakar
		// sonuc olarak true veya false a döndürür.
		
		//bazi methodlarin yaptiklari islem ile döndürdükleri sonuc farkli olabilir.
		// bir methoda git ali ismindeki elementi sil deriz.
		// o da ali'yi bulur ve siler ve sildiyse true getirir ama silemezse false getirir
		//
		
		String str = "Ali Can";
		String str2 = "Ali Can";
		
		// str ile str2'nin esit olup olmadigini yazdirin.
		// esit veya esit degil yazdirin
		
		System.out.println(str.equals(str2)); // True 
								//ama ben esit yada esit degil yazdirmasini istiyorum
		
		
		System.out.println(str.equals(str2) ? "Esit" : "Esit degil");// Esit
		
		// java'da Stringler case sensitive'dir.Buyuk kucuk harf duyarlidir.
		// Bir harf bile farkli olsa Stringler esit olmaz.
		
		
		
		
		
		
		
		
		

	}

}
