import java.util.*;

public class Uygulama1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean isPalindrom = true;

        System.out.println("Palindromik Kelime Programi");

        System.out.print("Lutfen bir kelime giriniz: ");

        String word = scan.nextLine();

        for (int i = 0; i < word.length() / 2; i++) {

            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                isPalindrom = false;
            }
        }

        if(isPalindrom){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Palindrom Degil");
        }


    }
}

