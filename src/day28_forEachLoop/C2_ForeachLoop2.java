package day28_forEachLoop;

public class C2_ForeachLoop2 {

	public static void main(String[] args) {
	
//bir integer Array olusturunuz ve bu arraydeki tum sayilarin
//carpimini	FOR-EACH LOOP kullanarak bulunuz
		
		int arr[] = {1,2,1,2,4,3,1,2};
		
		int carpim = 1;
		
		for (int each : arr) {
			
			carpim *=each;
			
		}
		
		System.out.println("array'in tum elemanlarinin carpimi : " + carpim);

	}

}
