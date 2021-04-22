package day31_varargsStringBuilder;

public class C4_Varargs03 {
    public static void main(String[] args) {

   //verilen int'lerden ilki haric tum sayilari toplayin ve
        // buldugunuz toplam ile ilk sayiyi carpip sonucu yazdirin

        toplama(2, 5);
        toplama(5, 10, 15);
        toplama(4, 5, 9, 7);
        toplama(5, 6, 8, 10, 45, 78, -12);

    }

    public static void toplama(int sayi, int... var) {//

        System.out.println("varargs'a ait olmayan argument :" + sayi);

        int toplama = 0;
        for (int each: var) {
            toplama+=each;
        }
        System.out.println(sayi*toplama);



    }
}