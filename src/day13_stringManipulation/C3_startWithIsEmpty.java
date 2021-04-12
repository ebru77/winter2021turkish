package day13_stringManipulation;

public class C3_startWithIsEmpty {

	public static void main(String[] args) {
		//
		
		
		String str = "Her gun java olsa";
		System.out.println(str.startsWith("H"));// true cunku H harfiyle basliyor
		
		System.out.println(str.startsWith("Her"));// true
		
		System.out.println(str.startsWith("g",4));// true
		
		System.out.println(str.startsWith("java",7));//false cunku 7 bosluga denk geliyor
		
		
		System.out.println(str.isEmpty());//false bos degil
		System.out.println(str.isEmpty());//false
		
		String str2 = "";
		System.out.println(str2.isEmpty());//true
		
		
		String str3 = null;
		System.out.println(str3.isEmpty());// hata verir cunku null string
		                                   // methoduyla calisirsa RTE verir
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
