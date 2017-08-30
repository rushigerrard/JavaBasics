package com.advanced.datastructures.linkedlist;

public class Traverse2DArray {

	public static void traverse2DArray(int[][] grid, int x, int y){
		
		for(int i = 0; i < grid.length; i++){
            grid[x][i] = 1;
            grid[i][y] = 1;
        }
		int i = x - 1;
		int j = y + 1;
		//north east direction
		while(i >= 0 && j < grid.length){
			grid[i][j] = 1;
			
			i--; j++;
		}
		//north west direction
		i = x - 1;
		j = y - 1;
		while(i >= 0 && j >= 0){
			grid[i][j] = 1;
			i--; j--;
		}
		//south west direction
		i = x + 1;
		j = y - 1;
		while(i < grid.length && j >= 0){
			grid[i][j] = 1;
			i++; j--;
		}
		//south east direction
		i = x + 1;
		j = y + 1;
		while(i < grid.length && j < grid.length){
			grid[i][j] = 1;
			i++; j++;
		}
	}
	public static void main(String[] args) {
		int[][] grid = new int[8][8];
		traverse2DArray(grid, 2, 3);
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}

}
