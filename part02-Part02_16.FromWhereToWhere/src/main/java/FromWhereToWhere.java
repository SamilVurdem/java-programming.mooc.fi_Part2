
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int i = scanner.nextInt();
        int a = 1;

        while (a <= i) {
            System.out.println(a);
            a++;
        }

        System.out.print("Where to? ");
        int b = scanner.nextInt();
        System.out.print("Where from? ");
        int c = scanner.nextInt();

        while (c <= b) {
            System.out.println(c);
            c++;
        }
    }
}
