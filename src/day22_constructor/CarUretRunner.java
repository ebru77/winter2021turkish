package day22_constructor;

public class CarUretRunner {

	public static void main(String[] args) {

		
		CarUret car1 =new CarUret();//hangi class dan obje uretiyorsan onun adini yaziyorsun
		car1.model="Corolla";
		car1.marka="Toyota";
		car1.yil=2010;
		car1.kazasiVarMi=true;
		
		System.out.println(car1.marka+" "+car1.model+" "+car1.yil+" "+car1.kazasiVarMi); 
		
        car1.yakit("benzin");
        car1.vites("duz");
	}

}
