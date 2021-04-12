package day27_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
	
	//verilen bir Array'i listeye nasil ceviririm
		/* 1.YOL
	    Integer array[]= {10,12,35,60,40};
		
		List listeyap = new ArrayList();
		
		listeyap = Arrays.asList(array);
		
		System.out.println(listeyap);
		*/

		//2.YOL
	//Bu methodla Arrayden cevirdigimiz list esnek olmaz.Arrayin ozelliklerini
	//tasir add(),remove(),clear(),gibi uzunlugu etkileyen methodlar kullanamayiz.
		Integer arr1[]= {1,2,3};
		List<Integer> list2 = Arrays.asList(arr1);
		System.out.println(list2);//[1,2,3]
		
		String arr[]= {"ALI","Veli"};
		List<String>listarr = Arrays.asList(arr);
		System.out.println(listarr);//[ALI,Veli]
		
	//ORNEK
		
		arr1[1]=5;//1. indexdeki sayiyi 5 yap
		
		System.out.println(Arrays.toString(arr1));//[1,5,3] Array degisti
		System.out.println("list2:" + list2);//list2:[1,5,3] List de degisti
		
		list2.set(2, 13);//2. indexdeki 3 sayisini kaldir yerine 13 koy
		
		System.out.println("list2 : " +list2);//list2 :[1,5,13]
		
		System.out.println("array : " + Arrays.toString(arr1));//array : [1, 5, 13]
		
	//Java bu degisimdeki Array ve List'i senkronize eder.
	//Birinde yaptigimiz bir degisiklik otomatik olarak digerinide update eder	
		

	}

}
