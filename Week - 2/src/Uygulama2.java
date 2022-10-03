import java.util.Scanner;

public class Uygulama2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final float PI = 3.14f;


        System.out.println("Lutfen yaricapi giriniz :");
        float r = keyboard.nextFloat();

        float area = PI * r * r;
        float cev = 2 * PI * r;

        System.out.println("Dairenin, alani : " + area + " cevresi : " + cev);

    }
}
