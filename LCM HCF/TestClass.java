package com.metacube;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestClass {
	LcmHcf lcmHcf = new LcmHcf();
	
	//To test LCM
	@Test
	public void lcmTest() {
        Object[][] testCases = {
                // Test cases: {valueOfX, valueOfY, expectedLcm}
                { 7, 5, 35}, 	// Expected LCM : 35
                { 4, 6, 12}, 	// Expected LCM : 12
                { 9, 6, 18},    // Expected LCM : 18
                { 12, 24, 24},  // Expected LCM : 24
                { 0, 5, 0},  	// Expected LCM : 0
            };
        
        // iterate through each test case in testCases
        for ( Object[] testCase : testCases ) {
            int valueOfX = (int) testCase[0];
            int valueOfY = (int) testCase[1];
            int expectedOutput = (int) testCase[2];

            int actualOutput = lcmHcf.findLcm(valueOfX, valueOfY);
            assertEquals(expectedOutput, actualOutput);
        }
	}
	
	
	//To test HCF
	@Test
	public void hcfTest() {
		Object[][] testCases = {
				// Test cases: {valueOfX, valueOfY, expectedHCF}
				{ 7, 5, 1}, 	// Expected HCF : 1
				{ 4, 6, 2}, 	// Expected HCF : 2
				{ 9, 6, 3},     // Expected HCF : 3
				{ 12, 24, 12},  // Expected HCF : 12
				{ 0, 5, 5},  	// Expected HCF : 5
		};
		
		// iterate through each test case in testCases
		for ( Object[] testCase : testCases ) {
			int valueOfX = (int) testCase[0];
			int valueOfY = (int) testCase[1];
			int expectedOutput = (int) testCase[2];
			
			int actualOutput = lcmHcf.findHcf(valueOfX, valueOfY);
			assertEquals(expectedOutput, actualOutput);
		}
	}
}
