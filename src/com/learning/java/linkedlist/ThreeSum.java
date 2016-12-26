package com.learning.java.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {

	
	    public List<List<Integer>> threeSum(int[] nums) {
	        Arrays.sort(nums);

	        for(Integer i : nums){
	        	System.out.print(i + " , ");
	        }
	        System.out.println();
	        System.out.println(nums.length);
	        int[] reduced = reduceSize(nums);
	        
	        for(Integer i : reduced){
	        	System.out.print(i + " , ");
	        }
	        System.out.println();
	        System.out.println(reduced.length);
	        
	        HashSet<ArrayList<Integer>> hs = new HashSet<>();
	        List<List<Integer>> tmp = new ArrayList<List<Integer>>(hs);
	        if(nums.length < 3)
	            return tmp;
	        for(int i = 0; i < reduced.length - 2; i++){
	            if(reduced[i] > 0){
	                break;
	            }
	            for(int j = i + 1; j < reduced.length - 1; j++){
	                if((reduced[i] + reduced[j]) > 0){
	                    break;
	                }
	                for(int k = j + 1; k < reduced.length; k++){
	                    if( (reduced[i] + reduced[j] + reduced[k]) == 0){
	                        ArrayList<Integer> current = new ArrayList<Integer>();
	                        current.add(reduced[i]);
	                        current.add(reduced[j]);
	                        current.add(reduced[k]);
	                        hs.add(current);
	                    }
	                    if((reduced[i] + reduced[j] + reduced[k]) > 0 ){
	                        break ;
	                    }
	                }
	            }    
	        }
	        List<List<Integer>> as = new ArrayList<List<Integer>>(hs);
	        return as;
	    }
	    
	    private int[] reduceSize(int[] nums) {
			HashMap<Integer, Integer> hm = new HashMap<>();
			int[] reduced = new int[nums.length];
			int count = 0;
			for(int i = 0; i < nums.length; i++){
				if(hm.containsKey(nums[i])){
					if(hm.get(nums[i]) == 2){
						if(nums[i] == 0){
							reduced[count] = nums[i];
							count++;
						}
					}
					else{
						hm.put(nums[i], 2);
						reduced[count] = nums[i];
						count++;
					}
				}else{
					hm.put(nums[i], 1);
					reduced[count] = nums[i];
					count++;
				}
			}
	    	int[] a = new int[count];
	    	for(int i = 0; i < count; i++){
	    		a[i] = reduced[i];
	    	}
	    	return a;
		}

		public static void main(String[] args){
	    	ThreeSum  ts = new ThreeSum();
	    	//int[] arr =  {13,9,1,12,-7,-12,7,3,9,6,-7,4,9,5,5,-7,4,11,1,-2,12,3,-12,-15,0,-12,-6,-1,7,-5,-4,-3,12,4,-14,-10,-1,8,1,-6,-1,9,13,-14,-1,-5,-6,-12,-8,2,2,11,13,-3,11,-2,1,-10,4,-15,-8,7,-11,11,-4,-10,-13,3,5,3,12,11,-11,2,12,3,13,13,-2,12,-7,-15,8,-9,-10,-4,-4,6,1,-15,-2,0,-1,2,-3,10,-1,-9,-10,-11,1,-13,-15,5,-3,5,-7,-5,-5,6,14,3,-1,7,1,-4,-12,12,-13,-4,4,0,3,-12,9,-15,6};
	    	int[] arr = {-15,13,6,-11,-4,5,-13,5,3,2,6,-1,4,12,-10,-13,-7,-4,-5,6,9,-14,1,-6,13,7,-8,10,-4,11,-8,-3,1,5,-7,4,-13,-13,-5,-3,4,-14,11,-14,5,-13,-12,13,-10,-10,-4,-15,13,13,-14,11,-3,-15,6,1,3,5,13,-11,-5,-9,1,-2,-14,11,10,5,4,-1,6,-6,-7,9,-15,-2,7,-12,-10,5,-14,13,-6,-9,6,7,7,-6,-2,-3,-9,0,-5,7,5,-4,-5,-7,-13,14,7,8,-15,7,-5,-15,-10,9};
	    	//int[] arr = {-1, -1, -1, 1};
	    	List<List<Integer>> as = ts.threeSum(arr);
	    	for(List<Integer> a : as){
	    		System.out.println(a);
	    	}
	    }
}
