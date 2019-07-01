package kaye.sudokuh;

import java.util.Set;
import java.util.HashSet;

public class SudoKuh {
    public static void main (String[] args) {
        System.out.println("SudoKuh started. ");
        Cell[][] inputCells = new Cell[9][9];
        SudokuSolver solver = new SudokuSolver(inputCells);
        solver.run();
    }
}