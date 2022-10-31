import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dizi dizi = new Dizi();
        Scanner scan = new Scanner(System.in);

        int siradakiSayi = 0, silinecekSayi = 0;

        dizi.sayilariGir();

        System.out.print("Sıradaki sayıyı giriniz :");
        siradakiSayi = scan.nextInt();
        dizi.bul(siradakiSayi, false);

        dizi.sayilariYazdir(false);
        dizi.diziDegerleriniGetir();

        System.out.print("Silinecek sayıyı giriniz :");
        silinecekSayi = scan.nextInt();
        dizi.bul(silinecekSayi, true);

        dizi.sayilariYazdir(true);


    }
}