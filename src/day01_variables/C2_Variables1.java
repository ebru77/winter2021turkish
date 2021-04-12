package day01_variables;

public class C2_Variables1 {

	public static void main(String[] args) {
		int sayi; //;yazim dilindeki . gibidir. java ;'u gorunce o satirdaki kod yaziliminin bittigini
		sayi=27;
		
		System.out.println(sayi);// eger println degil de print yazarsak yazdirma isleminden 
		// sonra alt satira gecmez
		
		char ilkharf='M';
		
		System.out.println(ilkharf); // println yazinca yazma isleminden sonra alt satira gecer
		
		double sayiDouble=5.34;
		
		System.out.println(sayiDouble);
		
		System.out.println(sayi +sayiDouble); //32.34
		
		System.out.println(sayi + ilkharf);
}
}
