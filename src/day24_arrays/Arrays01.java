package day24_arrays;

import java.util.Arrays;

public class Arrays01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
	 int sayi = 10;
	 int sayi2 = 20;
	 int sayi3 = 30;
	 String isim = "Ali";
	 
//Java da birden fazla elemani koyabilecegimiz(store)object'ler vardir.
//bunlardan ikisi
	 
	int arr[] = { 10,20,30};//int[]arr seklinde de kullanilabilir
	                      //bu ornekte Array'in elemanlarini direk yazdigim icin
	                      //uzunluk belirtmeye gerek kalmadi
	                   //Bu kullanimda max eleman sayisi(length)yazdigimiz eleman sayisidir.
	
	System.out.println(arr);//array bir objedir
	                  //Eger direk olarak Array'i yazdirmak istersek Java ref'i yazdirir.
	
	System.out.println(Arrays.toString(arr));//[10,20,30]
	
	String takim[] = new String[3];//[null,null,null] data turu String oldugundan ve 
	                  // Stringlerin default degeri null oldugundan null yazdirir
		
	System.out.println(Arrays.toString(takim));//[null,null,null]
	
	takim[0]="Ali";
	System.out.println(Arrays.toString(takim));//[Ali,null,null]
	
	takim[2] ="Hasan";
	takim[1] ="Veli";
	System.out.println(Arrays.toString(takim));//[Ali,Veli,Hasan]
	
	//takim[3] ="Mehmet";//Java run time programdir,dolayisiyla array programi calistirilinca
	//olusturulur.36.satirda syntax olarak hata olmadigindan CTE vermez ama calistirinca
	//girdiginiz index sinirin disinda diye hata verir RTE.
	
	//Array'de ki bir elemani update etme(Veli'nin yerine Kemal)
	
	takim[1]="Kemal";
	
	System.out.println(Arrays.toString(takim));//[Ali,Kemal,Veli]
	
	//Array'in uzunlugunu nasil bulabiliriz
	
	System.out.println(takim.length);//3
	
	//Array'de ki son elemani Mehmet yapin
	
	takim[takim.length-1]="Mehmet";
	System.out.println(Arrays.toString(takim));
	
	if (takim.length%2==1) {
		int ortaIndex = (takim.length)/2;
		takim[ortaIndex]="Can";
		
	}
	System.out.println(Arrays.toString(takim));
	
		
	

	}

}
