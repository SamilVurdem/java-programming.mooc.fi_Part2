
public class Averaging {

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }

    public static double sum(int number1, int number2, int number3, int number4) {
        double sum = number1 + number2 + number3 + number4;
        return sum;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        double a = sum(number1, number2, number3, number4);
        return a / 4;
    }
}
