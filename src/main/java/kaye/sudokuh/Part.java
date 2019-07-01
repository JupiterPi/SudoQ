package kaye.sudokuh;

import java.util.Set;
import java.util.HashSet;

public class Part {
    private Cell[][] innerCells = new Cell[3][3];
    private boolean solved;

    public Part (Cell[][] innerCells) {
        this.innerCells = innerCells;
        solved = true;
        for (Cell[] cellRows : innerCells) {
            for (Cell cell : cellRows) {
                if (!(cell.isSolved())) {
                    solved = false;
                }
            }
        }
    }

    public boolean isSolved() {
        return solved;
    }

    public int getRemainingCellsAmount() {
        return getRemainingCells().size();
    }

    public Set getRemainingCells() {
        Set remainingCells = new HashSet();
        for (Cell[] cellRows : innerCells) {
            for (Cell cell : cellRows) {
                if (!(cell.isSolved())) {
                    remainingCells.add(cell);
                }
            }
        }
        return remainingCells;
    }

    public Set getRemainingCellsNumbers() {
        Set remainingCellsNumbers = new HashSet();
        for (int i = 1; i < 10; i++) {
            remainingCellsNumbers.add(i);
        }
        for (Cell[] cellRows : innerCells) {
            for (Cell cell : cellRows) {
                if (cell.isSolved()) {
                    remainingCellsNumbers.remove(cell.getNumber());
                }
            }
        }
        return remainingCells;
    }
}