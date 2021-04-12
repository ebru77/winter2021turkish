package day07_IfStatement;

import java.util.Scanner;

public class C3_IfElse2 {

	public static void main(String[] args) {
		// kullanicidan bir karakter girmesini isteyiniz
		// harf olup olmadigini yazdiriniz
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir kaeakter giriniz");
		char karakter=scan.next().charAt(0);
		
		if((karakter >='a' && karakter <='z') || (karakter >='A' && karakter<='Z')){
			System.out.println("girdiginiz karakter harf");
		}else {
			System.out.println("girdiginiz karakter harf degil");
		}

		scan.close();
	}

}
