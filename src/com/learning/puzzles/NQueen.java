package com.learning.puzzles;

import java.util.*;

public class NQueen {

    public boolean doPlacement(int[][] board, int x, int n){
        if(x == n){
    		return true;
    	}
        for(int i = 0; i < n; i++){
            if(board[i][x] == 0){
            	if(isSafe(board, i, x)){
            		board[i][x] = 1;
            		if(doPlacement(board, x + 1, n)){
            			return true;
            		}
            		else{
            			board[i][x] = 0;
            		}
            	}
            }
            
        }
        return false;
    }
    
	private boolean isSafe(int[][] board, int x, int y) {
		for(int i = 0; i < board.length; i++){ //check left and right
			if(board[i][y] == 1){
				return false;
			}
			if(board[x][i] == 1){
				return false;
			}
		}
		for(int i = x, j = y; i >= 0 && j >= 0; i--, j--){ //north west
			if(board[i][j] == 1){
				return false;
			}
		}
		for(int i = x, j = y; j >= 0 && i < board.length; i++, j--){ //south west
			if(board[i][j] == 1){
				return false;
			}
		}
		return true;
	}

	public List<List<String>> solveNQueens(int n) {
        int[][] board  = new int[n][n];
        //initialize to zero
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board [i][j] = 0;
            }    
        }
        doPlacement(board , 0, n);
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
        
            }
            System.out.println();
        }
        return null;
    }
	public static void main(String[] args) {
		NQueen nq = new NQueen();
		nq.solveNQueens(8);
				
	}

}
