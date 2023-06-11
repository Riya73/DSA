package Patterns_Using_Recursion;

public class Triangle {
     public static void main(String[] args) {
        int size = 5;
        printPattern(size, 0);
    }

    public static void printPattern(int size, int row) {
        if (row < size) {
            printSpaces(size - row - 1, 0);
            printStars(2 * row + 1);
            System.out.println();
            printPattern(size, row + 1);
        }
    }

    public static void printSpaces(int count, int col) {
        if (col < count) {
            System.out.print(" ");
            printSpaces(count, col + 1);
        }
    }

    public static void printStars(int count) {
        if (count > 0) {
            System.out.print("*");
            printStars(count - 1);
        }
    }
}
