import java.util.Scanner;

public class Uygulama3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double kilo, boy;


        System.out.println("Vucut Kitle Indeksi Uygulamasi" );
        System.out.print("Lutfen kilonuzu giriniz(kg) : " );
        kilo = scan.nextDouble();
        System.out.print("Lutfen boyunuzu giriniz(m) : " );
        boy = scan.nextDouble();

        double vki = (kilo / (boy * boy));

        System.out.println("Vucut Kitle Indeksiniz : " + vki);


        if(vki <= 18.4f && vki > 0){
            System.out.println("Zayifsiniz");
        }
        else if(vki > 18.5f && vki <= 24.9f){
            System.out.println("Normal");
        }
        else if(vki > 25f && vki <= 29.9f){
            System.out.println("Fazla Kilolusunuz");
        }
        else if(vki > 30f && vki <= 34.9f){
            System.out.println("Obez");

        }

    }
}
