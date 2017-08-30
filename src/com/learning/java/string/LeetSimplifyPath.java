package com.learning.java.string;

import java.util.Stack;

public class LeetSimplifyPath {

	public String simplifyPath(String path) {

		StringBuilder sb = new StringBuilder(path);
		for(int i = 0; i < sb.length(); i++){
			if(sb.charAt(i) == '/'){
				int j = i + 1;
				while(j < sb.length() && sb.charAt(j) == '/' )
					sb.deleteCharAt(j);
			}
		}
		if(sb.toString().equals("/")){
			return sb.toString();
		}
		if(sb.charAt(0) == '/')
			sb.deleteCharAt(0);
	
		
		String[] tokens = sb.toString().split("/");
		Stack<String> stack = new Stack<>();
		for(String token : tokens){
			if(token.equals("..")){
				if(stack.isEmpty()){
					//do nothing
				}
				else{
					stack.pop();
				}
			}else if(token.equals(".")){
				//do nothing
			}else{
				stack.push(token);
			}
		}
		String output = "";
		if(stack.isEmpty())
			return "/";
		
		while(!stack.isEmpty()){
			output = "/" + stack.pop() + output;
		}
		return output;
    }
	public static void main(String[] args) {
		String path = "/a/./b///../c/../././../d/..//../e/./f/./g/././//.//h///././/..///";
		LeetSimplifyPath lsp = new LeetSimplifyPath();
		System.out.println(lsp.simplifyPath(path));

		/*
		String[] tokens = path.split("/");
		System.out.println(tokens.length);
		for(String t : tokens)
			System.out.println(t);
		System.out.println("---------");
		*/
		
	}

}
