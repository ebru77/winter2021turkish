package day31_varargsStringBuilder;

public class C3_Varargs02 {
    public static void main(String[] args) {

  //Istedigimiz kadar sayi girdigimizdetum sayilari toplayan bir method yazalim
  // Var----Variety cesitlilik args--arguments

        toplama(2,5);
        toplama(5,10,15);
        toplama(4,5,9,7);
        toplama(5,6,8,10,45,78,-12);
    }

    private static void toplama(int...var) {//data turunden sonra yazdigimiz uc nokta varagskullanacagimiz anlamina geliyor

        int toplam =0;//toplami koyacagimiz konteyner

        for (int each : var){//var'a git her bir int'i bana getir
            toplam+=each;
        }
        System.out.println("toplam:"+toplam);//toplam:7
                                            //toplam:30
                                            //toplam:25
                                            //toplam:140

    }
}
