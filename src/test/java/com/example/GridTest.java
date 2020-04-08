package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GridTest {
    @Test
    public void newlyInstantiatedGridShouldBeEmpty() {
        Grid grid = new Grid();
        assertEquals(42, grid.size());
        assertTrue(grid.isEmpty());
    }
}
