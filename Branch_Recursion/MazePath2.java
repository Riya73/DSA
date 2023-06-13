package Branch_Recursion;

import java.util.ArrayList;
import java.util.List;

public class MazePath2 {
    public static void main(String[] args) {
        int row = 0;
        int col = 0;
        int endRow = 2;
        int endCol = 2;
        String result = "";
        List<String> paths = new ArrayList<>();
        mazePathProblem(row, col, endRow, endCol, result, paths);
        for (String path : paths) {
            System.out.println(path);
        }
    }

    public static void mazePathProblem(int row, int col, int endRow, int endCol, String result, List<String> paths) {
        if (row == endRow && col == endCol) {
            paths.add(result);
            return;
        }

        // Move to the right
        if (col + 1 <= endCol) {
            mazePathProblem(row, col + 1, endRow, endCol, result + "R", paths);
        }

        // Move down
        if (row + 1 <= endRow) {
            mazePathProblem(row + 1, col, endRow, endCol, result + "D", paths);
        }

        // Move diagonally
        if (row + 1 <= endRow && col + 1 <= endCol) {
            mazePathProblem(row + 1, col + 1, endRow, endCol, result + "Diagonal", paths);
        }
    }
    
}
