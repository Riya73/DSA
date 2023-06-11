package Patterns_Using_Recursion;

import java.util.Scanner;

public class RightTriangle {
    public static void printPatternRecursive(int rows, int currentRow) {
        if (currentRow > rows) {
            return;
        }
        
        printSpaces(rows, currentRow);
        printStars(currentRow);
        System.out.println();
        
        printPatternRecursive(rows, currentRow + 1);
    }
    
    public static void printSpaces(int rows, int currentRow) {
        if (currentRow < rows) {
            System.out.print(" ");
            printSpaces(rows, currentRow + 1);
        }
    }
    
    public static void printStars(int currentRow) {
        if (currentRow > 0) {
            System.out.print("*");
            printStars(currentRow - 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        
        printPatternRecursive(rows, 0);
        
        sc.close();
    }
}
