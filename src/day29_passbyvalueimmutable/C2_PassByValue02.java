package day29_passbyvalueimmutable;

public class C2_PassByValue02 {

	public static void main(String[] args) {
	/*
Verilen bir fiyat icin %10,%20,%25 indirim yapan 3 method olusturun
Method'da indirim uygulayip fiyati main method'da yazdirin.Method'lari
arka arkaya cagirip dogru calistiklarini kontrol edin
	 */
		
double fiyat = 100;//fiyat degiskeni olusturduk
		
System.out.println("%10 indirimli fiyat : " + indirimUygula10(fiyat));
System.out.println("%20 indirimli fiyat : " + indirimUygula20(fiyat));		
System.out.println("%25 indirimli fiyat : " + indirimUygula25(fiyat));
System.out.println("Method call'dan sonra fiyat : " + fiyat);
	}

	private static double indirimUygula25(double fiyat) {
		
		fiyat*=0.75;
		return fiyat;
	}

	private static double indirimUygula20(double fiyat) {
		
		fiyat*=0.80;
		return fiyat;
	}

	private static double indirimUygula10(double fiyat) {
		
		fiyat*=0.90;
		
		return fiyat;
	}

	
		
	}


