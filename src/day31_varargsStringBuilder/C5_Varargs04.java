package day31_varargsStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class C5_Varargs04 {
    public static void main(String[] args) {

        List<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(20);
 //toplama(list);varargs esnek oldugu icin list'e benzese de list degildir

      int arr[]={15,20,25};
      toplama(arr);

 //kullanicidan deger alarak varargs calistirmak istiyorsak girilen degerleri
 //bir Array'e kaydetmeliyiz bunun icin kullanicidan aldiginiz degerleri esnek
 //oldugu icin bir list'e koyariz sonra list'i array'e ceviriniz
    }

    public static void toplama(int... var) {
        int toplam=0;
        for (int each: var) {
            toplam+=each;
        }
        System.out.println(toplam);
    }
}
