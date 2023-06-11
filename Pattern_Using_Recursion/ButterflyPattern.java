package Patterns_Using_Recursion;

public class ButterflyPattern {
    public static void main(String[] args) {
        int rows = 4;
        printButterfly(rows);
    }

    public static void printButterfly(int rows) {
        printUpperPattern(rows, 1);
        printLowerPattern(rows, 1);
    }

    public static void printUpperPattern(int rows, int currRow) {
        if (currRow <= rows) {
            printStars(currRow);
            printSpaces(2 * (rows - currRow));
            printStars(currRow);
            System.out.println();
            printUpperPattern(rows, currRow + 1);
        }
    }

    public static void printLowerPattern(int rows, int currRow) {
        if (currRow <= rows) {
            printStars(rows - currRow + 1);
            printSpaces(2 * (currRow - 1));
            printStars(rows - currRow + 1);
            System.out.println();
            printLowerPattern(rows, currRow + 1);
        }
    }

    public static void printStars(int count) {
        if (count > 0) {
            System.out.print("*");
            printStars(count - 1);
        }
    }

    public static void printSpaces(int count) {
        if (count > 0) {
            System.out.print(" ");
            printSpaces(count - 1);
        }
    }
}
