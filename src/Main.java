import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        System.out.print(" první číslo: ");
        float x = ss.nextInt();

        while (true) {
            System.out.print(" Znamínko: ");
            String b = ss.next();

            System.out.print(" druhé číslo: ");
            float y = ss.nextInt();


            if (Objects.equals(b, "+")) {
                x = x + y;
                System.out.println("Výsledek : " + x);
            }

            if (Objects.equals(b, "-")) {
                x = x - y;
                System.out.println("Výsledek : " + x);
            }

            if (Objects.equals(b, "*")) {
                x = x * y;
                System.out.println("Výsledek : " + x);
            }

            if (Objects.equals(b, "/")) {
                x = x / y;
                System.out.println("Výsledek : " + x);
            }
        }
    }
}