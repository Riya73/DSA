package Patterns_Using_Recursion;

public class HollowSquare {
    public static void main(String[] args) {
        int size = 5;  

        printHollowSquare(size, size);
    }

    public static void printHollowSquare(int size, int row) {
        if (row <= 0) {
            return;
        }

        printRow(size, row);
        System.out.println();
        printHollowSquare(size, row - 1);
    }

    public static void printRow(int size, int currentRow) {
        if (currentRow == size || currentRow == 1) {
            printStars(size);
        } else {
            System.out.print(" * ");
            printSpaces(size - 2);
            System.out.print(" * ");
        }
    }

    public static void printStars(int count) {
        if (count <= 0) {
            return;
        }

        System.out.print(" * ");
        printStars(count - 1);
    }

    public static void printSpaces(int count) {
        if (count <= 0) {
            return;
        }

        System.out.print("   ");
        printSpaces(count - 1);
    }
}
