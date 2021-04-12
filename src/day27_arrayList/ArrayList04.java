package day27_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
	
		@SuppressWarnings("unchecked")
		List<Integer> list1 = new ArrayList();
		
		list1.add(10);
		list1.add(20);
		
		@SuppressWarnings("unchecked")
		List<Integer> list2 = new ArrayList();
		
		list2.add(20);
		list2.add(10);
		
		System.out.println(list1.equals(list2));//false
//NOT:equals()methodeu 2 listeyi hem elemanlar hem de elemanlarin 
//index'leri ile karsilastirir.Hem elemanlar hem de indexler esit ise 
//true doner,	yoksa  false doner.
		
		Collections.sort(list1);//[10,20]
		Collections.sort(list2);//[10,20]
		
		System.out.println(list1.equals(list2));//true
		
		list1.clear();//listedeki tum elemanlari siler
		System.out.println(list1);//[] bos liste verir
		

	}

}
