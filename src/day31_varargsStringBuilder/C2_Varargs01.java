package day31_varargsStringBuilder;

public class C2_Varargs01 {
    public static void main(String[] args) {

 //Verilen iki syiyi toplayan ve sonucu yazdiran bir method yaziniz

        int sayi1 =10;
        int sayi2 = 20;
        int sayi3 = 30;

        toplama(sayi1,sayi2);//method call

  // Verilen 3 sayiyi toplayan ve sonucu yazdiran bir method yaziniz

        toplama(sayi1,sayi2,sayi3);//method call
    }
    public static void toplama(int sayi1,int sayi2, int sayi3){
        System.out.println("uc sayinin toplami : " +(sayi1+sayi2+sayi3));//60
    }

    public static void toplama(int sayi1, int sayi2) {
        System.out.println("iki sayinin toplami :" +(sayi1+sayi2));//30
    }
}
