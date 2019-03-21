package com.practice.arrays;

import java.util.Scanner;

public class MatrixTest {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		int[][] inputMatrix = new int[rows][cols];
		
		for (int row = 0; row < 3; row ++) {
			for (int col = 0; col < 3; col++) {
				inputMatrix[row][col] = 1;
			}		     
		}
		
		inputMatrix[1][0] = 0;
		int rowCount = 0;
		int colCount = 0;
		for(int i = 0; i < inputMatrix[0].length; i++) {
			for(int j = 0; j < inputMatrix[1].length; j++) {
				if(inputMatrix[i][j] == 0) {
					rowCount = i;
					colCount = j;
					break;
				}
			}
		}
		
		for(int k = 0; k < inputMatrix[1].length; k++) {
			inputMatrix[rowCount][k] = 0;
			inputMatrix[k][colCount] = 0;
		}
		System.out.println(inputMatrix);
		scan.close();
	}
}
