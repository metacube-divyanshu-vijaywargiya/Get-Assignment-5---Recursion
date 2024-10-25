package com.metacube;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinearAndBinarySearch linearAndBinarySearch = new LinearAndBinarySearch();
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("Enter Size of Array : ");
			int sizeOfArray = scanner.nextInt();
			
			if (sizeOfArray <= 0) {
				throw new AssertionError("Size of Array must be greater than 0.");
			}
			
			int[] array =new int[sizeOfArray];
			
			for ( int i=0; i<sizeOfArray; i++ ) {
				System.out.print("Enter " + (i+1) + " element of array : ");
				array[i]= scanner.nextInt();
			}
			
			System.out.println("Entered Array : ");
			for(int numberEntered : array) {
				System.out.print(numberEntered + " ");
			}
			System.out.println("\n");
			
			System.out.println("Enter target to find : ");
			int targetToFind = scanner.nextInt();
			
			
			System.out.println("\n\n 1. Linear Search. \n 2. Binary Search.");
			System.out.print("Enter a choice : ");
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1: 
				System.out.println("Linear Search , Target Found at : " + linearAndBinarySearch.linearSearch(array, 0, array.length-1, targetToFind));
				break;
				
			case 2: 
				System.out.println("Binary Search , Target Found at : " + linearAndBinarySearch.binarySearch(array, 0, array.length-1, targetToFind));
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Only Integer.");
		} catch (AssertionError e) {
			System.out.println(e.getMessage());
		} finally {
			scanner.close();
		}
	}

}
