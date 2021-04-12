package day27_arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Fatma");
		
		System.out.println(list);//[Ali,Can,Ayse,Fatma]
		
		System.out.println(list.size());//4
		
		System.out.println(list.remove(1));//index'i 1 olan Can'i silip,sildigi elemani bana dondurecek
        System.out.println(list);//[Ali,Ayse,Fatma]
		
		System.out.println(list.remove("Ayse"));//true dondurdu.Ayse'yi sildi
		System.out.println(list);//[Ali,Fatma]
		
		System.out.println(list.remove("Mehmet"));//False
		
		/*
		String isim ="Ali";// Immutable (degistirilemez)
		isim.toLowerCase();//ali
		System.out.println(isim);//Ali cunku Java String methodlari ile String'i degistirmez
		
		System.out.println(list);//[Ali,Fatma]
		list.add("Ayse");
		System.out.println(list);//[Ali,Fatma,Ayse]
       */
		
		list. remove(1);//Fatmayi sildi
		list.remove("Ali");//Ali'yi sildi
		System.out.println(list);//[]
	//NOT: List'ler method oldugu icin kalici olarak degisir
	}

}
