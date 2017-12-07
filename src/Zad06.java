import java.util.Scanner;

public class Zad06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = 0;
        boolean condition = true;

        do {
            System.out.println("Podaj liczbę:");
            i = scan.nextInt();
            if (i < 100) {
                System.out.println("Podana liczba jest za mała");
            } else if (i > 200) {
                System.out.println("Podana liczba jest za duża");
            } else if (i >= 100 && i <= 200) {
                if (i % 3 == 0) {
                    System.out.println("Twoja liczba jest ok");
                    break;
                } else {
                    System.out.println("Liczba nie jest podzielna przez 3");
                }
            }
        } while (condition);

        scan.close();
    }
}
