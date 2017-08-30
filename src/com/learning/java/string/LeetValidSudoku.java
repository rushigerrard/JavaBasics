package com.learning.java.string;

import java.util.ArrayList;
import java.util.HashSet;

public class LeetValidSudoku {

	public boolean isValidSudoku(char[][] board) {
		//HashSet[]<Character> hs = new HashSet<>()[];
		ArrayList<HashSet<Character>> hs = new ArrayList<>();
		int current = 0;
		for(int i = 0; i <= 10; i++){
		    hs.add(new HashSet<Character>());
		}
        for(int i = 0; i < board.length; i++){ //checking valid rows
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] != '.'){
                    if(row.add(board[i][j]) == false){
                    	//System.out.println("Row failed. i : " + i + " , j : " + j );
                    	return  false;   
                    }    
                }
                if(board[j][i] != '.'){
                    if(col.add(board[j][i]) == false){
                    	//System.out.println("Col failed. i : " + i + " , j : " + j );
                        return  false;   
                    }    
                }

                if(board[i][j] != '.'){
	                current = (i / 3) + 3 * (i / 3) + (j / 3);
	                if( hs.get(current).add(board[i][j]) == false){
	                	//System.out.println("Grid failed. i : " + i + " , j : " + j  + " , current : " + current);
	                	return false;
	                }
                }
 
            }
        }
 		return true;
    }
	
	public static void main(String[] args) {
		LeetValidSudoku lvs = new LeetValidSudoku();
		char[][] board = new char[9][9];
		String[] sts = {".87654321","2........","3........","4........","5........","6........","7........","8........","9........"};
		int count = 0;
		for(String s : sts){
			board[count++] = s.toCharArray();
		}
		System.out.println(lvs.isValidSudoku(board));
		System.out.println(lvs.isValidSudoku2(board));
	}

	private boolean isValidSudoku2(char[][] board) {
		return areRowsValid(board) && areColumnsValid(board) && areGridsValid(board);
	}

	private boolean areColumnsValid(char[][] board) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean areGridsValid(char[][] board) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean areRowsValid(char[][] board) {
		boolean[] check = new boolean[board.length];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == '.')
					continue;
				if (check[Character.getNumericValue(board[i][j])]) {
					return false;
				} else {
					check[Character.getNumericValue(board[i][j])] = true;
				}
			}
			check = new boolean[board.length];
		}
		return true;
	}
	
}
