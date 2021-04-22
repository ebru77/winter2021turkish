package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C3_PassByValue03 {

	public static void main(String[] args) {
/*
 Bir list olusturalim eleman olarak 10,11,12 ekleyelim.iki
 method olusturup list elemanlarin
 1-Method'da elemanlari for each loop kullanarak artirin
 2-Method'da elemanlari set methodu kullanarak artirin
 Method'lari arka arkaya cagirip artislarin kalici olup 
 olmadiklarini kontrol edelim
 */
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		System.out.println(list);//[10,11,12]

		degistirFor(list);
		System.out.println("1.method call'dan sonra : "+list);//[10,11,12]
        degistirSet(list);
		System.out.println("Set ile degistirdigimiz liste main method'un icinde:"+list);//[13, 14, 15]


	}

	private static void degistirSet(List<Integer> list) {
	 for (int i =0; i< list.size(); i++){
	 	list.set(i, list.get(i)+3);
	 }
		System.out.println("SEt ile degistirdigimiz liste methodun icinde:"+list);//[13,14,15]
	 //Java Pass By Value kullanir ancak list'deki SET METHODU istisnai olarak methodun
	//icinde yapilan degisiklikleri de kalici hale getirir.
	}

	private static void degistirFor(List<Integer> list) {

		for (Integer each : list) {//foreach loop ile listeyi guncellemiyoruz sadece
			each += 3;          // herbir elemani tek tek cagirip 3 fazlasini yazdirdik
			System.out.print(each + " ");// 13 14 15
		}
		System.out.println("");
		System.out.println(list);//[10,11,12]listenin kendisinin degismedigini gorduk


	}
}
