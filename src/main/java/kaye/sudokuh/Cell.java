package kaye.sudokuh;

import java.util.Set;
import java.util.HashSet;

public class Cell {
    private boolean solved;
    private Set couldBe = new HashSet();
    private int number;

    public Cell() {
        solved = false;
        for (int i = 1; i < 10; i++) {
            couldBe.add(i);
        }
    }

    public Cell(int number) {
        solved = true;
        this.number = number;
    }

    public void doConsequences(Cell[][] cells) {
        // Folgen ausführen
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(int number) {
        solved = true;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void removeFromCouldBe (int number) {
        couldBe.remove(number);
    }
}