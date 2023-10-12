
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        while (true) {
            System.out.println("Give a number:");
            int a = Integer.valueOf(scanner.nextLine());

            if (a == 0) {
                break;
            }

            if (a < 0) {
                number = number + 1;
            }
        }

        System.out.println("Number of negative numbers: " + number);
    }
}
