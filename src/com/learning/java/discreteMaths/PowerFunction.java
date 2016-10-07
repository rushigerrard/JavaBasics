package com.learning.java.discreteMaths;

import java.util.ArrayList;
import java.util.HashMap;


public class PowerFunction {

	public double compute(double x, int y){
		double original_x = 1;
		while(y != 1){
			if(y % 2 == 1){
				original_x = original_x * x;
			}
			y = y / 2;
			x = x * x;
			
		}
		return x * original_x;
		
	}
	 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(B,D) (D,E) (A,B) (C,F) (E,G) (A,C)";
	}

}
