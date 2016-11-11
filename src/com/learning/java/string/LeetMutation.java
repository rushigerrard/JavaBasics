package com.learning.java.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class LeetMutation {

	public static int minMutation(String start, String end, String[] bank) {
        if(start == end) 
            return 0;
        if(bank.length == 0)
        	return -1;
        int count  = 0;
        ArrayList<Integer> indexList = new ArrayList<>();
        TreeMap<Character, Integer> hm = new TreeMap<>();
        //hm.pollLastEntry()
        ArrayList<ArrayList<Integer>> bankList = new ArrayList<>();
        for(int i = 0; i < 8; i++){
        	if(start.charAt(i) != end.charAt(i)){
        		indexList.add(i);
        		
        	}
        }
        for(String b : bank){
        	int i = 0;
        	while(i < 8){
        		if(start.charAt(i) != b.charAt(i)){
        			
        		}
        	}
        }
        /*
        char[] startArr = start.toCharArray();
        for(Integer i : indexList){
        	startArr[i] = end.charAt(i);
        	String tmp = new String(startArr);
        	if(!Arrays.asList(bank).contains(tmp)){
        		
        		return -1;
        	}
        	else{
        		count++;
        	}
        }*/
        
        return count;
        
    }
	
	public static void main(String[] args) {
		String start = "AACCGGTT";
		String end = "AACCGCTA";
		String[] bank = {"AACCGGTA"};
		System.out.println(minMutation(start, end, bank));
	}

}
/*"AACCGGTT"
"AACCGGTA"
["AACCGGTA"]*/

/*"AACCGGTT"
"AACCGCTA"
["AACCGGTA"
"AACCGCTA"
"AAACGGTA"]*/