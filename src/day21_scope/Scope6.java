package day21_scope;

public class Scope6 {
	
	int num1;//Instance variable
	String name ="Ali";//Instance variable
	
	public static void main(String args) {
		
		add();
	//product(5);Static olmayan bir method static olan main method icerisinden cagrilmaz
	}
	
	public static void add() {
		
	//num1++;static olmayan(instance) num1, static bir method icinden kullanilmaz
		
		int num2 = 6;//local variable
		
		char letter;//local variable
		
		System.out.println("Do addition");
	}
	
	public void product(int num3) {
		
		name = "Veli";//instance variable
		
	//num2++;/ num2 ustteki methodda olusturulmus local variable dir
		System.out.println(num3*num3);
	}
	


}
