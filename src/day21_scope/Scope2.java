package day21_scope;

public class Scope2 {

	public static void main(String[] args) {
	// static variablelar icin object olusturma ihtiyaci yoktur
   // baska bir classdan static variablelara ulasmak istedigimizde
   // Ulasmak istedigimiz classin adi static variable yazmamiz yeterlidir
		
		
		System.out.println(Scope1.okulAdi);
		System.out.println(Scope1.okulId);//1201 Java RUN TIME programdir
		                              //Scope2 classi calistiginda Scope1 classi calismazzz
		                 //dolayisiyla en basta olusturulan ve atanan degerler gecerli olur
		
		
		Scope1.okulAdi ="Mehmet kolleji";
		System.out.println(Scope1.okulAdi);// mehmet koleji
		
		Scope1.staticMethod();
		System.out.println(Scope1.okulId);
		System.out.println(Scope1.okulAdi);
		
	}

}
