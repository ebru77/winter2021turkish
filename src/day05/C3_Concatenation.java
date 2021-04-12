package day05;

public class C3_Concatenation {

	public static void main(String[] args) {
		// Concatenation (Birlestirme): java;da birden fazla string'i + isaretiyle toplarsaniz java bu Stringleri yanyana yazar
		
		String str1="Java";
		String str2="Guzeldir";
		
		System.out.println(str1+str2); // java guzeldir
		// eger arada bosluk birakmak isterseniz
		System.out.println(str1+" "+str2); // java guzeldir
		
		System.out.println(str1+' '+str2);
		// GuzeldirJava
		System.out.println(str2+str1);
		
		int sayi1= 5;
		int sayi2= 4;
		
		// verilen degiskenleri kullanarak consolda 9 yazdirin
		System.out.println(sayi1+sayi2);
		
		
		System.out.println(sayi1 + sayi2 + str1 + str2 ); //9JavaGuzeldir
		
		System.out.println(str1+str2+sayi1+sayi2);// JavaGuzeldir54
		
		// verilen degiskenlerle JavaGuzeldir1 yazdirin
		
		System.out.println(str1 + str2 + (sayi1 - sayi2)); // JavaGuzeldir1
		
		// verilen degiskenlerle "9 JavaGuzeldir" yazdirin
		
		System.out.println(sayi1+sayi2+' '+str1+str2); // 41JavaGuzeldir
		
		// matematiksel bir islem yapilirken char data turunden bir degerle karsilasirsa o char'in ascii degerini alir
		
		System.out.println(sayi1+sayi2+str1+' '+str2);// 9Java Guzeldir
		
		System.out.println(str1+str2+sayi1*sayi2); //JavaGuzeldir20
		
		
		// son tekrar
		// kural 1) eger toplanan degerlerden bir tanesi bile String ise Java toplama degil concatenation(birlestirme)
		// kural 2) eger toplanan degerlerin ikisi de matematiksel islemse java toplar
		// kural 3) eger sayi ve String degiskenler birlikte kullanilacaksa oncelikler belirlenip  o islemler icin parantez kullanilabilir
		// kural 4) matematiksel bir islemde char degisken kullanilirsa java charin ascii degerini isleme alir
		// kural 5) char bir degisken ile string bir degisken toplanirsa concatenation olur

	}

}
