package Patterns_Using_Recursion;

public class HourGlass {
         public static void printSandglassPatternRecursive(int rows, int currentRow) {
        if (currentRow > rows) {
            return;
        }

        printSpaces(currentRow - 1);
        printStars(rows - currentRow + 1);
        System.out.println();

        printSandglassPatternRecursive(rows, currentRow + 1);

        printSpaces(currentRow - 1);
        printStars(rows - currentRow + 1);
        System.out.println();
    }

    public static void printSpaces(int count) {
        if (count <= 0) {
            return;
        }

        System.out.print(" ");
        printSpaces(count - 1);
    }

    public static void printStars(int count) {
        if (count <= 0) {
            return;
        }

        System.out.print("* ");
        printStars(count - 1);
    }

    public static void main(String[] args) {
       
        printSandglassPatternRecursive(7, 1);
    }
}
