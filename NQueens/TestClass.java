package com.metacube;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class TestClass {
	NQueensSolution solution = new NQueensSolution();
	
    @Test
    public void testSolveNQueens_1() {
        List<List<String>> result = solution.solveNQueens(2);
        assertEquals(0, result.size()); // No solutions for 2 queens
    }

    @Test
    public void testSolveNQueens_2() {
        List<List<String>> result = solution.solveNQueens(3);
        assertEquals(0, result.size()); // No solutions for 3 queens
    }

    @Test
    public void testSolveNQueens_3() {
        List<List<String>> result = solution.solveNQueens(4);
        assertEquals(2, result.size()); // 2 Expected solutions for 4 queens
        assertTrue(result.contains(List.of("..Q.", "Q...", "...Q", ".Q.."))); // first expected solution
        assertTrue(result.contains(List.of(".Q..", "...Q", "Q...", "..Q."))); // second expected solution
    }

    @Test
    public void testSolveNQueens_4() {
        List<List<String>> result = solution.solveNQueens(6);
        assertEquals(4, result.size()); // 4 Expected solutions for 6 queens
    }

    @Test
    public void testSolveNQueens_5() {
        List<List<String>> result = solution.solveNQueens(7);
        assertEquals(40, result.size()); // 40 Expected solutions for 7 queens
    }

    @Test
    public void testSolveNQueens_6() {
        List<List<String>> result = solution.solveNQueens(8);
        assertEquals(92, result.size()); // 92 Expected solutions for 8 queens
    }
}
