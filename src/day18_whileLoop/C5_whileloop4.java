package day18_whileLoop;

import java.util.Scanner;

public class C5_whileloop4 {

	public static void main(String[] args) {
	// kullanicidan bir tamsayi alin ve bu sayiyi tam bolen sayilari
	//ve toplam kac tane olduklarini ekrana yazdirin
		
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Lutfen bolenleri bulmak icin bir tamsayi girin");
	int sayi = scan.nextInt();
		
	int bolen = 1;//baslangic degeri
	int count = 0;
	while(bolen<=sayi) {
		
		if (sayi%bolen==0) {
			
			count++;//kac tane kalansiz sayiya bolundugunu verir
			
			System.out.println(bolen);
			
		}
		bolen++;
	}
		
	System.out.println(sayi + "sayinin bolenleri: " + count + " adettir");
	
	
	bolen = 1;
    count = 0;
	while(bolen<=sayi) {
		
		if (sayi%bolen==0) {
			
			count++;
			
			System.out.println(count+"_"+bolen);
	
		}
		bolen++;
	}
	
	
	scan.close();
	
	
	
	
	
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


