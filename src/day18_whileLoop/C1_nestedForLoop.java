package day18_whileLoop;

import java.util.Iterator;
import java.util.Scanner;

public class C1_nestedForLoop {

	public static void main(String[] args) {
	//kullanicidan pozitif bir rakam girmesini isteyin
	//girilen rakama gore carpim tablosu olusturun
	//ornek = kullanici 3 girerse
		/*
		1 2 3
		2 4 6
		3 6 9
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen pozitif bir rakam giriniz");
		int rakam = scan.nextInt();
		
		for (int i = 1; i <=rakam; i++) {
			
			System.out.println("");
			
			for (int j = 1; j <=rakam; j++) {
				
				System.out.print(i * j + " ");
				
			}scan.close();
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}


