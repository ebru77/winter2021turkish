package day20_scope;

import java.util.Scanner;
public class Scope1 {

    public String isim;
	public String soyisim;
	public int sayi;
	int sayi1;//classin icinde fakat main methodun disinda olusturulan
	//ve static olmayan variablelara INSTANCE(Object)variable denir.
	//class level da olusturuldugu icin classin her yerinden belli sartlarla kullanilabilir.
	//object'e bagli olarak calisir(ogretmen adi veya ogrenci notu gibi)
	
	String isim1 = "Mehmet";// Mehmet degeri atanmis
	String soyisim1;// Deger atanmamis "null"verir
	boolean izindeMi1;// Deger atanmamis "false" verir
	char ilkHarf1;//Deger atanmamis "hiclik" verir.
	
	public static void main(String[] args) {
	//System.out.println(sayi); Static olmayan bir variable'a static method icinden ulasamayiz
	//main methodumuz static oldugu icin main method icerisinden static olmayan variable veya
	//methodlara direk ulasamayiz
		
	// instance bir variable'a main method icerisinden ulasmak istedigimizde OBJECT olusturmaliyiz
		
	 Scanner        scan     =  new               Scanner     (System.in);// OBJE olusturma
	//class ismi   obje ismi   obje olusturmada   class ismi   parametre
	                            //keyword

	 Scope1 obj1 = new Scope1();
	 System.out.println(obj1.sayi);//buna deger atamadik java default deger verdi (0)
	 System.out.println(obj1.isim);
	 System.out.println(obj1.soyisim);//buna deger atamadik java DEFAULT verdi "null"
	 //instance variableler olusturuldugunda biz istersek deger atayabiliriz.Eger biz atamazsak
	 // java Default deger atar.
	 
	 Scope1 obj2 = new Scope1();
	 obj2.isim = "Muslum";
	 obj2.soyisim = "Baba";
		
	 System.out.println(obj2.isim + " " + obj2.soyisim);//Muslum Baba
	 System.out.println(obj1.isim + " " + obj1.soyisim);//Mehmet null
	 System.out.println(obj1.izindeMi1);//false
	 System.out.println(obj1.ilkHarf1);// hiclik verir
	 
	 Scope1 obj3 = new Scope1();
	 obj3.isim ="Ferdi";
	 obj3.soyisim ="Tayfur";
	 obj3.izindeMi1 = true;
	 
	 System.out.println(obj3.isim + " " + obj3.soyisim + " " + obj3.izindeMi1);//Ferdi Tayfur
		scan.close();	 
	}
	
	public static void staticMethod() {

}
	public void method() {
		System.out.println(sayi);//Bu method static olmadigi icin instance variablelara direk erisebilir
		sayi = sayi+20;// Ve bu method icerisinde gecerli olmak uzere degerini degistirebilir
		
}
	
}
