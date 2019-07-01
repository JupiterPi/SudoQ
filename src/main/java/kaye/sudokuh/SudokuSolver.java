package kaye.sudokuh;

import java.util.Set;
import java.util.HashSet;

public class SudokuSolver {
    private boolean solved = false;
    private Cell[][] cells = new Cell[9][9];
    private Part[][] parts = new Part[3][3];

    public SudokuSolver(Cell[][] inputCells) {
        solved = false;
        cells = inputCells;
        for (int aPart = 0; aPart < 3; aPart++) {
            for (int bPart = 0; bPart < 3; bPart++) {
                Cell[][] innerCells = new Cell[3][3];
                for (int aCells = 0; aCells < 3; aCells++) {
                    for (int bCells = 0; bCells < 3; bCells++) {
                        innerCells[aCells][bCells] = cells[aPart*3+aCells][bPart*3+bCells];
                    }
                }
                parts[aPart][bPart] = new Part(innerCells);
            }
        }
    }

    public void run() {
        firstLook(); // Erste Erschlüsse
        // Möglichkeiten streichen
        // Fortlaufender Algorythmus zur weiteren Lösung
    }

    // Erste Erschlüsse
    private void firstLook() {
        firstLookPartsWay();
        firstLookRowsWay();
        firstLookColumnsWay();
    }

    // Erste Erschlüsse: Parts-Erschlüsse
    private void firstLookPartsWay() {
        for (Part[] partRows : parts) {
            for (Part part : partRows) {
                if (!part.isSolved()) {
                    if (part.getRemainingCellsAmount() == 1) {
                        (Cell) part.getRemainingCells().toArray()[0].setSolved((int) part.getRemainingCellsNumbers().toArray()[0]);
                    }
                }
            }
        }
    }

    // Erste Erschlüsse: Zeilen-Erschlüsse
    private void firstLookRowsWay() {
        Set rows = new HashSet();
        for (int i = 0; i < 9; i++) {

        }
    }
}