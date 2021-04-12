package day13_stringManipulation;

import java.util.Scanner;

public class C2_endWith {

	public static void main(String[] args) {
		// 
		
		
	String str = "Java'yla hayat ne guzel";
	
	System.out.println(str.endsWith("zel"));//true
	
	System.out.println(str.endsWith("ne guzel"));//true
	
	System.out.println(str.endsWith("zel "));//false
	
		
		
		
	Scanner scan= new Scanner(System.in);
	System.out.println("Lutfen email'inizi giriniz");
	
	String email = scan.next();
	
	

	if (!email.contains("@")) {
		System.out.println("girdiginiz bilgi mail degil");
		
	} else if(!email.contains("@gmail.com")){
		System.out.println("Lutfen gmail adresi yaziniz");//eger emailiniz 
		                              				// @gmail.com icermiyorsa
		
	} else if (email.endsWith("@gmail.com")) {
		System.out.println("Emailiniz basariyla kaydedildi");

	}else {
		System.out.println("gecersiz email adresi");
	}
	scan.close();	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
