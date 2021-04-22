package day30_datetime;

import java.time.LocalDate;
import java.time.LocalTime;

public class C2_LocalTime {
    public static void main(String[] args) {

     //java'da saat ile islem yapmak icin
     //LocalTime  class'indan obje kullaniriz

        LocalTime saat = LocalTime.now();
        System.out.println(saat);//23:23:30.829
        System.out.println(saat.getSecond());//30
        System.out.println(saat.minusSeconds(1564548745));//bu kadar saniye once kacti



    }
}
