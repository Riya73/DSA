package Patterns_Using_Recursion;

public class NumberedHalfTriangle {
     static void printNumbers(int num, int value) {
        if (num == 0) {
            return;
        }

        System.out.print(value + " ");
        printNumbers(num - 1, value + 1);
    }

    static void printLines(int rows, int incrementFact) {
        if (rows == 5) {
            return;
        }

        printNumbers(rows, incrementFact);
        System.out.println();
        printLines(rows + 1, rows + incrementFact);
    }

    public static void main(String[] args) {
        printLines(1, 1);
    }
}
