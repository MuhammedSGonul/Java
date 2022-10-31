import java.util.Scanner;

public class Dizi {
    public int dizi[] = new int[10];
    Scanner scan = new Scanner(System.in);
    int minDeger = 0, maxDeger = 0, toplam= 0, ortalama = 0, silinenIndex = 0;
    boolean bulundu = false;


    public void sayilariGir(){
        for(int i = 0; i< dizi.length; i++){
            System.out.print((i+1) + ". Sayıyı giriniz :");
            dizi[i] = scan.nextInt();
        }
    }

    public void sayilariYazdir(boolean sil){
        if(sil){
            for (int i = 0; i < dizi.length; i++) {

                if(i != silinenIndex){
                    System.out.print(dizi[i] + " ");
                }
            }
        }
        else{
            for (int i = 0; i < dizi.length; i++) {
                    System.out.print(dizi[i] + " ");
            }
        }

    }

    public void bulunduMu(){
        if(!bulundu){
            System.out.println("BULUNAMADI");
        }
        else{
            System.out.println("BULUNDU");
        }
    }

    public void bul(int bulunacakSayi, boolean sil){

        for(int i = 0; i< dizi.length; i++){
            if(bulunacakSayi == dizi[i]){
                if(sil){
                    dizi[i] = 0;
                    silinenIndex = i;
                }
                bulundu = true;
                break;
            }
            else{
                bulundu = false;
            }
        }

        bulunduMu();
    }

    public void diziDegerleriniGetir(){
        minDeger = dizi[0];
        maxDeger = dizi[0];

        for (int i = 0; i < dizi.length; i++){

            toplam += dizi[i];
            ortalama = toplam / dizi.length;


            if(dizi[i] < minDeger){
                minDeger = dizi[i];
            }

            if(dizi[i] > maxDeger){
                maxDeger = dizi[i];
            }

        }
        System.out.println();
        System.out.println("Maximum değer : " + maxDeger);
        System.out.println("Minimum değer : " + minDeger);
        System.out.println("Ortalama değer : " + ortalama);
    }

}
