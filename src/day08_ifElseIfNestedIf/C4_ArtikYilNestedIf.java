package day08_ifElseIfNestedIf;

import java.util.Scanner;

public class C4_ArtikYilNestedIf {
	public static void main(String[] args) {
		// kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin
		//kural 1: 4 ile bolunemeyen yillar artik yil degildir
		//kural 2: 4'un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400'un kati olan yillarnartik yildir
		
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen yil yaziniz");
		
		int yil = scan.nextInt();
		
		if (yil%100==0) { // 100'e bolunebiliyor
			
			
			if (yil%400==0) {
				System.out.println("Artik yil");
			
			} else { 
			System.out.println("Artik yil degil");
			}
			
		}else { // 100'e bolunemiyor
			
			if (yil%4==0) {
				System.out.println("Artik yil");
			}else { 
				System.out.println("Artik yil degil");
			}
			scan.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

