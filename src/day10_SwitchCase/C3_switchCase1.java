package day10_SwitchCase;

import java.util.Scanner;

public class C3_switchCase1 {

	public static void main(String[] args) {
		// kullanicidan  bir rakam isteyin
		//girilen rakami yazi ile yazdirin
		// negatifse reddedin noktaliysa reddedin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir rakam giriniz");
		
		int rakam = scan.nextInt();
		
		if (rakam==1) {
			System.out.println("Bir");
			
		} else if(rakam==2){
			System.out.println("iki");

		} else if(rakam==3) {
			System.out.println("uc");
			
		}else if(rakam==4){
			System.out.println("dort");
			
		}else if(rakam==5){
				System.out.println("bes");	
		
		}else if(rakam==6){
			System.out.println("alti");
			
		}else if(rakam==7){
			System.out.println("yedi");	
	
		}else if(rakam==8){
			System.out.println("sekiz");	
	
		}else if(rakam==9){
			System.out.println("dokuz");
			
		}else {
			System.out.println("gecerli bir rakam giriniz");	
		
			
		
		}		
		
		
		switch(rakam) {
		
		case 0 :
			System.out.println("sifir");
			break;
		
		case 1 :
			System.out.println("bir");
			break;
		
		case 2:
			System.out.println("iki");
			break;
		
		case 3 :
			System.out.println("uc");
			break;
		
		case 4 :
			System.out.println("dort");
			break;
		
		case 5 :
			System.out.println("bes");
			break;
		
		case 6 :
			System.out.println("alti");
			break;
		
		case 7 :
			System.out.println("yedi");// break leri koymazsak asagiya dogru hepsini
										// yazdirir
			//break;
			
		case 8 :
			System.out.println("sekiz");
			//break;
		
		case 9 :
			System.out.println("dokuz");
			break;
		
		default :
			System.out.println(" lutfen gecerli rakam giriniz");
			
		
		
		scan.close();
		
		
		
		
		
		}	
		
		
		

	}

}
