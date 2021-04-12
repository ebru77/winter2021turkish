package day26_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C2_ArrayList01 {

	public static void main(String[] args) {
	/*
	  bir arraylist nasil olusturulur
	 ArrayList objedir,yeni bir tane olusturmak icin new keyword kullanmaliyiz
	*/
		
		//1.Yol
		
		@SuppressWarnings("unused")
		ArrayList<String> list = new ArrayList<String>();
		
		//2.Yol
		
		@SuppressWarnings("unused")
		ArrayList<String> list2 = new ArrayList<>();
		
		//3.Yol
		
		List<String> list3 = new ArrayList<>();
		
	//NOT:Eger constructor olarak List<>() kullanilirsa CTE verir.
	// List<String> list4 = new List<>();
		
//Olusturdugumuz Class isimleri Java'da kullanilan obje isimleri ile AYNI OLMAMALIDIR.
		
		//Liste eleman ekleme
 //Liste olusturulurken otomatik olarak eleman ekleme ozelligi yoktur,
	//elemanlarin tek tek eklenmesi gerekir
		
		list3.add("Ali");//0.index
		list3.add("Veli");//1.index
		list3.add("Ayse");//2.index
		
		System.out.println(list3);//[Ali,Veli,Ayse]
		
		list3.add(1, "Can");//1.indexe istenen degeri ekler
		
		System.out.println(list3);//[Ali,Can,Veli,Ayse]
		
		list3.add(1, "Fatma");
		System.out.println(list3);//[Ali,Fatma,Can,Veli,Ayse]
		
		/*
		 verilen bir Arrayden istenen degere esit olan elemanlari kaldirip
		 kalanlari yeni bir Array olarak yazdiran bir method yaziniz
		 */
		
		int arr[]= {2,3,5,3,6,4,3,6,7};
		int sayi =5;
		
		List<Integer>istenenList = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]!=sayi) {
				
				istenenList.add(arr[i]);
				
			}
			
		}
		System.out.println(istenenList);//[2,3,6,4,3,6,7]
		
		
		
	}

}
