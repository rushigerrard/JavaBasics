package com.learning.java.discreteMaths;

import java.util.Arrays;
import java.util.Scanner;

public class MinToys {

    public static void minToys(int[] arr){
        //Step 1 - Sort the array
        // 1 2 3 10 17
    	int[] series = new int[arr.length];
    	int count = 1;
    	Arrays.sort(arr);
    	
    	for(int i = 0; i < arr.length - 1; i++){
    		System.out.print(arr[i] + " ");
    	}
    	System.out.println();
    	
    	for(int i = 0; i < arr.length - 1; i++){
    		count = 1;
    		for(int j = i + 1; j < arr.length; j++){
    			if(arr[j] <= arr[i] + 4){
    				count++;
    			}
    		}
    		series[i] = count;
    	}
    	series[arr.length - 1] = 1;
    	for(int i = 0; i < arr.length - 1; i++){
    		System.out.print(series[i] + " ");
    	}
    	System.out.println();
    	count = 0;
    	//10
    	//16 18 10 13 2 9 17 17 0 19
    	//0 2 9 10 13 16 17 17 18 19
    	
    	
    	int i = 0;
    	while(i < arr.length){
    		boolean flag = true;
    		int range = i + series[i];
    		System.out.println("Range is i : " + i + ", range : " + (range - 1));
    		for(int j = i; j < range; j++){
    			if(j == arr.length)
    				break;
    			
    			if(series[i] < series[j]){
    				count++;
    				System.out.println("Inside loop i : " + i + " j : " + j + " count : " + count );
    				i = j;
    				flag = false;
    			}
    		}
    		if(flag == true){
    			count++;
    			System.out.println("i : " + i + " count : " + count );
    			i = i + series[i];
    		}
    	}
        System.out.println(count);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();    
        }
        minToys(arr);
    }
}