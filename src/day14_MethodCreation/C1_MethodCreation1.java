package day14_MethodCreation;

public class C1_MethodCreation1 {

	public static void main(String[] args) {
		// 
		
		String str ="Java cok guzel";
		
		// 1) java method'larin sadece ismine degil ' isim + parametrelere  bakar
		//sadece parametre sayisi degil parametre'lerin data tiplerine bakar
		
		
		str.endsWith("el"); // bu methodun gorevi gidip kelimenin son kismini kontrol etmek
		                    // bu methodu kullanmak icin bu methodun kontrol ettikten sonra 
		                   //bana rapor olarak ne getirecegini bilmem lazim (true/false)
		
		
		// 2) bir method olusturdugumuzda methodun ne yapacagina ve 
		// gorevi yaptiktan sonra bana ne dondurecegine bastan karar vermeliyiz
		
		// 3) Bir method olustururken "str.indexOf(String str, int fromIndex) " de oldugu gibi
		//    disardan kabul edecegi parametreleri ve bu parametrelerin tiplerini deklare etmeliyiz
		
		// Method'u calistirmak istedigimizde (Method'u cagirmak) Parametre olarak
		// declare edilen data tiplerine uygun degerler girmeliyiz.
		// girilen bu degerlere ARGUMENT denir
		
		
		str.indexOf("va", 1);

	}

}
