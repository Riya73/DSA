package Patterns_Using_Recursion;

public class Diamond {
    public static void main(String[] args) {
        int number = 7;
        printDiamond(number, 1);
    }

    public static void printDiamond(int number, int row) {
        if (row <= number) {
            printSpaces(number - row, 1);
            printStars(row * 2 - 1, 1);
            System.out.println();
            printDiamond(number, row + 1);
        } else {
            printLowerDiamond(number - 1, number - 1);
        }
    }

    public static void printLowerDiamond(int number, int row) {
        if (row >= 1) {
            printSpaces(number - row + 1, 1);
            printStars(row * 2 - 1, 1);
            System.out.println();
            printLowerDiamond(number, row - 1);
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
