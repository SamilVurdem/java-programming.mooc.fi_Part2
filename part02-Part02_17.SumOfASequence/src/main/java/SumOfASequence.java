
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number = 1;

        System.out.print("Last number? ");
        int a = scanner.nextInt();

        for (number = 1; number <= a; number++) {
            sum = (a * (a + 1)) / 2;
        }
        System.out.println("The sum is " + sum);

    }
}
