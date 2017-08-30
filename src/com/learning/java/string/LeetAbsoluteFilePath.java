package com.learning.java.string;

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class LeetAbsoluteFilePath {


	public static void main(String[] args){
		LeetAbsoluteFilePath s = new LeetAbsoluteFilePath();
		System.out.println(s.lengthLongestPath("a\n\tb\n\t\tc.txt\n\taaaa.txt"));
	}

	public int lengthLongestPath(String input) {
		String[] tokens = input.split("\n");
		node[] no = new node[tokens.length];        
		int tokenCount = 0;

		for(String token : tokens){

			int tabCount = 0;
			while(token.startsWith("    ")){
				token = token.replaceFirst("    ", "\t");
			}
			while(token.startsWith("\t")){
				tabCount++;
				token = token.substring(1);

			}
			no[tokenCount++] = new node(token, tabCount);
			System.out.println(token + " , "+ tabCount);
		}

		Integer maxPath = 0;
		System.out.println(maxPath);
		if(no[0].s.contains(".")){

			maxPath = no[0].s.length();
			System.out.println(maxPath);
		}

		no[0].currCount = no[0].s.length();
		for(int i = 1; i < no.length; i++){
			if(no[i].tabCount == 0){
				no[i].currCount = no[i].s.length();
				if(no[i].s.contains(".")){
					if(maxPath < no[i].s.length()){
						maxPath = no[i].s.length();
						System.out.println(maxPath);
					}
				}
				continue ; 
			}
			if(no[i - 1].tabCount < no[i].tabCount){
				no[i].currCount = no[i - 1].currCount + no[i].s.length();
				if(no[i].s.contains(".") && no[i].currCount + no[i].tabCount > maxPath){
					maxPath = no[i].currCount + no[i].tabCount;
					System.out.println(maxPath);
				}
			}
			else{
				int j = i - 2;
				while(j >= 0 && no[i].tabCount - no[j].tabCount != 1){
					j--;
				}
				no[i].currCount = no[j].currCount + no[i].s.length();
				if(no[i].s.contains(".") && no[i].currCount  + no[i].tabCount > maxPath){
					maxPath = no[i].currCount + no[i].tabCount;
				}
			}
		}
		return maxPath;
	}
}
class node{
	String s;
	Integer tabCount;
	Integer currCount;
	node(String s, int t){
		this.s = s;
		this.tabCount = t;
	}

}