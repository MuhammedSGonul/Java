import java.awt.*;
import java.util.Scanner;

public class Uygulama5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("KDV % orani ve tutar giriniz: ");

        int kdv = keyboard.nextInt();
        int tutar = keyboard.nextInt();

        float kdvHaricTutar = (float)(tutar - tutar * kdv / 100);
        float kdvTutari = (float)(tutar * kdv / 100);

        System.out.println("KDV Haric Net Tutar : " + kdvHaricTutar);
        System.out.println("KDV Tutari : " + kdvTutari);


    }
}
