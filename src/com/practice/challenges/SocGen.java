package com.practice.challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SocGen {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int numberOfTestCases = scanner.nextInt();
		int previousCaloriesBurned = 0;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < numberOfTestCases; i++) {
			int numberOfDays = scanner.nextInt();
			int[] array = new int[numberOfDays];

			scanner.nextLine().split(" ");
			String[] sArr = scanner.nextLine().split(" ");
			for (int k = 0; k < sArr.length; k++) {
				array[k] = Integer.parseInt(sArr[k]);
			}
			// array = list.stream().mapToInt(v -> v).toArray();
			calculateSum(previousCaloriesBurned, array, array.length);
		}

		reader.close();
		scanner.close();
	}

	private static void calculateSum(int i, int[] distanceArray, int numberOfDays) {

		int previousDayCalorie = i;
		int calorieBurned = 0;
		Collections.sort(Arrays.asList(distanceArray), Collections.reverseOrder());

		for (int j = 0; j < distanceArray.length - 1; j++) {
			for (int k = 0; k < distanceArray.length - 1; k++) {
				if (distanceArray[k] < distanceArray[k + 1]) {
					distanceArray[k] = distanceArray[k] + distanceArray[k + 1];
					distanceArray[k + 1] = distanceArray[k] - distanceArray[k + 1];
					distanceArray[k] = distanceArray[k] - distanceArray[k + 1];
				}
			}
		}

		for (int m = 0; m < distanceArray.length; m++) {
			calorieBurned += 2 * previousDayCalorie + distanceArray[m];
			previousDayCalorie += distanceArray[m];
		}
		System.out.println(calorieBurned);
	}
}
