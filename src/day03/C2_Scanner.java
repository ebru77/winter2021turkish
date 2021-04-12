package day03;

import java.util.Scanner;

public class C2_Scanner {

	public static void main(String[] args) {
		
		// Kullanicidan ismini isteyip ilk harfini buyuk harf olarak yazdirin
		// mehmet ==> basharfiniz :M
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz");
		
		char ilkHarf =scan.next().toUpperCase().charAt(0);
		//Stringde harflerin indexleri 0'dan baslar
		// biz ilk harfi almak istedigimiz icin index olarak 0 girmeliyiz
		
		
		System.out.println("bas harfiniz : " + ilkHarf);
		
		//eger charAt(0) yazdiktan sonra . koyarsak methodlar gelmez
		// cunku charAt(0) methodu kullanilinca variable'imizi char yapmis oluruz
		//char primitive data tipindedir
		// primitive data tipleri methodlara sahip degildir
		
		scan.close();

	}

}
