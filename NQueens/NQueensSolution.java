package com.metacube;

import java.util.ArrayList;
import java.util.*;

public class NQueensSolution {

	/**
	 * To check that particular position is safe for queen or not 
	 * @param row integer row count of board
	 * @param column integer column count of board
	 * @param board current board to find safe position for queen
	 * @return boolean true if position is safe to place queen there and false if place is not safe
	 */
	public boolean isSafeToPutQueen(int row, int column, char[][] board) {
		//first we will check in upper left diagonal is there any queen present
		int duplicateRow = row;
		int duplicateCol = column;
		
		while( row >= 0 && column >=0 ) {
			if(board[row][column] == 'Q') {
				return false;
			}
			row--;
			column--;
		}
		
		//now checking all columns in the left , is there any queen present in same row in different column
		column = duplicateCol;
		row = duplicateRow;
		while(column>=0) {
			if(board[row][column] == 'Q') {
				return false;
			}
			column--;
		}
		
		//now we will check bottom left diagonal is there any queen present
		column = duplicateCol;
		row = duplicateRow;
		while( row < board.length && column >=0 ) {
			if(board[row][column] == 'Q') {
				return false;
			}
			row++;
			column--;
		}
		
		
		return true;	
	}
	
	
	/**
	 * recursive function to solve and return the final ans which stores possible arrangements of board
	 * @param column iterating through column by column to place queen
	 * @param board current board to place queen
	 * @param ans returns the List<List<String>> ans, in which all possible arrangements are stored
	 */
	public void solve(int column, char[][] board, List<List<String>> ans) {
		//base condition - if we are last column then return the ans
		if(column == board.length) {
			ans.add(construct(board));
			return;
		}
		
		
		//for each column we are traversing each row to place queen 
		for( int row = 0; row < board.length; row++) {
			if(isSafeToPutQueen(row, column, board)) {
				board[row][column] = 'Q';
				solve(column + 1 , board, ans);
				board[row][column] = '.';
			}
		}
	}
	
	/**
	 * Main function which we will call in main class
	 * @param n integer for number of queens
	 * @return List < List < String >> possible arrangements of queen 
	 */
	public List < List < String >> solveNQueens(int n){
		//creating n*n board
		char[][] board = new char[n][n];
		//creating answer list in which we will store multiple possible arrangements of n queen
		List < List < String >> ans = new ArrayList < List < String >> ();

		//prefilling board with '.'
		for (int i = 0; i < n; i++) {			
            for (int j = 0; j < n; j++) {            	
                board[i][j] = '.';
            }
		}

        //calling solve function to find arrangement
        solve(0, board, ans);
        
        return ans;
	}
	
	/**
	 * To convert 2D character array into List<String> , need to use this because it can have multiple arrangements possible 
	 * @param board 2d character array to convert into list<string>
	 * @return List < String > converted list 
	 */
    static List < String > construct(char[][] board) {
        List < String > res = new LinkedList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}
