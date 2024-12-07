package org.example.prefixSum;

public class RangeAddition_Google {
    public static void main(String[] args) {
            // Initialize the array and the number of elements (n)
            int[] array = new int[]{1, 2, 3, 4, 5}; // Original array
            int n = array.length; // Length of the array
            int query = 3; // Number of queries to process

            // Define the range update queries in the form of [left, right, value]
            int queryArray[][] = new int[][]{{0, 3, 10}, {1, 4, -5}, {0, 2, 10}}; // Queries array

            // Initialize the difference array, an auxiliary array to efficiently manage range updates
            int[] differenceArray = new int[array.length + 1]; // An array of size n+1 (extra element for handling the right boundary)

            // Loop through each query to apply the range updates to the difference array
            for (int i = 0; i < query; i++) {
                // Extract the left index, right index, and value to be added from the query array
                int left = queryArray[i][0]; // Start index of the range
                int right = queryArray[i][1]; // End index of the range
                int val = queryArray[i][2]; // Value to add to each element in the range

                // Update the difference array to reflect the range addition:
                differenceArray[left] = differenceArray[left] + val; // Add val at the start of the range
                if (right + 1 < array.length) {
                    differenceArray[right + 1] = differenceArray[right + 1] - val; // Subtract val just after the end of the range
                }
            }

            // Variable to accumulate the cumulative sum as we process the difference array
            int sum = 0;
            // Apply the difference array to the original array by calculating the prefix sum
            for (int i = 0; i < n; i++) {
                // Calculate the prefix sum to apply the range updates to each element of the original array
                sum = sum + differenceArray[i]; // Sum the differences to get the cumulative value for the current index

                // Update the original array by adding the cumulative sum to each element
                array[i] = array[i] + sum;

                // Output the modified value of each element after applying all queries
                System.out.println(array[i] + " "); // Print the updated value
            }
    }
}
