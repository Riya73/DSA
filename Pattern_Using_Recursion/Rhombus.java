package Patterns_Using_Recursion;

public class Rhombus {

    public static void main(String[] args) {
        printRhombus(6, 6, true);
    }

    public static void printRhombus(int currentRow, int totalRows, boolean isIncreasing) {
        if (currentRow > 0) {
            printSpaces(totalRows - currentRow, 1);
            printStars(totalRows, 1);
            System.out.println();
            if (currentRow == 1) {
                printRhombus(currentRow - 1, totalRows, false);
            } else if (isIncreasing) {
                printRhombus(currentRow - 1, totalRows, true);
            } else {
                printRhombus(currentRow - 1, totalRows, false);
            }
        }
    }

    public static void printSpaces(int count, int col) {
        if (col <= count) {
            System.out.print(" ");
            printSpaces(count, col + 1);
        }
    }

    public static void printStars(int count, int col) {
        if (col <= count) {
            System.out.print("*");
            printStars(count, col + 1);
        }
    }
}
