package day25_arrays;

import java.util.Arrays;

public class arrays03 {

	public static void main(String[] args) {
	//verilen bir string'i array'e cevirin
	//verilen bir cumlede kac kelime oldugunu bulunuz
	//verilen cumlede her kelimenin ilk harfini buyuk yapiniz
		
		String str ="Herkes javayi tanisa severdi";
		
		//bu string'i kelimelere ayiriniz
		//Split methodu (Bolme methodu)
		
		String arr[]=str.split(" ");// String
		System.out.println(Arrays.toString(arr));//[Herkes, javayi, tanisa, sever]->Array
	
	// Split space'leri kaldirir virgul ve bosluk koyar
		
		String arr2[]= str.split("java");
		System.out.println(Arrays.toString(arr2));
		
		
		String arr3[]= str.split("a");//kucuk 'a'harflerini sildi
		System.out.println(Arrays.toString(arr3));//[Herkes j, v, yi t, nis,  severdi]
		
		
		String arr4[]= str.split("");
		System.out.println(Arrays.toString(arr4));//[H, e, r, k, e, s,  , j, a, v, a, y, i, 
		                                         //, t, a, n, i, s, a,  , s, e, v, e, r, d, i]

	}

}
