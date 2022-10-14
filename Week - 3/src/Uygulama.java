import java.util.Scanner;

public class Uygulama {
    public static void main(String[] args) {
        int toplamKredi = 0, toplamAgirlik = 0, i = 0;
        float agno = 0;

        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.print("Lutfen " + (i + 1) + ". dersin kredisini giriniz: ");
            int kredi = scan.nextInt();
            scan.nextLine();
            System.out.print("Lutfen " + (i + 1) + ". dersin harf notunu giriniz: ");
            String harfNot = scan.nextLine();
            System.out.println("Ders ekleyecek misiniz? (E: Evet) (H: Hayır): ");
            String answer = scan.nextLine();

            switch (harfNot) {
                case "AA":
                case "aa":
                    toplamAgirlik += 4 * kredi;
                    break;
                case "BB":
                case "bb":
                    toplamAgirlik += 3.5f * kredi;
                    break;
                case "BA":
                case "ba":
                    toplamAgirlik += 3 * kredi;
                    break;
                case "CB":
                case "cb":
                    toplamAgirlik += 2.5f * kredi;
                    break;
                case "CC":
                case "cc":
                    toplamAgirlik += 2 * kredi;
                    break;
                case "DC":
                case "dc":
                    toplamAgirlik += 1.5f * kredi;
                    break;
                case "DD":
                case "dd":
                    toplamAgirlik += 1 * kredi;
                    break;
                case "FD":
                case "fd":
                    toplamAgirlik += 0.5f * kredi;
                    break;
                case "FF":
                case "ff":
                    toplamAgirlik += 0 * kredi;
                    break;

            }

            toplamKredi += kredi;


            if (answer.equalsIgnoreCase("E")) {
                i++;
            } else {

                agno = (float) (toplamAgirlik / toplamKredi);

                System.out.print("Aldığınız ders sayısı : " + (i + 1) + " AGNO: " + agno);
                break;
            }

        }


    }
}
