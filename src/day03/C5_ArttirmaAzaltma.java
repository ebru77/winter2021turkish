package day03;

public class C5_ArttirmaAzaltma {

	public static void main(String[] args) {
		
		int num = 15;
		
		// bir sayiyi 2 arttirmak istersek sayiyi iki ile toplariz
		
		int num2 = num + 2;
				
		System.out.println("num2 =" + num2);
		      
        System.out.println("num =" + num);
        
        num =num+5; // esitligin solunda num yazdigimizda esitligin sagindaki islemde olusan sonuc num 
          //variable'ina atanir. bu satirdan sonra num=20 dir.
        
        System.out.println("16. satirdan sonra num = " + num);
        
        System.out.println(num+12); // 32
        
        // bir sayiyi arttirmak istersek o sayiya istedigimiz sayiyi ekler ve sonucu variable'ye atariz
        
        // num'i 8 artirin
        
        num = num+8; //num =28
        
        // num'i 5 artirin
        
        num += 5; // num=33
        
        System.out.println("Javanin pratik artirilmasindan sonra num=" + num);
        
        // num'i 10 artiralim
        
        num +=10; //num=43
        
        //num'i 1 arttirin 
        
        //num =num +1;
        num+=1; //num=44
        
        //sadece 1 artirmaya ozel olarak Java pratik method
        
        num++; //num=45
        
        System.out.println("num 'in son hali :"+ num);
	}

}
