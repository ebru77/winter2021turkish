package day29_passbyvalueimmutable;


import java.util.ArrayList;
import java.util.List;

public class C4_Immutable01 {
    public static void main(String[] args) {

        String isim = "Ali";
        isim.concat("can");
        System.out.println(isim);//Ali cunku Stringde method uyguladigimizda String degismez
        System.out.println(isim.concat("can"));//Alican (methodu icine alip yazdirdik)
        System.out.println(isim);//Ali (kalici degisiklik olmaz)
        //eger Alican yazdirmak istiyorsak methodu syso'nun icine koyariz
     //Stringlerde method ile yaptigimiz degisiklikler kalici olmaz
     //cunku Java String Class'ini immutable(degismez)yapmistir

        List<String> isimList = new ArrayList<>();//list'lerde methodla yaptigimiz degisiklikler
                                            //kalici olarak List'e islenir
        System.out.println(isimList);//[]
        isimList.add("Ali");
        isimList.add("can");
        System.out.println(isimList);
        isimList.remove(1);//1. indexdeki elemani kaldirir
        System.out.println(isimList);//[Ali]
      //List'lerde methodla yaptigimiz degisiklikler kalici olarak List'e islenir
      //cunku list mutable'dir.

    }
}
