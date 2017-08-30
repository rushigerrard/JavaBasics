package com.learning.java.sorting;

public class MedianOfTwoSortedArrays {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = new int[nums1.length + nums2.length];
		int i = 0, j = 0;
		int k = 0;
		double median;
		while(i < nums1.length && j < nums2.length){
			if(nums1[i] < nums2[j]){
				merge[k++] = nums1[i++];
			}
			else{
				merge[k++] = nums2[j++];
			}
		}
		while(i < nums1.length){
			merge[k++] = nums1[i++];
		}
		while(j < nums2.length){
			merge[k++] = nums2[j++];
		}
		if(merge.length % 2 == 0){
			median = (merge[merge.length / 2] + merge[(merge.length ) / 2 - 1]) ;
			System.out.println(median);
		}else{
			median = merge[merge.length];
		}
		
        return median / 2;
        
    }
	public static void main(String[] args){
		MedianOfTwoSortedArrays m = new MedianOfTwoSortedArrays();
		int[] nums1 = new int[]{};
		int[] nums2 = new int[]{3, 4};
		System.out.println(m.findMedianSortedArrays(nums1, nums2));
		
	}
}
