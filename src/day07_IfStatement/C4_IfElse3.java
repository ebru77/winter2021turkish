package day07_IfStatement;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		// kullanicidan yasini sorun
		// 65 veya buyukse "emekli olabilirsin" yoksa "emekli olamazsin" yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		int yas=scan.nextInt();
		
		if (yas>=65) {
			System.out.println("Emekli olabilirsin");
			}else {
				System.out.println("Emekli olamazsin");
			}
            scan.close();
	}

}
