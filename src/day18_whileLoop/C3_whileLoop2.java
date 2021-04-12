package day18_whileLoop;

public class C3_whileLoop2 {

	public static void main(String[] args) {
	// 3 basamakli pozitif sayilardan 15,20 ve 90'na
	// tam bolunebilen sayilari yazdirin
		
	// FORLOOP
		
		for (int i = 100; i < 1000; i++) {
			if (i%15==0 && i%20==0 && i%90==0) {
				System.out.print(i + " ");
				
			}
			
		}
		System.out.println("");
		
	// WHILELOOP
		
		int sayi = 100;
		
		while(sayi<1000) {
		
		if (sayi%15==0 && sayi%20==0 && sayi%90==0) {
			System.out.print(sayi + " ");
		
		}
		
		sayi++;
	}
	
	}
}
		
		
		
		
		
		
		
		
		
		
		

	


