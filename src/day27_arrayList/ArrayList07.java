package day27_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList07 {

	public static void main(String[] args) {
	
	//Verilen bir arraydeki tekrarli elemanlari silip
	//tekrarsiz bir array olusturmak istiyoruz
	// Array veya list olusturarak yapiniz
		
		int arr[]= {1,2,3,5,1,2,4,3,5,1,6,7,1,2,6,4,2};
		
		List<Integer> list = new ArrayList <>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if (!list.contains(arr[i])) {//arr benim sayimi icermiyorsa
				
				list.add(arr[i]);//listeye sayiyi ekle.Tekrarsiz LIST olustu
			}
			
		}
		System.out.println(list);//[1, 2, 3, 5, 4, 6, 7]
		
	//Bizden Array olarak istedigi icin listimizi Array'e cevirdik
		Integer tekrarsizArray[]= list.toArray(new Integer[0]);
		
		System.out.println(Arrays.toString(tekrarsizArray));
	
		
		
		

	}

}
