package day31_varargsStringBuilder;

public class C6_StringBuilder01 {
    public static void main(String[] args) {

        StringBuilder sb1 =new StringBuilder();//bos bir SB olusturur
        System.out.println("sb1 : " + sb1);

        StringBuilder sb2 =new StringBuilder("Mehmet");//icinde mehmet degeri olan bir SB veri
        System.out.println("sb2 : " + sb2);//Mehmet

        StringBuilder sb3 =new StringBuilder(10);
        System.out.println("sb3 : " + sb3);//10 karakter kapasitesi olan bir SB uretir

        sb1.append("Hoca");
        System.out.println("sb1 append :" + sb1);//sb1 append : Hoca

        sb2.append("Hoca");
        System.out.println("sb2 append :" + sb2);//sb2 append : MehmetHoca

        sb3.append("Hoca");
        System.out.println("sb3 append :" + sb3);//sb3 append : Hoca

        System.out.println("sb1 uzunluk :" +sb1.length());//4 (bu Hoca'nin uzunlugu
        System.out.println("sb1 kapasite :" +sb1.capacity());//16 (biz yazmadigimiz icin
                                                            //default capacity verdi

        System.out.println("sb2 uzunluk :" +sb2.length());//10 (MehmetHoca'nin uzunlugu
        System.out.println("sb2 kapasite :" +sb2.capacity());//22 (mehmet 6 uzunlukta 16 da default verdi
                                                             // 16+6=22

        System.out.println("sb3 uzunluk :" +sb3.length());//4 (Hoca)
        System.out.println("sb3 kapasite :" +sb3.capacity());//10 (basta 10 kapasite verdigimiz icin
                                                            // dolana kadar

   // Capacity hafiza yonetimi icin cok onemli
   // Kod yazilirken sabit uzunluk veya max.uzunluk belli ise
   // 3. method ile olusturarak HAFIZA KULLANIMINI optimize edebiliriz.

    }
}
