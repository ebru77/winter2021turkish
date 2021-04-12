package day10_SwitchCase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		// kullanicidan VIP (very important person)
		//kisaltmasinda hangi harfin anlamini istedigini soralim
		//girilen harfin aciklamasini yazdiralim
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen harf giriniz");
		
		char harf = scan.next().charAt(0);//
		
		switch (harf) {
		case 'V':
		case 'v':
			System.out.println("Very");
			break;
		case 'I':
		case 'i':
			System.out.println("Important");
			break;
		case 'P':
		case 'p':
			System.out.println("Person");
			break;
			default:
				System.out.println("gecerli harf giriniz");
		}
				
				
	// kullanicinin birden fazla harf girmesini sorun ediyorsaniz 
	// ve bunu kullaniciya hata olarak bildirmek istiyorsaniz			
				
			System.out.println("Lutfen harf giriniz");
			
			String str =scan.next();
			
			switch (str) {
			case "V":
			case "v":
				System.out.println("Very");
				break;
			case "I":
			case "i":
				System.out.println("Important");
				break;
			case "P":
			case "p":
				System.out.println("Person");
				break;
				default:
					System.out.println("gecerli harf giriniz");
					
				
			}	
				
				
		
			scan.close();
				
				
				
				
				
				
			
			
		}
			
			
			
			
		}

	


