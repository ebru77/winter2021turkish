package day20_scope;

public class Scope2 {

	public static void main(String[] args) {
	//farkli class'lardan da Scope1 class'ina object olusturarak ulasabilirim
		
		Scope1 obj4 = new Scope1();//Scope1 classimiza ulasiyoruz
		System.out.println(obj4.isim);// Mehmet
		System.out.println(obj4.soyisim);// null
		
		obj4.soyisim = "Can";
		obj4.isim ="Ahmet";
		System.out.println(obj4.isim + " " + obj4.soyisim);// Ahmet Can

	}

}
