import java.util.Scanner;

public class deneme {


    public static void main(String[] args){

        //System.out.println("patates");
/*
        for(int i = 0; i < 10; i++){
            System.out.println(i + " kg" + " patates");
        }
*/

        Scanner klavye = new Scanner(System.in);

        System.out.println("Karsi ve komsu sirayla giriniz");

        int a = klavye.nextInt();
        int b = klavye.nextInt();

        System.out.println("Hipotenus : " + hipotenusHesapla(a, b));


        System.out.println("Lutfen adinizi ve soyadinizi giriniz");

        String ad = klavye.nextLine();
        String soyad = klavye.nextLine();

        System.out.println("Adiniz : " + ad + " Soyadiniz : " + soyad);

    }


    public static int hipotenusHesapla(int karsi, int komsu){

        int hipotenus = karsi * karsi + komsu * komsu;
        hipotenus = (int)Math.sqrt(hipotenus);

        return hipotenus;
    }




}


