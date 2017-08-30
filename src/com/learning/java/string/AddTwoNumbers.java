package com.learning.java.string;

public class AddTwoNumbers {

	public String addStrings(String num1, String num2) {
		
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry == 1 ; i--, j--){
        	int n1 = i < 0 ? 0 : num1.charAt(i) - '0';
        	int n2 = j < 0 ? 0 : num2.charAt(j) - '0';
        	int result = (n1 + n2 + carry) % 10;
        	sb.append(String.valueOf(result));
        	carry = (n1 + n2 + carry) / 10;
        }
        
        return sb.reverse().toString();
    }
	public String add2Strings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--){
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            sb.append((x + y + carry) % 10);
            carry = (x + y + carry) / 10;
        }
        return sb.reverse().toString();
    }
	public static void main(String[] args) {
		String num1 = "999";
		String num2 = "1";
		AddTwoNumbers at = new AddTwoNumbers();
		System.out.println(at.addStrings(num1, num2));

	}

}
