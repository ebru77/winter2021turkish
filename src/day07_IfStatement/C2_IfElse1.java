package day07_IfStatement;

import java.util.Scanner;

public class C2_IfElse1 {

	public static void main(String[] args) {
		// kullanicidan dikdortgenin kenar uzunluklarini alin 
		//uzunluklar esit ise Kare,degilse Kare degil yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen dikdortgenin kenar uzunluklarini giriniz");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("Kare");
		} else {
			System.out.println("Kare degil");
			scan.close();
		}

	}

}
