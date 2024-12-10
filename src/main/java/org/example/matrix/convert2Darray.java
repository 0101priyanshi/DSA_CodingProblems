package org.example.matrix;

public class convert2Darray {
    public int[][] construct2DArray(int[] original, int m, int n) {
        // Step 1: Calculate the length of the original array
        int l = original.length;

        // Step 2: Check if reshaping is possible
        // If the number of elements in the original array does not match m * n,
        // return an empty 2D array (no valid reshaping is possible).
        if (l != m * n) {
            return new int[0][0];
        }

        // Step 3: Initialize the output 2D array with dimensions m x n
        int[][] output = new int[m][n];

        // Step 4: Variable to track the current index in the original array
        int index = 0;

        // Step 5: Populate the 2D array using elements from the original array
        for (int i = 0; i < m; i++) { // Iterate over rows
            for (int j = 0; j < n; j++) { // Iterate over columns
                // Fill the current cell in the 2D array with the value
                // from the original array at the current index
                output[i][j] = original[index++];
            }
        }

        // Step 6: Return the reshaped 2D array
        return output;
    }
}
