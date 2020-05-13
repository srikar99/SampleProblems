package com.practice.sorting;

public class BubbleSort {
	int reverse;
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		// int arr[] = {64, 86, 15, 122, 22, 11, 90}; 
		// sort(arr);
		// printArray(arr);
		// System.out.println();
		// swapWithTemp(120, 1320);
		// bs.reverseInt(1534236469);
		 bs.reverseIntWithoutRecursion(1534236469);
		 //System.out.println(bs.reverse);
		// swapWithoutTemp(10, 20);
		 
		 System.out.println(isPalindrome(-121));
		 
	}
	
	private static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	public static void sort(int[] array) {
		for(int i = 0; i < array.length-1; i++) {
			for(int j = 0; j < array.length-1; j++) {
				if(array[j] > array[j+1]) {
					array[j] = array[j] + array[j+1];
					array[j+1] = array[j] - array[j+1];
					array[j] = array[j] -  array[j+1];
				}
				
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	private static void swapWithTemp(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println(a + ":" + b);
	}
	
	private void reverseInt(int a) {
		reverse = reverse * 10 + a % 10;
		a = a / 10;
		if(a > 0) {
			reverseInt(a);
		}
		
		System.out.println(reverse);
	}
	
	private int reverseIntWithoutRecursion(int x) {
		int a = 0, b = 0;
        while(x != 0) {
            int y = x % 10;
            a = a * 10 + y;
            if((a-y) / 10 != b) {
                return 0;
            }
            b = a;
            x = x / 10;
        }
        
        return a;
	}

	 public static boolean isPalindrome(int x) {
	        int a = 0, b = x;
	        while(x != 0) {
	            a = a*10 + x%10;
	            x = x/10;
	        }
	        
	        System.out.println(a);
	        if(a == b) {
	            return true;
	        } else {
	        	return false;
	        }
	    }
	private static void swapWithoutTemp(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a + " : " + b);
	}
}
