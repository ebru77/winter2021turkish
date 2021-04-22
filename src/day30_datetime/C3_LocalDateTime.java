package day30_datetime;

import java.time.LocalDateTime;

public class C3_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);//2021-04-16T23:56:20.656
        System.out.println(ldt.toString());//2021-04-16T23:56:20.656
        String time = ldt.toString();//atama yaptigim icin artik time. yaptigimda
        // String methodlarini gorurum ve maniulasyon yapabilirim
        System.out.println(time.startsWith("2021"));//true
    }
}
