package day13_stringManipulation;

public class C8_examples2 {

	public static void main(String[] args) {
		
		// String seklinde verilen asagidakinfiyatlarin toplamini bulunuz
				
			//String str1 ="$13.99"
			//String str2 ="$10.55"
		//ipucu : Double.parseDouble() methodu kullanabiliriz
		
		
		String str1 = "$13.99";//Dolar isaretini ve noktayi kaldirmamiz lazim
		str1 =str1.replaceAll("\\D","");//Bastaki dolar isaretini ve noktayi siler
		System.out.println(str1);//1399
		
		
		
		String str2 = "$10.55";//Dolar isaretini ve noktayi kaldirmamiz lazim
		str2 =str2.replaceAll("\\D","");//Bastaki dolar isaretini ve noktayi siler
		System.out.println(str2);//1055
		
		
		double sayi1 = Double.parseDouble(str1);// wrapper class(string degeri double a cevirdi)
		double sayi2 = Double.parseDouble(str2);// wrapper class
		
		double toplam = (sayi1+sayi2)/100;
		
		System.out.println(toplam);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
