package com.learning.java.dynamicprogramming;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "adcdac";
		String t = "dadacc";
		System.out.println("The longest common subsequence is " + LongestCommonSubsequence(s, t));
	}

	private static String LongestCommonSubsequence(String s, String t) {
		// TODO Auto-generated method stub
		Grid[][] a = new Grid[s.length() + 1][t.length() + 1];

		for(int i = 0; i <= s.length(); i++){
			for(int j = 0; j <= t.length(); j++){
				a[i][j] = new Grid();
			}
		}
		for(int i = 1; i <= s.length(); i++){
			for(int j = 1; j <= t.length(); j++){
				if(s.charAt(i - 1) == t.charAt(j - 1)){
					a[i][j].value = a[i - 1][j - 1].value + 1;
					a[i][j].pointer = 2;
				}
				else{
					//if left value is greater
					if(a[i][j - 1].value > a[i - 1][j].value){
						a[i][j].value = a[i][j - 1].value;
						a[i][j].pointer = 1;
					}
					else{ //if top is greater
						a[i][j].value = a[i - 1][j].value;
						a[i][j].pointer = 3;
					}
				}
				System.out.print(a[i][j].value + " ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		for(int i = 1; i <= s.length(); i++){
			for(int j = 1; j <= t.length(); j++){
				System.out.print(a[i][j].pointer + " ");
			}
			System.out.println();
		}
		int i = s.length(), j = t.length();
		StringBuilder finalString = new StringBuilder();
		while(i != 0 && j != 0){
			switch(a[i][j].pointer){
				case 1:
					j = j - 1;
					break;
				case 2:
					finalString.append(s.charAt(i - 1));
					i = i - 1; j = j -1;
					break;
				case 3:
					i = i - 1;
					break;
			}
			
		}
		
		return finalString.reverse().toString();
	}

}
class Grid{
	//1 : left, 2 : diagonal, 3 : top
	int pointer;
	int value;
}
