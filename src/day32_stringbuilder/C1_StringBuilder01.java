package day32_stringbuilder;

public class C1_StringBuilder01 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Rumeysa");
        System.out.println(sb1);//Rumeysa

        sb1.append(" ").append("Cetinturk");//verilen SB'in sonuna istedigimiz String degerlerini ekler
        System.out.println(sb1);//Rumeysa Cetinturk
        /*
        sb1.append("javayi cok sever",6,9);//6 inculisive  9 exclusive
        System.out.println(sb1);//Rumeysa Cetinturk co
        */
        String cumle ="Javayi cok sever";
        sb1.append(cumle,6,10);//Baska bir Stringden istedigimiz bolumu SB'nin sonuna ekler
                                       //Baslangic indexi inclusive bitis indexi exclusive dir
        System.out.println(sb1);//Rumeysa Cetinturk  cok


        System.out.println(sb1.length());//21  SB'in uzunluk bilgisini verir
        System.out.println(sb1.capacity());//23  (7+16) kapasite bilgisini verir

        System.out.println(sb1.charAt(1));//u SB'in istedigimiz indexte olan karakterin bilgisini verir

        sb1.charAt(5);//Bize bilgi getiren methodlar SB'i degistirmez
        System.out.println(sb1);//Rumeysa Cetinturk coK

        sb1.delete(17,21);//SB'in istedigimiz indexleri arasindaki kismini siler
        System.out.println(sb1);//Rumeysa Cetinturk

        sb1.deleteCharAt(16);
        System.out.println(sb1);//Rumeysa Cetintur

        String isim = "Rumeysa Cetinturk";
        System.out.println(sb1.equals(isim));//false Data turleri farkli oldugu icin
                                         // icerigin kiyaslanmasi mumkun degildir

        StringBuilder sb2 = new StringBuilder("Rumeysa Cetinturk");
        System.out.println(sb1==sb2);//false

        System.out.println(sb1.equals(sb2));//False SB de equals method'u Stringden farkli calisir
                               //ancak ayni obje ile kiyaslandiginda true verir

        System.out.println(sb1.equals(sb1));//true

        System.out.println(sb1.indexOf("Cetin"));//8
        System.out.println(sb1.indexOf("e",6));//9

        System.out.println(sb1.indexOf("Kazim"));//-1 (olmadigi zaman -1 verir)

        sb1.insert(7," ");//istedigimiz indexden itibaren istenen stringi ekler
        System.out.println(sb1);//Rumeysa  Cetintur (bir bosluk daha oldu

        cumle ="Merhaba dunya";
        sb1.insert(0,cumle,0,8);
                                               //0:SB a hangi indexden itibaren eklene
                                              //cumle : hangi stringden eklenecek
                                             // 0: cumlenin hangi indexinden baslanacak
                                            // 8 : bitis indexsini
        System.out.println(sb1);//Merhaba Rumeysa  Cetintur

        sb1.insert(25,cumle,8,13);
        System.out.println(sb1);//Merhaba Rumeysa  Cetinturdunya

        System.out.println(sb1.lastIndexOf("t"));//22 istenen String'in kullanildigi son indexi verir
        System.out.println(sb1.lastIndexOf("a",22));//14 istenen indexden oncesine bakar

        sb1.replace(8,16,"Seher");// SB'in baslangic ve bitis indexleri arasindaki kismi
                                                // verilen String ile degistirir.

        System.out.println(sb1);//Merhaba Seher Cetinturdunya

        sb1.reverse();//Stringi(cumleyi)tersinden yazdirir
        System.out.println(sb1);//aynudrutniteC reheS abahreM
        sb1.reverse();

        sb1.setCharAt(10,'k');
        System.out.println(sb1);//Merhaba Seker Cetinturdunya

        System.out.println(sb1.subSequence(8,13));//Seker(SB'in istedigimiz indexler
                                                // arasindaki bolumunu verir

        System.out.println(sb1.substring(10));

        StringBuilder sb3 = new StringBuilder("Java cok guzel");
        StringBuilder sb4 = new StringBuilder("Java cok guzel");
        //iceriklerinin esit olup olmadigina bakmak icin String'deki equals method'unu kullanalim

        System.out.println(sb3.toString().equals(sb4.toString()));//true

        sb3.toString().concat("Insanin sevdikce sevesi geliyor");//eklemez
        System.out.println(sb3);//Java cok guzel ( syso'nun icine almamiz lazim)
      //to String() methodunu kullaninca SB Stringe donusmus olur
      // dolayisiyla tum String methodlari kullanilabilir

        System.out.println(sb3.toString().concat("Insanin sevdikce sevesi geliyor"));
          //Java cok guzelInsanin sevdikce sevesi geliyor

        System.out.println(sb1.length());//27
        System.out.println(sb1.capacity());//48

        sb1.trimToSize();//SB icin hazirlanan kapasitedeki fazlaliklari siler
                        // SB'in capacity ile length'ini esitler
        System.out.println(sb1.length());//27
        System.out.println(sb1.capacity());//27





    }
}
