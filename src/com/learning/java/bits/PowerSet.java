package com.learning.java.bits;

public class PowerSet {
    // Print all subsets of given set[]
    static boolean printSubsets(int set[], int expectedSum)
    {
        int n = set.length;
 
        // Run a loop for printing all 2^n
        // subsets one by obe
        for (int i = 0; i < (1<<n); i++){
            int currentSum = 0;
            if(currentSum == expectedSum){
            	return true;
            }
            // Print current subset
            for (int j = 0; j < n; j++){
 
                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
            	
                if ((i & (1 << j)) > 0){
                	currentSum = currentSum + set[j];
                	if(currentSum == expectedSum)
                		return true;
                }
            }   
        }
        return false;
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char set[] = {'a', 'b', 'c'};
		/*int set[] = {1, 2, 4, 4, 7, 21};
		int expectedSum = 34;
		*/
		int set[] = {1, 2, 3, 4, 5, 6, 7};
		int expectedSum = 14;
	    System.out.println(printSubsets(set, expectedSum));
	    System.out.println(recursiveSolution(set, expectedSum, 0));
	}

	private static boolean recursiveSolution(int[] set, int expectedSum, int i) {
		// TODO Auto-generated method stub
		
		
		if(expectedSum == 0){
			return true;
		}
		if(expectedSum < 0){
			return false;
		}
		for(int j = i; j < set.length ; j++){
			if(recursiveSolution(set, expectedSum - set[j], j + 1) == true){
				return true;
			}
		}
		return false;	
	}

}
