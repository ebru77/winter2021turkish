package day25_arrays;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
	// iki array'in esit oldugunu kontrol etme
		
		int arr1[]= {10,25,5,20};
		int arr2[]= {25,10,20,5};
		System.out.println(Arrays.equals(arr1, arr2));//false
		
		Arrays.sort(arr1);//| Buyukten kucuge siralayinca
		Arrays.sort(arr2);//|(arr1)ve(arr2)birbirine esit oldu
		System.out.println(Arrays.equals(arr1, arr2));//true
		
	//iki array'in birbirine esit olmasi icin  uzunluklari,icindeki tum elemanlar
	// ve esit elemanlarin indexleri esit olmalidir
		
		
				
				
		}

	}


