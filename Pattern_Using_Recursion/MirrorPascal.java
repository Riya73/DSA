package Patterns_Using_Recursion;

public class MirrorPascal {
    static void stars(int stars){
        if(stars == 0){
            return;
        }

        System.out.print("*");
        stars(stars - 1);
    }

    static void spaces(int spaces){
        if(spaces == 0){
            return;
        }
        System.out.print(" ");
        spaces(spaces - 1);
    }

    static void  printUpperLines(int rows , int spaces){
        if(rows == 0){
            return;
        }

        printUpperLines(rows - 1, spaces +1);
        spaces(spaces);
        stars(rows);
        System.out.println();
    }

    static void  printLowerLines(int rows , int spaces){
        if(rows == 0){
            return;
        }

        spaces(spaces);
        stars(rows);
        System.out.println();
        printLowerLines(rows - 1, spaces + 1);        
    }

    public static void main(String[] args) {
        printUpperLines(5, 0);
        printLowerLines(4, 1);
    }
}
