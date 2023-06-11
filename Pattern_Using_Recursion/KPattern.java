package Patterns_Using_Recursion;

public class KPattern {
     public static void printPatternRecursive(int rows, int currentRow) {
        if (currentRow == 0) {
            return;
        }
        
        printStars(currentRow);
        System.out.println();
        
        printPatternRecursive(rows, currentRow - 1);
        
        printStars(currentRow);
        System.out.println();
    }
    
    public static void printStars(int count) {
        if (count == 0) {
            return;
        }
        
        System.out.print("* ");
        printStars(count - 1);
    }
    
    public static void main(String[] args) {
        int rows = 5;
        
        printPatternRecursive(rows, rows);
    }
}
