package day19_doWhileLoop;

import java.util.Scanner;

public class C1_count {

	public static void main(String[] args) {
	// kullanicidan bir cumle ve bir harf isteyin
	//whileloop kullanarak cumledeistenen harfkac kez kullanilmis bulunuz
	//program case sensitive olsun
		
		
	Scanner scan = new Scanner(System.in);
	System.out.println("lutfen bir cumle giriniz");
	String cumle = scan.nextLine();
	
	System.out.println("Lutfen saymak istediginiz harfi giriniz");
	String harf = scan.next().substring(0,1);//0.index dahil 1. index haric yani
	                                       //ilk bas harfini aliyoruz
	
	int count = 0;
	int index = 0;//whileloop'un baslangici icin (baslangic variable)
	
	while(index<cumle.length()) {//esitlik kullanmadigimiz icin length()demek
								//yeterli 0<cumle -1 oldugunu gosterir
		
		
		if(cumle.substring(index, index+1).equals(harf)) {
						//	0		1 -> 0. index'deki harfi olacak->a'ya esit mi
		count++;		//  1       2 -> 1. index'deki harfi olacak->a'ya esit mi
						//  2		3 -> 2. index'deki harfi olacak->a'ya esit mi
			// Eger a'ya esitse count'umu 1 artiracak,degilse birsey yapmayacak
			
		}
		index++;
		
	}
	System.out.println("cumlede " + harf + " harfi " + count + " defa kullanilmis");
	
	scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
