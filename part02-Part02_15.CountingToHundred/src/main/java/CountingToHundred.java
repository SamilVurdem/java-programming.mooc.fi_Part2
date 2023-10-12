
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        for (i = i; i <= 100; i++) {
            System.out.println(i);
        }

    }
}
