package com.learning.java.discreteMaths;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for(int i = 0; i < testCase; i++){
          int size = in.nextInt();
              
            
          int[] arr = new int[size];
          int[] left = new int[size];
          int[] right = new int[size];
            
          arr[0] = in.nextInt();
          if(size == 1){
        	  System.out.println("YES");
        	  continue;
          }
          left[0] = 0;
          right[0] = 0;  
          for(int j = 1; j < size; j++){
              arr[j] = in.nextInt();
              left[j] = left[j - 1] + arr[j - 1];
              right[0] = right[0] + arr[j];
          }
          int flag = 0;
            
          for(int j = 1; j < size; j++){
              right[j] = right[j - 1] - arr[j];
              if(right[j] == left[j]){
                System.out.println("YES");
                flag = 1;
                break ;
              }
          }
          if(right[0] == left[0]){
              System.out.println("YES");
              flag = 1;
          }
              
          if(flag == 0)
              System.out.println("NO");
        }

        
    }
}