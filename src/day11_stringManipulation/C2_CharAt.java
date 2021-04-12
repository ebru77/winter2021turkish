package day11_stringManipulation;

public class C2_CharAt {

	public static void main(String[] args) {
		// charAt(index)
		//scan.next().charAt(0)
		// index 0'dan baslar
		
		
		String str ="Java cok guzel";// uzunlugu 14
		
		System.out.println(str.charAt(0)); // J  yazdirir
		
		System.out.println(str.charAt(5)); // c yazdirir
		
		System.out.println(str.charAt(13));// l yazdirir
		// kelimenin uzunlugu son index +1 dir
		// son index kelimenin uzunlugu(lenght) -1 dir
		
		
		//System.out.println(str.charAt(15));// exception verir.
		
		// kelimenin uzunlugunu verirsen hata verir -1 vermek lazim en fazla
		
		
		//String str3 = 5 ; // Compile time error CTE
		
		// kod calismadan Java'nin farkina varip altini kirmizi cizdigi hatalardir
		
		
		

	}

}
