package com.learning.java.discreteMaths;

public class ReverseInteger {

	public int reverse(int x) {
        int newNo = 0;
        int remainder;
        
        if(x == 0)
            return 0;
        if(x > 0){
        	int count = 1;
            while(x > 0){
            	if(count == 10){
            		if(newNo > 214748364 ){
            			return 0;
            		}
            	}

            	remainder = x % 10;
                x = x / 10;
                newNo = newNo * 10 + remainder;
                count++;
            }
            return newNo;
        }
        else{
            x = x * -1;
            int count = 1;
            while(x > 0){
            	if(count == 10){
            		if(newNo > 214748364 ){
            			return 0;
            		}
            	}
            		
                remainder = x % 10;
                x = x / 10;
                newNo = newNo * 10 + remainder;
                count++;
            }
            return newNo * (-1);
        }
    }
	
	public static void main(String[] args) {
		ReverseInteger ri = new ReverseInteger();
		System.out.println(ri.reverse(1534236491));
	}

}
