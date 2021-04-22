package day29_passbyvalueimmutable;

public class C6_Immutable03 {
    public static void main(String[] args) {

        //Atama yapildiginda ne olur?


        String isim = "";

        for(int i = 0 ; i<10; i++){

            isim=isim+i;
            System.out.println(isim);//0
                                    //01
                                    //012
                                    //0123
                                    //01234
                                    //012345
                                    //0123456
                                    //01234567
                                    //012345678
                                    //0123456789
        }
        System.out.println("========================");
        System.out.println(isim);//0123456789
    }
}
