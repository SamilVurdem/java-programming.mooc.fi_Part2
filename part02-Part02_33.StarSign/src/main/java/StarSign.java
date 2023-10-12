
public class StarSign {

    public static void main(String[] args) {

        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int a = 0; a < size; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printRectangle(int width, int height) {
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printTriangle(int size) {
        for (int s = 1; s <= size; s++) {
            for (int h = 1; h <= s; h++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
