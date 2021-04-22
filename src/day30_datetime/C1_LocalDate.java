package day30_datetime;

import java.time.LocalDate;
import java.util.Locale;

public class C1_LocalDate {
    public static void main(String[] args) {
     //java'da sadece tarih kullanmak istiyorsak
     //LocalDate class'indan bir obje uretiriz

        LocalDate tarih = LocalDate.now();
        System.out.println(tarih);//2021-03-19

        System.out.println(tarih.plusWeeks(20));//2021-09-03
        System.out.println(tarih.plusDays(500));//2022-08-29
        System.out.println(tarih.plusYears(3).plusMonths(5).plusDays(12));//2024-09-28
        System.out.println(tarih.getDayOfYear());//106 (yilin kacinci gunu oldugunu)
        System.out.println(tarih.getMonthValue());//4 (kacinci aydayiz)
        System.out.println(tarih.getDayOfWeek());//friday
        System.out.println(tarih.getMonth());//april
        LocalDate dogumgunu = LocalDate.of(1977,10,15);
        System.out.println(dogumgunu.getDayOfWeek());//saturday

        System.out.println(tarih.isLeapYear());//false

    //Eger suanki tarih ile degil de eski bir tarih ile islem yapacaksak
    //LocalDate.of() methodunu kullaniyotuz

        LocalDate tarih1 = LocalDate.of(1995,12,15);
        LocalDate tarih2 = LocalDate.of(1995,12,10);

        System.out.println(tarih1.isAfter(tarih2));//true tarih1 tarih2 den sonradir
        System.out.println(tarih1.isBefore(tarih2));//false tarih1 tarih2 den oncedir

    }
}
