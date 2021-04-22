package day31_varargsStringBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C1_DateTimeFormater {
    public static void main(String[] args) {


        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);//2021-04-18T23:52:06.536

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MMMM/dd hh:mm");
        System.out.println(dtf.format(ldt));//21/April/18 12:00
        /*
        yy: yilin son iki rakamini
        yyyy: yilin tamamini
        M:ay sirasini verir mart icin:3
        MM:ay sirasini verir mart icin:03
        MMM:ay isminin ilk uc harfini verir
        MMMM:ay isminin tamamini verir
        */

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MMM/dd ");
        System.out.println(dtf2.format(ldt));//21/Apr/18

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm ");//24 saatlik dilim
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("hh:mm ");//12:20 am/pm gibi
        System.out.println(dtf3.format(ldt));//00:20
        System.out.println(dtf4.format(ldt));//12:20

        LocalDate dogumtarihi = LocalDate.of(1995,3,12);
        LocalDate bugun = LocalDate.now();

        Period benimyasim = Period.between(bugun,dogumtarihi);
        System.out.println(benimyasim);//P-26Y-1M-6D

        //sadece yasi ogrenmek icin

        int yas = Period.between(bugun,dogumtarihi).getYears();
        System.out.println(yas);

    }
}
