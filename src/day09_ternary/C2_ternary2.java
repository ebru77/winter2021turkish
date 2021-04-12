package day09_ternary;

public class C2_ternary2 {

	public static void main(String[] args) {
		//
		
		
		int y = 1;
		int z = 1;
		
		int a = y<10 ? y++ : z++;// assign bu satirda // postincrement(y++) once islem sonra artir
		                          					// preincrement (++y) once artir sonra islem
		// int a = 1 once islem
		//     y = 2 sonra artir
		
		System.out.println(y+","+z+","+a);// y = 2
		                                  // z = 1
		                                  // a = 1
		
		
		System.out.println(y++);// 2 yazdirir ama y'nin degeri 3 olur postincrement
		
		
		System.out.println(++y);// 4 olur preincrement
		
		
		System.out.println(y);// 4 olur
		
		
		
		
		
		
		
		
		
		

	}

}
