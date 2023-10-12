
public class Smallest {

    public static void main(String[] args) {
        int result = smallest(12, 1);
        System.out.println("Smallest: " + result);
    }

    public static int smallest(int number1, int number2) {
        int small = 0;
        if (number1 < number2) {
            small = number1;;
        } else if (number2 < number1) {
            small = number2;;
        }
        return small;
    }
}
