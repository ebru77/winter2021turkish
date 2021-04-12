package day24_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
	/*
	 verilen 3 elemanli bir array'in tum elemanlarini
	 bir soldaki konuma tasiyacak bir program yazin
	 ornek;array[1,2,3]ise output[2,3,4]olacak
	 */
	
		int arr[]= {1,2,3,4,5};
		int temp=arr[0];//1. index'i koruma altina aldik
		
		for (int i = 0; i < arr.length-1; i++) {
			
			arr[i]=arr[i+1];//matematiksel deger yazmamiz gerekiyor
			
		}
		arr[arr.length-1]=temp;
		System.out.println(Arrays.toString(arr));
		

	}

}
