package day18_whileLoop;

public class C2_whileLoop1 {

	public static void main(String[] args) {
	
	// while oldugu surece 10'dan 30'a kadar olan sayilardan 
	//4 ile bolunebilenleri aralarinda bir bosluk olacak sekilde yanyana yazdirin
		
		// FORLOOP
		
		for (int i = 10; i <= 30; i++) {
			
			if (i%4==0) {
				
				System.out.print(i + " ");
				
			}
			
		}
		System.out.println("");
		
		
		// WHILE LOOP 
		
		int sayi = 10;// 1.SART (baslangic degeri)
		
		while(sayi<30) {
			
			if (sayi%4==0) {
				
				System.out.print(sayi + " ");
				
			}
			sayi++;
		}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	

}
