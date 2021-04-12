package day28_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C3_ForeachLoop3 {

	public static void main(String[] args) {

	//verilen bir array deki elemanlari bir listeye
	//aktaran bir method yaziniz
		
		String arr[]= {"Ali","Veli","Ayse","Fatma"};
		
		List<String> list = listeyeCevir(arr);
		
		list.add(0,"Bu is bukadar");//0.index'e ekler
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);//1. index'i siler(Ali)

	}

	private static List<String> listeyeCevir(String[] arr) {
		
		List<String>gecicilist = new ArrayList<>();
		
		for (String each : arr) {
			 gecicilist.add(each);
			
		}
		return gecicilist;
	}

}
