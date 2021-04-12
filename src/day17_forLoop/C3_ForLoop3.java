package day17_forLoop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
	//KULLANICIDAN 35'DEN KUCUK POZITIF BIR SAYI ALIN,
	//GIRILEN SAYININ FAKTORYEL,INI HESAPLAYIP YAZDIRAN BIR METHOD OLUSTURUN
		//6! =1*2*3*4*5*6 = 720
		
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Lutfen faktoryel hesaplamak icin 35'den kucuk pozitif bir tamsayi giriniz");
		
	int sayi = scan.nextInt();
	
	if (sayi<=0 || sayi>=35) {
		System.out.println("Lutfen gecerli bir sayi giriniz"); 
		
	} else {
		faktoryelBul(sayi);
		

	}
	}

	public static void faktoryelBul(int sayi) {
	
		long faktoryel = 1;//sonucu koyacagimiz konteyneri long kullaniyoruz	
		             // daha buyuk oldugu icin
	
	for (int i = 1; i <=sayi; i++) {
		
		faktoryel*=i;
		
	}
	System.out.println(faktoryel);	
		
	
		
		
		
		
		
		
		
	}

}
