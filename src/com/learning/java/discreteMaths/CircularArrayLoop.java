package com.learning.java.discreteMaths;

public class CircularArrayLoop {

	public boolean circularArrayLoop(int[] nums) {
        if(nums.length <= 1){
            return false;
        }
        int nextIndex = -1;
        int currentIndex = 0;
        int ctr = 0;
        int tmp;
        int[] visited = new int[nums.length];
        while(nextIndex != 0){
        	
        	if(nums[currentIndex] < 0){
        		while(Math.abs(nums[currentIndex]) >= nums.length){
        			nums[currentIndex] += nums.length;
        		}
        		
        		tmp = nums.length + currentIndex + nums[currentIndex];
        	}
        	else{
        		tmp = currentIndex + nums[currentIndex];
        	}
            
            nextIndex = (tmp) % nums.length;
            
            if(visited[nextIndex] == 1){
                return false;
            }
            
            visited[nextIndex] = 1;
            currentIndex = nextIndex;
            ctr++;
        }
        if(ctr > 1){
            return true;
        }
        return false;
    }
	public static void main(String[] args){
		int[] nums = new int[]{-2, 1, -1, -2, -2};
		CircularArrayLoop cp = new CircularArrayLoop();
		System.out.println(cp.circularArrayLoop(nums));
	}
}
