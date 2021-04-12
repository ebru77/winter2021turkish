package day22_constructor;

public class Otomobil {
	
	public Otomobil(String renk){//istersek constructori parametreli olarak yazdirabiliriz
		
	}
	// biz bir constructor olusturuldugumuzda java default olani yok eder dolayisiyla
	//constructor olusturdugumuzda mutlaka default constructor'in yerinede bir constructor yazmaliyiz.
	public Otomobil() {// default constructor'in yerine bunu yazmaliyiz
		
	}
	/*
	ONEMLI NOT:Default constructor'dan baska bir constructor yazdigimizda
	java default olani yok ettigi icin MUTLAKA default yerine de constructor yazmaliyiz
	*/
	
	String marka;
	String model;
	String renk;
	int yil;
	boolean kazasiVarMi;
	
	
	

	public static void main(String[] args) {


	}
	public void yakit(String yakit) {//method
		System.out.println("Araba yakit olarak " + yakit +" kullanir");
	}
	
	public void vites(String vites) {//method
		System.out.println("Araba "+vites+" viteslidir");
	}
	public void renk(String renk) {
		System.out.println("Araba "+renk+" renklidir");
	}

}
