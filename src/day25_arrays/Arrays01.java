package day25_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
//Array(dizi);Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
		
		
		
		int arr[]= {10,23,54};//length = 3
		String isimler[]=new String[4];//length=4 olan bos bir array olusturur
		
	//Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
	//Mesela isimler array'in icinde isim degerleri degil,isimlerin referanslari olur

		
	//Array'in elemanlarina ulasma ve update etme
		
		System.out.println(isimler[1]);// null
		isimler[2]="Boss";
		isimler[0]="Elveda";
		
	//Array'in tum elemanlarini yazdirma
		
		System.out.println(isimler);//referans yazdirir[ljava.lang....
		
		System.out.println(Arrays.toString(isimler));//[Elvede, null,Boss,null]
		
	//Method kullanmadan tum elemanlari yazdiralim
	//loop kullanmamiz lazim
		
		for (int i = 0; i < isimler.length; i++) {//Dinamik olmasi icin LENGTH kullaniyoruz
			
			System.out.print(isimler[i]+" ");//Elveda null Boss null ;normal string yazdirir gibi yazdirdi
			
		}
		System.out.println();
		System.out.println(arr);//referans yazdirir
		
		System.out.println(Arrays.toString(arr));//[10,23,54]
		
		
	//Array'in elemanlarini nasil siralayabiliriz
		
		isimler[1]="Oguzhan";
		isimler[3]="Bilal";
		
		Arrays.sort(isimler);//Kucukten buyuge siralar
		
		System.out.println(Arrays.toString(isimler));//[Bilal,Boss,Elveda,Oguzhan]
		
	}

}
