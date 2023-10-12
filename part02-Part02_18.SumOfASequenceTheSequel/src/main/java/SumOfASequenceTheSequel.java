
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int a = scanner.nextInt();

        System.out.print("Last number? ");
        int b = scanner.nextInt();

        int i;
        int sum = 0;

        for (i = a; i <= b; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);
    }
}
