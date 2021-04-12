package day25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
	//verilen bir arrayde bir elemanin var olup olmadigini nasil kontrol ederiz
		
		int arr[]= {10,25,3,16,75};
		int sayi = 19
				;
		
		boolean flag = false;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]==sayi) {//eger arr'in [i] elementi sayiya esitse
				flag=true;
				
			}
			
		}
		if (flag) {//eger flag sa
			System.out.println("Array sorulan elemani iceriyor");
			
		}else {//degilse
			System.out.println("array sorulan elemani icermiyor");
		}
		
	// Arrays class'indan method kullanarak yapalim
		
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 25));// -4(siralamada 19 yok ama olsaydi 4. sirada olurdu
		System.out.println(Arrays.binarySearch(arr, 100));// -6 (SIRALAMADA 100 YOK AMA OLSAYDI 6.SIRADA OLURDU
		
	//BINARYSEARCH sonuc olarak aradigimiz eleman varsa index'ini verir.
	//aradigimiz eleman yoksa (-)isareti ile olsaydi kacinci eleman olacagini dondurur
		
		int arr2[]= {12,15,25,14,3,12,65};
		
		Arrays.sort(arr2);
		System.out.println(Arrays.binarySearch(arr2, 12));
		
	//Array nasil String'e cevrilir?
		
		String arrayString = Arrays.toString(arr2);
		System.out.println(arrayString);//[3, 12, 12, 14, 15, 25, 65]
		System.out.println(arrayString.substring(10));

	}

}
