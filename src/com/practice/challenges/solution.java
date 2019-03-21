package com.practice.challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class solution {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int numberOfTestCases = scanner.nextInt();
		int previousCaloriesBurned = 0;

		Map<Integer, Integer[]> map = new LinkedHashMap<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < numberOfTestCases; i++) {
			int numberOfDays = scanner.nextInt();
			int[] array = new int[numberOfDays];
			
			if(reader.readLine() != null)
				array = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

			Integer[] newArr = new Integer[numberOfDays];
			int z = 0;
			for (int in : array) {
				newArr[z++] = Integer.valueOf(in);
			}
			map.put(numberOfDays, newArr);
		}

		for (Map.Entry<Integer, Integer[]> entryMap : map.entrySet()) {
			calculateSum(previousCaloriesBurned, entryMap.getValue(), entryMap.getValue().length);
		}

		reader.close();
		scanner.close();
	}

	private static void calculateSum(int i, Integer[] distanceArray, int numberOfDays) {

		int previousDayCalorie = i;
		int calorieBurned = 0;

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
