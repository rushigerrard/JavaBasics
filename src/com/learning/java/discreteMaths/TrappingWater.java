package com.learning.java.discreteMaths;

public class TrappingWater {
	
	public int trap(int[] height) {
		int max = height[0];
		int left, right;
		int water = 0;
		for(int i = 1; i < height.length; i++){
			if(height[i] > max)
				max = height[i];
		}
		
		for(int level = 1; level <= max; level++){
			for(left = 0; left < height.length; left++){
				if(height[left] >= level){
					break;
				}
			}
			for(right = height.length - 1; right > 0; right--){
				if(height[right] >= level){
					break;
				}
			}
			for(int range = left; range <= right; range++){
				if(height[range] < level){
					water++;
				}
			}
		}
		return water;
    }
	
	public static void main(String[] args) {
		int[] height = new int[]{};
		TrappingWater tw = new TrappingWater();
		System.out.println(tw.trap(height));
	}

}
