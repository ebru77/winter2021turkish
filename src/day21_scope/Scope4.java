package day21_scope;

public class Scope4 {

	public static void main(String[] args) {
	
		int sayi=10;//degisen
	//1-bir method icinde olusturulan variable,sadece o method icinde kullanilabilir
	//1-System.out.println(isim);java hata verir
		
		int sayi2;//2-bir local variable deger atamadan da olusturulabilir
     //2- System.out.println(sayi);2-ancak ilk deger atamasi yapilmayan variable,lar kullanilmaz
	//2- Sayi2++; 2- ilk deger atanmadigi icin artirma veya azaltma da yapmayiz
	// 2- Java deger atamasi olmadan local variable olusturulmasina izin verir,ilerde deger atanacak diye bekler
		
		sayi2=15;//2-olusturma ayri satirda(11.satir),deger atama ayri satirda(16.satir)yapilabilir
		
	//3-birden fazla methodun oldugu class'larda her method'da kullanmamiz gereken
	//3-ortak variable'lar varsa class level da variable olusturmaliyim
	//3-ortak variable class'in yapisina bagli olarak instance veya static olabilir
	}
	public static void staticMethod() {
		
		String isim="Hasan";//degisen
	//1-System.out.println(sayi);java hata verir
	//1-Bu kurala main method icerisinde olusturulan variable'lar da dahildir

}
	public void method() {
		
		boolean isTrue=true;//degisen
	//1-System.out.println(isim);java hata verir
	// bu kural static olan veya olmayan tum methodlar icin gecerlidir
	}
	}
