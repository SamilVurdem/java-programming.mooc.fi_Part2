
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        double sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int a = Integer.valueOf(scanner.nextLine());

            if (a == 0) {
                break;
            } else {
                number = number + 1;
                sum = sum + a;
            }
        }

        double average = sum / number;
        System.out.println("Average of the numbers: " + average );
    }
}
