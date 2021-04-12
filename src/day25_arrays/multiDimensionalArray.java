package day25_arrays;

import java.util.Arrays;

public class multiDimensionalArray {

	public static void main(String[] args) {
/*
 1-Ic ice Array olusturdugumuzda disaridaki ana arraye OUTER array,
 icerdeki kucuk arraylere ise INNER array denir
 2- Egericerdeki arraylerin boyutlari birbirinden farkli ise 
 Array'i ancak tum elemanlari yazarak declare edebiliriz
 3-Multidimensional arrayde bir elemanin indexi icin en disardaki array haric
  elemana kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
 */
		
		int arr [][] = {{1,3,5}, {3,5}, {5,9,11,3}};//iki katli bir arraydir
		
		int arr2[][]= new int [3][2];
//[3] ilk yazilan sayi outer arrayin icinde kac tane inner array oldugunu belirtir
//[2] her bir inner arrayin uzunlugu
		
		System.out.println(Arrays.toString(arr2));//(arr2)outer Arraydir bu yuzden referans verir
//Multidimensional array'leri yazdirmak icin toString methodu kullanilmaz.cunku toString methodu 
//outer Stringi array'e cevirir.Outer Array'in icinde inner Arrayler oldugundan toString methodunda 
//inner arraylerin referans degerleri yazdirilir.
		
		System.out.println(Arrays.deepToString(arr2));

	}

}
