package Patterns_Using_Recursion;

public class XPattern {
    static void printX(int rows, int starsOrSpaces) {
        if (rows == 0) {
            return;
        }

        printX(rows - 1, starsOrSpaces);
        printStarsOrSpaces(rows, starsOrSpaces);
        System.out.println();
    }

    static void printStarsOrSpaces(int rows, int starsOrSpaces) {
        if (starsOrSpaces == 0) {
            return;
        }

        printStarsOrSpaces(rows, starsOrSpaces - 1);

        if (rows + starsOrSpaces == 6 || rows == starsOrSpaces) {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }

    public static void main(String[] args) {
        printX(5, 5);
    }
}
