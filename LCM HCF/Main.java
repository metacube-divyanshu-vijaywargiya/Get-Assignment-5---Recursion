package com.metacube;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			LcmHcf lcmHcf = new LcmHcf();
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter X : ");
			int arguementX = scanner.nextInt();
			System.out.println("Enter Y : ");
			int arguementY = scanner.nextInt();
			
			System.out.println("HCF of " + arguementX + " and " + arguementY + " is : " + lcmHcf.findHcf(arguementX, arguementY) );
			System.out.println("LCM of " + arguementX + " and " + arguementY + " is : " + lcmHcf.findLcm(arguementX, arguementY) );			
		} catch (InputMismatchException e) {
			System.out.println("Please enter only integer.");
		}
		

	}

}
