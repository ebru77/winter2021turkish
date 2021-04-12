package day07_IfStatement;

import java.util.Scanner;

public class C8_ifElseIf_maas {

	public static void main(String[] args) {
// kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap yazdirin
// Teklif 80.000'in uzerinde ise "Kabul ediyorum".
// 60.000-80.000 arasinda ise "Konusabiliriz",
// 60.000 'nin altinda ise "Maalesef kabul edemem"yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen maas teklifini giriniz");
		double maas = scan.nextDouble();
		
		if (maas>80.000) {
			System.out.println("Kabul ediyorum");
			
		}else if (maas>60.000){
			System.out.println("Konusabiliriz");
			
		}else {
			System.out.println("Maalesef kabul edemem");
		}
        scan.close();
	}

}
