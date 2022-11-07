import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        ArrayList<Araba> Araclar = new ArrayList<Araba>();

        Araclar.add(new Araba("BMW", "34 PLT 34", "X5", "SUV", "Siyah", "2002", "10000"));
        Araclar.add(new Araba("Tofas", "26 FJK 120", "Sahin", "Sedan", "Beyaz", "1990", "256000"));
        Araclar.add(new Araba("Fiat", "42 AUU 20", "Doblo", "Ticari", "Gri", "2009", "450000"));
        Araclar.add(new Araba("Mercedes", "43 DR 518", "AMG GT", "Sedan", "Gri", "2020", "5000"));

        for (Araba arabaa : Araclar)
            System.out.println(arabaa);
        Araclar.set(3, new Araba("Opel", "06 ABC 123", "Insignia", "Sedan", "Beyaz", "2021", "5000"));
        System.out.println("--------------- Bilgiler guncellendi ! ---------------");
        for (Araba arabaa : Araclar)
            System.out.println(arabaa);

        System.out.print("Aratmak istediginiz aracin rengini giriniz : ");
        String aranacakSozcuk = scan.nextLine();

        System.out.println(aranacakSozcuk + "  renkli arac icin bulunan sonuclar: ");
        for (int i = 0; i < Araclar.size(); i++){
            if(aranacakSozcuk.equalsIgnoreCase(Araclar.get(i).renk)){
                System.out.println(Araclar.get(i));
            }

        }
        System.out.println();


        System.out.print("Aratmak istediginiz aracin markasini giriniz : ");
        aranacakSozcuk = scan.nextLine();

        System.out.println(aranacakSozcuk + "  markali arac icin bulunan sonuclar: ");
        for (int i = 0; i < Araclar.size(); i++){
            if(aranacakSozcuk.equalsIgnoreCase(Araclar.get(i).marka)){
                System.out.println(Araclar.get(i));
            }

        }
        System.out.println();

        System.out.print("Aratmak istediginiz aracin sinifini giriniz : ");
        aranacakSozcuk = scan.nextLine();


        System.out.println(aranacakSozcuk + "  sinif arac icin bulunan sonuclar: ");
        for (int i = 0; i < Araclar.size(); i++){
            if(aranacakSozcuk.equalsIgnoreCase(Araclar.get(i).sinif)){
                System.out.println(Araclar.get(i));
            }
        }
        System.out.println();




    }
}