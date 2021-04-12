package day21_scope;

public class Scope1 {
	
	static int okulId = 1201;
	static String okulAdi = "Yildiz Kolleji";
    static boolean acikMi;

	public static void main(String[] args) {
	 
		System.out.println(okulId+" "+okulAdi+" "+acikMi);//1201 Yildiz Kolleji false
		
		okulId = 1202;
		acikMi = true;
		
		staticMethod();// method call
		System.out.println(okulId+" "+okulAdi+" "+acikMi);
     
	}// Main methodun sonu
	
	public static void staticMethod() {
		
		System.out.println(okulId+" "+okulAdi+" "+acikMi);
		
		okulId =1203;

}
	public void method() {
		
		okulId=1205;//bu class calistirildiginda bu method calismaz
		
	}
}