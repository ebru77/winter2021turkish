package day29_passbyvalueimmutable;

public class C1_PassByValue01 {

	public static void main(String[] args) {
	
	//PassByValue ve PassByReference
		/*
	Verilen bir fiyat icin %10 indirim yapan bir method olusturun
	method'da indirim uygulanan fiyati yazdirin
	Method Call sonrasi orjinal fiyati yazdirin ve method da yapilan
	degisikligin orjinal degerinin degisip degismedigini kontrol edin
		 */
		
		double fiyat = 100;//fiyat degiskeni olusturduk
		
		indirimUygula(fiyat);//Method Call
		
		System.out.println("method call sonrasi fiyat : " + fiyat);//100
		
		

	}

	private static void indirimUygula(double fiyat) {
		
		fiyat = fiyat *0.90;//fiyatin %10'unu bulmak icin
		System.out.println("%10 indirimli fiyat : " + fiyat);//90
		
		System.out.println(fiyat-10);//80
		
	}

}
