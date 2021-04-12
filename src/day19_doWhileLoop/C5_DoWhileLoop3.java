package day19_doWhileLoop;

import java.util.Scanner;

public class C5_DoWhileLoop3 {

	public static void main(String[] args) {
	/*
	 kullanicidan bir sifre girmesini isteyin.Girilen sifreyi 
	 asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin
	 Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin.
	 gecerli sifre girdiginde "sifreniz kabul edilmistir" yazdirin
	 
	 -sifre kucuk harf icermelidir          |
	 -sifre ozel karakter icermelidir       |
	 -sifre buyuk harf icermelidir          |METHOD OLUSTURULMAMIZ LAZIM      
	 -sifre en az sekiz karakter olmalidir  |
	 */
		
	Scanner scan = new Scanner(System.in);
	String sifre = "";
	int sonuc =0;
	
	do {
		System.out.println("lutfen sifrenizi giriniz");
		
		sifre = scan.nextLine();
		
		sonuc=kucukHarfVarMi(sifre)+buyukHarfVarMi(sifre)+ozelKarVarMi(sifre)+uzunlukUygunMu(sifre);
		
	} while (sonuc!=4);//4 tane method olusturdugumuz icin 1+1+1+1=4
	System.out.println("sifreniz basari ile kaydedildi");//
		scan.close();
		}

	public static int uzunlukUygunMu(String sifre) {
		int sonucUzunluk = 0;
		if (sifre.length()<8) {
			System.out.println("sifre en az sekiz karakter olmalidir");
			
		} else {
			sonucUzunluk = 1;
        }
		
		return sonucUzunluk;
	}

	public static int ozelKarVarMi(String sifre) {
		int flagOzel = 0;
		int index = 0;
		
		while(index<sifre.length()) {
			if (sifre.charAt(index)>=' ' && sifre.charAt(index)<='/'){
				flagOzel = 1;
		}
		 index++;	
		}
		if (flagOzel==0) {
			System.out.println("sifre ozel karakter icermelidir");
			
		}
		return flagOzel;
	}

	public static int buyukHarfVarMi(String sifre) {
		int flagBuyuk =0;
		int index =0;
		
		while(index<sifre.length()) {
			if (sifre.charAt(index)>='A' && sifre.charAt(index)<='Z') {
				flagBuyuk = 1;
			}
			index++;
		}
		if (flagBuyuk==0) {
			System.out.println("sifre buyuk harf icermelidir");
		}
		
		return flagBuyuk;
	}

	public static int kucukHarfVarMi(String sifre) {
		int flagKucuk = 0;
		int index = 0;
		
		while(index<sifre.length()) {
			if (sifre.charAt(index)>='a' && sifre.charAt(index)<='z') {
				flagKucuk = 1;
			}
			index++;
		}
	       if (flagKucuk==0) {
			   System.out.println("sifre kucuk harf icermelidir");
		}
		return flagKucuk;
		
	}
       
}
