package day22_constructor;

public class CarUret {
	
//SORU.....CONSTRUCTOR BU CLASS'DA NEREDE?
// Su anda bu class da gorunur bir constructor yok
//bir class olusturuldugunda java bu class'dan obje uretebilecegini bilir
// ve gorunmeyen DEFAULT CONSTRUCTOR'I class'ayerlestirir.
// default constructor parametresizdir dolayisiyla sadece hic bir ozelligi tanimlamayan
//objeler uretir(tsort uret demek gibidir)
//default constructor ile uretilen bir objenin tum ozellikleri sonradan tanimlanmalidir
//eger biz sonradan bir constuctor yazarsak,java default constructor'i iptal eder.

// bir constructor olusturalim
	
	public CarUret (){
		
	}
//kurallar 1- ismi class ile ayni olmalidir(dolayisiyla buyuk harfle baslar
//2- Constructor return type'a sahip degildir
//3-Constructor isminden sonra mutlaka parantez olur() ama parantez olmasi opsiyoneldir
//4-Constructor olusturuldugunda kimlerin kullanacagini belirlemek icin access modifier yazilir(public)
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
//bir programda cok fazla uretecegimiz objeler icin bir tane class olustururuz
//bu class'da olusturulacak objelere ait tum ozellikler olur
//bu class direk calistirilmayacagi icin main method olmasada olur
//kaliphane gibidir.

	public static void main(String[] args) {
	//

	}
	
	public void yakit(String yakit) {//method
		System.out.println("Araba yakit olarak " + yakit +" kullanir");
	}
	
	public void vites(String vites) {//method
		System.out.println("Araba "+vites+" viteslidir");
	}

}
