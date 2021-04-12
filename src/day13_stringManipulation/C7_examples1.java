package day13_stringManipulation;

import java.util.Scanner;

public class C7_examples1 {

	public static void main(String[] args) {
		
		//kullanicidan 4 harfli bir kelime isteyin
		//girilen kelimeyi tersten yazdirin
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen dort harfli bir kelime giriniz");
		
		String str = scan.nextLine();
		
		if (str.length()!=4) {//kullanici 4 den fazla harf girmesin diye
			System.out.println("lutfen 4 karakterli bir kelime giriniz");
			
		} else {
			
			// 1. yol
			System.out.print(str.substring(3));
			System.out.print(str.substring(2,3));//2.al 3. yu alma
			System.out.print(str.substring(1,2));//1.yi al 2. yi alma
			System.out.print(str.substring(0,1));//0.ui al 1. yi alma
			
			// 2. yol
			System.out.print(str.charAt(3));
			System.out.print(str.charAt(2));
			System.out.print(str.charAt(1));
			System.out.print(str.charAt(0));

			
			scan.close();
			
			
			
			
			
			
			

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
