package Patterns_Using_Recursion;

public class MirrorHalfPyramid {
     public static void main(String[] args) {
        int rows = 5;  

        printMirrorHalfPyramid(rows);
    }

    public static void printMirrorHalfPyramid(int rows) {
        helper(rows, 1);
    }

    public static void helper(int rows, int currentRow) {
        if (currentRow > rows) {
            return;
        }
        printSpaces(rows - currentRow);
        printStars(currentRow);
        System.out.println();
        helper(rows, currentRow + 1);
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
        System.out.print("*");
        printStars(count - 1);
    }
}
