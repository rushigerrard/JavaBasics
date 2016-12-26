package com.learning.java.basics;

public class MyAtoi {

	public int myAtoi(String str) {
		str = str.trim();
		if(str.length() == 0)
			return 0;
		
        if(str.length() > 10)
        	return 0;
        
		int newNo = 0;
        char[] ct = str.toCharArray();
        if((ct[0] == '+' || ct[0] == '-')){
        	if(ct.length == 1)
        		return 0;
        	for(int i = 1; i < ct.length; i++){
        		if(isValid(ct[i]))
        			newNo = newNo * 10 + (ct[i] - '0');
        		else{
            		if(ct[0] == '-')
            	        return -1 * newNo;
            	    else
            	        return newNo;
            	}
        	}
        	if(ct[0] == '-')
        		return -1 * newNo;
        	else{
        		if(ct[0] == '-')
        	        return -1 * newNo;
        	    else
        	        return newNo;
        	}
        		
        }
        else{
        	for(Character c : str.toCharArray()){
        		if(isValid(c))
        			newNo = newNo * 10 + (c - '0');
        		else
        			return newNo;
        	}
        	return newNo;
        }
    }
	private boolean isValid(Character c) {
		String a = "1234567890";
		if(a.contains(String.valueOf(c)))
			return true;
		return false;
	}
	public static void main(String[] args) {
		MyAtoi ma = new MyAtoi();
		System.out.println(ma.myAtoi("  -0012a42"));
	}

}
