import java.util.Scanner;

public class Uygulama2 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        int randNumber, number;


        randNumber = (int) (Math.random() * 100);

        System.out.println("Rastgele Sayi " + randNumber);

        while(true){

            System.out.println("Lutfen yeni bir sayi giriniz");
            number = scan.nextInt();

            if(number == randNumber){
                System.out.println("Tebrikler");
                System.out.println("Girilen Sayi " + number);
                System.out.println("Rastgele Sayi " + randNumber);
                break;
            }
            else{
                if(number > randNumber){
                    System.out.println("Asagi!!");
                }
                else{
                    System.out.println("Yukari!!");
                }
            }
        }






    }
}
