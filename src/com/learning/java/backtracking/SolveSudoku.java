package com.learning.java.backtracking;

public class SolveSudoku {
 
	public void solveSudoku(char[][] board) {
		_solveSudoku(board);
	}
	
	private Boolean _solveSudoku(char[][] board) {
		
		Combo combo = findUnassigned(board);
		if(combo.i == -1 || combo.j == -1){
			return true;
		}
		int r = combo.i;
		int c = combo.j;

		for(char no = '1'; no <= '9'; no++){
			if(isValid(board, no, r, c)){
				board[r][c] = no;
				
				if(_solveSudoku(board))
					return true;

				board[r][c]= '.';
			}
		}
		return false;
	}
	public Boolean solveSudoku(Integer[][] board) {
    
		Combo combo = findUnassigned(board);
		if(combo.i == -1 || combo.j == -1){
			return true;
		}
		int r = combo.i;
		int c = combo.j;
		for(int no = 1; no <= 9; no++){
			if(isValid(board, no, r, c)){
				board[r][c] = no;
				
				if(solveSudoku(board))
					return true;

				board[r][c]= 0;
			}
		}
		return false;
    }
	private Combo findUnassigned(char[][] board) {
    	for(int i = 0; i < 9; i++){
    		for(int j = 0; j < 9; j++){
    			if(board[i][j] == '.'){
    				return new Combo(i, j);
    			}
    		}
    	}
    	return new Combo(-1, -1);
	}
    private Combo findUnassigned(Integer[][] board) {
    	for(int i = 0; i < 9; i++){
    		for(int j = 0; j < 9; j++){
    			if(board[i][j] == 0){
    				return new Combo(i, j);
    			}
    		}
    	}
    	return new Combo(-1, -1);
	}

    private boolean isValid(char[][] board, char no, int i, int j) {
		//check row & column
    	for(int k = 0; k < 9; k++){
    		if(board[i][k] == no){
    			return false;
    		}
    		if(board[k][j] == no){
    			return false;
    		}
    	}
    	//check grid
    	for(int r = (i / 3) * 3; r < (i / 3) * 3 + 3; r++){
    		for(int c = (j / 3) * 3; c < (j / 3) * 3 + 3; c++){
        		if(board[r][c] == no){
        			return false;
        		}	
    		}
    	}
    	
    	return true;
	}
    
	private boolean isValid(Integer[][] board, int no, int i, int j) {
		//check row & column
    	for(int k = 0; k < 9; k++){
    		if(board[i][k] == no){
    			return false;
    		}
    		if(board[k][j] == no){
    			return false;
    		}
    	}
    	//check grid
    	for(int r = (i / 3) * 3; r < (i / 3) * 3 + 3; r++){
    		for(int c = (j / 3) * 3; c < (j / 3) * 3 + 3; c++){
        		if(board[r][c] == no){
        			return false;
        		}	
    		}
    	}
    	
    	return true;
	}
	public static void main(String[] args) {
    	Integer[][] board = new Integer[][]
    		{{0, 0, 9, 7, 4, 8, 0, 0, 0},
			 {7, 0, 0, 0, 0, 0, 0, 0, 0},
			 {0, 2, 0, 1, 0, 9, 0, 0, 0},
			 {0, 0, 7, 0, 0, 0, 2, 4, 0},
			 {0, 6, 4, 0, 1, 0, 5, 9, 0},
			 {0, 9, 8, 0, 0, 0, 3, 0, 0},
			 {0, 0, 0, 8, 0, 3, 0, 2, 0},
			 {0, 0, 0, 0, 0, 0, 0, 0, 6},
			 {0, 0, 0, 2, 7, 5, 9, 0, 0}
    		};
    	SolveSudoku ss = new SolveSudoku();
    	ss.solveSudoku(board);
    	ss.print(board);
    	
    	char[][] boar = new char[9][9];
		String[] sts = {"..9748...","7........",".2.1.9...","..7...24.",".64.1.59.",".98...3..","...8.3.2.","........6","...2759.."};
		int count = 0;
		for(String s : sts){
			boar[count++] = s.toCharArray();
		}
		System.out.println("-----------------------");
    	ss.solveSudoku(boar);
    	ss.print(boar);
	}
    //["..9748...","7........",".2.1.9...","..7...24.",".64.1.59.",".98...3..","...8.3.2.","........6","...2759.."]
    //

	private void print(Integer[][] board) {
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	private void print(char[][] board) {
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
class Combo{
	int i;
	int j;
	public Combo(int i, int j){
		this.i = i;
		this.j = j;
	}
}