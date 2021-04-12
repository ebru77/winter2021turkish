package day12_stringManipulation;

public class C2_equalsIgnoreCase {

	public static void main(String[] args) {
	// equalsIgnoreCase() method'u karsilastirdigi String'lere case sensitive olmaksizin bakar
	// Stringler ayni ise true ayri ise false doner.
		
		
		
		String str1 = "ALI Can";
		String str2 = "ali Can";
		String str3 = "Ali Can ";
		
		System.out.println(str1.equals(str2));// false
		
		System.out.println(str1.equalsIgnoreCase(str2));//true
		
		
		System.out.println(str1.equals(str3));//false
		
		System.out.println(str1.equalsIgnoreCase(str3));//false
		

	}

}
