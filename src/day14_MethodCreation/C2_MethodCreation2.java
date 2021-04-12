package day14_MethodCreation;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		
// bir methodu calistirmak icin main methodun icinden  cagirmamiz gerekir
// bir method'u calistirmak icin ise method adini ve parametrelere uygun argumentleri yazmaliyiz
		
		ortalama(85.2, 90.3);// method call
		

	}// main method sonu
	
	// bir method olusturmak istedigimizde Class'in icinde ama main methodun disinda 
	// bir alanda olusturmaliyiz. Genel kullanim method'lar main method'dan sonra olur.
	
	public static void ortalama (double sayi1, double sayi2) {
		
		System.out.println("girdiginiz iki sayinin ortalamasi : " + (sayi1+sayi2)/2);
		//bir methodu olusturmak o methodu calistirmak icin yeterli degildir
		// olusturulan method main method icinden cagirilinca calisir
	}

} // Class sonu
