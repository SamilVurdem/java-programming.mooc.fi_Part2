
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        double sum = 0;

        while (true) {
            int a = Integer.valueOf(scanner.nextLine());

            if (a == 0) {
                break;
            } else if (a > 0) {
                number = number + 1;
                sum = sum + a;
            }
        }
        System.out.println(sum / number);

        if (sum <= 0) {
            System.out.println("Cannot calculate the average");
        }

    }
}
