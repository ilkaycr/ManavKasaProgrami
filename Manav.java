package TemelKavramlar;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

        double armut = 2.14,a , elma = 3.67,e , domates = 1.11,d , muz= 0.95,m , patlıcan = 5.00,p ,fiyat ;

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan kilo bilgisi alalım ve fiyatları a,e,d,m,p değerlerine atayalım
        System.out.print("Armut Kaç Kilo ? : ");
        a = input.nextDouble();

        a *= armut;

        System.out.print("Elma Kaç Kilo ? : ");
        e = input.nextDouble();

        e *= elma;


        System.out.print("Domates Kaç Kilo ? : ");
        d = input.nextDouble();

        d *= domates ;

        System.out.print("Muz Kaç Kilo ? : ");
        m = input.nextDouble();

        m *= muz;

        System.out.print("Patlıcan Kaç Kilo ? : ");
        p = input.nextDouble();

        p *= patlıcan;

        //Toplayalım

        fiyat = a+e+d+m+p;

        System.out.println("Toplam Tutar : " + fiyat + "TL");
    }
}
