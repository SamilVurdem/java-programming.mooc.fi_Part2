
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int a = scanner.nextInt();

        int f = 1;
        int sum = 1;

        for (f = 1; f <= a; f++) {
            sum = sum * f;
        }
        System.out.println("Factorial: " + sum);

    }
}
