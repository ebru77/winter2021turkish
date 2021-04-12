package day08_ifElseIfNestedIf;

public class C2_nestedIf {

	public static void main(String[] args) {
		// Nested : ic ice
		// verilen cinsiyet ve yas icin kisinin emekli olup olmayacagini yazdiran bir java programi yaziniz
		// eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir
		//calisan erkekse 65 yasindan buyukse emekli olabilir.
		
		String cinsiyet = "kadin";
				
		int yas = 65;
		
		if (yas<0) {
			System.out.println("Yas negatif bir sayi olamaz");
			
		}else if (cinsiyet.equalsIgnoreCase("erkek")&&yas>=65) {
			System.out.println("Emekli olabilirsin");
			
		}else if (cinsiyet.equalsIgnoreCase("erkek")&& yas<65) {
			System.out.println("Emekli olamazsin");
			
		}else if(cinsiyet.equalsIgnoreCase("kadin")&& yas>=60){
			System.out.println("emekli olabilirsin");
			
		}else if(cinsiyet.equalsIgnoreCase("kadin")&& yas<60){
			System.out.println("Emekli olamazsin");
			
		}else {
			System.out.println("cinsiyet veya yas tanimsiz");
			
		}	
			
			System.out.println("Nested if ile sonuc");
			
		if (cinsiyet.equalsIgnoreCase("erkek")) {
				
			 if (yas<0) {
					System.out.println("erkek yas negatif olamaz");
					
			 } else if (yas<65){  
					System.out.println("bu yastaki erkek emekli olamaz");

			 }else {
					System.out.println("bu yastaki erkek emekli olabilir");
				}
				
			} else if (cinsiyet.equalsIgnoreCase("kadin")){
				if(yas<0) {
					System.out.println("kadin yas negatif olamaz");
					
			}else if (yas<60) {
				System.out.println("bu yastaki kadin emekli olamaz");
				
			}else {
				System.out.println("bu yastaki kadin emekli olabilir");
			}

			}else {
				System.out.println("yazdiginiz cinsiyet sisteme kayitli degil");
			}
		}
		

	}


