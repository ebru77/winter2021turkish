package day18_whileLoop;

public class C6_whileLoop5 {

	public static void main(String[] args) {
	//verilen sayinin asal olup olmadigini bulan bir program yazin
	//asal sayi : 1 ve kendisi disinda hicbir pozitif tamsayiya bolunmeyen
		
		
	int sayi = 50;
	 String flag = "Asal";
	 
	 int bolen =2;
	 
	 while(bolen<sayi) {
		 
		 if (sayi%bolen==0) {
			 flag = "Asal sayi degil";
			 
			}
		 bolen ++;
	 }
	System.out.println(flag);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
