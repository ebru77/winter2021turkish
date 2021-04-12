package day09_ternary;

import java.util.Scanner;

public class C4_ternary4 {

	public static void main(String[] args) {
		// kullanicidan bir tam sayi alin ve sayinin tek mi cift mi oldugunu yazdirin
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		
		int sayi = scan.nextInt();
		
		System.out.println(sayi%2==0 ? "cift sayi" : "teksayi");
		
		
		// girilen sayinin mutlak degerini yazdirin
		// girilen sayi x olsun . x pozitifse |x|=x  x negatifse |x|=-x
		
		
		System.out.println("sayinin mutlak degeri :" + (sayi>0 ? sayi : -sayi));
		
		
		scan.close();
		
		
		
		
		
		
		
		

	}

}
