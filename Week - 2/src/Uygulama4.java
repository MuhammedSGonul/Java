import java.util.Scanner;

public class Uygulama4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Lutfen 4 haneli bir sayi giriniz");

        int sayi = keyboard.nextInt();



        System.out.println("Basamaklar toplami : " + basamaklariTopla(sayi));


    }

    public static int basamaklariTopla(int sayi){

        int birlerBasamak = sayi % 10;
        int onlarBasamak = (sayi % 100 - birlerBasamak) / 10;
        int yuzlerBasamak = (sayi % 1000 - onlarBasamak * 10  - birlerBasamak) /100;
        int binlerBasmak = (sayi % 10000 - yuzlerBasamak * 100 - onlarBasamak * 10 - birlerBasamak) / 1000;

        int basamaklarToplami = birlerBasamak + onlarBasamak + yuzlerBasamak + binlerBasmak;

        return basamaklarToplami;
    }


}
