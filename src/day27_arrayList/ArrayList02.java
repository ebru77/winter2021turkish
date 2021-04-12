package day27_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
	
List<String> list = new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Fatma");
		System.out.println(list);//[Ali,Can,Ayse,Fatma]
		
		list.set(2, "Kemal");//
		System.out.println(list);//[Ali,Can,Kemal,Fatma]
		
		list.set(0, "Semih");
		System.out.println(list);//[Semih,Can,Kemal,Fatma]
		
		//list.set(4, "Memo");//4 numarali index olmadigi icin hata verir
		
		list.add(2, "Yasin");
		System.out.println(list);//[Semih,Can,Yasin,Kemal,Fatma]
		
		list.add(5, "Hurriyet");
		System.out.println(list);//[Semih,Can,Yasin,Kemal,Fatma,Hurriyet]
		//list.add(10,"Sefer");// Size dan buyuk index kabul etmez
		
		System.out.println(list.contains("Hurriyet"));//true
		System.out.println(list.contains("Mehmet"));//false
		list.contains("Cemal");//OLU KOD
		
		//List'in elemanlarini siralayiniz
		
		Collections.sort(list);//Alfabetik sirayla yazdirir
		System.out.println(list);//[Can,Fatma,Hurriyet,Kemal,Semih,Yasin]
		
		

	}

}
