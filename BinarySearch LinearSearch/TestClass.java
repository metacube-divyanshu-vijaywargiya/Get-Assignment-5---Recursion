package com.metacube;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestClass {
	LinearAndBinarySearch linearAndBinarySearch = new LinearAndBinarySearch();
	
	@Test
	public void linearSearchTest() {
        
        Object[][] testCases = {
            // Test cases: {inputArray, start, end, target, expectedOutput}
            {new int[]{1, 2, 3, 4, 5}, 0, 5, 3, 2}, // Target 3 found at index 2
            {new int[]{1, 2, 3, 4, 5}, 0, 5, 6, -1}, // Target 6 not found, return -1
            {new int[]{}, 0, 0, 1, -1},               // Empty array, return -1
            {new int[]{5, 1, 2, 3, 4}, 0, 5, 5, 0},  // Target 5 found at index 0
            {new int[]{1, 2, 3, 2, 1}, 0, 5, 4, -1},  // Target 4 not found, return -1
            {new int[]{1, 1, 1, 1, 1}, 0, 5, 1, 0},  // Target 1 found at index 0 (first occurrence)
        };

        // iterate through each test case in testCases
        for ( Object[] testCase : testCases ) {
            int[] inputArray = (int[]) testCase[0];		
            int start = (int) testCase[1];
            int end = (int) testCase[2] - 1 ;
            int target = (int) testCase[3];
            int expectedOutput = (int) testCase[4];

            int actualOutput = linearAndBinarySearch.linearSearch(inputArray, start, end, target);
            assertEquals(expectedOutput, actualOutput);
        }
    }
}
