import java.util.Scanner;

public class Uygulama3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Iki adet sayi giriniz : ");

        int sayi1 = keyboard.nextInt();
        int sayi2 = keyboard.nextInt();

        float harmonikOrtalama = (float)(2 * sayi1 * sayi2) / (sayi1 + sayi2);

        System.out.println("Harmonik ortalama : " + harmonikOrtalama);




    }


}

