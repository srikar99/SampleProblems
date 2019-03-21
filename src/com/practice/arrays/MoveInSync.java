package com.practice.arrays;

import java.util.Scanner;

public class MoveInSync {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int testCases = scanner.nextInt();
		
		for(int i = 0; i < testCases; i++) {
			String input = scanner.next();
			blockQueen(input);
		}
		
		scanner.close();
	}
	
	private static void blockQueen(String line) {
		
		int size = Integer.parseInt(line);
		
		//String[] position = stringArray[1].replace("(", "").replace(")", "").split(",");

		//int rowPos = Integer.parseInt(position[0]);
		//int colPos = Integer.parseInt(position[1]);
		
		int[][] chessMatrix = new int[size][size];
		
		int movementCount = size;
		
		for(int i = 0; i < chessMatrix[1].length; i++) {
			for(int j = chessMatrix[0].length-1; j >= 0; j--) {
				// for diagonal cases
				if(i == j) {
					movementCount++;
				}
			}
		}
		
		
		for(int i = 0; i < chessMatrix[0].length; i++) {
			for(int j = chessMatrix[1].length-1; j >= 0; j--) {
				// for diagonal cases
				if(i == j) {
					movementCount++;
				}
			}
		}
		
		System.out.println(movementCount);
	}
}
