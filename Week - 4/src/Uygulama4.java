import java.util.Scanner;


public class Uygulama4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int satir, j;

        System.out.println("Yıldız Basma Uygulaması");
        System.out.print("Lutfen satir sayisi giriniz : ");
        satir = scan.nextInt();

        for(int i = 0; i < satir; i++) {
            for (j = i; j <= satir - 1; j++) {
                System.out.print("*");
            }
            for (int k = 0; k <= j; k++){
                System.out.print(" ");
            }
            System.out.println(" ");

        }

    }



}


