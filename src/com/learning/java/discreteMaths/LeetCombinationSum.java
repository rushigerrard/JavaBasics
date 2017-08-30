package com.learning.java.discreteMaths;

import java.util.*;


public class LeetCombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    
    	List<List<Integer>> completeList = new ArrayList<>();
    	List<Integer> shortList = new ArrayList<>();
    	completeList.add(shortList);
    	
    	Arrays.sort(candidates);
    	
    	
    	
    	return completeList;
    }

	public static void main(String[] args) {
		
		int[] candidates = new int[]{2, 3, 6, 7};
		int target = 7;
		
		
		LeetCombinationSum lcs = new LeetCombinationSum();
		lcs.combinationSum(candidates, target);
	}

}
