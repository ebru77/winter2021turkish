package day12_stringManipulation;

import java.util.Scanner;

public class C6_lastIndexOf {

	public static void main(String[] args) {
		// kullanicidan bir cumle alin ve asagidaki 
		//3 durumdan uygun olani yazdirin
		
		//1)  cumle java icermiyor 
		//2) cumle bir tane java iceriyor
		//3) cumlede birden fazla java var
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir cumle giriniz : ");
		
		String cumle = scan.nextLine().toLowerCase();
		
		int ilkJava=cumle.indexOf("java");// -1 yada ilk java'nin index'ini
		
		int sonJava = cumle.lastIndexOf("java");// -1 yada son java nin index'ini
		
		if (ilkJava==-1) {
			System.out.println("cumle java icermiyor");
			
		} else if (ilkJava==sonJava){
			System.out.println("cumle bir java kelimesi iceriyor");
			

		}else {
			System.out.println("cumle birden fazla java iceriyor");
			
			scan.close();
		
		
		}
		
		
	}

	

}
