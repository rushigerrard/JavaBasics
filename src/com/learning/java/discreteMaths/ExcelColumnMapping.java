package com.learning.java.discreteMaths;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class ExcelColumnMapping {

	static HashMap<Integer, String> mp = new HashMap<>();
	static{
		int i = 0;
		for (char ch = 'A'; ch <= 'Z'; ++ch){
			mp.put(i, String.valueOf(ch));
			i++;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int no = 700; no < 1403; no++){
			//int no = sc.nextInt();
			
			if(no < 0){
				System.out.println("Invalid input");
				return ;
			}
			//excelColumnMapping(no);
		}
		System.out.println(convertToTitle(702));
	}

	public static String convertToTitle(int n) {
		 StringBuilder s = new StringBuilder();
	        int len=1;
	        //Find the length of final String
	        double temp = n;
	        while(temp>26){
	            len++;
	            temp=(temp-26)/26;
	        }
	        //Find each character of String
	        while(len>0){
	            int num = n%26;
	            if(num==0)num=26;//case when num is 0
	            char ch = (char) ('A'+ num-1);
	            s.append(ch);
	            len--;
	            n=(n-num)/26;
	        }
	        //reverse the string as we are finding from right to left
	        
	        return s.reverse().toString();
    }
	private static void excelColumnMapping(int no) {
		System.out.print(no);
		if(no < 26){
			System.out.println(", " + mp.get(no));
			return ;
		}
		Stack s = new Stack();
		StringBuilder sb = new StringBuilder();
		int columnNo = no % 26;
		s.push(columnNo);
//		System.out.println("Column Number is " + columnNo);
		while(no > 26){
			
			no = no / 26;
			if(no > 26){
//				System.out.println("Block identified is " + columnNo);
				s.push((no % 26) - 1);
			}
		}
		s.push(no - 1);
		while(!s.isEmpty()){
			sb.append(mp.get(s.pop()));
		}
		System.out.println(  " , " + sb.toString());
	}

}
