package com.practice.challenges;

public class HangingPoster {

	public static void main(String[] args) {
		long n = 10, h = 10;
		// long[] wallPoints = {15, 11, 17};
		long[] wallPoints = {13, 15, 26, 12, 11, 22, 11, 35, 23, 21};
		// long[] posterLengths = {5, 1, 2};
		long[] posterLengths = {151, 92, 131, 165, 197, 30, 149, 199, 19, 85};
		
		long ladderLength = hangPoster(posterLengths, wallPoints, n, h);
		
		System.out.println(ladderLength);
	}
	
	private static long hangPoster(long[] posterLengths, long[] wallPoints, long n, long h) {
		
		long ladderHeight = 0;
		long maxladder = 0;
		double height = 0.0;
		for(int i = 0; i < n; i++) {
			height = wallPoints[i] + (posterLengths[i] * 0.25) - (posterLengths[i]/2);
			if(h < height) {
				ladderHeight = Math.round(height) - h;
				if(maxladder < ladderHeight) {
					maxladder = ladderHeight;
				}
			}
		}
		
		return maxladder;
	}
}
