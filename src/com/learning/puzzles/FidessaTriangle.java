package com.learning.puzzles;

import java.util.Arrays;
import java.util.Scanner;

public class FidessaTriangle {

	public static String fidessaTriangle(int[] side){
		Arrays.sort(side);
		if(side[0] + side[1] <= side[2]){
			return "None of these";
		}
		if(side[0] == side[1] && side[1] == side[2]){
			return "Equilateral";
		}
		if(side[0] == side[1] || side[1] == side[2]){
			return "Isosceles";
		}	
		return "None of these";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer T = Integer.parseInt(sc.nextLine());
		for(int i = 1; i <= T; i++){
			int[] sides = new int[3];
			sides[0] = sc.nextInt();
			sides[1] = sc.nextInt();
			sides[2] = sc.nextInt();
			System.out.println(fidessaTriangle(sides));
		}
	}

}
