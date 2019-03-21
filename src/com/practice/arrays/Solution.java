package com.practice.arrays;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int count = 0;
        for(int i = 0; i < c.length - 2; i++) {
            if(c[i] == 0) {
                if(c[i+1] == 0) {                    
                    if (c[i + 2] == 0) {
                        count += 1;
                        continue;
                    }
                    count += 1;
                }
                
                if(c[i+1] == 1) {
                    if(c[i+2] == 0) {
                        count += 1;
                        continue;
                    }
                    count -= 1;
                }
            }
        }

        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

       System.out.println(result);

        scanner.close();
    }
}
