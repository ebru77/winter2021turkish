package day02_scanner;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
		// Scanner ile kullanicidan bilgi alabilirsiniz
		// 3 adimla scanner islemini gerceklestiriyoruz
		// 1. adimda Scanner olusturacagiz
		
	Scanner scan =new Scanner (System.in);
	
	// new : Java da ne zaman new kelimesini gorseni yeni bir object olusturuyor demektir
	// parantezin icine yazilan degerlere parametre diyoruz ve Scanner icin System.in yazmamiz gerek
	// Bir kod yazdigimizda kodun altindaki kirmizi cizgi olusuyorsa veya satir numarasi
	// olan kisminda kirmizi x olusuyorsa bir seyler yanlis demektir
	// java.until java'nin bizim icin hazirladigi bir kutuphanedir,ihtiyacimiz oldugunda ihtiyacamiz
	// class'a import etmemiz yeterlidir 
	// scan olusturdugumz Scanner objesine verdigimiz isimdir .Farkli isimlerde verebiliriz
	// ancak scan ismi tum programcilar tarafindan kullanilan bir isimdir
	//kodumuz anlasilabilir ve rahat okunabilir olmasi icin scan ismini kullanmamiz tavsiye edilir
	
	// 2.adim kullaniciya bir mesaj yazin 
	System.out.println("Karenin bir kenar uzunlugunu girin");
	
	// 3. adim kullanicinin konsola girdigi degeri programimiza alacagiz
	// kullanicidan bir kenar uzunlugu istedigim icin kullanici kucuk bir sayi da girebilir,
	// buyuk bir sayi da yazabilir, tam sayi da yazabilir, virgullu sayi da yazabilir
	
	double kenar=scan.nextDouble();
	
	System.out.println("girdiginiz kenar uzunluguna sahip karenin alani ="+kenar*kenar);
	scan.close();

	}

}
