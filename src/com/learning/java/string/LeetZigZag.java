package com.learning.java.string;

public class LeetZigZag {
	public String convert(String s, int numRows) {
        
		char[][] a = new char[numRows][s.length()];
        int direction = 0;// 0 is down, 1 is left
        int global_r = 0, global_c = 0; 
        int count = 0;
        StringBuilder sb = new StringBuilder();
        if(numRows == 1) //edge case
        	return s;
        
        while(count < s.length()){
        	if(global_r == 0)
        		direction = 0;
        	if(global_r == numRows - 1)
        		direction = 1;
        	
        	a[global_r][global_c] = s.charAt(count);
        	count++;
        	
        	if(direction == 0)
        		global_r = global_r + 1;
        	if(direction == 1){
        		global_r = global_r - 1;
        		global_c = global_c + 1;
        	}
        }
        for(int i = 0; i < numRows; i++){
        	for(int j = 0; j <= global_c; j++){
        		if((int)a[i][j] != 0){
        			sb.append(a[i][j]);
        		}
        	}

        }
        return sb.toString();
    }
	public static void main(String[] args) {
		LeetZigZag lzz = new LeetZigZag();
		String s = "paypalishiring";
		System.out.println(lzz.convert(s, 3));

	}

}
