package com.learning.java.maths;

public class AddDigits{
	
	public static int addDigits(int num) {
		if(num < 10)
			return num;
		int sum = 0;
		while(num > 0){
			sum = sum + num % 10;
			num = num / 10;
		}
		if(sum >= 10){
			sum = addDigits(sum);
		}
		return sum;
    }
	public static void main(String args[]){
		System.out.println(addDigits(989));
		
	}
}