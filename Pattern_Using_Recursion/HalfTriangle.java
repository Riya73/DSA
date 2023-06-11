package Patterns_Using_Recursion;

public class HalfTriangle {
    public static void main(String[] args) {
        int rows = 5;  

        printLeftPyramid(rows);
    }

    public static void printLeftPyramid(int rows) {
        helper(rows, 1);
    }

    public static void helper(int rows, int currentRow) {
        if (currentRow > rows) {
            return;
        }

        printStars(currentRow);
        System.out.println();
        helper(rows, currentRow + 1);
    }

    public static void printStars(int count) {
        if (count <= 0) {
            return;
        }

        System.out.print("* ");
        printStars(count - 1);
    }
}
