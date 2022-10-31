import  java.util.*;
public class Uygulama1 {

    public static void main(String[] args) {

        float geriOdenecek = 0;

        miktarSorgula();


        System.out.println(geriOdenecek);



    }


    public static void miktarSorgula(){
        Scanner scan = new Scanner(System.in);

        float toplamTutar, odenenMiktar;

        System.out.print("Lutfen toplam tutari giriniz: ");
        toplamTutar = scan.nextFloat();
        System.out.print("Lutfen odenen miktari giriniz: ");
        odenenMiktar = scan.nextFloat();

        this.geriOdenecek = odenenMiktar - toplamTutar;

    }





}
