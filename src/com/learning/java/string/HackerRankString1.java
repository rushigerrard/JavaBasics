package com.learning.java.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HackerRankString1 {

	static boolean isAnagram(String a, String b) {
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();
        
        Arrays.sort(ac);
        Arrays.sort(bc);

        if(Arrays.equals(ac,bc)){
        	System.out.println("Anagrams");
        	return true;
        }
    	System.out.println("Not Anagrams");
		return false;
    }
	public static String myfun(String k) {
		int i = 0, j;
		String ans = "";
				
		boolean isRemoved[] = new boolean[k.length()];
		boolean hasData = true;
		while (hasData) {
			while (i < k.length() && isRemoved[i]) i++;
			j = i + 1;
			if (i >= k.length())
				break;
			while (j < k.length() && isRemoved[j]) j++;
			if (j >= k.length()) {
				i = 0;
			} else if (k.charAt(i) == k.charAt(j)) {
				isRemoved[i] = true;
				isRemoved[j] = true;
				i = 0;
			} else {
				i = j;
			}
		}
		for (int p = 0; p < isRemoved.length; p++) {
			if (!isRemoved[p])
				ans += k.charAt(p);
		}
		return ans;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(myfun(s));
		scan.close();

		
		String a = "anagram";
        String b = "margana";
        isAnagram(a, b);
        // Regex -todo later
        String delimeter = "!,?._'@ ";
        String[] arr = s.split(delimeter);//this is how you use delimeters
        System.out.println(arr.length);
        for(String tok : arr){
        	System.out.println(tok);
        }
	}
	
}
