package com.practice.challenges;

public class MicrosoftArithmaticProgression {

	public static void main(String[] args) {
		
		int[] A = {3, 6, 9, 12};
		System.out.println(lap(A));
	}
	
	private static int lap(final int[] A) {
		int max = 0;
		int diff = 0;
		
		int[] lap = new int[A.length];
		
		for(int i = 0; i < A.length; i++) {
			lap[i] = 1;
		}
		
		for(int i = 0; i < A.length; i++) {
			for(int j = i; j < i + 1; j++) {
				diff = A[j] - A[i];
				lap[i] = diff;
			}
		}
		
		int com  = maxRepeating(lap, lap.length, lap.length);
		return max;
	}
	
	static int maxRepeating(int arr[], int n, int k) 
    { 
        // Iterate though input array, for every element 
        // arr[i], increment arr[arr[i]%k] by k 
        for (int i = 0; i< n; i++) 
            arr[(arr[i]%k)] += k; 
  
        // Find index of the maximum repeating element 
        int max = arr[0], result = 0; 
        for (int i = 1; i < n; i++) 
        { 
            if (arr[i] > max) 
            { 
                max = arr[i]; 
                result = i; 
            } 
        } 
  
        /* Uncomment this code to get the original array back 
        for (int i = 0; i< n; i++) 
          arr[i] = arr[i]%k; */
  
        // Return index of the maximum element 
        return result; 
    } 
}
