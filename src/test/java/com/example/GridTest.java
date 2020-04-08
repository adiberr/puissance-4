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
            grid.insertTockenInColumn('X',7);
        });
    }
}
