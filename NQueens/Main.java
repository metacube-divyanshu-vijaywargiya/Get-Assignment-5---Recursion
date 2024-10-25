package com.metacube;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		try {
			
			NQueensSolution nQueensSolution = new NQueensSolution();
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter N : ");
			int arguementN = scanner.nextInt();

			int optionCount = 0;
	        // Print the answer before returning
	        System.out.println("Possible Solutions for " + arguementN + " Queens:");
	        for (List<String> solution : nQueensSolution.solveNQueens(arguementN)) {
	        	System.out.println("Option : " + (optionCount+1));
	            for (String row : solution) {
	                System.out.println(row);
	            }
	            optionCount++;
	            System.out.println(); // Print a blank line between solutions
	        }
	        
		} catch (InputMismatchException e) {
			System.out.println("Please enter valid input integer.");
		}

	}

}
