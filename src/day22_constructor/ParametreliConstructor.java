package day22_constructor;

public class ParametreliConstructor {
	
	String marka;
	String model;
	String renk;
	int yil;
	boolean kazasiVarMi;
	public ParametreliConstructor(String renk) {//1
		this.renk = renk;
		
	}
	
	public ParametreliConstructor(int yil) {//1
		this.yil = yil;
		
	}
	public ParametreliConstructor() {//2
		
	}
	public ParametreliConstructor(String  Marka,String Model) {//3
		
	}
	public ParametreliConstructor(String Marka,String Model,int yil,boolean kazaVarMi) {//4
		this.marka = Marka;
		this.model = Model;
		this.yil = yil;
		this.kazasiVarMi = kazaVarMi;
		
	}

	public static void yakit(String yakit) {
		System.out.println("Araba yakit olarak"+ yakit+"kullanilir");

	}
	public void vites(String vites) {
		System.out.println("Araba "+vites+" viteslidir");
	}
	

}
