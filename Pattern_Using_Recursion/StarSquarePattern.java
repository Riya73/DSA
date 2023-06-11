package Patterns_Using_Recursion;

public class StarSquarePattern {
     public static void main(String[] args) {
        int size = 5;  

        printStarSquarePattern(size, size);
    }

    public static void printStarSquarePattern(int size, int row) {
        if (row == 0) {
            return;
        }

        printStarRow(size, size);
        System.out.println();
        printStarSquarePattern(size, row - 1);
    }

    public static void printStarRow(int size, int column) {
        if (column == 0) {
            return;
        }

        System.out.print("* ");
        printStarRow(size, column - 1);
    }
}
