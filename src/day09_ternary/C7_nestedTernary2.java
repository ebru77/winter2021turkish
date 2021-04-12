package day09_ternary;

import java.util.Scanner;

public class C7_nestedTernary2 {

	public static void main(String[] args) {
		// kullanicidan bir harf isteyin kucuk harf ise consola "kucuk harf"
		// buyuk harfse "buyuk harf"yoksa "girdiginiz karakter harf degil yazsin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir harf giriniz");
		
		char harf = scan.next().charAt(0);
		
		System.out.println(harf>='a' && harf<'z' || harf>'A' && harf<'Z'
				? "kucuk harf" :"buyuk harf gir");
		
			
		scan.close();

	}

}
