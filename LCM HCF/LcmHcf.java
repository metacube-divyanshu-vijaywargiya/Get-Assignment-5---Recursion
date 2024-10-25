package com.metacube;

//By Divyanshu Vijaywargiya , 25-10-2024
public class LcmHcf {
	
	/**
	 * To find HCF of two numbers x , y
	 * @param x integer first argument to find HCF
	 * @param y integer second argument to find HCF
	 * @return integer HCF of x and y
	 */
	public int findHcf(int x, int y) {
		if( y == 0) {
			return x;
		}
		
		return findHcf(y, x % y);
	}
	
	
	/**
	 * To find LCM of two numbers x, y
	 * @param x integer first argument to find LCM
	 * @param y integer second argument to find LCM
	 * @return integer LCM of x and y
	 */
	public int findLcm(int x, int y) {
		return ( x*y / findHcf(x, y));
	}
	
	
}
