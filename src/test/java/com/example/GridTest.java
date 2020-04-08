package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GridTest {
    @Test
    public void newlyInstantiatedGridShouldBeEmpty() {
        Grid grid = new Grid();
        assertEquals(42, grid.size());
        assertTrue(grid.isEmpty());
    }
    @Test
    public  void insertInColumnWhenColumnNumberIsGreaterThan7ShouldThrowException(){
        Grid grid = new Grid();
          Assertions.assertThrows(Exception.class, () -> {
            grid.insertTokenInColumn("X",7);
        });
    }

    @Test
    public void insertInToEmptyColumnShouldPutTokenInTheFisrtLine() throws Exception {
        Grid grid = new Grid();
        int line = grid.insertTokenInColumn("X", 0);
        assertEquals(0,line);
    }

    @Test
    public void insertInToColumnContainingThreeTokensShouldPutTokenInTheFourthLine() throws Exception {
        Grid grid = new Grid();
        grid.insertTokenInColumn("X", 0);
        grid.insertTokenInColumn("X", 0);
        grid.insertTokenInColumn("X", 0);
        int line = grid.insertTokenInColumn("X", 0);
        assertEquals(3,line);
    }

    @Test
    public void insterIntoFullColumnShouldThrowsException() throws Exception {
        Grid grid = new Grid();
        grid.insertTokenInColumn("X", 0);
        grid.insertTokenInColumn("X", 0);
        grid.insertTokenInColumn("X", 0);
        grid.insertTokenInColumn("X", 0);
        grid.insertTokenInColumn("X", 0);
        grid.insertTokenInColumn("X", 0);
        Assertions.assertThrows(Exception.class, () -> {
            grid.insertTokenInColumn("X",0);
        });

    }

    @Test
    public void checkAlignedTokenOfTypeShouldReturnTrueWhenTokenAreAlignedInTheSameColumn() throws Exception {
        Grid grid = new Grid();
        grid.insertTokenInColumn("X", 0);
        grid.insertTokenInColumn("X", 0);
        grid.insertTokenInColumn("X", 0);
        grid.insertTokenInColumn("X", 0);
        assertTrue(grid.isAlignedTokenOf("X", 2));
        assertTrue(grid.isAlignedTokenOf("X", 3));
        assertTrue(grid.isAlignedTokenOf("X", 4));
        assertFalse(grid.isAlignedTokenOf("X", 5));
    }
}
