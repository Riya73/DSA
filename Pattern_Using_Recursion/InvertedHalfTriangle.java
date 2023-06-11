package Patterns_Using_Recursion;

public class InvertedHalfTriangle {
     public static void main(String[] args) {
        int rows = 5;  

        printInvertedHalfPyramid(rows);
    }

    public static void printInvertedHalfPyramid(int rows) {
        helper(rows);
    }

    public static void helper(int rows) {
        if (rows <= 0) {
            return;
        }

        printStars(rows);
        System.out.println();
        helper(rows - 1);
    }

    public static void printStars(int count) {
        if (count <= 0) {
            return;
        }

        System.out.print("*");
        printStars(count - 1);
    }
}
